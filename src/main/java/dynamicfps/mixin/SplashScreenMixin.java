package dynamicfps.mixin;

import dynamicfps.DynamicFPSMod.SplashScreenAccessor;
import net.minecraft.client.gui.screen.SplashScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(SplashScreen.class)
public class SplashScreenMixin implements SplashScreenAccessor {
	@Shadow
	private long applyCompleteTime;
	
	@Override
	public boolean isReloadComplete() {
		return applyCompleteTime > -1L;
	}
}
