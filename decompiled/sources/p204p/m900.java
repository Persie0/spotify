package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class m900 {

    /* JADX INFO: renamed from: a */
    public final r300 f141183a;

    /* JADX INFO: renamed from: b */
    public final long f141184b;

    public m900(r300 r300Var, long j) {
        c95.m31844j(r300Var.f195358H != null, "format colorInfo must be set");
        int i = r300Var.f195394w;
        c95.m31842h("format width must be positive, but is: %s", i, i > 0);
        int i2 = r300Var.f195395x;
        c95.m31842h("format height must be positive, but is: %s", i2, i2 > 0);
        this.f141183a = r300Var;
        this.f141184b = j;
    }
}
