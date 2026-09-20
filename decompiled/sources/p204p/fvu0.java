package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class fvu0 {

    /* JADX INFO: renamed from: a */
    public final Context f73867a;

    /* JADX INFO: renamed from: b */
    public final sb40 f73868b;

    /* JADX INFO: renamed from: c */
    public final wg61 f73869c;

    /* JADX INFO: renamed from: d */
    public final wg61 f73870d;

    /* JADX INFO: renamed from: e */
    public final wg61 f73871e;

    /* JADX INFO: renamed from: f */
    public final cxf f73872f;

    public fvu0(Context context, sb40 sb40Var, wg61 wg61Var, wg61 wg61Var2, wg61 wg61Var3, cxf cxfVar) {
        this.f73867a = context;
        this.f73868b = sb40Var;
        this.f73869c = wg61Var;
        this.f73870d = wg61Var2;
        this.f73871e = wg61Var3;
        this.f73872f = cxfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvu0)) {
            return false;
        }
        fvu0 fvu0Var = (fvu0) obj;
        if (!wj50.m88271j(this.f73867a, fvu0Var.f73867a) || !this.f73868b.equals(fvu0Var.f73868b) || !this.f73869c.equals(fvu0Var.f73869c) || !this.f73870d.equals(fvu0Var.f73870d) || !this.f73871e.equals(fvu0Var.f73871e)) {
            return false;
        }
        Object obj2 = wra.f254301e;
        return obj2.equals(obj2) && this.f73872f.equals(fvu0Var.f73872f);
    }

    public final int hashCode() {
        return (this.f73872f.hashCode() + ((wra.f254301e.hashCode() + ((this.f73871e.hashCode() + ((this.f73870d.hashCode() + ((this.f73869c.hashCode() + ((this.f73868b.hashCode() + (this.f73867a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.f73867a + ", defaults=" + this.f73868b + ", mainCoroutineContextLazy=" + this.f73869c + ", memoryCacheLazy=" + this.f73870d + ", diskCacheLazy=" + this.f73871e + ", eventListenerFactory=" + wra.f254301e + ", componentRegistry=" + this.f73872f + ", logger=null)";
    }
}
