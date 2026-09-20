package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class adc0 extends mdc0 {

    /* JADX INFO: renamed from: a */
    public final boolean f14600a;

    public adc0(boolean z) {
        this.f14600a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adc0) && this.f14600a == ((adc0) obj).f14600a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14600a);
    }
}
