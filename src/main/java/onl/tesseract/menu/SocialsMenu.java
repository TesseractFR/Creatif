package onl.tesseract.menu;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import onl.tesseract.tesseractlib.util.menu.InventoryMenu;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SocialsMenu extends InventoryMenu {

    public SocialsMenu(InventoryMenu previous) {
        super(27, Component.text("Réseaux sociaux").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.BOLD, true), previous);
    }

    static final ItemStack teteInstagram = InventoryMenu.getCustomHead("",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTBkNDY0MTg2ZTFhNTBkZGFhMTRiZTIyNTk2MTFhNGU4NDU4NTE1YTUzNjdhOTM4OWE5Y2M3Yzg5Yzk0YTkzYiJ9fX0=",
            "90d464186e1a50ddaa14be2259611a4e8458515a5367a9389a9cc7c89c94a93b");
    static final ItemStack teteSiteWeb = InventoryMenu.getCustomHead("",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzZmOGEyMTlmMDgwMzk0MGYxZDI3MzQ5ZmIwNTBjMzJkYzdjMDUwZGIzM2NhMWUwYjM2YzIyZjIxYjA3YmU4NiJ9fX0=",
            "76f8a219f0803940f1d27349fb050c32dc7c050db33ca1e0b36c22f21b07be86");
    static final ItemStack teteFacebook = InventoryMenu.getCustomHead("",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGViNDYxMjY5MDQ0NjNmMDdlY2ZjOTcyYWFhMzczNzNhMjIzNTliNWJhMjcxODIxYjY4OWNkNTM2N2Y3NTc2MiJ9fX0=",
            "deb46126904463f07ecfc972aaa37373a22359b5ba271821b689cd5367f75762");
    static final ItemStack teteYoutube = InventoryMenu.getCustomHead("",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ4ODU0NWQ1N2M5ZWVkNTJjM2U1NDdlOTZjNDVkYWJiYjdjZjVmOThkNGM4ZmU2MWRjNmY2OWFiYTBhZWY5NiJ9fX0=",
            "3488545d57c9eed52c3e547e96c45dabbb7cf5f98d4c8fe61dc6f69aba0aef96");
    static final ItemStack teteTwitter = InventoryMenu.getCustomHead("",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTFiN2EwYzIxMGU2Y2RmNWEzNWZkODE5N2U2ZTI0YTAzODMxNWJiZTNiZGNkMWJjYzM2MzBiZjI2ZjU5ZWM1YyJ9fX0=",
            "91b7a0c210e6cdf5a35fd8197e6e24a038315bbe3bdcd1bcc3630bf26f59ec5c");
    static final ItemStack teteTiktok = InventoryMenu.getCustomHead("",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNThkMDI5ODRhNDNlNmM2OTEwZDBkOTA4YTU3ZTA0MWMzY2ZiMWRkODgxYjViNzIwYzU1NTYzZTY4MWY1OWUwZSJ9fX0=",
            "58d02984a43e6c6910d0d908a57e041c3cfb1dd881b5b720c55563e681f59e0e");

    @Override
    public void open(Player viewer){
        // Remplir la base avec des vitres grises pour un fond uniforme
        fill(Material.GRAY_STAINED_GLASS_PANE, " ");

        addButton(0, teteInstagram, ChatColor.LIGHT_PURPLE + "Instagram",
                ChatColor.GRAY + "Cliquez pour obtenir le lien vers notre Instagram.",
                event -> {
                    viewer.closeInventory();
                    viewer.sendMessage(Component.text("Instagram")
                                    .color(NamedTextColor.LIGHT_PURPLE)
                                    .decorate(TextDecoration.BOLD)
                                    .clickEvent(ClickEvent.openUrl("https://www.instagram.com/tesseractfr/")
                            )
                    );
        });

        addButton(4, teteTiktok, ChatColor.GOLD + "TikTok",
                ChatColor.GRAY + "Cliquez pour obtenir le lien vers notre compte TikTok.",
                event -> {
                    viewer.closeInventory();
                    viewer.sendMessage(Component.text("TikTok")
                            .color(NamedTextColor.GOLD)
                            .decorate(TextDecoration.BOLD)
                            .clickEvent(ClickEvent.openUrl("https://www.tiktok.com/@tesseractfr?lang=fr")
                            )
                    );
                });

        addButton(8, teteFacebook, ChatColor.BLUE + "Facebook",
                ChatColor.GRAY + "Cliquez pour obtenir le lien vers notre page Facebook.",
                event -> {
                    viewer.closeInventory();
                    viewer.sendMessage(Component.text("Facebook")
                            .color(NamedTextColor.BLUE)
                            .decorate(TextDecoration.BOLD)
                            .clickEvent(ClickEvent.openUrl("https://www.facebook.com/TesseractFR?locale=fr_FR")
                            )
                    );
                });

        addButton(11, teteYoutube, ChatColor.RED + "YouTube",
                ChatColor.GRAY + "Cliquez pour obtenir le lien vers notre chaîne YouTube.",
                event -> {
                    viewer.closeInventory();
                    viewer.sendMessage(Component.text("Youtube")
                            .color(NamedTextColor.RED)
                            .decorate(TextDecoration.BOLD)
                            .clickEvent(ClickEvent.openUrl("https://www.youtube.com/@tesseract7852")
                            )
                    );
                });

        addButton(15, teteTwitter, ChatColor.AQUA + "X (Twitter)",
                ChatColor.GRAY + "Cliquez pour obtenir le lien vers notre page X (Twitter).",
                event -> {
                    viewer.closeInventory();
                    viewer.sendMessage(Component.text("X (Twitter)")
                            .color(NamedTextColor.AQUA)
                            .decorate(TextDecoration.BOLD)
                            .clickEvent(ClickEvent.openUrl("https://x.com/TesseractFR")
                            )
                    );
                });

        addButton(22, teteSiteWeb, ChatColor.YELLOW + "Site Internet",
                ChatColor.GRAY + "Cliquez pour obtenir le lien vers notre site internet.",
                event -> {
                    viewer.closeInventory();
                    viewer.sendMessage(Component.text("Site Internet")
                            .color(NamedTextColor.YELLOW)
                            .decorate(TextDecoration.BOLD)
                            .clickEvent(ClickEvent.openUrl("https://www.tesseract.onl/")
                            )
                    );
                });

        addBackButton();
        addQuitButton();

        super.open(viewer);
    }
}