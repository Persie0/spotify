package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class u140 {

    /* JADX INFO: renamed from: a */
    public final String f225678a;

    /* JADX INFO: renamed from: b */
    public final String f225679b;

    public u140(String str, String str2) {
        this.f225678a = str;
        this.f225679b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u140)) {
            return false;
        }
        u140 u140Var = (u140) obj;
        return wj50.m88271j(this.f225678a, u140Var.f225678a) && wj50.m88271j(this.f225679b, u140Var.f225679b);
    }

    public final int hashCode() {
        return this.f225679b.hashCode() + (this.f225678a.hashCode() * 31);
    }
}
