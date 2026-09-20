package p204p;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fv21 {

    /* JADX INFO: renamed from: a */
    public final long f73624a;

    /* JADX INFO: renamed from: b */
    public final long f73625b;

    /* JADX INFO: renamed from: c */
    public final int f73626c;

    public fv21(int i, long j, long j2) {
        c95.m31843i(j < j2);
        this.f73624a = j;
        this.f73625b = j2;
        this.f73626c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fv21.class == obj.getClass()) {
            fv21 fv21Var = (fv21) obj;
            if (this.f73624a == fv21Var.f73624a && this.f73625b == fv21Var.f73625b && this.f73626c == fv21Var.f73626c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f73624a), Long.valueOf(this.f73625b), Integer.valueOf(this.f73626c));
    }

    public final String toString() {
        String str = h0b1.f86200a;
        Locale locale = Locale.US;
        StringBuilder sbM77254m = s571.m77254m(this.f73624a, "Segment: startTimeMs=", ", endTimeMs=");
        sbM77254m.append(this.f73625b);
        sbM77254m.append(", speedDivisor=");
        sbM77254m.append(this.f73626c);
        return sbM77254m.toString();
    }
}
