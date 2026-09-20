package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzq implements k0r {

    /* JADX INFO: renamed from: a */
    public final fuo f288059a;

    /* JADX INFO: renamed from: b */
    public final boolean f288060b;

    /* JADX INFO: renamed from: c */
    public final boolean f288061c;

    public zzq(fuo fuoVar, boolean z, boolean z2, int i) {
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        this.f288059a = fuoVar;
        this.f288060b = z;
        this.f288061c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return wj50.m88271j(this.f288059a, zzqVar.f288059a) && this.f288060b == zzqVar.f288060b && this.f288061c == zzqVar.f288061c;
    }

    public final int hashCode() {
        fuo fuoVar = this.f288059a;
        return Boolean.hashCode(this.f288061c) + s571.m77245d((fuoVar == null ? 0 : fuoVar.hashCode()) * 31, 31, this.f288060b);
    }
}
