package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eui implements lui {

    /* JADX INFO: renamed from: a */
    public final hui f62984a;

    /* JADX INFO: renamed from: b */
    public final fat0 f62985b;

    public eui(hui huiVar, fat0 fat0Var) {
        this.f62984a = huiVar;
        this.f62985b = fat0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eui)) {
            return false;
        }
        eui euiVar = (eui) obj;
        return wj50.m88271j(this.f62984a, euiVar.f62984a) && wj50.m88271j(this.f62985b, euiVar.f62985b);
    }

    public final int hashCode() {
        return this.f62985b.hashCode() + (this.f62984a.hashCode() * 31);
    }
}
