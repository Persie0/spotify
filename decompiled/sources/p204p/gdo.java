package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gdo {

    /* JADX INFO: renamed from: a */
    public final fdo f78899a;

    /* JADX INFO: renamed from: b */
    public final fdo f78900b;

    /* JADX INFO: renamed from: c */
    public final double f78901c;

    public gdo(fdo fdoVar, fdo fdoVar2, double d) {
        this.f78899a = fdoVar;
        this.f78900b = fdoVar2;
        this.f78901c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdo)) {
            return false;
        }
        gdo gdoVar = (gdo) obj;
        return this.f78899a == gdoVar.f78899a && this.f78900b == gdoVar.f78900b && Double.compare(this.f78901c, gdoVar.f78901c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f78901c) + ((this.f78900b.hashCode() + (this.f78899a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f78899a + ", crashlytics=" + this.f78900b + ", sessionSamplingRate=" + this.f78901c + ')';
    }
}
