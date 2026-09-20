package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u4n0 implements v4n0 {

    /* JADX INFO: renamed from: a */
    public final String f226777a;

    public u4n0(String str) {
        this.f226777a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4n0) && wj50.m88271j(this.f226777a, ((u4n0) obj).f226777a);
    }

    public final int hashCode() {
        return this.f226777a.hashCode();
    }
}
