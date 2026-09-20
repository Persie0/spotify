package p204p;

import android.content.Context;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class vaj0 implements cvb0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f239284a = 0;

    /* JADX INFO: renamed from: b */
    public final c9k f239285b;

    /* JADX INFO: renamed from: c */
    public final Object f239286c;

    /* JADX INFO: renamed from: d */
    public final Object f239287d;

    /* JADX INFO: renamed from: e */
    public final Object f239288e;

    /* JADX INFO: renamed from: f */
    public final Object f239289f;

    public vaj0(da80 da80Var, d2j0 d2j0Var, iej0 iej0Var, Context context, luk lukVar) {
        this.f239286c = da80Var;
        this.f239287d = d2j0Var;
        this.f239288e = iej0Var;
        this.f239289f = context;
        this.f239285b = AbstractC0000a.m16o(lukVar);
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: c */
    public final void mo25302c() {
        switch (this.f239284a) {
            case 0:
                break;
            default:
                if (((fl4) this.f239289f).m41981a()) {
                    x0h1.m89578u(this.f239285b, null, 0, new a7s0(this, (fbk) null, 15), 3);
                }
                break;
        }
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: d */
    public final void mo25303d() {
        switch (this.f239284a) {
            case 0:
                qlg1.m73214s(this.f239285b.f35578a, null);
                break;
            default:
                qlg1.m73214s(this.f239285b.f35578a, null);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public Object m85087e(String str, ibk ibkVar) {
        uhv0 uhv0Var;
        if (ibkVar instanceof uhv0) {
            uhv0Var = (uhv0) ibkVar;
            int i = uhv0Var.f230538c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uhv0Var.f230538c = i - Integer.MIN_VALUE;
            } else {
                uhv0Var = new uhv0(this, ibkVar);
            }
        } else {
            uhv0Var = new uhv0(this, ibkVar);
        }
        Object obj = uhv0Var.f230536a;
        int i2 = uhv0Var.f230538c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single singleM78369c = ske.m78369c((ske) this.f239286c, edb.m38564m("recs-quality:foreground:v1:", str), null, null, null, null, null, null, null, null, 510);
        uhv0Var.f230538c = 1;
        Object objM96567o = zn91.m96567o(singleM78369c, uhv0Var);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: g */
    public final void mo25304g(ViewGroup viewGroup) {
        switch (this.f239284a) {
            case 0:
                x0h1.m89578u(this.f239285b, null, 0, new l2i0(this, null, 7), 3);
                break;
        }
    }

    public vaj0(ske skeVar, o040 o040Var, Flowable flowable, fl4 fl4Var, luk lukVar) {
        this.f239286c = skeVar;
        this.f239287d = o040Var;
        this.f239288e = flowable;
        this.f239289f = fl4Var;
        this.f239285b = kk40.m56661c(lukVar);
    }

    /* JADX INFO: renamed from: b */
    private final void m85086b() {
    }

    /* JADX INFO: renamed from: a */
    private final void m85085a(ViewGroup viewGroup) {
    }
}
