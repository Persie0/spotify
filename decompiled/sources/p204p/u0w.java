package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u0w {

    /* JADX INFO: renamed from: a */
    public final String f225616a;

    /* JADX INFO: renamed from: b */
    public final boolean f225617b;

    public u0w(String str, boolean z) {
        this.f225616a = str;
        this.f225617b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0w)) {
            return false;
        }
        u0w u0wVar = (u0w) obj;
        return wj50.m88271j(this.f225616a, u0wVar.f225616a) && this.f225617b == u0wVar.f225617b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225617b) + (this.f225616a.hashCode() * 31);
    }
}
