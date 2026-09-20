package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zt00 implements du00 {

    /* JADX INFO: renamed from: a */
    public final String f286032a;

    /* JADX INFO: renamed from: b */
    public final boolean f286033b;

    public zt00(String str, boolean z) {
        this.f286032a = str;
        this.f286033b = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m96898a() {
        return this.f286033b;
    }

    /* JADX INFO: renamed from: b */
    public final String m96899b() {
        return this.f286032a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt00)) {
            return false;
        }
        zt00 zt00Var = (zt00) obj;
        return wj50.m88271j(this.f286032a, zt00Var.f286032a) && this.f286033b == zt00Var.f286033b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f286033b) + (this.f286032a.hashCode() * 31);
    }
}
