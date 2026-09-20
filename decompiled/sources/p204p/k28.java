package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k28 {

    /* JADX INFO: renamed from: a */
    public final int f118544a;

    /* JADX INFO: renamed from: b */
    public final int f118545b;

    /* JADX INFO: renamed from: c */
    public final boolean f118546c;

    /* JADX INFO: renamed from: d */
    public final boolean f118547d;

    public k28(int i, int i2, boolean z, boolean z2) {
        this.f118544a = i;
        this.f118545b = i2;
        this.f118546c = z;
        this.f118547d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k28) {
            k28 k28Var = (k28) obj;
            if (this.f118544a == k28Var.f118544a && this.f118545b == k28Var.f118545b && this.f118546c == k28Var.f118546c && this.f118547d == k28Var.f118547d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f118544a ^ 1000003) * 1000003) ^ this.f118545b) * 1000003) ^ (this.f118546c ? 1231 : 1237)) * 1000003) ^ (this.f118547d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings{cameraMode=");
        sb.append(this.f118544a);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.f118545b);
        sb.append(", previewStabilizationOn=");
        sb.append(this.f118546c);
        sb.append(", ultraHdrOn=");
        return edb.m38570s(sb, this.f118547d, "}");
    }
}
