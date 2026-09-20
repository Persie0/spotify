package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wdz {

    /* JADX INFO: renamed from: a */
    public final boolean f250384a;

    /* JADX INFO: renamed from: b */
    public final boolean f250385b;

    /* JADX INFO: renamed from: c */
    public final String f250386c;

    /* JADX INFO: renamed from: d */
    public final boolean f250387d;

    public wdz(String str, boolean z, boolean z2, boolean z3) {
        this.f250384a = z;
        this.f250385b = z2;
        this.f250386c = str;
        this.f250387d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdz)) {
            return false;
        }
        wdz wdzVar = (wdz) obj;
        return this.f250384a == wdzVar.f250384a && this.f250385b == wdzVar.f250385b && wj50.m88271j(this.f250386c, wdzVar.f250386c) && this.f250387d == wdzVar.f250387d;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f250384a) * 31, 31, this.f250385b);
        String str = this.f250386c;
        return Boolean.hashCode(this.f250387d) + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }
}
