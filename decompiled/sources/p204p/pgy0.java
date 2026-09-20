package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class pgy0 extends aqs {

    /* JADX INFO: renamed from: h */
    public double f177429h;

    /* JADX INFO: renamed from: i */
    public double f177430i;

    @Override // p204p.aqs
    /* JADX INFO: renamed from: c */
    public final double mo26896c(double d) {
        double d2 = this.f177429h;
        double d3 = this.f177430i;
        if (d < d3) {
            return (d3 * d) / (((d3 - d) * d2) + d);
        }
        return ((d - 1.0d) * (1.0d - d3)) / ((1.0d - d) - ((d3 - d) * d2));
    }

    @Override // p204p.aqs
    /* JADX INFO: renamed from: d */
    public final double mo26897d(double d) {
        double d2 = this.f177429h;
        double d3 = this.f177430i;
        if (d < d3) {
            double d4 = d2 * d3 * d3;
            double d5 = ((d3 - d) * d2) + d;
            return d4 / (d5 * d5);
        }
        double d6 = d3 - 1.0d;
        double d7 = (((d3 - d) * (-d2)) - d) + 1.0d;
        return ((d6 * d2) * d6) / (d7 * d7);
    }
}
