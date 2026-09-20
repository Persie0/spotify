package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ezu0 implements hzu0 {

    /* JADX INFO: renamed from: a */
    public final wwu f64471a;

    public ezu0(wwu wwuVar) {
        this.f64471a = wwuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ezu0) && wj50.m88271j(this.f64471a, ((ezu0) obj).f64471a);
    }

    public final int hashCode() {
        return this.f64471a.hashCode();
    }
}
