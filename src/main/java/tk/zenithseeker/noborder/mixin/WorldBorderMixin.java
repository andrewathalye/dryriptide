package tk.zenithseeker.noborder.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.world.border.WorldBorder;

@Mixin(WorldBorder.class)
public class WorldBorderMixin {
    @Overwrite
    public double getBoundWest() {
	return -3.0E7;
    }

    @Overwrite
    public double getBoundNorth() {
	return -3.0E7;
    }

    @Overwrite
    public double getBoundEast() {
	return 3.0E7;
    }

    @Overwrite
    public double getBoundSouth() {
	return 3.0E7;
    }

    @Overwrite
    public double getSize() {
    	return 6.0E7;
    }

}
