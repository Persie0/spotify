package p204p;

import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class o28 {

    /* JADX INFO: renamed from: a */
    public final int f160964a;

    /* JADX INFO: renamed from: b */
    public final Surface f160965b;

    public o28(int i, Surface surface) {
        this.f160964a = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f160965b = surface;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o28)) {
            return false;
        }
        o28 o28Var = (o28) obj;
        return this.f160964a == o28Var.f160964a && this.f160965b.equals(o28Var.f160965b);
    }

    public final int hashCode() {
        return ((this.f160964a ^ 1000003) * 1000003) ^ this.f160965b.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.f160964a + ", surface=" + this.f160965b + "}";
    }
}
