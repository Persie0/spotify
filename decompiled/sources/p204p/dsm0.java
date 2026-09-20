package p204p;

import androidx.compose.p002ui.unit.TextUnit;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class dsm0 implements esm0 {

    /* JADX INFO: renamed from: a */
    public final float f52600a;

    /* JADX INFO: renamed from: b */
    public final float f52601b;

    /* JADX INFO: renamed from: c */
    public final long f52602c;

    public dsm0(float f, float f2, long j) {
        this.f52600a = f;
        this.f52601b = f2;
        this.f52602c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsm0)) {
            return false;
        }
        dsm0 dsm0Var = (dsm0) obj;
        return Float.compare(this.f52600a, dsm0Var.f52600a) == 0 && Float.compare(this.f52601b, dsm0Var.f52601b) == 0 && TextUnit.m306a(this.f52602c, dsm0Var.f52602c);
    }

    public final int hashCode() {
        int iM8g = AbstractC0000a.m8g(Float.hashCode(this.f52600a) * 31, 31, this.f52601b);
        tf71[] tf71VarArr = TextUnit.f546b;
        return Integer.hashCode(0) + dq60.m36605e(iM8g, this.f52602c, 31);
    }
}
