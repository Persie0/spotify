package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ks70 extends dzg1 {

    /* JADX INFO: renamed from: f */
    public static final xaf f125857f = new xaf(12);

    /* JADX INFO: renamed from: b */
    public final ws70 f125858b = new ws70(this);

    /* JADX INFO: renamed from: c */
    public final zk1 f125859c = new zk1(22, (byte) 0);

    /* JADX INFO: renamed from: d */
    public boolean f125860d;

    /* JADX INFO: renamed from: e */
    public soi0 f125861e;

    public ks70(gh00 gh00Var) {
        gh00Var.invoke(this);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m57191y(ks70 ks70Var, Object obj, kzd1 kzd1Var, fyf fyfVar, int i) {
        fh30 fh30Var = fh30.f69556c;
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            fh30Var = null;
        }
        if ((i & 4) != 0) {
            kzd1Var = null;
        }
        ks70Var.m57192x(obj, fh30Var, kzd1Var, fyfVar);
    }

    @Override // p204p.dzg1
    /* JADX INFO: renamed from: t */
    public final zk1 mo27504t() {
        return this.f125859c;
    }

    /* JADX INFO: renamed from: x */
    public final void m57192x(Object obj, gh00 gh00Var, Object obj2, fyf fyfVar) {
        this.f125859c.m96278c(1, new gs70(obj != null ? new lw70(obj, 0) : null, gh00Var != null ? new hs70(0, gh00Var) : f125857f, new lw70(obj2, 0), new fyf(new is70(fyfVar, 0), true, -291643851)));
        if (gh00Var != null) {
            this.f125860d = true;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m57193z(int i, gh00 gh00Var, th00 th00Var, gh00 gh00Var2, fyf fyfVar) {
        this.f125859c.m96278c(i, new gs70(gh00Var, th00Var == null ? f125857f : th00Var, gh00Var2, fyfVar));
        if (th00Var != null) {
            this.f125860d = true;
        }
    }
}
