package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class own0 {

    /* JADX INFO: renamed from: b */
    public static final fv31 f170738b;

    /* JADX INFO: renamed from: c */
    public static final fv31 f170739c;

    /* JADX INFO: renamed from: d */
    public static final fv31 f170740d;

    /* JADX INFO: renamed from: a */
    public final hv31 f170741a;

    static {
        si5 si5Var = fv31.f73628b;
        f170738b = si5Var.m78183U("ReinventFreeRenewal.keyEligibleForRenewalTooltip");
        f170739c = si5Var.m78183U("ReinventFreeRenewal.keyHardCapEducationType");
        f170740d = si5Var.m78183U("ReinventFreeRenewal.keyHardCapEducationId");
    }

    public own0(hv31 hv31Var) {
        this.f170741a = hv31Var;
    }

    /* JADX INFO: renamed from: a */
    public final sc20 m68174a() {
        String strMo48710e;
        hv31 hv31Var = this.f170741a;
        String strMo48710e2 = hv31Var.mo48710e(f170740d, "");
        String str = strMo48710e2 != null ? strMo48710e2 : "";
        if (str.length() != 0 && (strMo48710e = hv31Var.mo48710e(f170739c, null)) != null) {
            int iHashCode = strMo48710e.hashCode();
            if (iHashCode != 505020428) {
                if (iHashCode != 801382683) {
                    if (iHashCode == 1037898064 && strMo48710e.equals("EDUCATION_PASSIVE")) {
                        return new rc20(str);
                    }
                } else if (strMo48710e.equals("EDUCATION_AGGRESSIVE")) {
                    return new oc20(str);
                }
            } else if (strMo48710e.equals("EDUCATION_MEDIUM")) {
                return new pc20(str);
            }
        }
        return qc20.f187243b;
    }

    /* JADX INFO: renamed from: b */
    public final void m68175b(sc20 sc20Var) {
        String str;
        if (sc20Var instanceof oc20) {
            str = "EDUCATION_AGGRESSIVE";
        } else if (sc20Var instanceof pc20) {
            str = "EDUCATION_MEDIUM";
        } else if (sc20Var instanceof rc20) {
            str = "EDUCATION_PASSIVE";
        } else {
            if (!sc20Var.equals(qc20.f187243b)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "EDUCATION_NONE";
        }
        lv31 lv31VarEdit = this.f170741a.edit();
        lv31VarEdit.m60051d(f170739c, str);
        lv31VarEdit.m60051d(f170740d, sc20Var.mo66672a());
        lv31VarEdit.m60054g();
    }
}
