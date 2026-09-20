package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ppa {

    /* JADX INFO: renamed from: a */
    public final int f179983a;

    /* JADX INFO: renamed from: b */
    public final long f179984b;

    /* JADX INFO: renamed from: c */
    public final long f179985c;

    /* JADX INFO: renamed from: d */
    public final long f179986d;

    public ppa(int i, long j, long j2) {
        this.f179983a = i;
        this.f179984b = j;
        this.f179985c = j2;
        boolean z = j2 != -1;
        long j3 = j2 - j;
        this.f179986d = (z && (j3 >= 0)) ? j3 : 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppa)) {
            return false;
        }
        ppa ppaVar = (ppa) obj;
        return this.f179983a == ppaVar.f179983a && this.f179984b == ppaVar.f179984b && this.f179985c == ppaVar.f179985c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f179985c) + dq60.m36605e(edb.m38547C(this.f179983a) * 31, this.f179984b, 31);
    }

    public /* synthetic */ ppa(int i, long j) {
        this(i, j, -1L);
    }
}
