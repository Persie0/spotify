package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wqj implements yqj {

    /* JADX INFO: renamed from: a */
    public final Exception f254050a;

    public wqj(Exception exc) {
        this.f254050a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqj) && wj50.m88271j(this.f254050a, ((wqj) obj).f254050a);
    }

    public final int hashCode() {
        return this.f254050a.hashCode();
    }
}
