package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: renamed from: p.qt */
/* JADX INFO: loaded from: classes4.dex */
public final class C2313qt implements by11 {

    /* JADX INFO: renamed from: a */
    public final C1957hw f192238a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f192239b;

    /* JADX INFO: renamed from: c */
    public final Observable f192240c;

    /* JADX INFO: renamed from: d */
    public final i4t0 f192241d;

    /* JADX INFO: renamed from: e */
    public final Single f192242e;

    /* JADX INFO: renamed from: f */
    public final i4t0 f192243f;

    /* JADX INFO: renamed from: g */
    public final wg61 f192244g = new wg61(new C2038k3(this, 6));

    public C2313qt(C1957hw c1957hw, i4t0 i4t0Var, Observable observable, slq slqVar, Single single, pwn pwnVar) {
        this.f192238a = c1957hw;
        this.f192239b = i4t0Var;
        this.f192240c = observable;
        this.f192241d = slqVar;
        this.f192242e = single;
        this.f192243f = pwnVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m73777b(C2313qt c2313qt, ibk ibkVar) {
        C2227ot c2227ot;
        if (ibkVar instanceof C2227ot) {
            c2227ot = (C2227ot) ibkVar;
            int i = c2227ot.f168928c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2227ot.f168928c = i - Integer.MIN_VALUE;
            } else {
                c2227ot = new C2227ot(c2313qt, ibkVar);
            }
        } else {
            c2227ot = new C2227ot(c2313qt, ibkVar);
        }
        Object obj = c2227ot.f168926a;
        int i2 = c2227ot.f168928c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single singleM84079a = ((uw00) c2313qt.f192241d.get()).m84079a();
        c2227ot.f168928c = 1;
        Object objM96567o = zn91.m96567o(singleM84079a, c2227ot);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    @Override // p204p.by11
    /* JADX INFO: renamed from: a */
    public final fiz mo30863a() {
        return (fiz) this.f192244g.getValue();
    }
}
