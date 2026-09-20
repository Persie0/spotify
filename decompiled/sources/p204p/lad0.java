package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lad0 extends mce {

    /* JADX INFO: renamed from: j */
    public final long f131328j;

    public lad0(uio uioVar, sjo sjoVar, r300 r300Var, int i, Object obj, long j, long j2, long j3, String str) {
        super(uioVar, sjoVar, 1, r300Var, i, obj, j, j2, str);
        r300Var.getClass();
        this.f131328j = j3;
    }

    /* JADX INFO: renamed from: c */
    public long mo58544c() {
        long j = this.f131328j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo38894d();
}
