package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class oom0 {

    /* JADX INFO: renamed from: a */
    public final hb11 f167666a;

    /* JADX INFO: renamed from: b */
    public final hb11 f167667b;

    /* JADX INFO: renamed from: c */
    public final hb11 f167668c;

    public oom0(hb11 hb11Var, hb11 hb11Var2, hb11 hb11Var3) {
        this.f167666a = hb11Var;
        this.f167667b = hb11Var2;
        this.f167668c = hb11Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oom0)) {
            return false;
        }
        oom0 oom0Var = (oom0) obj;
        return this.f167666a.equals(oom0Var.f167666a) && this.f167667b.equals(oom0Var.f167667b) && this.f167668c.equals(oom0Var.f167668c);
    }

    public final int hashCode() {
        return this.f167668c.hashCode() + ((this.f167667b.hashCode() + (this.f167666a.hashCode() * 31)) * 31);
    }
}
