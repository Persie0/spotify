package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ca20 {

    /* JADX INFO: renamed from: a */
    public final a6e f35705a;

    /* JADX INFO: renamed from: b */
    public final String f35706b;

    public ca20(a6e a6eVar, String str) {
        this.f35705a = a6eVar;
        this.f35706b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca20)) {
            return false;
        }
        ca20 ca20Var = (ca20) obj;
        return wj50.m88271j(this.f35705a, ca20Var.f35705a) && wj50.m88271j(this.f35706b, ca20Var.f35706b);
    }

    public final int hashCode() {
        return this.f35706b.hashCode() + (this.f35705a.hashCode() * 31);
    }
}
