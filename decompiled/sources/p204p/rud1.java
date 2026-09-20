package p204p;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: classes2.dex */
public final class rud1 {

    /* JADX INFO: renamed from: a */
    public final fjc1 f202803a;

    /* JADX INFO: renamed from: b */
    public final ums f202804b;

    /* JADX INFO: renamed from: c */
    public final ums f202805c;

    /* JADX INFO: renamed from: d */
    public final ums f202806d;

    /* JADX INFO: renamed from: e */
    public final wc3 f202807e;

    /* JADX INFO: renamed from: f */
    public final hev0 f202808f;

    /* JADX INFO: renamed from: g */
    public final luk f202809g;

    /* JADX INFO: renamed from: h */
    public final am71 f202810h;

    /* JADX INFO: renamed from: i */
    public final ftd1 f202811i;

    public rud1(fjc1 fjc1Var, ums umsVar, ums umsVar2, ums umsVar3, wc3 wc3Var, hev0 hev0Var, luk lukVar, am71 am71Var, ftd1 ftd1Var) {
        this.f202803a = fjc1Var;
        this.f202804b = umsVar;
        this.f202805c = umsVar2;
        this.f202806d = umsVar3;
        this.f202807e = wc3Var;
        this.f202808f = hev0Var;
        this.f202809g = lukVar;
        this.f202810h = am71Var;
        this.f202811i = ftd1Var;
    }

    /* JADX INFO: renamed from: b */
    public static Object m76448b(rud1 rud1Var, int i, ctd1 ctd1Var, boolean z, sr4 sr4Var, pud1 pud1Var) throws Throwable {
        Object objM89557A = x0h1.m89557A(rud1Var.f202809g, new qud1(rud1Var, i, ctd1Var, sr4Var, null, z, null), pud1Var);
        return objM89557A == yuk.f276404a ? objM89557A : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r1 == r10) goto L76;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m76449a(Intent intent, int i, ibk ibkVar) throws Throwable {
        pud1 pud1Var;
        boolean zM43503p;
        sr4 sr4Var;
        int i2;
        Object objM83490a;
        sr4 sr4Var2;
        boolean z;
        if (ibkVar instanceof pud1) {
            pud1Var = (pud1) ibkVar;
            int i3 = pud1Var.f181430f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pud1Var.f181430f = i3 - Integer.MIN_VALUE;
            } else {
                pud1Var = new pud1(this, ibkVar);
            }
        } else {
            pud1Var = new pud1(this, ibkVar);
        }
        pud1 pud1Var2 = pud1Var;
        Object obj = pud1Var2.f181428d;
        int i4 = pud1Var2.f181430f;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        switch (i4) {
            case 0:
                bga.m29073P(obj);
                sr4 sr4VarM76275a = ((rr4) this.f202810h).m76275a("WidgetUpdate");
                sr4VarM76275a.m79019k("resolve_state", null, (4 & 4) != 0);
                String action = intent.getAction();
                zM43503p = g3h1.m43503p(intent);
                if (wj50.m88271j(action, "com.spotify.widgets.widgets.ACTION_TOOLTIP")) {
                    String stringExtra = intent.getStringExtra("com.spotify.widgets.widgets.EXTRA_WIDGET_TOOLTIP_MESSAGE");
                    pud1Var2.f181425a = null;
                    pud1Var2.f181426b = i;
                    pud1Var2.f181427c = zM43503p;
                    pud1Var2.f181430f = 1;
                    Object objM89557A = x0h1.m89557A(this.f202809g, new qud1(this, i, ctd1.ACTION_TOOLTIP, sr4VarM76275a, stringExtra, zM43503p, null), pud1Var2);
                    if (objM89557A != yukVar) {
                        objM89557A = w2a1Var;
                    }
                    break;
                } else if (wj50.m88271j(action, "com.spotify.widgets.widgets.ACTION_REFRESH")) {
                    pud1Var2.f181425a = sr4VarM76275a;
                    pud1Var2.f181426b = i;
                    pud1Var2.f181427c = zM43503p;
                    pud1Var2.f181430f = 2;
                    Object objMo42598a = this.f202811i.mo42598a(i, pud1Var2);
                    if (objMo42598a != yukVar) {
                        sr4Var = sr4VarM76275a;
                        obj = objMo42598a;
                        i2 = i;
                        String str = ((etd1) obj).f62690a;
                        pud1Var2.f181425a = sr4Var;
                        pud1Var2.f181426b = i2;
                        pud1Var2.f181427c = zM43503p;
                        pud1Var2.f181430f = 3;
                        objM83490a = this.f202806d.m83490a(i2, new WidgetState.LoadingState(str), pud1Var2);
                        if (objM83490a != yukVar) {
                            objM83490a = w2a1Var;
                        }
                        if (objM83490a != yukVar) {
                            boolean z2 = zM43503p;
                            sr4Var2 = sr4Var;
                            z = z2;
                            this.f202808f.f90514b = true;
                            pud1Var2.f181425a = null;
                            pud1Var2.f181426b = i2;
                            pud1Var2.f181427c = z;
                            pud1Var2.f181430f = 4;
                            if (m76448b(this, i2, ctd1.ACTION_REFRESH, z, sr4Var2, pud1Var2) == yukVar) {
                                return w2a1Var;
                            }
                        }
                    }
                } else if (wj50.m88271j(action, "miui.appwidget.action.APPWIDGET_UPDATE") || wj50.m88271j(action, "com.spotify.widgets.widgets.ACTION_UPDATE")) {
                    pud1Var2.f181425a = null;
                    pud1Var2.f181426b = i;
                    pud1Var2.f181427c = zM43503p;
                    pud1Var2.f181430f = 5;
                    if (m76448b(this, i, ctd1.ACTION_UPDATE, zM43503p, sr4VarM76275a, pud1Var2) != yukVar) {
                        return w2a1Var;
                    }
                } else if (wj50.m88271j(action, "com.spotify.widgets.widgets.ACTION_USER_LOGIN")) {
                    pud1Var2.f181425a = null;
                    pud1Var2.f181426b = i;
                    pud1Var2.f181427c = zM43503p;
                    pud1Var2.f181430f = 6;
                    if (m76448b(this, i, ctd1.ACTION_USER_LOGIN, zM43503p, sr4VarM76275a, pud1Var2) != yukVar) {
                        return w2a1Var;
                    }
                } else if (wj50.m88271j(action, "com.spotify.widgets.widgets.ACTION_USER_LOGOUT")) {
                    pud1Var2.f181425a = null;
                    pud1Var2.f181426b = i;
                    pud1Var2.f181427c = zM43503p;
                    pud1Var2.f181430f = 7;
                    if (m76448b(this, i, ctd1.ACTION_USER_LOGOUT, zM43503p, sr4VarM76275a, pud1Var2) != yukVar) {
                        return w2a1Var;
                    }
                } else {
                    if (!wj50.m88271j(action, "com.spotify.widgets.widgets.ACTION_END_SESSION")) {
                        Logger.m3973i("Action not recognized: %s", action);
                        return w2a1Var;
                    }
                    pud1Var2.f181425a = null;
                    pud1Var2.f181426b = i;
                    pud1Var2.f181427c = zM43503p;
                    pud1Var2.f181430f = 8;
                    if (m76448b(this, i, ctd1.ACTION_END_SESSION, zM43503p, sr4VarM76275a, pud1Var2) != yukVar) {
                        return w2a1Var;
                    }
                }
                return yukVar;
            case 1:
                bga.m29073P(obj);
                this.f202807e.m87685e();
                return w2a1Var;
            case 2:
                boolean z3 = pud1Var2.f181427c;
                int i5 = pud1Var2.f181426b;
                sr4 sr4Var3 = pud1Var2.f181425a;
                bga.m29073P(obj);
                zM43503p = z3;
                i2 = i5;
                sr4Var = sr4Var3;
                String str2 = ((etd1) obj).f62690a;
                pud1Var2.f181425a = sr4Var;
                pud1Var2.f181426b = i2;
                pud1Var2.f181427c = zM43503p;
                pud1Var2.f181430f = 3;
                objM83490a = this.f202806d.m83490a(i2, new WidgetState.LoadingState(str2), pud1Var2);
                if (objM83490a != yukVar) {
                    objM83490a = w2a1Var;
                }
                if (objM83490a != yukVar) {
                    boolean z4 = zM43503p;
                    sr4Var2 = sr4Var;
                    z = z4;
                    this.f202808f.f90514b = true;
                    pud1Var2.f181425a = null;
                    pud1Var2.f181426b = i2;
                    pud1Var2.f181427c = z;
                    pud1Var2.f181430f = 4;
                    if (m76448b(this, i2, ctd1.ACTION_REFRESH, z, sr4Var2, pud1Var2) == yukVar) {
                        return w2a1Var;
                    }
                }
                return yukVar;
            case 3:
                boolean z5 = pud1Var2.f181427c;
                int i6 = pud1Var2.f181426b;
                sr4Var2 = pud1Var2.f181425a;
                bga.m29073P(obj);
                z = z5;
                i2 = i6;
                this.f202808f.f90514b = true;
                pud1Var2.f181425a = null;
                pud1Var2.f181426b = i2;
                pud1Var2.f181427c = z;
                pud1Var2.f181430f = 4;
                if (m76448b(this, i2, ctd1.ACTION_REFRESH, z, sr4Var2, pud1Var2) == yukVar) {
                    return yukVar;
                }
                return w2a1Var;
            case 4:
                bga.m29073P(obj);
                return w2a1Var;
            case 5:
                bga.m29073P(obj);
                return w2a1Var;
            case 6:
                bga.m29073P(obj);
                return w2a1Var;
            case 7:
                bga.m29073P(obj);
                return w2a1Var;
            case 8:
                bga.m29073P(obj);
                return w2a1Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
