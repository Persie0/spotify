package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yzk {

    /* JADX INFO: renamed from: c */
    public static final urv0 f277836c = new urv0("[\n\t\r ]");

    /* JADX INFO: renamed from: d */
    public static final wg61 f277837d = new wg61(bpj.f29485M0);

    /* JADX INFO: renamed from: e */
    public static final wg61 f277838e = new wg61(bpj.f29484L0);

    /* JADX INFO: renamed from: a */
    public final double f277839a;

    /* JADX INFO: renamed from: b */
    public final double f277840b;

    public yzk(double d, double d2) {
        this.f277839a = d;
        this.f277840b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzk)) {
            return false;
        }
        yzk yzkVar = (yzk) obj;
        return Double.compare(this.f277839a, yzkVar.f277839a) == 0 && Double.compare(this.f277840b, yzkVar.f277840b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f277840b) + (Double.hashCode(this.f277839a) * 31);
    }
}
