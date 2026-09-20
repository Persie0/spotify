package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ala {

    /* JADX INFO: renamed from: a */
    public final boolean f16822a;

    /* JADX INFO: renamed from: b */
    public final api f16823b;

    /* JADX INFO: renamed from: c */
    public final boolean f16824c;

    /* JADX INFO: renamed from: d */
    public final boolean f16825d;

    public ala(boolean z, api apiVar, boolean z2, boolean z3) {
        this.f16822a = z;
        this.f16823b = apiVar;
        this.f16824c = z2;
        this.f16825d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ala)) {
            return false;
        }
        ala alaVar = (ala) obj;
        return this.f16822a == alaVar.f16822a && wj50.m88271j(this.f16823b, alaVar.f16823b) && this.f16824c == alaVar.f16824c && this.f16825d == alaVar.f16825d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f16822a) * 31;
        api apiVar = this.f16823b;
        return Boolean.hashCode(this.f16825d) + s571.m77245d((iHashCode + (apiVar == null ? 0 : apiVar.hashCode())) * 31, 31, this.f16824c);
    }
}
