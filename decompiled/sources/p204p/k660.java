package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k660 implements m660 {

    /* JADX INFO: renamed from: a */
    public final String f119679a;

    /* JADX INFO: renamed from: b */
    public final String f119680b;

    public k660(String str, String str2) {
        this.f119679a = str;
        this.f119680b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k660)) {
            return false;
        }
        k660 k660Var = (k660) obj;
        return wj50.m88271j(this.f119679a, k660Var.f119679a) && wj50.m88271j(this.f119680b, k660Var.f119680b);
    }

    public final int hashCode() {
        return this.f119680b.hashCode() + (this.f119679a.hashCode() * 31);
    }
}
