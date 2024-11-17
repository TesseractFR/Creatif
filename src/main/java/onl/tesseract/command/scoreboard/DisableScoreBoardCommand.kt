package onl.tesseract.command.scoreboard

import onl.tesseract.commandBuilder.CommandContext
import onl.tesseract.commandBuilder.annotation.Argument
import onl.tesseract.commandBuilder.annotation.Command
import onl.tesseract.commandBuilder.annotation.CommandBody
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

@Command(name = "masquer")
class DisableScoreBoardCommand : CommandContext() {

    @Command
    fun disableScoreBoard(
        @Argument(value = "afficher") sender: CommandSender) {

    }
}