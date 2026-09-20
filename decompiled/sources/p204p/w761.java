package p204p;

import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class w761 {

    /* JADX INFO: renamed from: a */
    public final Surface f248574a;

    /* JADX INFO: renamed from: b */
    public final int f248575b;

    /* JADX INFO: renamed from: c */
    public final int f248576c;

    /* JADX INFO: renamed from: d */
    public final int f248577d;

    /* JADX INFO: renamed from: e */
    public final boolean f248578e;

    public w761(Surface surface, int i, int i2, int i3, boolean z) {
        c95.m31844j(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f248574a = surface;
        this.f248575b = i;
        this.f248576c = i2;
        this.f248577d = i3;
        this.f248578e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w761)) {
            return false;
        }
        w761 w761Var = (w761) obj;
        return this.f248575b == w761Var.f248575b && this.f248576c == w761Var.f248576c && this.f248577d == w761Var.f248577d && this.f248578e == w761Var.f248578e && this.f248574a.equals(w761Var.f248574a);
    }

    public final int hashCode() {
        return (((((((this.f248574a.hashCode() * 31) + this.f248575b) * 31) + this.f248576c) * 31) + this.f248577d) * 31) + (this.f248578e ? 1 : 0);
    }
}
