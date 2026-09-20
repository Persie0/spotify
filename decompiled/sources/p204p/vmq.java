package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vmq {

    /* JADX INFO: renamed from: a */
    public final String f242906a;

    /* JADX INFO: renamed from: b */
    public final boolean f242907b;

    /* JADX INFO: renamed from: c */
    public final String f242908c;

    public vmq(String str, String str2, boolean z) {
        this.f242906a = str;
        this.f242907b = z;
        this.f242908c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmq)) {
            return false;
        }
        vmq vmqVar = (vmq) obj;
        return wj50.m88271j(this.f242906a, vmqVar.f242906a) && this.f242907b == vmqVar.f242907b && wj50.m88271j(this.f242908c, vmqVar.f242908c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f242906a.hashCode() * 31, 31, this.f242907b);
        String str = this.f242908c;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
