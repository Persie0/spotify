package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wai implements gbi {

    /* JADX INFO: renamed from: a */
    public final String f249537a;

    public wai(String str) {
        this.f249537a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wai) && wj50.m88271j(this.f249537a, ((wai) obj).f249537a);
    }

    public final int hashCode() {
        return this.f249537a.hashCode();
    }
}
