package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class w72 {

    /* JADX INFO: renamed from: a */
    public final ron0 f248520a;

    /* JADX INFO: renamed from: b */
    public final y72 f248521b;

    /* JADX INFO: renamed from: c */
    public final x401 f248522c;

    public w72(boolean z, boolean z2, ron0 ron0Var, y72 y72Var) {
        this.f248520a = ron0Var;
        this.f248521b = y72Var;
        x401 x401Var = new x401();
        if (z) {
            x401Var.add(gn80.SHOW_EPISODE);
        }
        if (z2) {
            x401Var.add(gn80.TRACK);
        }
        this.f248522c = n0e1.m63425d(x401Var);
    }
}
