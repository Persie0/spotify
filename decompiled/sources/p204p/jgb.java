package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jgb {

    /* JADX INFO: renamed from: a */
    public final dwg1 f112133a;

    /* JADX INFO: renamed from: b */
    public final boolean f112134b;

    public jgb(dwg1 dwg1Var, boolean z) {
        this.f112133a = dwg1Var;
        this.f112134b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgb)) {
            return false;
        }
        jgb jgbVar = (jgb) obj;
        return this.f112133a.equals(jgbVar.f112133a) && this.f112134b == jgbVar.f112134b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112134b) + (this.f112133a.hashCode() * 31);
    }
}
