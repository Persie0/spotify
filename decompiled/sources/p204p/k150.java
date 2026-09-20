package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k150 {

    /* JADX INFO: renamed from: a */
    public final String f118205a;

    /* JADX INFO: renamed from: b */
    public final i150 f118206b;

    /* JADX INFO: renamed from: c */
    public final boolean f118207c;

    public k150(String str, i150 i150Var, boolean z) {
        this.f118205a = str;
        this.f118206b = i150Var;
        this.f118207c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k150)) {
            return false;
        }
        k150 k150Var = (k150) obj;
        return wj50.m88271j(this.f118205a, k150Var.f118205a) && wj50.m88271j(this.f118206b, k150Var.f118206b) && this.f118207c == k150Var.f118207c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f118207c) + ((this.f118206b.hashCode() + (this.f118205a.hashCode() * 31)) * 31);
    }
}
