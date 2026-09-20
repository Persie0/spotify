package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cm60 extends AbstractC1887g7 {

    /* JADX INFO: renamed from: f */
    public final jk60 f39600f;

    /* JADX INFO: renamed from: g */
    public final int f39601g;

    /* JADX INFO: renamed from: h */
    public int f39602h;

    public cm60(fk60 fk60Var, jk60 jk60Var) {
        super(null, fk60Var);
        this.f39600f = jk60Var;
        this.f39601g = jk60Var.f113228a.size();
        this.f39602h = -1;
    }

    @Override // p204p.AbstractC1887g7
    /* JADX INFO: renamed from: G */
    public final yk60 mo29809G() {
        return this.f39600f;
    }

    @Override // p204p.AbstractC1887g7
    /* JADX INFO: renamed from: e */
    public final yk60 mo29815e(String str) {
        return (yk60) this.f39600f.f113228a.get(Integer.parseInt(str));
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: p */
    public final int mo29816p(ktz0 ktz0Var) {
        int i = this.f39602h;
        if (i >= this.f39601g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f39602h = i2;
        return i2;
    }

    @Override // p204p.AbstractC1887g7
    /* JADX INFO: renamed from: z */
    public final String mo29817z(ktz0 ktz0Var, int i) {
        return String.valueOf(i);
    }
}
