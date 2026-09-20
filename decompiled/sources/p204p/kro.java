package p204p;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class kro {

    /* JADX INFO: renamed from: a */
    public final String f125693a;

    /* JADX INFO: renamed from: b */
    public final r300 f125694b;

    /* JADX INFO: renamed from: c */
    public final r300 f125695c;

    /* JADX INFO: renamed from: d */
    public final int f125696d;

    /* JADX INFO: renamed from: e */
    public final int f125697e;

    public kro(String str, r300 r300Var, r300 r300Var2, int i, int i2) {
        c95.m31843i(i == 0 || i2 == 0);
        c95.m31843i(true ^ TextUtils.isEmpty(str));
        this.f125693a = str;
        r300Var.getClass();
        this.f125694b = r300Var;
        r300Var2.getClass();
        this.f125695c = r300Var2;
        this.f125696d = i;
        this.f125697e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kro.class == obj.getClass()) {
            kro kroVar = (kro) obj;
            if (this.f125696d == kroVar.f125696d && this.f125697e == kroVar.f125697e && this.f125693a.equals(kroVar.f125693a) && this.f125694b.equals(kroVar.f125694b) && this.f125695c.equals(kroVar.f125695c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f125695c.hashCode() + ((this.f125694b.hashCode() + s571.m77243b((((527 + this.f125696d) * 31) + this.f125697e) * 31, 31, this.f125693a)) * 31);
    }
}
