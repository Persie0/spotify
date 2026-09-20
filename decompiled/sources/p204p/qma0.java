package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qma0 extends rma0 {

    /* JADX INFO: renamed from: a */
    public final String f190172a;

    /* JADX INFO: renamed from: b */
    public final String f190173b;

    /* JADX INFO: renamed from: c */
    public final cna0 f190174c;

    /* JADX INFO: renamed from: d */
    public final cna0 f190175d;

    public qma0(String str, String str2, cna0 cna0Var, cna0 cna0Var2) {
        this.f190172a = str;
        this.f190173b = str2;
        this.f190174c = cna0Var;
        this.f190175d = cna0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qma0)) {
            return false;
        }
        qma0 qma0Var = (qma0) obj;
        return wj50.m88271j(this.f190172a, qma0Var.f190172a) && wj50.m88271j(this.f190173b, qma0Var.f190173b) && wj50.m88271j(this.f190174c, qma0Var.f190174c) && wj50.m88271j(this.f190175d, qma0Var.f190175d);
    }

    public final int hashCode() {
        return this.f190175d.hashCode() + ((this.f190174c.hashCode() + s571.m77243b(this.f190172a.hashCode() * 31, 31, this.f190173b)) * 31);
    }
}
