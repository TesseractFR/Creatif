package onl.tesseract.menu

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.TextDecoration
import onl.tesseract.lib.menu.ItemBuilder
import onl.tesseract.lib.menu.Menu
import onl.tesseract.lib.menu.MenuSize
import onl.tesseract.lib.util.ItemLoreBuilder
import onl.tesseract.plot.entity.PlotWorld
import onl.tesseract.world.WorldManager
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

private val tete100 = ItemBuilder(Material.PLAYER_HEAD).customHead(
    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFlNzhmZjQ3NjNlOWFkMWE5OThjNzI4ZjcxZmE1ZGJiZDYxNjRhMjdjYTFmMGU0MjMyYzQxZDc0MjA4MTgwYSJ9fX0=",
    "")
private val tete250 = ItemBuilder(Material.PLAYER_HEAD).customHead(
    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDNlMWM1ZTY1ZTEzNTU5YmY2MGUxNTRmMTdmNmFmM2E4ZTU2MDhhNDk4N2VjZDFlMGZhZTc1MWM2ZjgyNzI2In19fQ==",
    "")
private val tete500 = ItemBuilder(Material.PLAYER_HEAD).customHead(
    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQ4NTlmN2IzY2RmZGFkNDcxODI4ODRlMTI3ZjQ2MWZlOGY5ZmM1MmY3ZDE1MDQyN2MxMTcwNzliMDkyNGUzIn19fQ==",
    "")
private val tete1000 = ItemBuilder(Material.PLAYER_HEAD).customHead(
    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWU0ZGNmNzFiMGI2ODUyYjU0MWNkMjNhMzFiODg0NjlhZjU4NDI5YWQ1MjJmNTI4MjhmM2E4MGIzNjI5ZWYyIn19fQ==",
    "")
private val teteEvent = ItemBuilder(Material.PLAYER_HEAD).customHead(
    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmFhZDZmZmFmNmZiOWE4ZWVhOGYzZGJlYTZkZGYzNDcyYTBhNTQ2YjVlMTk0YmQ1NWI0MzNiZDlkMTU4OTMwIn19fQ==",
    "")

class TPWorldMenu(previous: Menu? = null) :

        Menu(
            MenuSize.Three,
            Component.text("Menu des téléportations", NamedTextColor.BLUE, TextDecoration.BOLD),
            previous) {

    override fun placeButtons(viewer: Player) {
        fill(
            ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).name("")
                    .build())

        addButton(
            0, createWorld100Item()) {
            teleport(viewer, PlotWorld.WORLD_100)
        }

        addButton(
            11, createWorld250Item()) {
            teleport(viewer, PlotWorld.WORLD_250)
        }

        addButton(
            4, createWorld500Item()) {
            teleport(viewer, PlotWorld.WORLD_500)
        }

        addButton(
            15, createWorld1000Item()) {
            teleport(viewer, PlotWorld.WORLD_1000)
        }

        addButton(8, createEventWorldItem()) {
            teleport(viewer, PlotWorld.WORLD_EVENT)
        }

        addBackButton()
        addCloseButton()
    }

    private fun teleport(viewer: Player, plotWorld: PlotWorld) {
        viewer.teleport(WorldManager.instance.getWorldSpawn(plotWorld))
    }

    private fun createWorld100Item(): ItemStack {
        val ilb = ItemLoreBuilder()
            .newline()
            .append("Cliquez pour vous téléporter dans le monde 100x100.", NamedTextColor.GRAY)
        return tete100
            .name("Monde 100x100", NamedTextColor.AQUA, TextDecoration.BOLD)
            .lore(ilb.get())
            .build()
    }

    private fun createWorld250Item(): ItemStack {
        val ilb = ItemLoreBuilder()
            .newline()
            .append("Cliquez pour vous téléporter dans le monde 250x250.", NamedTextColor.GRAY)
        return tete250
            .name("Monde 250x250", NamedTextColor.YELLOW, TextDecoration.BOLD)
            .lore(ilb.get())
            .build()
    }

    private fun createWorld500Item(): ItemStack {
        val ilb = ItemLoreBuilder()
            .newline()
            .append("Cliquez pour vous téléporter dans le monde 500x500.", NamedTextColor.GRAY)
        return tete500
            .name("Monde 500x500", NamedTextColor.GOLD, TextDecoration.BOLD)
            .lore(ilb.get())
            .build()
    }

    private fun createWorld1000Item(): ItemStack {
        val ilb = ItemLoreBuilder()
            .newline()
            .append("Cliquez pour vous téléporter dans le monde 1000x1000.", NamedTextColor.GRAY)
        return tete1000
            .name("Monde 1000x1000", NamedTextColor.LIGHT_PURPLE, TextDecoration.BOLD)
            .lore(ilb.get())
            .build()
    }

    private fun createEventWorldItem(): ItemStack {
        val ilb = ItemLoreBuilder()
            .newline()
            .append("Cliquez pour vous téléporter dans le monde Event.", NamedTextColor.GRAY)
        return teteEvent
            .name("Monde Event", NamedTextColor.RED, TextDecoration.BOLD)
            .lore(ilb.get())
            .build()
    }

}
