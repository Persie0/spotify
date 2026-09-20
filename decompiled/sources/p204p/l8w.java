package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l8w {

    /* JADX INFO: renamed from: a */
    public final String f130948a;

    /* JADX INFO: renamed from: b */
    public final String f130949b;

    /* JADX INFO: renamed from: c */
    public final String f130950c;

    /* JADX INFO: renamed from: d */
    public final qsj f130951d;

    /* JADX INFO: renamed from: e */
    public final boolean f130952e;

    public l8w(String str, String str2, String str3, qsj qsjVar, boolean z) {
        this.f130948a = str;
        this.f130949b = str2;
        this.f130950c = str3;
        this.f130951d = qsjVar;
        this.f130952e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8w)) {
            return false;
        }
        l8w l8wVar = (l8w) obj;
        return wj50.m88271j(this.f130948a, l8wVar.f130948a) && wj50.m88271j(this.f130949b, l8wVar.f130949b) && wj50.m88271j(this.f130950c, l8wVar.f130950c) && this.f130951d == l8wVar.f130951d && this.f130952e == l8wVar.f130952e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130952e) + xl81.m91401j(this.f130951d, s571.m77243b(s571.m77243b(this.f130948a.hashCode() * 31, 31, this.f130949b), 31, this.f130950c), 31);
    }
}
