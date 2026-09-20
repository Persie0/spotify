package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j000 implements h000 {

    /* JADX INFO: renamed from: a */
    public final int f107322a;

    public j000(int i) {
        this.f107322a = i;
    }

    @Override // p204p.h000
    /* JADX INFO: renamed from: a */
    public final float mo46232a() {
        return this.f107322a;
    }

    @Override // p204p.h000
    /* JADX INFO: renamed from: b */
    public final String mo46233b() {
        return "wght";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j000) && this.f107322a == ((j000) obj).f107322a;
    }

    public final int hashCode() {
        return 113071012 + this.f107322a;
    }

    public final String toString() {
        return edb.m38567p(new StringBuilder("FontVariation.Setting(axisName='wght', value="), this.f107322a, ')');
    }
}
