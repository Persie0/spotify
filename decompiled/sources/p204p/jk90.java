package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class jk90 implements ot51, dqk0 {

    /* JADX INFO: renamed from: a */
    public final ft51 f113248a;

    /* JADX INFO: renamed from: b */
    public final hc80 f113249b;

    /* JADX INFO: renamed from: c */
    public final ck90 f113250c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f113251d;

    /* JADX INFO: renamed from: e */
    public boolean f113252e;

    /* JADX INFO: renamed from: f */
    public long f113253f;

    /* JADX INFO: renamed from: g */
    public Object f113254g;

    public jk90(ft51 ft51Var, hc80 hc80Var, ck90 ck90Var) {
        this.f113248a = ft51Var;
        this.f113249b = hc80Var;
        this.f113250c = ck90Var;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        if (this.f113251d) {
            return;
        }
        if (this.f113253f <= 0) {
            this.f113254g = obj;
            return;
        }
        this.f113254g = null;
        this.f113248a.onNext(obj);
        long j = this.f113253f;
        if (j != Long.MAX_VALUE) {
            this.f113253f = j - 1;
        }
    }

    @Override // p204p.ot51
    public final void cancel() {
        if (this.f113251d) {
            return;
        }
        this.f113251d = true;
        ki5.m56473e().m42761b(new ig10(this, 11));
    }

    @Override // p204p.ot51
    public final void request(long j) {
        if (this.f113251d) {
            return;
        }
        ki5.m56473e().m42761b(new f57(this, j, 1));
    }
}
