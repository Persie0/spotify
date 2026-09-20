package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h930 extends l930 {

    /* JADX INFO: renamed from: a */
    public final String f88865a;

    /* JADX INFO: renamed from: b */
    public final m730 f88866b;

    public h930(String str, m730 m730Var) {
        this.f88865a = str;
        this.f88866b = m730Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h930)) {
            return false;
        }
        h930 h930Var = (h930) obj;
        return wj50.m88271j(this.f88865a, h930Var.f88865a) && wj50.m88271j(this.f88866b, h930Var.f88866b);
    }

    public final int hashCode() {
        return this.f88866b.hashCode() + (this.f88865a.hashCode() * 31);
    }
}
