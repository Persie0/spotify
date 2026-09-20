package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nsf {

    /* JADX INFO: renamed from: a */
    public final String f157760a;

    /* JADX INFO: renamed from: b */
    public final boolean f157761b;

    /* JADX INFO: renamed from: c */
    public final boolean f157762c;

    public nsf(String str, boolean z, int i) {
        boolean z2 = (i & 8) == 0;
        this.f157760a = str;
        this.f157761b = z;
        this.f157762c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsf)) {
            return false;
        }
        nsf nsfVar = (nsf) obj;
        return wj50.m88271j(this.f157760a, nsfVar.f157760a) && this.f157761b == nsfVar.f157761b && this.f157762c == nsfVar.f157762c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157762c) + mt60.m62800g(16, s571.m77245d(this.f157760a.hashCode() * 31, 31, this.f157761b), 31);
    }
}
