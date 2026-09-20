package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class omq0 {

    /* JADX INFO: renamed from: a */
    public final String f167076a;

    /* JADX INFO: renamed from: b */
    public final m1b f167077b;

    /* JADX INFO: renamed from: c */
    public final boolean f167078c;

    /* JADX INFO: renamed from: d */
    public final ogz f167079d;

    /* JADX INFO: renamed from: e */
    public final jsa0 f167080e;

    public omq0(String str, m1b m1bVar, boolean z, ogz ogzVar, jsa0 jsa0Var) {
        this.f167076a = str;
        this.f167077b = m1bVar;
        this.f167078c = z;
        this.f167079d = ogzVar;
        this.f167080e = jsa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omq0)) {
            return false;
        }
        omq0 omq0Var = (omq0) obj;
        return wj50.m88271j(this.f167076a, omq0Var.f167076a) && wj50.m88271j(this.f167077b, omq0Var.f167077b) && this.f167078c == omq0Var.f167078c && wj50.m88271j(this.f167079d, omq0Var.f167079d) && wj50.m88271j(this.f167080e, omq0Var.f167080e);
    }

    public final int hashCode() {
        String str = this.f167076a;
        int iM77245d = s571.m77245d((this.f167077b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f167078c);
        ogz ogzVar = this.f167079d;
        int iHashCode = (iM77245d + (ogzVar == null ? 0 : ogzVar.hashCode())) * 31;
        jsa0 jsa0Var = this.f167080e;
        return iHashCode + (jsa0Var != null ? jsa0Var.hashCode() : 0);
    }
}
