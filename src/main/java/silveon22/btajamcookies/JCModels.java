package silveon22.btajamcookies;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.util.collection.NamespaceID;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static silveon22.btajamcookies.BTAJamCookies.MOD_ID;

public class JCModels implements ModelEntrypoint {
	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {

	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		ModelHelper.setItemModel(JCItems.jamCookie,()->{
			ItemModelStandard model = new ItemModelStandard(JCItems.jamCookie, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/food_cookie_jam"));
			return model;
		});
		ModelHelper.setItemModel(JCItems.pumpkinBread,()->{
			ItemModelStandard model = new ItemModelStandard(JCItems.pumpkinBread, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/food_bread_pumpkin"));
			return model;
		});
		ModelHelper.setItemModel(JCItems.icePop,()->{
			ItemModelStandard model = new ItemModelStandard(JCItems.icePop, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/food_icepop"));
			return model;
		});
		ModelHelper.setItemModel(JCItems.cupcake,()->{
			ItemModelStandard model = new ItemModelStandard(JCItems.cupcake, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/food_cupcake"));
			return model;
		});
		ModelHelper.setItemModel(JCItems.brownie,()->{
			ItemModelStandard model = new ItemModelStandard(JCItems.brownie, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/food_brownie"));
			return model;
		});
		ModelHelper.setItemModel(JCItems.meatloaf,()->{
			ItemModelStandard model = new ItemModelStandard(JCItems.meatloaf, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/food_meatloaf"));
			return model;
		});
		ModelHelper.setItemModel(JCItems.onion,()->{
			ItemModelStandard model = new ItemModelStandard(JCItems.onion, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/food_onion"));
			return model;
		});


	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
