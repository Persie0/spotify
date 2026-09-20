package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xqe0 implements zqe0 {

    /* JADX INFO: renamed from: a */
    public final String f264974a;

    public xqe0(String str) {
        this.f264974a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqe0) && wj50.m88271j(this.f264974a, ((xqe0) obj).f264974a);
    }

    @Override // p204p.zqe0
    public final String getId() {
        return this.f264974a;
    }

    public final int hashCode() {
        return this.f264974a.hashCode();
    }
}
