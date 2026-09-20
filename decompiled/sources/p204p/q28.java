package p204p;

import android.util.Size;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class q28 {

    /* JADX INFO: renamed from: a */
    public final Size f184534a;

    /* JADX INFO: renamed from: b */
    public final HashMap f184535b;

    /* JADX INFO: renamed from: c */
    public final Size f184536c;

    /* JADX INFO: renamed from: d */
    public final HashMap f184537d;

    /* JADX INFO: renamed from: e */
    public final Size f184538e;

    /* JADX INFO: renamed from: f */
    public final HashMap f184539f;

    /* JADX INFO: renamed from: g */
    public final HashMap f184540g;

    public q28(Size size, HashMap map, Size size2, HashMap map2, Size size3, HashMap map3, HashMap map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f184534a = size;
        this.f184535b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f184536c = size2;
        this.f184537d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f184538e = size3;
        this.f184539f = map3;
        this.f184540g = map4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q28)) {
            return false;
        }
        q28 q28Var = (q28) obj;
        return this.f184534a.equals(q28Var.f184534a) && this.f184535b.equals(q28Var.f184535b) && this.f184536c.equals(q28Var.f184536c) && this.f184537d.equals(q28Var.f184537d) && this.f184538e.equals(q28Var.f184538e) && this.f184539f.equals(q28Var.f184539f) && this.f184540g.equals(q28Var.f184540g);
    }

    public final int hashCode() {
        return ((((((((((((this.f184534a.hashCode() ^ 1000003) * 1000003) ^ this.f184535b.hashCode()) * 1000003) ^ this.f184536c.hashCode()) * 1000003) ^ this.f184537d.hashCode()) * 1000003) ^ this.f184538e.hashCode()) * 1000003) ^ this.f184539f.hashCode()) * 1000003) ^ this.f184540g.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f184534a + ", s720pSizeMap=" + this.f184535b + ", previewSize=" + this.f184536c + ", s1440pSizeMap=" + this.f184537d + ", recordSize=" + this.f184538e + ", maximumSizeMap=" + this.f184539f + ", ultraMaximumSizeMap=" + this.f184540g + "}";
    }
}
