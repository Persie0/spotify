package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class kdd1 {

    /* JADX INFO: renamed from: a */
    public final vwf f121662a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f121663b;

    /* JADX INFO: renamed from: c */
    public final fpm0 f121664c;

    /* JADX INFO: renamed from: d */
    public final String f121665d;

    /* JADX INFO: renamed from: e */
    public final w3o0 f121666e;

    /* JADX INFO: renamed from: f */
    public final egl0 f121667f;

    /* JADX INFO: renamed from: g */
    public final f931 f121668g;

    /* JADX INFO: renamed from: h */
    public final boolean f121669h;

    /* JADX INFO: renamed from: i */
    public final boolean f121670i;

    /* JADX INFO: renamed from: j */
    public final String f121671j;

    public kdd1(vwf vwfVar, ArrayList arrayList, fpm0 fpm0Var, String str, w3o0 w3o0Var, egl0 egl0Var, f931 f931Var, boolean z, boolean z2, String str2) {
        this.f121662a = vwfVar;
        this.f121663b = arrayList;
        this.f121664c = fpm0Var;
        this.f121665d = str;
        this.f121666e = w3o0Var;
        this.f121667f = egl0Var;
        this.f121668g = f931Var;
        this.f121669h = z;
        this.f121670i = z2;
        this.f121671j = str2;
    }

    /* JADX INFO: renamed from: a */
    public static kdd1 m56170a(kdd1 kdd1Var, ArrayList arrayList, fpm0 fpm0Var, f931 f931Var, int i) {
        vwf vwfVar = kdd1Var.f121662a;
        String str = kdd1Var.f121665d;
        w3o0 w3o0Var = kdd1Var.f121666e;
        egl0 egl0Var = kdd1Var.f121667f;
        if ((i & 64) != 0) {
            f931Var = kdd1Var.f121668g;
        }
        boolean z = kdd1Var.f121669h;
        boolean z2 = kdd1Var.f121670i;
        String str2 = kdd1Var.f121671j;
        kdd1Var.getClass();
        return new kdd1(vwfVar, arrayList, fpm0Var, str, w3o0Var, egl0Var, f931Var, z, z2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdd1)) {
            return false;
        }
        kdd1 kdd1Var = (kdd1) obj;
        return wj50.m88271j(this.f121662a, kdd1Var.f121662a) && this.f121663b.equals(kdd1Var.f121663b) && wj50.m88271j(this.f121664c, kdd1Var.f121664c) && wj50.m88271j(this.f121665d, kdd1Var.f121665d) && wj50.m88271j(this.f121666e, kdd1Var.f121666e) && wj50.m88271j(this.f121667f, kdd1Var.f121667f) && wj50.m88271j(this.f121668g, kdd1Var.f121668g) && this.f121669h == kdd1Var.f121669h && this.f121670i == kdd1Var.f121670i && wj50.m88271j(this.f121671j, kdd1Var.f121671j);
    }

    public final int hashCode() {
        vwf vwfVar = this.f121662a;
        int iM59700f = lq51.m59700f(this.f121663b, (vwfVar == null ? 0 : vwfVar.hashCode()) * 31, 31);
        fpm0 fpm0Var = this.f121664c;
        int iM77243b = s571.m77243b((iM59700f + (fpm0Var == null ? 0 : fpm0Var.hashCode())) * 31, 31, this.f121665d);
        w3o0 w3o0Var = this.f121666e;
        int iHashCode = (iM77243b + (w3o0Var == null ? 0 : w3o0Var.f247618a.hashCode())) * 31;
        egl0 egl0Var = this.f121667f;
        int iHashCode2 = (iHashCode + (egl0Var == null ? 0 : egl0Var.hashCode())) * 31;
        f931 f931Var = this.f121668g;
        return this.f121671j.hashCode() + s571.m77245d(s571.m77245d((iHashCode2 + (f931Var != null ? f931Var.hashCode() : 0)) * 31, 31, this.f121669h), 31, this.f121670i);
    }
}
