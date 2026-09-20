package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u181 {

    /* JADX INFO: renamed from: a */
    public final String f225716a;

    /* JADX INFO: renamed from: b */
    public final String f225717b;

    public u181(String str, String str2) {
        this.f225716a = str;
        this.f225717b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u181)) {
            return false;
        }
        u181 u181Var = (u181) obj;
        return wj50.m88271j(this.f225716a, u181Var.f225716a) && wj50.m88271j(this.f225717b, u181Var.f225717b);
    }

    public final int hashCode() {
        return this.f225717b.hashCode() + (this.f225716a.hashCode() * 31);
    }
}
