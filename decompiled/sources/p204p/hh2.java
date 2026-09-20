package p204p;

import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes7.dex */
public final class hh2 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f91261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r4m0 f91262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh2(r4m0 r4m0Var, int i) {
        super(1);
        this.f91261a = i;
        this.f91262b = r4m0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f91261a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (bundle != null) {
                    eh2 eh2Var = Build.VERSION.SDK_INT >= 33 ? (eh2) bundle.getParcelable("age_verification_model_key", eh2.class) : (eh2) bundle.getParcelable("age_verification_model_key");
                    if (eh2Var != null) {
                        return eh2Var;
                    }
                }
                lh2 lh2Var = ((ih2) this.f91262b).f102124b;
                return new eh2(lh2Var.f133341a, lh2Var.f133342b, lh2Var.f133343c, false, false, lh2Var.f133344d, null);
            default:
                Bundle bundle2 = (Bundle) obj;
                if (bundle2 != null) {
                    gsa1 gsa1Var = Build.VERSION.SDK_INT >= 33 ? (gsa1) bundle2.getParcelable("user_info_model_key", gsa1.class) : (gsa1) bundle2.getParcelable("user_info_model_key");
                    if (gsa1Var != null) {
                        return gsa1Var;
                    }
                }
                nsa1 nsa1Var = ((isa1) this.f91262b).f105204b;
                String str = nsa1Var.f157725a;
                if (str == null) {
                    str = "";
                }
                String str2 = nsa1Var.f157726b;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = nsa1Var.f157727c;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = nsa1Var.f157728d;
                String str5 = str4 != null ? str4 : "";
                String str6 = str3;
                if ((30 & 1) != 0) {
                    str2 = "";
                }
                return new gsa1(str, new kmo(str2, "", null, null, null, (30 & 32) != 0 ? "" : str6, (30 & 64) != 0 ? "" : str5), nsa1Var.f157729e, nsa1Var.f157730f, 1, nsa1Var.f157731g);
        }
    }
}
