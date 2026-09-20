package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u2v0 implements v2v0 {

    /* JADX INFO: renamed from: a */
    public final String f226183a;

    public u2v0(String str) {
        this.f226183a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2v0) && wj50.m88271j(this.f226183a, ((u2v0) obj).f226183a);
    }

    public final int hashCode() {
        return this.f226183a.hashCode();
    }
}
