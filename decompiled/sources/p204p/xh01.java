package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xh01 implements pmj {

    /* JADX INFO: renamed from: a */
    public final String f261410a;

    /* JADX INFO: renamed from: b */
    public final int f261411b;

    /* JADX INFO: renamed from: c */
    public final hw4 f261412c;

    /* JADX INFO: renamed from: d */
    public final boolean f261413d;

    public xh01(String str, int i, hw4 hw4Var, boolean z) {
        this.f261410a = str;
        this.f261411b = i;
        this.f261412c = hw4Var;
        this.f261413d = z;
    }

    @Override // p204p.pmj
    /* JADX INFO: renamed from: a */
    public final hej mo26175a(r9b0 r9b0Var, u8b0 u8b0Var, oz8 oz8Var) {
        return new fh01(r9b0Var, oz8Var, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f261410a);
        sb.append(", index=");
        return edb.m38567p(sb, this.f261411b, '}');
    }
}
