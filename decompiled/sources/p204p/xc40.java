package p204p;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class xc40 extends sy61 {

    /* JADX INFO: renamed from: a */
    public final atj0 f260083a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f260084b;

    /* JADX INFO: renamed from: c */
    public final th00 f260085c;

    /* JADX INFO: renamed from: d */
    public final gh00 f260086d;

    /* JADX INFO: renamed from: e */
    public final gh00 f260087e;

    /* JADX INFO: renamed from: f */
    public final wdt0 f260088f;

    /* JADX INFO: renamed from: g */
    public final List f260089g;

    /* JADX INFO: renamed from: h */
    public final cii f260090h;

    public xc40(atj0 atj0Var, Bitmap bitmap, th00 th00Var, gh00 gh00Var, gh00 gh00Var2, wdt0 wdt0Var, List list, cii ciiVar) {
        this.f260083a = atj0Var;
        this.f260084b = bitmap;
        this.f260085c = th00Var;
        this.f260086d = gh00Var;
        this.f260087e = gh00Var2;
        this.f260088f = wdt0Var;
        this.f260089g = list;
        this.f260090h = ciiVar;
    }

    @Override // p204p.sy61
    /* JADX INFO: renamed from: a */
    public final wdt0 mo32339a() {
        return this.f260088f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc40)) {
            return false;
        }
        xc40 xc40Var = (xc40) obj;
        return wj50.m88271j(this.f260083a, xc40Var.f260083a) && wj50.m88271j(this.f260084b, xc40Var.f260084b) && wj50.m88271j(this.f260085c, xc40Var.f260085c) && wj50.m88271j(this.f260086d, xc40Var.f260086d) && wj50.m88271j(this.f260087e, xc40Var.f260087e) && this.f260088f.equals(xc40Var.f260088f) && this.f260089g.equals(xc40Var.f260089g) && wj50.m88271j(this.f260090h, xc40Var.f260090h);
    }

    public final int hashCode() {
        int iHashCode = (this.f260084b.hashCode() + (this.f260083a.hashCode() * 31)) * 31;
        th00 th00Var = this.f260085c;
        int iM77244c = s571.m77244c((this.f260088f.hashCode() + m6b.m60989d(this.f260087e, m6b.m60989d(this.f260086d, s571.m77245d((iHashCode + (th00Var == null ? 0 : th00Var.hashCode())) * 31, 31, true), 31), 31)) * 31, 31, this.f260089g);
        cii ciiVar = this.f260090h;
        return iM77244c + (ciiVar != null ? ciiVar.hashCode() : 0);
    }
}
