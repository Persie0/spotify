package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bz7 extends j3l {

    /* JADX INFO: renamed from: a */
    public final String f32422a;

    /* JADX INFO: renamed from: b */
    public final String f32423b;

    public bz7(String str, String str2) {
        this.f32422a = str;
        this.f32423b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j3l) {
            bz7 bz7Var = (bz7) ((j3l) obj);
            if (this.f32422a.equals(bz7Var.f32422a) && this.f32423b.equals(bz7Var.f32423b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f32422a.hashCode() ^ 1000003) * 1000003) ^ this.f32423b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f32422a);
        sb.append(", value=");
        return dq60.m36616p(this.f32423b, "}", sb);
    }
}
