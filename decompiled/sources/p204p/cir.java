package p204p;

import android.content.Context;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes8.dex */
public final class cir {

    /* JADX INFO: renamed from: a */
    public final Context f38420a;

    /* JADX INFO: renamed from: b */
    public final kv91 f38421b;

    /* JADX INFO: renamed from: c */
    public final ufh0 f38422c;

    /* JADX INFO: renamed from: d */
    public final vv91 f38423d;

    /* JADX INFO: renamed from: e */
    public final w6j0 f38424e;

    /* JADX INFO: renamed from: f */
    public final PublishSubject f38425f = new PublishSubject();

    /* JADX INFO: renamed from: g */
    public final zv41 f38426g;

    /* JADX INFO: renamed from: h */
    public final nuu0 f38427h;

    public cir(Context context, kv91 kv91Var, ufh0 ufh0Var, vv91 vv91Var, w6j0 w6j0Var) {
        this.f38420a = context;
        this.f38421b = kv91Var;
        this.f38422c = ufh0Var;
        this.f38423d = vv91Var;
        this.f38424e = w6j0Var;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f38426g = zv41VarM52819d;
        this.f38427h = bzf1.m31021m(zv41VarM52819d);
    }

    /* JADX INFO: renamed from: a */
    public static final void m32901a(cir cirVar, String str) {
        kv91 kv91Var = cirVar.f38421b;
        ufh0 ufh0Var = cirVar.f38422c;
        ufh0Var.getClass();
        yt91 yt91VarM96903c = ufh0Var.f229818a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("dismiss_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        kv91Var.mo57452p(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()));
        vv91 vv91Var = cirVar.f38423d;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        ((sfa0) vv91Var).m78000H(xgg1.m90871r5());
        cirVar.f38425f.onNext(new k521(str));
    }

    /* JADX INFO: renamed from: b */
    public final void m32902b() {
        this.f38426g.m97090l(null);
    }
}
