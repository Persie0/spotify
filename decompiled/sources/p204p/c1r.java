package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class c1r implements d1r {

    /* JADX INFO: renamed from: a */
    public final String f33178a;

    public c1r(String str) {
        this.f33178a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1r) && wj50.m88271j(this.f33178a, ((c1r) obj).f33178a);
    }

    public final int hashCode() {
        return this.f33178a.hashCode();
    }
}
