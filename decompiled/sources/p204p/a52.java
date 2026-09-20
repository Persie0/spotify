package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class a52 implements w5j0 {

    /* JADX INFO: renamed from: a */
    public final w6j0 f12372a;

    /* JADX INFO: renamed from: b */
    public final r52 f12373b;

    /* JADX INFO: renamed from: c */
    public final xuk f12374c;

    /* JADX INFO: renamed from: d */
    public final h90 f12375d;

    /* JADX INFO: renamed from: e */
    public final h90 f12376e;

    /* JADX INFO: renamed from: f */
    public final sxj f12377f = bx4.m30755d(kbv.m55958d(jg31.m53259E(100, 0, null, 6), 2), kbv.m55959e(jg31.m53259E(100, 50, null, 4), 2));

    public a52(w6j0 w6j0Var, r52 r52Var, xuk xukVar, h90 h90Var, h90 h90Var2) {
        this.f12372a = w6j0Var;
        this.f12373b = r52Var;
        this.f12374c = xukVar;
        this.f12375d = h90Var;
        this.f12376e = h90Var2;
    }

    @Override // p204p.w5j0
    /* JADX INFO: renamed from: b */
    public final void mo24744b(String str, d850 d850Var, Bundle bundle) {
        b3j0 z2j0Var = d850Var != null ? new z2j0(str, d850Var.f46380a) : x2j0.f257512a;
        w6j0 w6j0Var = this.f12372a;
        w6j0Var.m87294e(z2j0Var);
        w6j0Var.m87295f(z2j0Var);
        x0h1.m89578u(this.f12374c, null, 0, new f81(str, bundle, this, null, 6), 3);
    }

    @Override // p204p.w5j0
    /* JADX INFO: renamed from: d */
    public final void mo24745d(String str) {
        fbk fbkVar = null;
        if (str.length() <= 0) {
            str = null;
        }
        m2j0 m2j0Var = str != null ? new m2j0(new z650(str)) : new m2j0(null);
        w6j0 w6j0Var = this.f12372a;
        w6j0Var.m87294e(m2j0Var);
        w6j0Var.m87295f(m2j0Var);
        x0h1.m89578u(this.f12374c, null, 0, new C2574xj(this, fbkVar, 3), 3);
    }
}
