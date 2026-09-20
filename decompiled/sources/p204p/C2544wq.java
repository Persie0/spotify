package p204p;

/* JADX INFO: renamed from: p.wq */
/* JADX INFO: loaded from: classes4.dex */
public final class C2544wq implements InterfaceC2622yq {

    /* JADX INFO: renamed from: a */
    public final String f253871a;

    /* JADX INFO: renamed from: b */
    public final String f253872b;

    /* JADX INFO: renamed from: c */
    public final boolean f253873c;

    public C2544wq(String str, String str2, boolean z) {
        this.f253871a = str;
        this.f253872b = str2;
        this.f253873c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2544wq)) {
            return false;
        }
        C2544wq c2544wq = (C2544wq) obj;
        return wj50.m88271j(this.f253871a, c2544wq.f253871a) && wj50.m88271j(this.f253872b, c2544wq.f253872b) && this.f253873c == c2544wq.f253873c;
    }

    public final int hashCode() {
        String str = this.f253871a;
        return Boolean.hashCode(this.f253873c) + s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f253872b);
    }
}
