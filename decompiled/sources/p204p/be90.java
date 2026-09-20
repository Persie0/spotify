package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class be90 {

    /* JADX INFO: renamed from: a */
    public final boolean f26303a;

    /* JADX INFO: renamed from: b */
    public final boolean f26304b;

    /* JADX INFO: renamed from: c */
    public final boolean f26305c;

    public be90(boolean z, boolean z2, boolean z3) {
        this.f26303a = z;
        this.f26304b = z2;
        this.f26305c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be90)) {
            return false;
        }
        be90 be90Var = (be90) obj;
        return this.f26303a == be90Var.f26303a && this.f26304b == be90Var.f26304b && this.f26305c == be90Var.f26305c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26305c) + s571.m77245d(Boolean.hashCode(this.f26303a) * 31, 31, this.f26304b);
    }
}
