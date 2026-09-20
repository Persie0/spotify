package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wqx implements irx {

    /* JADX INFO: renamed from: a */
    public final String f254191a;

    public wqx(String str) {
        this.f254191a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqx) && wj50.m88271j(this.f254191a, ((wqx) obj).f254191a);
    }

    public final int hashCode() {
        return this.f254191a.hashCode();
    }
}
