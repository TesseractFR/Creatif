package onl.tesseract.command

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import onl.tesseract.commandBuilder.CommandContext
import onl.tesseract.commandBuilder.annotation.Argument
import onl.tesseract.commandBuilder.annotation.Command
import onl.tesseract.commandBuilder.annotation.CommandBody
import onl.tesseract.commandBuilder.annotation.Env
import onl.tesseract.core.event.ColoredChat
import onl.tesseract.lib.command.argument.StringArg
import onl.tesseract.lib.service.ServiceContainer
import onl.tesseract.lib.util.append
import onl.tesseract.nickname.NicknameService
import onl.tesseract.rank.PlayerRankService
import org.bukkit.entity.Player

@Command(
    name = "nick",
    args = [Argument(value = "surnom", clazz = StringArg::class, optional = true)]
)
class NickCommand : CommandContext() {

    private val nicknameService = ServiceContainer[NicknameService::class.java]
    private val rankService = ServiceContainer[PlayerRankService::class.java]

    @CommandBody
    fun onCommand(@Env(key = "surnom") nickname: String?, sender: Player): Boolean {
        val currentNickname = nicknameService.getNickname(sender.uniqueId)
        val rank = rankService.getPlayerRank(sender.uniqueId)

        if (nickname.isNullOrBlank()) {
            if (currentNickname == null) {
                sender.sendMessage(
                    Component.text("Vous n'avez pas de surnom.", NamedTextColor.RED)
                )
            } else {
                removeNickname(sender)
                sender.sendMessage(
                    Component.text("Votre surnom a été supprimé.", NamedTextColor.GREEN)
                )
            }
        } else {
            setNickname(sender, nickname)
            val coloredNickname = ColoredChat.colorMessage(nickname)
            sender.sendMessage(
                Component.text("Votre surnom est maintenant : ", NamedTextColor.GREEN)
                    .append(coloredNickname, rank.color)
            )
        }
        return true
    }

    private fun setNickname(player: Player, nickname: String) {
        nicknameService.setNickname(player.uniqueId, nickname)
        val formattedNickname = ColoredChat.colorComponent(Component.text(nickname))
        player.displayName(formattedNickname)
        player.playerListName(formattedNickname)
    }

    private fun removeNickname(player: Player) {
        nicknameService.setNickname(player.uniqueId, null)
        player.displayName(Component.text(player.name))
        player.playerListName(Component.text(player.name))
    }
}