package p204p;

import androidx.compose.p002ui.graphics.Brush;

/* JADX INFO: loaded from: classes9.dex */
public final class a79 {

    /* JADX INFO: renamed from: a */
    public final long f12997a;

    /* JADX INFO: renamed from: b */
    public final Brush f12998b;

    public a79(long j, Brush brush) {
        this.f12997a = j;
        this.f12998b = brush;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a79)) {
            return false;
        }
        a79 a79Var = (a79) obj;
        long j = a79Var.f12997a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f12997a, j) && this.f12998b.equals(a79Var.f12998b);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return this.f12998b.hashCode() + (Long.hashCode(this.f12997a) * 31);
    }
}
