package onl.tesseract.menu

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.TextDecoration
import onl.tesseract.lib.menu.ItemBuilder
import onl.tesseract.lib.menu.Menu
import onl.tesseract.lib.menu.MenuSize
import onl.tesseract.lib.util.ItemLoreBuilder
import onl.tesseract.menu.boutique.CreativeBoutiqueMenu
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

private val teteApprenti = ItemBuilder(Material.PLAYER_HEAD).customHead(
    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWQwMzgyYjY1ZjQ0NmI3NDkxNTg2ZGE2MGE2MThlMTU3NTU2NWI5M2Q1NmIwZjAzZWVjNWQ3NjlkMmY1NmFjYSJ9fX0=",
    "")
private val teteConcepteur = ItemBuilder(Material.PLAYER_HEAD).customHead(
    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzJiZDVlYTA0OTliYjM0Y2JhMzE1OTc3ZGMwMjFjNmI0NGM0MGE1OWZhYmI4ODI1YWIxOGI0NjAyYWExOWU4YSJ9fX0=",
    "")
private val teteCreateur = ItemBuilder(Material.PLAYER_HEAD).customHead(
    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjRmZGJkNGJjMDYwM2EzYTVkNjhjYzRkZWI5ZmFiZjY2YzVjZTdkMTk1OTc0MjFkOTI5YjhhZGI3NDUzNzEyMCJ9fX0=",
    "")
private val teteIngenieur = ItemBuilder(Material.PLAYER_HEAD).customHead(
    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTZkOTZkYzlmZGY4YmViMzBkNDA1NDUyNDJiNGJmNWE0NWI2NWY4MzU0MTBmZTU3Njg5OGMyYjJmMDQyMjQ0NSJ9fX0=",
    "")
private val teteBatisseur = ItemBuilder(Material.PLAYER_HEAD).customHead(
    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTdlNzgyYjQwOGY1NDU2Y2ZhZDBjNDNlOGM1MDFlZjllZmQwMTI4NjI5NzM2MGJlM2I4M2ZiMTZkYzljZDJhNSJ9fX0=",
    "")
private val teteVirtuose = ItemBuilder(Material.PLAYER_HEAD).customHead(
    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQ3OTgwYzZkODZlYzA2ZDcyNDZhMmUxMzMzODE5MjQzNDAyNDk2YjRlYmRhZDJkNTRkMzUzNzAzNDJjNWFlYSJ9fX0=",
    "")

class RankMenu(previous: Menu? = null) :

        Menu(MenuSize.Three, Component.text("Grades", NamedTextColor.DARK_GREEN, TextDecoration.BOLD), previous) {

    override fun placeButtons(viewer: Player) {
        fill(
            ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).name(" ")
                    .build())

        addButton(0, createApprentiItem()) {}
        addButton(11, createConcepteurItem()) {}
        addButton(4, createCreateurItem()) {}
        addButton(15, createIngenieurItem()) {}
        addButton(8, createBatisseurItem()) {}
        addButton(22, createVirtuoseItem()) {
            CreativeBoutiqueMenu(viewer, this).open(viewer)
        }

        addBackButton()
        addCloseButton()
    }

    private fun createApprentiItem(): ItemStack {
        val ilb = ItemLoreBuilder()
            .newline()
            .append("Grade initial !", NamedTextColor.RED, TextDecoration.BOLD)
            .newline().newline()
            .append("Nombre de plots maximum : ", NamedTextColor.GRAY, TextDecoration.ITALIC)
            .newline()
            .append("Monde 100 : ", NamedTextColor.GOLD).append("1", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline()
            .append("Monde 250 : ", NamedTextColor.GOLD).append("1", NamedTextColor.WHITE, TextDecoration.BOLD)
        return teteApprenti
            .name("Apprenti", NamedTextColor.GREEN, TextDecoration.BOLD)
            .lore(ilb.get())
            .build()
    }

    private fun createConcepteurItem(): ItemStack {
        val ilb = ItemLoreBuilder()
            .newline()
            .append("Obtenable après : ", NamedTextColor.GRAY, TextDecoration.ITALIC)
            .append("4h de jeu", NamedTextColor.RED, TextDecoration.BOLD)
            .newline().newline()
            .append("Nombre de plots maximum : ", NamedTextColor.GRAY, TextDecoration.ITALIC)
            .newline()
            .append("Monde 100 : ", NamedTextColor.GOLD).append("2", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline()
            .append("Monde 250 : ", NamedTextColor.GOLD).append("2", NamedTextColor.WHITE, TextDecoration.BOLD)
        return teteConcepteur
            .name("Concepteur", NamedTextColor.LIGHT_PURPLE, TextDecoration.BOLD)
            .lore(ilb.get())
            .build()
    }

    private fun createCreateurItem(): ItemStack {
        val ilb = ItemLoreBuilder()
            .newline()
            .append("Obtenable après : ", NamedTextColor.GRAY, TextDecoration.ITALIC)
            .append("16h de jeu", NamedTextColor.RED, TextDecoration.BOLD)
            .newline().newline()
            .append("Nombre de plots maximum : ", NamedTextColor.GRAY, TextDecoration.ITALIC)
            .newline()
            .append("Monde 100 : ", NamedTextColor.GOLD).append("3", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline()
            .append("Monde 250 : ", NamedTextColor.GOLD).append("3", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline()
            .append("Monde 500 : ", NamedTextColor.GOLD).append("1", NamedTextColor.WHITE, TextDecoration.BOLD)
        return teteCreateur
            .name("Créateur", NamedTextColor.DARK_PURPLE, TextDecoration.BOLD)
            .lore(ilb.get())
            .build()
    }

    private fun createIngenieurItem(): ItemStack {
        val ilb = ItemLoreBuilder()
            .newline()
            .append("Obtenable après : ", NamedTextColor.GRAY, TextDecoration.ITALIC)
            .append("2j de jeu", NamedTextColor.RED, TextDecoration.BOLD)
            .newline().newline()
            .append("Nombre de plots maximum : ", NamedTextColor.GRAY, TextDecoration.ITALIC)
            .newline()
            .append("Monde 100 : ", NamedTextColor.GOLD).append("4", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline()
            .append("Monde 250 : ", NamedTextColor.GOLD).append("4", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline()
            .append("Monde 500 : ", NamedTextColor.GOLD).append("2", NamedTextColor.WHITE, TextDecoration.BOLD)
        return teteIngenieur
            .name("Ingénieur", NamedTextColor.DARK_BLUE, TextDecoration.BOLD)
            .lore(ilb.get())
            .build()
    }

    private fun createBatisseurItem(): ItemStack {
        val ilb = ItemLoreBuilder()
            .newline()
            .append("Obtenable après : ", NamedTextColor.GRAY, TextDecoration.ITALIC)
            .append("7j de jeu", NamedTextColor.RED, TextDecoration.BOLD)
            .newline().newline()
            .append("Nombre de plots maximum : ", NamedTextColor.GRAY, TextDecoration.ITALIC)
            .newline()
            .append("Monde 100 : ", NamedTextColor.GOLD).append("5", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline()
            .append("Monde 250 : ", NamedTextColor.GOLD).append("5", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline()
            .append("Monde 500 : ", NamedTextColor.GOLD).append("3", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline()
            .append("Monde 1000 : ", NamedTextColor.GOLD).append("1", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline().newline()
            .append("Obtention de ", NamedTextColor.GREEN, TextDecoration.BOLD).append("VoxelSniper", NamedTextColor.DARK_AQUA, TextDecoration.BOLD)
        return teteBatisseur
            .name("Bâtisseur", NamedTextColor.BLUE, TextDecoration.BOLD)
            .lore(ilb.get())
            .build()
    }


    private fun createVirtuoseItem(): ItemStack {
        val ilb = ItemLoreBuilder()
            .newline()
            .append("Grade PAYANT !", NamedTextColor.LIGHT_PURPLE, TextDecoration.BOLD)
            .newline()
            .append(" (Clique pour ouvrir la boutique)", NamedTextColor.DARK_PURPLE, TextDecoration.ITALIC)
            .newline().newline()
            .append("Nombre de plots maximum :", NamedTextColor.GRAY, TextDecoration.ITALIC)
            .newline()
            .append("Monde 100 : ", NamedTextColor.GOLD).append("6", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline()
            .append("Monde 200 : ", NamedTextColor.GOLD).append("6", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline()
            .append("Monde 500 : ", NamedTextColor.GOLD).append("4", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline()
            .append("Monde 1000 : ", NamedTextColor.GOLD).append("2", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline().newline()
            .append("Avantages supplémentaires : ", NamedTextColor.GREEN, TextDecoration.BOLD)
            .newline()
            .append("- Obtention de ", NamedTextColor.GOLD).append("VoxelSniper", NamedTextColor.DARK_AQUA, TextDecoration.BOLD)
            .newline()
            .append("- Commande ", NamedTextColor.GOLD).append("/nick", NamedTextColor.WHITE, TextDecoration.BOLD)
            .newline()
            .append("- Et bien plus encore...", NamedTextColor.GOLD, TextDecoration.ITALIC)
        return teteVirtuose
            .name("Virtuose", NamedTextColor.AQUA, TextDecoration.BOLD)
            .lore(ilb.get())
            .build()
    }

}
