package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kdj0 {

    /* JADX INFO: renamed from: a */
    public final wwu f121688a;

    /* JADX INFO: renamed from: b */
    public final String f121689b;

    /* JADX INFO: renamed from: c */
    public final String f121690c;

    public kdj0(wwu wwuVar, String str, String str2) {
        this.f121688a = wwuVar;
        this.f121689b = str;
        this.f121690c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdj0)) {
            return false;
        }
        kdj0 kdj0Var = (kdj0) obj;
        return wj50.m88271j(this.f121688a, kdj0Var.f121688a) && wj50.m88271j(this.f121689b, kdj0Var.f121689b) && wj50.m88271j(this.f121690c, kdj0Var.f121690c);
    }

    public final int hashCode() {
        return this.f121690c.hashCode() + s571.m77243b(this.f121688a.hashCode() * 31, 31, this.f121689b);
    }
}
