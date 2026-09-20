package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class m5p0 {
    public static int[] _values() {
        return edb.m38551G(2);
    }

    /* JADX INFO: renamed from: a */
    public static int m60869a(int i) {
        switch (i) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m60870b(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public static final String m60871c(int i) {
        switch (i) {
            case 1:
                return "ubi_interaction";
            case 2:
                return "autoplay";
            case 3:
                return "state_restore";
            case 4:
                return "widget";
            case 5:
                return "voice_assistant";
            case 6:
                return "connect";
            case 7:
                return "deep_link";
            case 8:
                return "notification";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m60872d(int i) {
        switch (i) {
            case 1:
                return "Animals & Pet Supplies";
            case 2:
                return "Apparel & Accessories";
            case 3:
                return "Arts & Entertainment";
            case 4:
                return "Baby & Toddler";
            case 5:
                return "Business & Industrial";
            case 6:
                return "Cameras & Optics";
            case 7:
                return "Electronics";
            case 8:
                return "Food, Beverages & Tobacco";
            case 9:
                return "Furniture";
            case 10:
                return "Hardware";
            case 11:
                return "Health & Beauty";
            case 12:
                return "Home & Garden";
            case 13:
                return "Luggage & Bags";
            case 14:
                return "Mature";
            case 15:
                return "Media";
            case 16:
                return "Office Supplies";
            case 17:
                return "Religious & Ceremonial";
            case 18:
                return "Software";
            case 19:
                return "Sporting Goods";
            case 20:
                return "Toys & Games";
            case 21:
                return "Vehicles & Parts";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m60873e(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* JADX INFO: renamed from: f */
    public static void m60874f(uxp0 uxp0Var, twp0 twp0Var, String str, ArrayList arrayList) {
        arrayList.add(uxp0.m84182b(twp0Var, str, uxp0Var.m84183a()));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m60875g(int i) {
        if (i == 1) {
            return "AUDIO";
        }
        if (i == 2) {
            return "VIDEO";
        }
        if (i == 3) {
            return "NONE";
        }
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m60876h(int i) {
        if (i == 1) {
            return "Section";
        }
        if (i == 2) {
            return "World";
        }
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m60877i(int i) {
        if (i == 1) {
            return "ACTIVE";
        }
        if (i == 2) {
            return "INACTIVE";
        }
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m60878j(int i) {
        if (i == 1) {
            return "OPAQUE";
        }
        if (i == 2) {
            return "TRANSPARENT";
        }
        if (i == 3) {
            return "FADE";
        }
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m60879k(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "INEXACT";
        }
        return "EXACT";
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m60880l(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "SUBS";
        }
        return "INAPP";
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m60881m(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("Section")) {
            return 1;
        }
        if (str.equals("World")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.home.evopage.element.promptablesection.promptbottomsheet.PromptKind.".concat(str));
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m60882n(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("DEFAULT_ELIGIBILITY")) {
            return 1;
        }
        if (str.equals("INTRO")) {
            return 2;
        }
        if (str.equals("NONINTRO")) {
            return 3;
        }
        if (str.equals("WINBACK")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.premiumdestination.destination.debug.PremiumPageEligibility.".concat(str));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m60883o(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("PROD")) {
            return 1;
        }
        if (str.equals("DEV")) {
            return 2;
        }
        if (str.equals("STAGING")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.premiumdestination.destination.debug.PremiumPageEnvironment.".concat(str));
    }
}
