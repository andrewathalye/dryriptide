package tk.zenithseeker.sectionsign.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.SharedConstants;

@Mixin(SharedConstants.class)
public class SharedConstantsMixin {
	@Overwrite
	public static boolean isValidChar(char chr) {
		return true;
	}
}
