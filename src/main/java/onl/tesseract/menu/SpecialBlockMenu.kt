package onl.tesseract.menu

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.TextDecoration
import onl.tesseract.CreativePlayer
import onl.tesseract.tesseractlib.util.menu.InventoryMenu
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.inventory.ItemStack

class SpecialBlockMenu : InventoryMenu {
    val player: Player

    constructor(player: Player) : super(
        27,
        Component.text("Blocs spéciaux", NamedTextColor.DARK_AQUA, TextDecoration.BOLD)
    ) {
        this.player = player
    }

    constructor(player: Player, previous: InventoryMenu?) : super(
        27,
        Component.text("Blocs spéciaux", NamedTextColor.DARK_AQUA, TextDecoration.BOLD),
        previous
    ) {
        this.player = player
    }

    override fun open(viewer: Player) {
        fill(Material.GRAY_STAINED_GLASS_PANE, " ")

        addButton(
            0, Material.COMMAND_BLOCK,
            Component.text("Bloc de commande", NamedTextColor.GOLD, TextDecoration.BOLD),
            Component.text("AJOUTER DESCRIPTION", NamedTextColor.GRAY)
        ) { event: InventoryClickEvent? -> player.inventory.addItem(ItemStack(Material.COMMAND_BLOCK)) }

        addButton(
            10, Material.CHAIN_COMMAND_BLOCK,
            Component.text("Bloc de commande en chaîne", NamedTextColor.GREEN, TextDecoration.BOLD),
            Component.text("AJOUTER DESCRIPTION", NamedTextColor.GRAY)
        ) { event: InventoryClickEvent? -> player.inventory.addItem(ItemStack(Material.CHAIN_COMMAND_BLOCK)) }

        addButton(
            2, Material.REPEATING_COMMAND_BLOCK,
            Component.text("Bloc de commande à répétition", NamedTextColor.AQUA, TextDecoration.BOLD),
            Component.text("AJOUTER DESCRIPTION", NamedTextColor.GRAY)
        ) { event: InventoryClickEvent? -> player.inventory.addItem(ItemStack(Material.REPEATING_COMMAND_BLOCK)) }

        addButton(
            12, Material.COMMAND_BLOCK_MINECART,
            Component.text("Wagonnet à bloc de commande", NamedTextColor.DARK_RED, TextDecoration.BOLD),
            Component.text("AJOUTER DESCRIPTION", NamedTextColor.GRAY)
        ) { event: InventoryClickEvent? -> player.inventory.addItem(ItemStack(Material.COMMAND_BLOCK_MINECART)) }

        addButton(
            4, Material.STRUCTURE_BLOCK,
            Component.text("Bloc de structure", NamedTextColor.DARK_PURPLE, TextDecoration.BOLD),
            Component.text("AJOUTER DESCRIPTION", NamedTextColor.GRAY)
        ) { event: InventoryClickEvent? -> player.inventory.addItem(ItemStack(Material.STRUCTURE_BLOCK)) }

        addButton(
            14, Material.JIGSAW,
            Component.text("Bloc de puzzle", NamedTextColor.DARK_PURPLE, TextDecoration.BOLD),
            Component.text("AJOUTER DESCRIPTION", NamedTextColor.GRAY)
        ) { event: InventoryClickEvent? -> player.inventory.addItem(ItemStack(Material.JIGSAW)) }

        addButton(
            6, Material.STRUCTURE_VOID,
            Component.text("Vide de structure", NamedTextColor.BLUE, TextDecoration.BOLD),
            Component.text("AJOUTER DESCRIPTION", NamedTextColor.GRAY)
        ) { event: InventoryClickEvent? -> player.inventory.addItem(ItemStack(Material.STRUCTURE_VOID)) }

        addButton(
            16, Material.BARRIER,
            Component.text("Barrière invisible", NamedTextColor.RED, TextDecoration.BOLD),
            Component.text("AJOUTER DESCRIPTION", NamedTextColor.GRAY)
        ) { event: InventoryClickEvent? -> player.inventory.addItem(ItemStack(Material.BARRIER)) }

        addButton(
            8, Material.LIGHT,
            Component.text("Lumière", NamedTextColor.YELLOW, TextDecoration.BOLD),
            Component.text("AJOUTER DESCRIPTION", NamedTextColor.GRAY)
        ) { event: InventoryClickEvent? -> player.inventory.addItem(ItemStack(Material.LIGHT)) }

        addBackButton()
        addQuitButton()
        super.open(viewer)
    }
}
