package silveon22.btajamcookies.mixin;

import net.minecraft.core.block.BlockLogicTallGrass;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import silveon22.btajamcookies.JCItems;

@Mixin(value = BlockLogicTallGrass.class, remap = false)
public class BlockTallGrassMixin {
	@Inject(method = "getBreakResult", at = @At(value = "HEAD"), cancellable = true)
	public void changeBlockDrop(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity, CallbackInfoReturnable<ItemStack[]> cir) {
		if (world.rand.nextInt(20) == 0) {
			cir.setReturnValue(new ItemStack[]{new ItemStack(JCItems.onion)});
		}

	}
}
