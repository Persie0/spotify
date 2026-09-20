package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class llf implements bmf {

    /* JADX INFO: renamed from: a */
    public final String f134626a;

    /* JADX INFO: renamed from: b */
    public final String f134627b;

    /* JADX INFO: renamed from: c */
    public final String f134628c;

    /* JADX INFO: renamed from: d */
    public final long f134629d;

    /* JADX INFO: renamed from: e */
    public final boolean f134630e;

    public llf(String str, String str2, String str3, long j, boolean z) {
        this.f134626a = str;
        this.f134627b = str2;
        this.f134628c = str3;
        this.f134629d = j;
        this.f134630e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llf)) {
            return false;
        }
        llf llfVar = (llf) obj;
        return wj50.m88271j(this.f134626a, llfVar.f134626a) && wj50.m88271j(this.f134627b, llfVar.f134627b) && wj50.m88271j(this.f134628c, llfVar.f134628c) && this.f134629d == llfVar.f134629d && this.f134630e == llfVar.f134630e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f134630e) + dq60.m36605e(s571.m77243b(s571.m77243b(this.f134626a.hashCode() * 31, 31, this.f134627b), 31, this.f134628c), this.f134629d, 31);
    }
}
