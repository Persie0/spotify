package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hg6 {

    /* JADX INFO: renamed from: a */
    public final z9j0 f91037a;

    /* JADX INFO: renamed from: b */
    public final k5m0 f91038b;

    public hg6(z9j0 z9j0Var, k5m0 k5m0Var) {
        this.f91037a = z9j0Var;
        this.f91038b = k5m0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m47415a(String str, d850 d850Var) {
        String strM38564m = edb.m38564m("spotify:assisted-curation?context=", str);
        n6j0 n6j0Var = d850Var != null ? new n6j0(d850Var) : null;
        if (strM38564m == null) {
            throw new IllegalStateException("uri was not set!");
        }
        this.f91037a.mo47348i(new p6j0(strM38564m, "", false, false, 0, 0, false, null, null, n6j0Var), og6.m66866h(strM38564m, str));
    }
}
