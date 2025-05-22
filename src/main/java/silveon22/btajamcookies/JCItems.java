package silveon22.btajamcookies;

import net.minecraft.core.item.ItemFood;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.util.ItemInitEntrypoint;

import static silveon22.btajamcookies.BTAJamCookies.MOD_ID;

public class JCItems implements ItemInitEntrypoint {
	public static ItemFood jamCookie;
	public static ItemFood pumpkinBread;
	public static ItemFood icePop;
	public static ItemFood cupcake;
	public static ItemFood brownie;
	public static ItemFood meatloaf;
	public static ItemFood onion;
	@Override
	public void afterItemInit() {
		jamCookie = new ItemBuilder(MOD_ID).build(new ItemFood("jamCookie",MOD_ID + ":item/jam_cookie",25062, 3, 7, false, 6));
		pumpkinBread = new ItemBuilder(MOD_ID).build(new ItemFood("pumpkinBread", MOD_ID + ":item/pumpkinBread", 25063, 7, 45, false, 6));
		icePop = new ItemBuilder(MOD_ID).build(new ItemFood("icePop", MOD_ID + ":item/icePop", 25064, 1, 10, false, 8));
		cupcake = new ItemBuilder(MOD_ID).build(new ItemFood("cupcake", MOD_ID + ":item/cupcake", 25065, 5, 3, false, 8));
		brownie = new ItemBuilder(MOD_ID).build(new ItemFood("brownie", MOD_ID + ":item/brownie", 25066, 15, 10, false, 1));
		meatloaf = new ItemBuilder(MOD_ID).build(new ItemFood("meatloaf", MOD_ID + ":item/meatloaf", 25067, 10, 10, true, 2));
		onion = new ItemBuilder(MOD_ID).build(new ItemFood("onion", MOD_ID + ":item/onion", 25068, 2, 10, false, 6));

	}
}
