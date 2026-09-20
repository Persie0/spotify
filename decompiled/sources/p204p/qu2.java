package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qu2 implements tu2 {

    /* JADX INFO: renamed from: a */
    public final String f192546a;

    public qu2(String str) {
        this.f192546a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu2) && wj50.m88271j(this.f192546a, ((qu2) obj).f192546a);
    }

    public final int hashCode() {
        return this.f192546a.hashCode();
    }
}
