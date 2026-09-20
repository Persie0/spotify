package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ik90 implements ot51, dqk0 {

    /* JADX INFO: renamed from: a */
    public final ft51 f103070a;

    /* JADX INFO: renamed from: b */
    public final ck90 f103071b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f103072c;

    /* JADX INFO: renamed from: d */
    public boolean f103073d;

    /* JADX INFO: renamed from: e */
    public long f103074e;

    /* JADX INFO: renamed from: f */
    public Object f103075f;

    public ik90(ft51 ft51Var, ck90 ck90Var) {
        this.f103070a = ft51Var;
        this.f103071b = ck90Var;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        if (this.f103072c) {
            return;
        }
        if (this.f103074e <= 0) {
            this.f103075f = obj;
            return;
        }
        this.f103075f = null;
        this.f103070a.onNext(obj);
        long j = this.f103074e;
        if (j != Long.MAX_VALUE) {
            this.f103074e = j - 1;
        }
    }

    @Override // p204p.ot51
    public final void cancel() {
        if (this.f103072c) {
            return;
        }
        this.f103072c = true;
        ki5.m56473e().m42761b(new kk00(this, 10));
    }

    @Override // p204p.ot51
    public final void request(long j) {
        if (this.f103072c) {
            return;
        }
        ki5.m56473e().m42761b(new wkp(this, j, 2));
    }
}
