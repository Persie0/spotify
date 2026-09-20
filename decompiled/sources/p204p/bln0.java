package p204p;

import androidx.compose.p002ui.geometry.Size;

/* JADX INFO: loaded from: classes.dex */
public final class bln0 implements fuk {

    /* JADX INFO: renamed from: a */
    public final float f28210a;

    public bln0(float f) {
        this.f28210a = f;
        if (f < 0.0f || f > 100.0f) {
            pt40.m70891a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // p204p.fuk
    /* JADX INFO: renamed from: a */
    public final float mo29770a(long j, yqq yqqVar) {
        return (this.f28210a / 100.0f) * Size.m264e(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bln0) && Float.compare(this.f28210a, ((bln0) obj).f28210a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28210a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f28210a + "%)";
    }
}
