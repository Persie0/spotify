package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wqh implements yqh {

    /* JADX INFO: renamed from: a */
    public final String f254045a;

    public wqh(String str) {
        this.f254045a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqh) && wj50.m88271j(this.f254045a, ((wqh) obj).f254045a);
    }

    public final int hashCode() {
        return this.f254045a.hashCode();
    }
}
