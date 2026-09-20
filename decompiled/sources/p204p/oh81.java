package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class oh81 {

    /* JADX INFO: renamed from: a */
    public final String f165370a;

    /* JADX INFO: renamed from: b */
    public final long f165371b;

    /* JADX INFO: renamed from: c */
    public final long f165372c;

    /* JADX INFO: renamed from: d */
    public final long f165373d;

    /* JADX INFO: renamed from: e */
    public final boolean f165374e;

    public /* synthetic */ oh81(String str) {
        this(str, 0L, 0L, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh81)) {
            return false;
        }
        oh81 oh81Var = (oh81) obj;
        return wj50.m88271j(this.f165370a, oh81Var.f165370a) && this.f165371b == oh81Var.f165371b && this.f165372c == oh81Var.f165372c && this.f165373d == oh81Var.f165373d && this.f165374e == oh81Var.f165374e;
    }

    public final int hashCode() {
        String str = this.f165370a;
        return Boolean.hashCode(this.f165374e) + dq60.m36605e(dq60.m36605e(dq60.m36605e((str == null ? 0 : str.hashCode()) * 31, this.f165371b, 31), this.f165372c, 31), this.f165373d, 31);
    }

    public oh81(String str, long j, long j2, long j3, boolean z) {
        this.f165370a = str;
        this.f165371b = j;
        this.f165372c = j2;
        this.f165373d = j3;
        this.f165374e = z;
    }
}
