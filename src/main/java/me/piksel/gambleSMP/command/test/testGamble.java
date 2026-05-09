package me.piksel.gambleSMP.command.test;

import io.papermc.paper.command.brigadier.BasicCommand;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import me.piksel.gambleSMP.guis.test.test;
import org.bukkit.entity.Player;

public class testGamble implements BasicCommand {
    @Override
    public void execute(CommandSourceStack source, String[] args) {
        if (!(source.getSender() instanceof Player player)) return;
        if (!player.hasPermission("gamblesmp.test")){return;}
        new test().open(player);
    }
}
