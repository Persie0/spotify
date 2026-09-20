package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wcy0 {

    /* JADX INFO: renamed from: a */
    public final scy0 f250144a;

    /* JADX INFO: renamed from: b */
    public final long f250145b;

    /* JADX INFO: renamed from: c */
    public final boolean f250146c;

    /* JADX INFO: renamed from: d */
    public final long f250147d;

    public wcy0(scy0 scy0Var, long j, boolean z, long j2) {
        this.f250144a = scy0Var;
        this.f250145b = j;
        this.f250146c = z;
        this.f250147d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static wcy0 m87766a(wcy0 wcy0Var, scy0 scy0Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            scy0Var = wcy0Var.f250144a;
        }
        scy0 scy0Var2 = scy0Var;
        if ((i & 2) != 0) {
            j = wcy0Var.f250145b;
        }
        long j3 = j;
        boolean z = (i & 4) != 0 ? wcy0Var.f250146c : true;
        if ((i & 8) != 0) {
            j2 = wcy0Var.f250147d;
        }
        wcy0Var.getClass();
        return new wcy0(scy0Var2, j3, z, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcy0)) {
            return false;
        }
        wcy0 wcy0Var = (wcy0) obj;
        return wj50.m88271j(this.f250144a, wcy0Var.f250144a) && this.f250145b == wcy0Var.f250145b && this.f250146c == wcy0Var.f250146c && this.f250147d == wcy0Var.f250147d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f250147d) + s571.m77245d(dq60.m36605e(this.f250144a.hashCode() * 31, this.f250145b, 31), 31, this.f250146c);
    }
}
