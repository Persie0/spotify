package p204p;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class xrk implements tty {

    /* JADX INFO: renamed from: a */
    public final Context f265362a;

    /* JADX INFO: renamed from: b */
    public final Uri f265363b;

    /* JADX INFO: renamed from: c */
    public final int f265364c;

    /* JADX INFO: renamed from: d */
    public final int f265365d;

    /* JADX INFO: renamed from: e */
    public final h4b f265366e;

    /* JADX INFO: renamed from: f */
    public final esk f265367f;

    /* JADX INFO: renamed from: g */
    public final z4l0 f265368g;

    /* JADX INFO: renamed from: h */
    public final a350 f265369h;

    /* JADX INFO: renamed from: i */
    public final String f265370i;

    public xrk(Context context, Uri uri, int i, int i2, h4b h4bVar, esk eskVar, z4l0 z4l0Var, a350 a350Var, String str) {
        this.f265362a = context;
        this.f265363b = uri;
        this.f265364c = i;
        this.f265365d = i2;
        this.f265366e = h4bVar;
        this.f265367f = eskVar;
        this.f265368g = z4l0Var;
        this.f265369h = a350Var;
        this.f265370i = str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p204p.tty
    /* JADX INFO: renamed from: a */
    public final Object mo25711a(fbk fbkVar) {
        vrk vrkVar;
        xrk xrkVar;
        if (fbkVar instanceof vrk) {
            vrkVar = (vrk) fbkVar;
            int i = vrkVar.f244220c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vrkVar.f244220c = i - Integer.MIN_VALUE;
            } else {
                vrkVar = new vrk(this, (ibk) fbkVar);
            }
        } else {
            vrkVar = new vrk(this, (ibk) fbkVar);
        }
        vrk vrkVar2 = vrkVar;
        Object objM91938b = vrkVar2.f244218a;
        int i2 = vrkVar2.f244220c;
        if (i2 == 0) {
            bga.m29073P(objM91938b);
            vrkVar2.f244220c = 1;
            xrkVar = this;
            objM91938b = xrkVar.m91938b(this.f265363b, this.f265364c, this.f265365d, this.f265366e, vrkVar2);
            yuk yukVar = yuk.f276404a;
            if (objM91938b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM91938b);
            xrkVar = this;
        }
        l540 l540Var = (l540) objM91938b;
        Uri uri = xrkVar.f265363b;
        if (l540Var == null) {
            throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
        }
        fsk fskVar = l540Var.f129820b;
        int iOrdinal = fskVar.ordinal();
        int i3 = 3;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 4;
        }
        a350 a350Var = xrkVar.f265369h;
        if (a350Var != null) {
            a350Var.m24609f(xrkVar.f265370i, fskVar, l540Var.f129821c);
        }
        return new fu31(bga.m29082d(kif1.m56500i(gif1.m44801l(l540Var.f129819a)), ywy.f277076a), xrkVar.f265362a.getContentResolver().getType(uri), i3);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m91938b(Uri uri, int i, int i2, h4b h4bVar, ibk ibkVar) {
        wrk wrkVar;
        b3b b3bVarM95437q;
        ztw0 ztw0Var;
        if (ibkVar instanceof wrk) {
            wrkVar = (wrk) ibkVar;
            int i3 = wrkVar.f254378e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wrkVar.f254378e = i3 - Integer.MIN_VALUE;
            } else {
                wrkVar = new wrk(this, ibkVar);
            }
        } else {
            wrkVar = new wrk(this, ibkVar);
        }
        Object objMo62238b = wrkVar.f254376c;
        int i4 = wrkVar.f254378e;
        if (i4 == 0) {
            bga.m29073P(objMo62238b);
            wrkVar.f254374a = uri;
            wrkVar.f254375b = h4bVar;
            wrkVar.f254378e = 1;
            esk eskVar = this.f265367f;
            eskVar.getClass();
            if (uri == null || uri.equals(Uri.EMPTY)) {
                objMo62238b = null;
            } else {
                String string = uri.toString();
                String scheme = uri.getScheme();
                if ("spotify".equals(scheme)) {
                    if (bm51.m29803n0(string, "spotify:image:", false)) {
                        string = Base64.encodeToString(string.substring(14).getBytes(vuc.f244913a), 0);
                    } else if (bm51.m29803n0(string, "spotify:localfileimage:", false)) {
                        string = Base64.encodeToString(string.getBytes(vuc.f244913a), 0);
                    }
                } else if ("http".equals(scheme) || pka1.f178421b.equals(scheme)) {
                    string = Base64.encodeToString(string.getBytes(vuc.f244913a), 0);
                }
                objMo62238b = eskVar.f62418a.f168395d.mo62238b(string, i, i2, wrkVar);
            }
            yuk yukVar = yuk.f276404a;
            if (objMo62238b == yukVar) {
                return yukVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h4bVar = wrkVar.f254375b;
            uri = wrkVar.f254374a;
            bga.m29073P(objMo62238b);
        }
        l540 l540Var = (l540) objMo62238b;
        if (l540Var != null) {
            return l540Var;
        }
        String scheme2 = uri.getScheme();
        if (!"http".equals(scheme2) && !pka1.f178421b.equals(scheme2)) {
            return null;
        }
        String string2 = uri.toString();
        int iOrdinal = h4bVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                a3b a3bVar = new a3b();
                z520.m95442v(a3bVar);
                b3bVarM95437q = z520.m95437q(a3bVar);
            } else if (iOrdinal == 2) {
                a3b a3bVar2 = new a3b();
                z520.m95441u(a3bVar2);
                b3bVarM95437q = z520.m95437q(a3bVar2);
            } else if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ztw0Var = new ztw0();
            ztw0Var.m96954g(string2);
            if (b3bVarM95437q != null) {
                ztw0Var.m96948a(b3bVarM95437q);
            }
            return new l540(this.f265368g.m95348b(new auw0(ztw0Var)).m97071g().f149863g.m69091a(), fsk.f72884c, null);
        }
        b3b b3bVar = b3b.f22994n;
        b3bVarM95437q = null;
        ztw0Var = new ztw0();
        ztw0Var.m96954g(string2);
        if (b3bVarM95437q != null) {
            ztw0Var.m96948a(b3bVarM95437q);
        }
        return new l540(this.f265368g.m95348b(new auw0(ztw0Var)).m97071g().f149863g.m69091a(), fsk.f72884c, null);
    }
}
