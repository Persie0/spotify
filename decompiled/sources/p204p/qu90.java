package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qu90 implements iv90 {

    /* JADX INFO: renamed from: a */
    public final String f192609a;

    public qu90(String str) {
        this.f192609a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu90) && wj50.m88271j(this.f192609a, ((qu90) obj).f192609a);
    }

    public final int hashCode() {
        String str = this.f192609a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
