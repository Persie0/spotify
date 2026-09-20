package p204p;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ey1 implements euk {

    /* JADX INFO: renamed from: a */
    public final euk f63910a;

    /* JADX INFO: renamed from: b */
    public final float f63911b;

    public ey1(float f, euk eukVar) {
        while (eukVar instanceof ey1) {
            eukVar = ((ey1) eukVar).f63910a;
            f += ((ey1) eukVar).f63911b;
        }
        this.f63910a = eukVar;
        this.f63911b = f;
    }

    @Override // p204p.euk
    /* JADX INFO: renamed from: a */
    public final float mo40076a(RectF rectF) {
        return Math.max(0.0f, this.f63910a.mo40076a(rectF) + this.f63911b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey1)) {
            return false;
        }
        ey1 ey1Var = (ey1) obj;
        return this.f63910a.equals(ey1Var.f63910a) && this.f63911b == ey1Var.f63911b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f63910a, Float.valueOf(this.f63911b)});
    }
}
