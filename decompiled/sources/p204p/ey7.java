package p204p;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ey7 {

    /* JADX INFO: renamed from: a */
    public final l28 f63975a;

    /* JADX INFO: renamed from: b */
    public final int f63976b;

    /* JADX INFO: renamed from: c */
    public final Size f63977c;

    /* JADX INFO: renamed from: d */
    public final cns f63978d;

    /* JADX INFO: renamed from: e */
    public final List f63979e;

    /* JADX INFO: renamed from: f */
    public final phi f63980f;

    /* JADX INFO: renamed from: g */
    public final Range f63981g;

    public ey7(l28 l28Var, int i, Size size, cns cnsVar, List list, phi phiVar, Range range) {
        if (l28Var == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f63975a = l28Var;
        this.f63976b = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f63977c = size;
        if (cnsVar == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f63978d = cnsVar;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f63979e = list;
        this.f63980f = phiVar;
        this.f63981g = range;
    }

    public final boolean equals(Object obj) {
        phi phiVar;
        Range range;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ey7) {
            ey7 ey7Var = (ey7) obj;
            Range range2 = ey7Var.f63981g;
            phi phiVar2 = ey7Var.f63980f;
            if (this.f63975a.equals(ey7Var.f63975a) && this.f63976b == ey7Var.f63976b && this.f63977c.equals(ey7Var.f63977c) && this.f63978d.equals(ey7Var.f63978d) && this.f63979e.equals(ey7Var.f63979e) && ((phiVar = this.f63980f) != null ? phiVar.equals(phiVar2) : phiVar2 == null) && ((range = this.f63981g) != null ? range.equals(range2) : range2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f63975a.hashCode() ^ 1000003) * 1000003) ^ this.f63976b) * 1000003) ^ this.f63977c.hashCode()) * 1000003) ^ this.f63978d.hashCode()) * 1000003) ^ this.f63979e.hashCode()) * 1000003;
        phi phiVar = this.f63980f;
        int iHashCode2 = (iHashCode ^ (phiVar == null ? 0 : phiVar.hashCode())) * 1000003;
        Range range = this.f63981g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f63975a + ", imageFormat=" + this.f63976b + ", size=" + this.f63977c + ", dynamicRange=" + this.f63978d + ", captureTypes=" + this.f63979e + ", implementationOptions=" + this.f63980f + ", targetFrameRate=" + this.f63981g + "}";
    }
}
