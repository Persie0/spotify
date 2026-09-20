package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gbe {

    /* JADX INFO: renamed from: a */
    public final boolean f78280a;

    /* JADX INFO: renamed from: b */
    public final boolean f78281b;

    /* JADX INFO: renamed from: c */
    public final boolean f78282c;

    /* JADX INFO: renamed from: d */
    public final boolean f78283d;

    /* JADX INFO: renamed from: e */
    public final boolean f78284e;

    public gbe(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f78280a = z;
        this.f78281b = z2;
        this.f78282c = z3;
        this.f78283d = z4;
        this.f78284e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbe)) {
            return false;
        }
        gbe gbeVar = (gbe) obj;
        return this.f78280a == gbeVar.f78280a && this.f78281b == gbeVar.f78281b && this.f78282c == gbeVar.f78282c && this.f78283d == gbeVar.f78283d && this.f78284e == gbeVar.f78284e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78284e) + s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f78280a) * 31, 31, this.f78281b), 31, this.f78282c), 31, this.f78283d);
    }
}
