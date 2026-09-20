package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kj71 implements mj71 {

    /* JADX INFO: renamed from: a */
    public final String f123258a;

    public kj71(String str) {
        this.f123258a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kj71) && wj50.m88271j(this.f123258a, ((kj71) obj).f123258a);
    }

    public final int hashCode() {
        return this.f123258a.hashCode();
    }
}
