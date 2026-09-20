package p204p;

import android.content.SharedPreferences;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hgy {

    /* JADX INFO: renamed from: a */
    public static final hgy f91235a = new hgy();

    /* JADX INFO: renamed from: b */
    public static final HashMap f91236b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static final void m47480a(egy egyVar, fgy fgyVar) {
        jty.m54320d(new ggy(egyVar, fgyVar));
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m47481b(fgy fgyVar) {
        fgy fgyVarM81638l;
        boolean z;
        boolean z2 = false;
        if (fgy.Unknown != fgyVar) {
            if (fgy.Core != fgyVar) {
                SharedPreferences sharedPreferences = p8y.m69343a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0);
                fgyVar.getClass();
                String string = sharedPreferences.getString("FBSDKFeature" + fgyVar, null);
                if (string == null || !string.equals("18.2.3")) {
                    int i = fgyVar.f69478a;
                    if ((i & 255) > 0) {
                        fgyVarM81638l = tw41.m81638l(i & (-256));
                    } else if ((65280 & i) > 0) {
                        fgyVarM81638l = tw41.m81638l(i & (-65536));
                    } else {
                        fgyVarM81638l = (16711680 & i) > 0 ? tw41.m81638l(i & (-16777216)) : tw41.m81638l(0);
                    }
                    if (fgyVarM81638l == fgyVar) {
                        switch (fgyVar.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 42:
                            case 43:
                            case 44:
                                break;
                            case 34:
                            case 35:
                            case 36:
                            case 41:
                            default:
                                z2 = true;
                                break;
                        }
                        return jty.m54319b("FBSDKFeature" + fgyVar, p8y.m69344b(), z2);
                    }
                    if (m47481b(fgyVarM81638l)) {
                        switch (fgyVar.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 42:
                            case 43:
                            case 44:
                                z = false;
                                break;
                            case 34:
                            case 35:
                            case 36:
                            case 41:
                            default:
                                z = true;
                                break;
                        }
                        if (jty.m54319b("FBSDKFeature" + fgyVar, p8y.m69344b(), z)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
