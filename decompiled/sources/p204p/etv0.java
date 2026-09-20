package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class etv0 extends eg40 {

    /* JADX INFO: renamed from: h */
    public static final etv0 f62810h;

    /* JADX INFO: renamed from: e */
    public final transient ylk0 f62811e;

    /* JADX INFO: renamed from: f */
    public final transient int f62812f;

    /* JADX INFO: renamed from: g */
    public transient ctv0 f62813g;

    static {
        ylk0 ylk0Var = new ylk0();
        ylk0Var.m94167d(3);
        f62810h = new etv0(ylk0Var);
    }

    public etv0(ylk0 ylk0Var) {
        this.f62811e = ylk0Var;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = ylk0Var.f274039c;
            if (i >= i2) {
                this.f62812f = k0e1.m54974I(j);
                return;
            } else {
                c95.m31847m(i, i2);
                j += (long) ylk0Var.f274038b[i];
                i++;
            }
        }
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: i */
    public final boolean mo1672i() {
        throw null;
    }

    @Override // p204p.eg40
    /* JADX INFO: renamed from: l */
    public final hg40 mo38770l() {
        ctv0 ctv0Var = this.f62813g;
        if (ctv0Var != null) {
            return ctv0Var;
        }
        ctv0 ctv0Var2 = new ctv0(this);
        this.f62813g = ctv0Var2;
        return ctv0Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f62812f;
    }

    @Override // p204p.eg40, p204p.ef40
    public Object writeReplace() {
        return new dtv0(this);
    }
}
