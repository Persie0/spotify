package p204p;

import androidx.compose.p002ui.graphics.Brush;

/* JADX INFO: loaded from: classes.dex */
public final class pk31 extends Brush implements fj50 {

    /* JADX INFO: renamed from: a */
    public final long f178375a;

    public pk31(long j) {
        this.f178375a = j;
    }

    @Override // androidx.compose.p002ui.graphics.Brush
    /* JADX INFO: renamed from: a */
    public final void mo268a(float f, long j, lk4 lk4Var) {
        long jM63765b;
        lk4Var.m59206a(1.0f);
        if (f == 1.0f) {
            jM63765b = this.f178375a;
        } else {
            long j2 = this.f178375a;
            jM63765b = n6f.m63765b(j2, n6f.m63766c(j2) * f, 0.0f, 0.0f, 0.0f, 14);
        }
        lk4Var.m59208c(jM63765b);
        if (lk4Var.f134235c != null) {
            lk4Var.m59210e(null);
        }
    }

    @Override // p204p.fj50
    /* JADX INFO: renamed from: b */
    public final Object mo41796b(Object obj, float f) {
        if (obj == null) {
            int i = n6f.f150872l;
            obj = new pk31(ly5.m60223m());
        }
        if (!(obj instanceof pk31)) {
            return null;
        }
        return new pk31(rfg1.m75456z(f, this.f178375a, ((pk31) obj).f178375a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk31)) {
            return false;
        }
        long j = ((pk31) obj).f178375a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f178375a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return as91.m27075c(this.f178375a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) n6f.m63771h(this.f178375a)) + ')';
    }
}
