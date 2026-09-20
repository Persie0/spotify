package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class axr implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20979a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f20980b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f20981c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f20982d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f20983e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f20984f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f20985g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f20986h;

    public /* synthetic */ axr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f20979a = i;
        this.f20980b = obj;
        this.f20981c = obj2;
        this.f20982d = obj3;
        this.f20983e = obj4;
        this.f20984f = obj5;
        this.f20985g = obj6;
        this.f20986h = obj7;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public Object m27427b(fbk fbkVar) {
        zwr zwrVar;
        Object fxrVar;
        ywr ywrVar;
        int i;
        yuk yukVar;
        ywr ywrVar2;
        kqi0 kqi0Var = (kqi0) this.f20986h;
        kqi0 kqi0Var2 = (kqi0) this.f20985g;
        cxr cxrVar = (cxr) this.f20981c;
        if (fbkVar instanceof zwr) {
            zwrVar = (zwr) fbkVar;
            int i2 = zwrVar.f287059d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zwrVar.f287059d = i2 - Integer.MIN_VALUE;
            } else {
                zwrVar = new zwr(this, fbkVar);
            }
        } else {
            zwrVar = new zwr(this, fbkVar);
        }
        zwr zwrVar2 = zwrVar;
        Object obj = zwrVar2.f287057b;
        int i3 = zwrVar2.f287059d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar2 = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(obj);
            C1668ai c1668ai = (C1668ai) this.f20980b;
            boolean z = ((Number) ((kqi0) this.f20982d).getValue()).intValue() == -1;
            qf40 qf40Var = (qf40) ((kqi0) this.f20983e).getValue();
            ibj ibjVar = (ibj) ((kqi0) this.f20984f).getValue();
            gxr gxrVar = gxr.f85325a;
            dxr dxrVar = dxr.f54074a;
            exr exrVar = exr.f63837a;
            if (z && !c1668ai.f15839b) {
                fxrVar = new fxr(new xwr(ibjVar, !qf40Var.equals((qf40) c1668ai.f15840c), !ibjVar.equals((ibj) c1668ai.f15841d)));
            } else if (z || !c1668ai.f15839b) {
                fxrVar = !z ? dxrVar : gxrVar;
            } else {
                c1668ai.f15840c = qf40Var;
                c1668ai.f15841d = ibjVar;
                fxrVar = exrVar;
            }
            c1668ai.f15839b = z;
            if (fxrVar instanceof fxr) {
                xwr xwrVar = ((fxr) fxrVar).f74414a;
                cxrVar.f43083b.setValue(xwrVar);
                ywr ywrVar3 = xwrVar.f266738a || xwrVar.f266739b ? new ywr(75) : new ywr(50);
                zwrVar2.f287056a = ywrVar3;
                zwrVar2.f287059d = 1;
                Object objM45914g = cxrVar.f43082a.m45914g(new Float(1.0f), zwrVar2);
                if (objM45914g != yukVar2) {
                    objM45914g = w2a1Var;
                }
                if (objM45914g == yukVar2) {
                    return yukVar2;
                }
                ywrVar = ywrVar3;
                ywrVar.getClass();
                zwrVar2.f287056a = ywrVar;
                zwrVar2.f287059d = 2;
                i = 0;
                yukVar = yukVar2;
                ywrVar2 = null;
                if (gw4.m45909c(cxrVar.f43082a, qyg1.m74179I(0.0f), jg31.m53259E(50, 0, null, 6), null, null, zwrVar2, 12) == yukVar) {
                    return yukVar;
                }
            } else {
                if (fxrVar.equals(exrVar)) {
                    cxrVar.f43084c.setValue((List) kqi0Var2.getValue());
                    cxrVar.f43085d.setValue((l590) kqi0Var.getValue());
                    xwr xwrVar2 = (xwr) cxrVar.f43083b.getValue();
                    ywr ywrVar4 = xwrVar2.f266738a || xwrVar2.f266739b ? new ywr(75) : new ywr(50);
                    zwrVar2.f287056a = null;
                    zwrVar2.f287059d = 4;
                    if (gw4.m45909c(cxrVar.f43082a, qyg1.m74179I(1.0f), jg31.m53259E(ywrVar4.f277030a, 0, null, 6), null, null, zwrVar2, 12) == yukVar2) {
                        return yukVar2;
                    }
                    cxrVar.f43083b.setValue(new xwr());
                    return w2a1Var;
                }
                if (fxrVar.equals(dxrVar)) {
                    cxrVar.f43084c.setValue((List) kqi0Var2.getValue());
                    cxrVar.f43085d.setValue((l590) kqi0Var.getValue());
                    return w2a1Var;
                }
                if (!fxrVar.equals(gxrVar)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if (i3 == 1) {
            ywrVar = zwrVar2.f287056a;
            bga.m29073P(obj);
            ywrVar.getClass();
            zwrVar2.f287056a = ywrVar;
            zwrVar2.f287059d = 2;
            i = 0;
            yukVar = yukVar2;
            ywrVar2 = null;
            if (gw4.m45909c(cxrVar.f43082a, qyg1.m74179I(0.0f), jg31.m53259E(50, 0, null, 6), null, null, zwrVar2, 12) == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                cxrVar.f43083b.setValue(new xwr());
                return w2a1Var;
            }
            ywrVar = zwrVar2.f287056a;
            bga.m29073P(obj);
            yukVar = yukVar2;
            ywrVar2 = null;
            i = 0;
        }
        ywrVar.getClass();
        zwrVar2.f287056a = ywrVar2;
        zwrVar2.f287059d = 3;
        return njg1.m64619l((long) i, zwrVar2) == yukVar ? yukVar : w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        xat xatVar;
        jol jolVar;
        String strM88484h1;
        jr91 jr91Var;
        switch (this.f20979a) {
            case 0:
                return m27427b(fbkVar);
            case 1:
                String str = (String) this.f20981c;
                if (fbkVar instanceof xat) {
                    xatVar = (xat) fbkVar;
                    int i = xatVar.f259759b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        xatVar.f259759b = i - Integer.MIN_VALUE;
                    } else {
                        xatVar = new xat(this, fbkVar);
                    }
                } else {
                    xatVar = new xat(this, fbkVar);
                }
                Object obj2 = xatVar.f259758a;
                int i2 = xatVar.f259759b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    niz nizVar = (niz) this.f20980b;
                    qho qhoVar = (qho) obj;
                    if (qhoVar instanceof oho) {
                        jolVar = (jol) ((oho) qhoVar).f165512a;
                    } else {
                        jolVar = new jol(!bm51.m29803n0(str, "spotify:user:", false) ? null : wl51.m88484h1(str, ":"), null);
                    }
                    String str2 = (String) this.f20982d;
                    String str3 = (String) this.f20983e;
                    String str4 = ((pat) this.f20984f).f175610b;
                    String str5 = (String) this.f20985g;
                    String str6 = jolVar.f114448a;
                    if (str6 == null) {
                        strM88484h1 = bm51.m29803n0(str, "spotify:user:", false) ? wl51.m88484h1(str, ":") : null;
                    } else {
                        strM88484h1 = str6;
                    }
                    wat watVar = new wat(str2, str3, str4, str5, strM88484h1, jolVar.f114449b, (Integer) this.f20986h);
                    xatVar.f259759b = 1;
                    Object objEmit = nizVar.emit(watVar, xatVar);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof jr91) {
                    jr91Var = (jr91) fbkVar;
                    int i3 = jr91Var.f115121b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        jr91Var.f115121b = i3 - Integer.MIN_VALUE;
                    } else {
                        jr91Var = new jr91(this, fbkVar);
                    }
                } else {
                    jr91Var = new jr91(this, fbkVar);
                }
                Object obj3 = jr91Var.f115120a;
                int i4 = jr91Var.f115121b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    niz nizVar2 = (niz) this.f20980b;
                    sut sutVarM76485a = rvw0.m76485a((rvw0) this.f20982d, ((shm0) obj).mo42395b(), ((rml) this.f20981c).mo31965l(), (LayoutInflater) this.f20983e, (ViewGroup) this.f20984f, (Bundle) this.f20985g, (fiz) this.f20986h);
                    jr91Var.f115121b = 1;
                    Object objEmit2 = nizVar2.emit(sutVarM76485a, jr91Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }

    public axr(niz nizVar, rml rmlVar, rvw0 rvw0Var, Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, fiz fizVar) {
        this.f20979a = 2;
        this.f20980b = nizVar;
        this.f20981c = rmlVar;
        this.f20982d = rvw0Var;
        this.f20983e = layoutInflater;
        this.f20984f = viewGroup;
        this.f20985g = bundle;
        this.f20986h = fizVar;
    }
}
