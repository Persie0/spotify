package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bzb0 implements wyb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f32456a;

    /* JADX INFO: renamed from: b */
    public final boolean f32457b;

    public bzb0(boolean z, boolean z2) {
        this.f32456a = z;
        this.f32457b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzb0)) {
            return false;
        }
        bzb0 bzb0Var = (bzb0) obj;
        return this.f32456a == bzb0Var.f32456a && this.f32457b == bzb0Var.f32457b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32457b) + (Boolean.hashCode(this.f32456a) * 31);
    }
}
