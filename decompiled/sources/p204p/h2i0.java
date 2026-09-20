package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final class h2i0 {

    /* JADX INFO: renamed from: a */
    public final long f87009a;

    /* JADX INFO: renamed from: b */
    public final long f87010b;

    /* JADX INFO: renamed from: c */
    public final boolean f87011c;

    public h2i0(long j, long j2, boolean z) {
        this.f87009a = j;
        this.f87010b = j2;
        this.f87011c = z;
    }

    /* JADX INFO: renamed from: a */
    public final h2i0 m46496a(h2i0 h2i0Var) {
        return new h2i0(Offset.m257g(this.f87009a, h2i0Var.f87009a), Math.max(this.f87010b, h2i0Var.f87010b), this.f87011c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2i0)) {
            return false;
        }
        h2i0 h2i0Var = (h2i0) obj;
        return Offset.m253c(this.f87009a, h2i0Var.f87009a) && this.f87010b == h2i0Var.f87010b && this.f87011c == h2i0Var.f87011c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87011c) + dq60.m36605e(Long.hashCode(this.f87009a) * 31, this.f87010b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) Offset.m259i(this.f87009a));
        sb.append(", timeMillis=");
        sb.append(this.f87010b);
        sb.append(", shouldApplyImmediately=");
        return s571.m77253l(sb, this.f87011c, ')');
    }
}
