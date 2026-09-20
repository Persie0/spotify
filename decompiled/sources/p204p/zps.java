package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class zps extends aqs {

    /* JADX INFO: renamed from: X */
    public final double f285203X;

    /* JADX INFO: renamed from: h */
    public final double f285204h;

    /* JADX INFO: renamed from: i */
    public final double f285205i;

    /* JADX INFO: renamed from: t */
    public final double f285206t;

    public zps(String str) {
        this.f18776b = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f285204h = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i);
        this.f285205i = Double.parseDouble(str.substring(i, iIndexOf3).trim());
        int i2 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(44, i2);
        this.f285206t = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
        int i3 = iIndexOf4 + 1;
        this.f285203X = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
    }

    @Override // p204p.aqs
    /* JADX INFO: renamed from: c */
    public final double mo26896c(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 0.01d) {
            d2 *= 0.5d;
            d3 = m96692k(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double dM96692k = m96692k(d4);
        double d5 = d3 + d2;
        double dM96692k2 = m96692k(d5);
        double dM96693l = m96693l(d4);
        return (((d - dM96692k) * (m96693l(d5) - dM96693l)) / (dM96692k2 - dM96692k)) + dM96693l;
    }

    @Override // p204p.aqs
    /* JADX INFO: renamed from: d */
    public final double mo26897d(double d) {
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 1.0E-4d) {
            d2 *= 0.5d;
            d3 = m96692k(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        return (m96693l(d5) - m96693l(d4)) / (m96692k(d5) - m96692k(d4));
    }

    /* JADX INFO: renamed from: k */
    public final double m96692k(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.f285206t * d5) + (this.f285204h * d4) + (d * d * d);
    }

    /* JADX INFO: renamed from: l */
    public final double m96693l(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.f285203X * d5) + (this.f285205i * d4) + (d * d * d);
    }
}
