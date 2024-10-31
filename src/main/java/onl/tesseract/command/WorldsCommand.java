package onl.tesseract.command;

import onl.tesseract.CreativePlayer;
import onl.tesseract.commandBuilder.CommandContext;
import onl.tesseract.commandBuilder.annotation.Command;
import onl.tesseract.commandBuilder.annotation.CommandBody;
import onl.tesseract.menu.MenuMenu;
import onl.tesseract.menu.SocialsMenu;
import onl.tesseract.menu.TPWorldMenu;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@Command
public class WorldsCommand extends CommandContext {
    @CommandBody
    public boolean onCommand(CommandSender sender)
    {
        if (sender instanceof Player player )
        {
            new TPWorldMenu().open(player);
        }

        return true;
    }
}
