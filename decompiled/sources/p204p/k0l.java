package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class k0l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f118117a;

    public k0l(String str) {
        this.f118117a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0l) && wj50.m88271j(this.f118117a, ((k0l) obj).f118117a);
    }

    public final int hashCode() {
        return this.f118117a.hashCode();
    }
}
