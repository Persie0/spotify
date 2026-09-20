package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class iy0 implements ky0 {

    /* JADX INFO: renamed from: b */
    public static final fv31 f106810b;

    /* JADX INFO: renamed from: c */
    public static final fv31 f106811c;

    /* JADX INFO: renamed from: d */
    public static final fv31 f106812d;

    /* JADX INFO: renamed from: a */
    public final hv31 f106813a;

    static {
        si5 si5Var = fv31.f73628b;
        f106810b = si5Var.m78182S("ADAPTIVE_AUTH_METADATA_AUTH_SOURCE");
        f106811c = si5Var.m78182S("ADAPTIVE_AUTH_METADATA_DEEPLINK");
        f106812d = si5Var.m78182S("ADAPTIVE_AUTH_METADATA_REFERRER");
    }

    public iy0(hv31 hv31Var) {
        this.f106813a = hv31Var;
    }

    /* JADX INFO: renamed from: a */
    public final jy0 m51874a() {
        hv31 hv31Var = this.f106813a;
        String strMo48710e = hv31Var.mo48710e(f106810b, null);
        return new jy0(hv31Var.mo48710e(f106811c, null), hv31Var.mo48710e(f106812d, null), strMo48710e != null ? rk7.valueOf(strMo48710e) : null);
    }

    /* JADX INFO: renamed from: b */
    public final void m51875b(fv31 fv31Var, String str) {
        lv31 lv31VarEdit = this.f106813a.edit();
        if (str != null) {
            lv31VarEdit.m60051d(fv31Var, str);
        } else {
            lv31VarEdit.m60053f(fv31Var);
        }
        lv31VarEdit.m60054g();
    }
}
