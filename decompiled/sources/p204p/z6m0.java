package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z6m0 {

    /* JADX INFO: renamed from: a */
    public final String f279962a;

    /* JADX INFO: renamed from: b */
    public final String f279963b;

    public z6m0(String str, String str2) {
        this.f279962a = str;
        this.f279963b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m95512a() {
        return this.f279962a;
    }

    /* JADX INFO: renamed from: b */
    public final String m95513b() {
        return this.f279963b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6m0)) {
            return false;
        }
        z6m0 z6m0Var = (z6m0) obj;
        return wj50.m88271j(this.f279962a, z6m0Var.f279962a) && wj50.m88271j(this.f279963b, z6m0Var.f279963b);
    }

    public final int hashCode() {
        return this.f279963b.hashCode() + (this.f279962a.hashCode() * 31);
    }
}
