package p204p;

import android.util.Range;
import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public final class j28 {

    /* JADX INFO: renamed from: f */
    public static final Range f107949f = new Range(0, 0);

    /* JADX INFO: renamed from: a */
    public final Size f107950a;

    /* JADX INFO: renamed from: b */
    public final cns f107951b;

    /* JADX INFO: renamed from: c */
    public final Range f107952c;

    /* JADX INFO: renamed from: d */
    public final phi f107953d;

    /* JADX INFO: renamed from: e */
    public final boolean f107954e;

    public j28(Size size, cns cnsVar, Range range, phi phiVar, boolean z) {
        this.f107950a = size;
        this.f107951b = cnsVar;
        this.f107952c = range;
        this.f107953d = phiVar;
        this.f107954e = z;
    }

    /* JADX INFO: renamed from: a */
    public final cxe m52211a() {
        cxe cxeVar = new cxe();
        cxeVar.f43011a = this.f107950a;
        cxeVar.f43012b = this.f107951b;
        cxeVar.f43013c = this.f107952c;
        cxeVar.f43014d = this.f107953d;
        cxeVar.f43015e = Boolean.valueOf(this.f107954e);
        return cxeVar;
    }

    public final boolean equals(Object obj) {
        phi phiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j28) {
            j28 j28Var = (j28) obj;
            phi phiVar2 = j28Var.f107953d;
            if (this.f107950a.equals(j28Var.f107950a) && this.f107951b.equals(j28Var.f107951b) && this.f107952c.equals(j28Var.f107952c) && ((phiVar = this.f107953d) != null ? phiVar.equals(phiVar2) : phiVar2 == null) && this.f107954e == j28Var.f107954e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f107950a.hashCode() ^ 1000003) * 1000003) ^ this.f107951b.hashCode()) * 1000003) ^ this.f107952c.hashCode()) * 1000003;
        phi phiVar = this.f107953d;
        return ((iHashCode ^ (phiVar == null ? 0 : phiVar.hashCode())) * 1000003) ^ (this.f107954e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.f107950a);
        sb.append(", dynamicRange=");
        sb.append(this.f107951b);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.f107952c);
        sb.append(", implementationOptions=");
        sb.append(this.f107953d);
        sb.append(", zslDisabled=");
        return edb.m38570s(sb, this.f107954e, "}");
    }
}
