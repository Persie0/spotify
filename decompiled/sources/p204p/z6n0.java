package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z6n0 implements a7n0 {

    /* JADX INFO: renamed from: a */
    public final String f279965a;

    public z6n0(String str) {
        this.f279965a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6n0) && wj50.m88271j(this.f279965a, ((z6n0) obj).f279965a);
    }

    public final int hashCode() {
        return this.f279965a.hashCode();
    }
}
