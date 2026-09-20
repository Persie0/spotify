package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mnf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final wbw f145421a;

    public mnf0(wbw wbwVar) {
        this.f145421a = wbwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnf0) && this.f145421a == ((mnf0) obj).f145421a;
    }

    public final int hashCode() {
        return this.f145421a.hashCode();
    }
}
