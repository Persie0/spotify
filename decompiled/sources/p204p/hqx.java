package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hqx {

    /* JADX INFO: renamed from: a */
    public final String f94264a;

    /* JADX INFO: renamed from: b */
    public final int f94265b;

    public hqx(String str, int i) {
        this.f94264a = str;
        this.f94265b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqx)) {
            return false;
        }
        hqx hqxVar = (hqx) obj;
        return wj50.m88271j(this.f94264a, hqxVar.f94264a) && this.f94265b == hqxVar.f94265b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f94265b) + (this.f94264a.hashCode() * 31);
    }
}
