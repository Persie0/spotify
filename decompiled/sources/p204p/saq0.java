package p204p;

import androidx.compose.p002ui.geometry.Size;

/* JADX INFO: loaded from: classes6.dex */
public final class saq0 implements fuk {

    /* JADX INFO: renamed from: a */
    public final float f207266a;

    /* JADX INFO: renamed from: b */
    public final float f207267b;

    public saq0(float f, float f2) {
        this.f207266a = f;
        this.f207267b = f2;
    }

    @Override // p204p.fuk
    /* JADX INFO: renamed from: a */
    public final float mo29770a(long j, yqq yqqVar) {
        float fMo35989Z0 = yqqVar.mo35989Z0(this.f207267b);
        float fM264e = Size.m264e(j) * this.f207266a;
        return fM264e < fMo35989Z0 ? fMo35989Z0 : fM264e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof saq0)) {
            return false;
        }
        saq0 saq0Var = (saq0) obj;
        return Float.compare(this.f207266a, saq0Var.f207266a) == 0 && ybs.m93301b(this.f207267b, saq0Var.f207267b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f207267b) + (Float.hashCode(this.f207266a) * 31);
    }
}
