package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class u800 extends l891 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f227775a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f227776b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f227777c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f227778d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ w800 f227779e;

    public u800(w800 w800Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f227779e = w800Var;
        this.f227775a = obj;
        this.f227776b = arrayList;
        this.f227777c = obj2;
        this.f227778d = arrayList2;
    }

    @Override // p204p.l891, p204p.x691
    /* JADX INFO: renamed from: f */
    public final void mo32234f(z691 z691Var) {
        z691Var.mo55874G(this);
    }

    @Override // p204p.l891, p204p.x691
    /* JADX INFO: renamed from: g */
    public final void mo32235g(z691 z691Var) {
        w800 w800Var = this.f227779e;
        Object obj = this.f227775a;
        if (obj != null) {
            w800Var.m87431z(obj, this.f227776b, null);
        }
        Object obj2 = this.f227777c;
        if (obj2 != null) {
            w800Var.m87431z(obj2, this.f227778d, null);
        }
    }
}
