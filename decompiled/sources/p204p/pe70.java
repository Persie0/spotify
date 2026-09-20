package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pe70 {

    /* JADX INFO: renamed from: a */
    public final String f176647a;

    /* JADX INFO: renamed from: b */
    public final String f176648b;

    public pe70(String str, String str2) {
        this.f176647a = str;
        this.f176648b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe70)) {
            return false;
        }
        pe70 pe70Var = (pe70) obj;
        return wj50.m88271j(this.f176647a, pe70Var.f176647a) && wj50.m88271j(this.f176648b, pe70Var.f176648b);
    }

    public final int hashCode() {
        return this.f176648b.hashCode() + (this.f176647a.hashCode() * 31);
    }
}
