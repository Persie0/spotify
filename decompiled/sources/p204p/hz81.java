package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hz81 implements jz81 {

    /* JADX INFO: renamed from: a */
    public final String f96835a;

    /* JADX INFO: renamed from: b */
    public final long f96836b;

    /* JADX INFO: renamed from: c */
    public final Long f96837c;

    public hz81(long j, Long l, String str) {
        this.f96835a = str;
        this.f96836b = j;
        this.f96837c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz81)) {
            return false;
        }
        hz81 hz81Var = (hz81) obj;
        return wj50.m88271j(this.f96835a, hz81Var.f96835a) && this.f96836b == hz81Var.f96836b && wj50.m88271j(this.f96837c, hz81Var.f96837c);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(this.f96835a.hashCode() * 31, this.f96836b, 31);
        Long l = this.f96837c;
        return iM36605e + (l == null ? 0 : l.hashCode());
    }
}
