package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gk5 implements fk5 {

    /* JADX INFO: renamed from: c */
    public static final Object f80732c;

    /* JADX INFO: renamed from: a */
    public final hv31 f80733a;

    /* JADX INFO: renamed from: b */
    public final xre f80734b;

    static {
        si5 si5Var = fv31.f73628b;
        f80732c = kkc0.m56695h0(new pqm0("prompted_playlists", si5Var.m78183U("artifact_disclosure_last_shown_prompted_playlists")), new pqm0("bluejay", si5Var.m78183U("artifact_disclosure_last_shown_bluejay")), new pqm0("bluejay_start", si5Var.m78183U("artifact_disclosure_last_shown_bluejay_start")));
    }

    public gk5(xre xreVar, hv31 hv31Var) {
        this.f80733a = hv31Var;
        this.f80734b = xreVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final boolean m45035a(String str) {
        Object obj = f80732c.get(str);
        if (obj == null) {
            throw new IllegalStateException("No disclosure key registered for content type: ".concat(str).toString());
        }
        long jMo48712g = this.f80733a.mo48712g((fv31) obj, 0L);
        if (str.equals("bluejay_start")) {
            return jMo48712g == 0;
        }
        ((wy3) this.f80734b).getClass();
        return jMo48712g == 0 || (System.currentTimeMillis() - jMo48712g) / 86400000 >= 30;
    }
}
