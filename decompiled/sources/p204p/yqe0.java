package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yqe0 implements zqe0 {

    /* JADX INFO: renamed from: a */
    public final String f275207a;

    public yqe0(String str) {
        this.f275207a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqe0) && wj50.m88271j(this.f275207a, ((yqe0) obj).f275207a);
    }

    @Override // p204p.zqe0
    public final String getId() {
        return this.f275207a;
    }

    public final int hashCode() {
        return this.f275207a.hashCode();
    }
}
