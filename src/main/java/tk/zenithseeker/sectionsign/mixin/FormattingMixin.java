package tk.zenithseeker.sectionsign.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.util.Formatting;

@Mixin(Formatting.class)
public class FormattingMixin {
	@Overwrite
	public static String strip(String string) {
		return string;
	}
}
