package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class g4i0 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final int f76425a;

    public g4i0(int i) {
        this.f76425a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g4i0) && this.f76425a == ((g4i0) obj).f76425a;
    }

    public final int hashCode() {
        return this.f76425a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f76425a;
    }
}
