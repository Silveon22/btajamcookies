package silveon22.btajamcookies;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.DyeColor;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;
import net.minecraft.core.item.Items;

import static silveon22.btajamcookies.BTAJamCookies.MOD_ID;

public class JCRecipes implements RecipeEntrypoint {
	@Override
	public void onRecipesReady() {
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("WCW")
			.addInput('C', Items.FOOD_CHERRY)
			.addInput('W', Items.WHEAT)
			.create("jamCookie", new ItemStack(JCItems.jamCookie, 2));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(" P ","WWW")
			.addInput('P', Blocks.PUMPKIN)
			.addInput('W', Items.WHEAT)
			.create("pumpkinBread", new ItemStack(JCItems.pumpkinBread, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("H","I","T")
			.addInput('I', Blocks.ICE)
			.addInput('T', Items.STICK)
			.addInput('H', Items.DUST_SUGAR)
			.create("icePop", new ItemStack(JCItems.icePop, 2));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("MM","HE","WW")
			.addInput('W', Items.WHEAT)
			.addInput('M', Items.BUCKET_MILK)
			.addInput('H', Items.DUST_SUGAR)
			.addInput('E', Items.EGG_CHICKEN)
			.create("cupcake", new ItemStack(JCItems.cupcake, 2));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("CCC","HMH","WWW")
			.addInput('W', Items.WHEAT)
			.addInput('M', Items.BUCKET_MILK)
			.addInput('H', Items.DUST_SUGAR)
			.addInput('C', Items.DYE, DyeColor.BROWN.itemMeta)
			.create("brownie", new ItemStack(JCItems.brownie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("POP")
			.addInput('P', Items.FOOD_PORKCHOP_COOKED)
			.addInput('O', JCItems.onion)
			.create("meatloaf", new ItemStack(JCItems.meatloaf, 2));

	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
		RecipeBuilder.getRecipeNamespace(MOD_ID);

	}
}
