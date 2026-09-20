package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes8.dex */
public final class v500 {

    /* JADX INFO: renamed from: a */
    public final ndy f237275a;

    /* JADX INFO: renamed from: b */
    public final f600 f237276b;

    /* JADX INFO: renamed from: c */
    public final w8j f237277c;

    /* JADX INFO: renamed from: d */
    public final irh f237278d;

    public v500(ndy ndyVar, f600 f600Var, w8j w8jVar, irh irhVar) {
        this.f237275a = ndyVar;
        this.f237276b = f600Var;
        this.f237277c = w8jVar;
        this.f237278d = irhVar;
    }

    /* JADX INFO: renamed from: a */
    public final mcf m84670a(s1j0 s1j0Var, Intent intent, zzq0 zzq0Var) {
        ClassLoader classLoader = v500.class.getClassLoader();
        if (classLoader == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        i500 i500VarMo24828a = this.f237278d.mo24828a(classLoader, s1j0Var.f204726a.getName());
        i500VarMo24828a.m49706b1(s1j0Var.f204727b);
        Object objCast = s1j0Var.f204726a.cast(i500VarMo24828a);
        if (objCast == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        h9y0 h9y0Var = (i500) objCast;
        this.f237276b.mo40791a((e600) h9y0Var, intent, zzq0Var instanceof tzq0 ? ((tzq0) zzq0Var).f225288a : zzq0Var);
        return zzq0Var instanceof tzq0 ? new gcf(new xeu(15, this, h9y0Var)) : jcf.f111110a;
    }
}
