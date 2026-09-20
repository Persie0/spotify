package p204p;

import androidx.compose.p002ui.geometry.Offset;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class s671 {

    /* JADX INFO: renamed from: f */
    public static final s671 f206019f = new s671(false, 9205357640488583168L, 0.0f, 1, false);

    /* JADX INFO: renamed from: a */
    public final boolean f206020a;

    /* JADX INFO: renamed from: b */
    public final long f206021b;

    /* JADX INFO: renamed from: c */
    public final float f206022c;

    /* JADX INFO: renamed from: d */
    public final int f206023d;

    /* JADX INFO: renamed from: e */
    public final boolean f206024e;

    public s671(boolean z, long j, float f, int i, boolean z2) {
        this.f206020a = z;
        this.f206021b = j;
        this.f206022c = f;
        this.f206023d = i;
        this.f206024e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s671)) {
            return false;
        }
        s671 s671Var = (s671) obj;
        return this.f206020a == s671Var.f206020a && Offset.m253c(this.f206021b, s671Var.f206021b) && Float.compare(this.f206022c, s671Var.f206022c) == 0 && this.f206023d == s671Var.f206023d && this.f206024e == s671Var.f206024e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206024e) + f710.m40938f(this.f206023d, AbstractC0000a.m8g(dq60.m36605e(Boolean.hashCode(this.f206020a) * 31, this.f206021b, 31), 31, this.f206022c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.f206020a);
        sb.append(", position=");
        sb.append((Object) Offset.m259i(this.f206021b));
        sb.append(", lineHeight=");
        sb.append(this.f206022c);
        sb.append(", direction=");
        sb.append(o7t0.m66400n(this.f206023d));
        sb.append(", handlesCrossed=");
        return s571.m77253l(sb, this.f206024e, ')');
    }
}
