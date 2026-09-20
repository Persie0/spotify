package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wpr0 {

    /* JADX INFO: renamed from: c */
    public static final wpr0 f253827c = new wpr0(false, false);

    /* JADX INFO: renamed from: a */
    public final boolean f253828a;

    /* JADX INFO: renamed from: b */
    public final boolean f253829b;

    public wpr0(boolean z, boolean z2) {
        this.f253828a = z;
        this.f253829b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpr0)) {
            return false;
        }
        wpr0 wpr0Var = (wpr0) obj;
        return this.f253828a == wpr0Var.f253828a && this.f253829b == wpr0Var.f253829b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f253829b) + (Boolean.hashCode(this.f253828a) * 31);
    }
}
