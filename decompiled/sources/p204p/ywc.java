package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ywc implements zwc {

    /* JADX INFO: renamed from: a */
    public final String f276942a;

    /* JADX INFO: renamed from: b */
    public final boolean f276943b;

    /* JADX INFO: renamed from: c */
    public final boolean f276944c;

    public ywc(String str, boolean z, boolean z2) {
        this.f276942a = str;
        this.f276943b = z;
        this.f276944c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywc)) {
            return false;
        }
        ywc ywcVar = (ywc) obj;
        return wj50.m88271j(this.f276942a, ywcVar.f276942a) && this.f276943b == ywcVar.f276943b && this.f276944c == ywcVar.f276944c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f276944c) + s571.m77245d(this.f276942a.hashCode() * 31, 31, this.f276943b);
    }
}
