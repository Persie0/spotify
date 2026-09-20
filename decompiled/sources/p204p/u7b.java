package p204p;

import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.car.app.C0023j;
import androidx.car.app.serialization.BundlerException;
import java.util.Collections;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class u7b implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f227556a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c8b f227557b;

    public /* synthetic */ u7b(c8b c8bVar, int i) {
        this.f227556a = i;
        this.f227557b = c8bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r11 == r9) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r12 == r9) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        return r9;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m82506b(a8b a8bVar, fbk fbkVar) throws Throwable {
        w7b w7bVar;
        c8b c8bVar = this.f227557b;
        zv41 zv41Var = c8bVar.f35158Y;
        er70 er70Var = c8bVar.f35162f;
        if (fbkVar instanceof w7b) {
            w7bVar = (w7b) fbkVar;
            int i = w7bVar.f248623d;
            if ((i & Integer.MIN_VALUE) != 0) {
                w7bVar.f248623d = i - Integer.MIN_VALUE;
            } else {
                w7bVar = new w7b(this, fbkVar);
            }
        } else {
            w7bVar = new w7b(this, fbkVar);
        }
        Object obj = w7bVar.f248621b;
        int i2 = w7bVar.f248623d;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar2 = null;
        if (i2 == 0) {
            bga.m29073P(obj);
            boolean z = a8bVar instanceof x7b;
            x2j0 x2j0Var = x2j0.f257512a;
            yuk yukVar = yuk.f276404a;
            if (z) {
                if (((x7b) a8bVar).f258867a) {
                    daj0 daj0Var = (daj0) er70Var.get();
                    w7bVar.f248620a = null;
                    w7bVar.f248623d = 1;
                    daj0.m35485f(daj0Var.f47056c, x2j0Var);
                    Object objM89557A = x0h1.m89557A(daj0Var.f47054a, new caj0(daj0Var, fbkVar2, 2), w7bVar);
                    if (objM89557A != yukVar) {
                        objM89557A = w2a1Var;
                    }
                }
            } else if (a8bVar instanceof y7b) {
                daj0 daj0Var2 = (daj0) er70Var.get();
                y7b y7bVar = (y7b) a8bVar;
                boolean z2 = y7bVar.f270006a;
                w7bVar.f248620a = y7bVar;
                w7bVar.f248623d = 2;
                if (z2) {
                    daj0.m35485f(daj0Var2.f47056c, x2j0Var);
                }
                Object objM89557A2 = x0h1.m89557A(daj0Var2.f47054a, new qra0(daj0Var2, fbkVar2, 1), w7bVar);
                if (objM89557A2 != yukVar) {
                    objM89557A2 = w2a1Var;
                }
            } else if (!wj50.m88271j(a8bVar, z7b.f280146a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i2 == 1) {
                bga.m29073P(obj);
                x7b x7bVar = new x7b(false);
                zv41Var.getClass();
                zv41Var.m97091m(null, x7bVar);
                return w2a1Var;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a8bVar = w7bVar.f248620a;
            bga.m29073P(obj);
            if (((y7b) a8bVar).f270006a) {
                y7b y7bVar2 = new y7b(false);
                zv41Var.getClass();
                zv41Var.m97091m(null, y7bVar2);
                return w2a1Var;
            }
        }
        return w2a1Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        di41 di41Var;
        switch (this.f227556a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                c8b c8bVar = this.f227557b;
                er70 er70Var = c8bVar.f35163g;
                zv41 zv41Var = c8bVar.f35158Y;
                fbk fbkVar2 = null;
                if (zBooleanValue) {
                    ll61 ll61VarM31778e = c8bVar.m31778e();
                    di41 di41Var2 = ll61VarM31778e.f134540L0;
                    if (di41Var2 == null || di41Var2.isCancelled() || ((di41Var = ll61VarM31778e.f134540L0) != null && di41Var.mo26606t())) {
                        ll61VarM31778e.f134540L0 = x0h1.m89578u(l5h1.m58232p(ll61VarM31778e.getLifecycle()), null, 0, new jl61(ll61VarM31778e, fbkVar2, 0), 3);
                        ll61VarM31778e.f134542N0 = x0h1.m89578u(l5h1.m58232p(ll61VarM31778e.getLifecycle()), null, 0, new jl61(ll61VarM31778e, fbkVar2, 1), 3);
                        di41 di41Var3 = ll61VarM31778e.f134540L0;
                        if (di41Var3 != null) {
                            di41Var3.mo26599N(new kl61(ll61VarM31778e, 0));
                        }
                        di41 di41Var4 = ll61VarM31778e.f134542N0;
                        if (di41Var4 != null) {
                            di41Var4.mo26599N(new kl61(ll61VarM31778e, 1));
                        }
                    }
                    x7b x7bVar = new x7b(zv41Var.getValue() instanceof y7b);
                    zv41Var.getClass();
                    zv41Var.m97091m(null, x7bVar);
                    xa60 xa60Var = (xa60) er70Var.get();
                    ub80 ub80VarM58232p = l5h1.m58232p(c8bVar.getLifecycle());
                    xa60Var.getClass();
                    xa60Var.f259571d = x0h1.m89578u(ub80VarM58232p, null, 0, new q950(xa60Var, fbkVar2, 12), 3);
                } else {
                    ll61 ll61VarM31778e2 = c8bVar.m31778e();
                    di41 di41Var5 = ll61VarM31778e2.f134540L0;
                    if (di41Var5 != null) {
                        di41Var5.mo26601e(null);
                    }
                    di41 di41Var6 = ll61VarM31778e2.f134542N0;
                    if (di41Var6 != null) {
                        di41Var6.mo26601e(null);
                    }
                    y7b y7bVar = new y7b(zv41Var.getValue() instanceof x7b);
                    zv41Var.getClass();
                    zv41Var.m97091m(null, y7bVar);
                    xa60 xa60Var2 = (xa60) er70Var.get();
                    di41 di41Var7 = xa60Var2.f259571d;
                    if (di41Var7 != null) {
                        di41Var7.mo26601e(null);
                    }
                    xa60Var2.f259571d = null;
                }
                return w2a1.f247311a;
            case 1:
                MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                C0023j c0023j = this.f227557b.f74496c;
                Objects.requireNonNull(c0023j);
                jkd0 jkd0Var = (jkd0) c0023j.m214d(jkd0.class);
                jkd0Var.getClass();
                zg71.m96049a();
                try {
                    jkd0Var.f113286a.m216a("media_playback", "registerMediaSessionToken", new zca0(new pra(mediaSessionCompat$Token), 12));
                    return w2a1.f247311a;
                } catch (BundlerException e) {
                    throw new IllegalArgumentException("Serialization failure", e);
                }
            case 2:
                return m82506b((a8b) obj, fbkVar);
            default:
                opc opcVar = (opc) obj;
                String str = opcVar.f167863a;
                c8b c8bVar2 = this.f227557b;
                l9g0 l9g0Var = c8bVar2.f35157X;
                l9g0Var.getClass();
                yt91 yt91VarM96903c = l9g0Var.f131086b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("chapter_list_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                String str2 = opcVar.f167863a;
                dv91 dv91Var = new dv91("hit", 1);
                String string = str2.toString();
                if (string == null) {
                    string = "";
                }
                av91 av91Var = new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
                z650 z650Var = c8bVar2.f35165i.mo57453r(av91Var, null).f46380a;
                c8bVar2.f35166t.m60098a(av91Var, z650Var);
                Object objM35490e = ((daj0) c8bVar2.f35162f.get()).m35490e(new h0j0(str2), new s9j0(z650Var), fbkVar);
                return objM35490e == yuk.f276404a ? objM35490e : w2a1.f247311a;
        }
    }
}
