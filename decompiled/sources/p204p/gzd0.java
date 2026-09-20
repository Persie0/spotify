package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gzd0 implements dqk0 {

    /* JADX INFO: renamed from: a */
    public final ck90 f85897a;

    /* JADX INFO: renamed from: b */
    public final dqk0 f85898b;

    /* JADX INFO: renamed from: c */
    public int f85899c = -1;

    public gzd0(ck90 ck90Var, dqk0 dqk0Var) {
        this.f85897a = ck90Var;
        this.f85898b = dqk0Var;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        int i = this.f85899c;
        int i2 = this.f85897a.f38886g;
        if (i != i2) {
            this.f85899c = i2;
            this.f85898b.mo31453b(obj);
        }
    }
}
