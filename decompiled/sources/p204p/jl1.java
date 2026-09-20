package p204p;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class jl1 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f113456b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f113457c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f113458d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f113459e;

    public /* synthetic */ jl1(Object obj, String str, Object obj2, boolean z, int i) {
        this.f113455a = i;
        this.f113458d = obj;
        this.f113456b = str;
        this.f113459e = obj2;
        this.f113457c = z;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0266  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        String string;
        View decorView;
        ghk ghkVar;
        riq0 riq0Var;
        cbf0 cbf0VarM35556a;
        cbf0 cbf0VarM35556a2;
        dbf0 dbf0VarM38368c;
        cbf0 cbf0VarM35556a3;
        mej mejVar;
        xky0 xky0Var;
        jk81 jk81Var;
        switch (this.f113455a) {
            case 0:
                Integer numValueOf = Integer.valueOf(R.string.snackbar_text);
                mmv mmvVar = (mmv) obj;
                kl1 kl1Var = (kl1) this.f113458d;
                String str = (String) this.f113456b;
                String str2 = (String) this.f113459e;
                g2q g2qVar = kl1Var.f123770d;
                if (this.f113457c) {
                    int i = mmvVar.f145263d;
                    int iM38547C = edb.m38547C(i);
                    if (iM38547C == 2 || iM38547C == 3 || iM38547C == 6) {
                        x60 x60Var = new x60((Object) kl1Var, str2, (Object) str, (Object) mmvVar, 2);
                        na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                        na6.m63963k(true, "Invalid resource ID provided: %s", null);
                        na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                        g2qVar.m43413r(new g631(null, "", numValueOf, null, Integer.valueOf(R.string.snackbar_view_action_text), new ryp(x60Var, 7), null, null, false), i, str);
                    } else {
                        na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                        na6.m63963k(true, "Invalid resource ID provided: %s", null);
                        g2qVar.m43413r(new g631(null, "", numValueOf, null, null, null, null, null, false), i, str);
                    }
                } else {
                    twy twyVar = kl1Var.f123768b;
                    int i2 = mmvVar.f145263d;
                    s73 s73Var = (s73) twyVar.f224516h;
                    if (s73Var == null || !s73Var.isShowing()) {
                        Context context = ((c03) twyVar.f224511c).f32655a;
                        String str3 = mmvVar.f145262c;
                        String str4 = mmvVar.f145260a;
                        int i3 = i2 == 2 ? 1 : 2;
                        int iM38547C2 = edb.m38547C(i2);
                        String string2 = (iM38547C2 == 1 || iM38547C2 == 5) ? context.getString(R.string.dialog_text_follow_artist, str4) : i2 == 4 ? context.getString(R.string.dialog_text_save_item_from, str4, str3) : context.getString(R.string.dialog_text_save_item, str4, str3);
                        String str5 = mmvVar.f145261b;
                        ha3 ha3Var = mmvVar.f145264e;
                        if (ha3Var instanceof ba3) {
                            string = context.getString(R.string.dialog_title_liked_songs);
                        } else if (ha3Var instanceof fa3) {
                            string = context.getString(R.string.dialog_title_your_episodes);
                        } else if (ha3Var instanceof ca3) {
                            string = ((ca3) ha3Var).f35710a;
                        } else {
                            string = wj50.m88271j(ha3Var, da3.f46966a) ? context.getString(R.string.dialog_title_your_library) : context.getString(R.string.dialog_title_your_library);
                        }
                        el1 el1Var = new el1(str5, string2, i3, string);
                        C2255pg c2255pg = new C2255pg(twyVar, str, mmvVar, 7);
                        C2038k3 c2038k3 = new C2038k3(twyVar, 20);
                        e940 e940Var = (e940) twyVar.f224513e;
                        Activity activity = (Activity) twyVar.f224514f;
                        ComposeView composeView = new ComposeView(activity, null, 0, 6, null);
                        composeView.setViewCompositionStrategy(mkr0.f144646T0);
                        composeView.setContent(new fyf(new C1690b3(e940Var, el1Var, c2255pg, c2038k3, 10), true, 1323856128));
                        s73 s73VarCreate = new r73(activity, R.style.AddToLibraryDialog).setView(composeView).create();
                        Window window = s73VarCreate.getWindow();
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            eug1.m40073o(decorView, activity instanceof hc80 ? (hc80) activity : null);
                            lug1.m59989F(decorView, activity instanceof ijc1 ? (ijc1) activity : null);
                            y85.m93047D(decorView, activity instanceof h9y0 ? (h9y0) activity : null);
                        }
                        s73VarCreate.setOnCancelListener(new gl1(twyVar, mmvVar, str));
                        s73VarCreate.show();
                        s1e1 s1e1Var = (s1e1) twyVar.f224512d;
                        s1e1Var.f204705d = null;
                        ((kv91) s1e1Var.f204703b).mo57449i(s1e1Var.m76954k(i2, str).mo24514e(), null);
                        twyVar.f224516h = s73VarCreate;
                    }
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof ghk) {
                    ghkVar = (ghk) fbkVar;
                    int i4 = ghkVar.f79942b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ghkVar.f79942b = i4 - Integer.MIN_VALUE;
                    } else {
                        ghkVar = new ghk(this, fbkVar);
                    }
                } else {
                    ghkVar = new ghk(this, fbkVar);
                }
                Object obj2 = ghkVar.f79941a;
                int i5 = ghkVar.f79942b;
                if (i5 == 0) {
                    bga.m29073P(obj2);
                    niz nizVar = (niz) this.f113458d;
                    qho qhoVar = (qho) obj;
                    oqj0 oqj0Var = qhoVar instanceof oho ? (oqj0) ((oho) qhoVar).f165512a : new oqj0(null, null);
                    String strM88484h1 = wl51.m88484h1((String) this.f113456b, ":");
                    ock ockVar = (ock) this.f113459e;
                    String str6 = oqj0Var.f168301a;
                    if (str6 != null) {
                        strM88484h1 = str6;
                    }
                    frj0 frj0Var = new frj0(ockVar, new oqj0(strM88484h1, oqj0Var.f168302b), this.f113457c);
                    ghkVar.f79942b = 1;
                    Object objEmit = nizVar.emit(frj0Var, ghkVar);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 2:
                uiq0 uiq0Var = (uiq0) this.f113459e;
                String str7 = (String) this.f113456b;
                if (fbkVar instanceof riq0) {
                    riq0Var = (riq0) fbkVar;
                    int i6 = riq0Var.f199603b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        riq0Var.f199603b = i6 - Integer.MIN_VALUE;
                    } else {
                        riq0Var = new riq0(this, fbkVar);
                    }
                } else {
                    riq0Var = new riq0(this, fbkVar);
                }
                Object obj3 = riq0Var.f199602a;
                int i7 = riq0Var.f199603b;
                if (i7 == 0) {
                    bga.m29073P(obj3);
                    niz nizVar2 = (niz) this.f113458d;
                    ebf0 ebf0Var = (ebf0) obj;
                    mna0 mna0VarM52499b = null;
                    d73Var = null;
                    d73 d73Var = null;
                    ks81Var = null;
                    ks81 ks81Var = null;
                    mna0VarM52499b = null;
                    vej vejVar = (!uiq0Var.f230795d.m34453a() || (dbf0VarM38368c = ebf0Var.m38368c(mej.class, str7)) == null || (cbf0VarM35556a3 = dbf0VarM38368c.m35556a()) == null || (mejVar = (mej) cbf0VarM35556a3.f36107a) == null) ? null : mejVar.f142740a;
                    if (this.f113457c) {
                        boolean z = false;
                        if (new gf41(str7).f79270c == df41.ALBUM) {
                            dbf0 dbf0VarM38368c2 = ebf0Var.m38368c(d73.class, str7);
                            if (dbf0VarM38368c2 != null && (cbf0VarM35556a2 = dbf0VarM38368c2.m35556a()) != null) {
                                d73Var = (d73) cbf0VarM35556a2.f36107a;
                            }
                            if (d73Var != null && d73Var.f45978h) {
                                z = true;
                            }
                            mna0VarM52499b = j5z.m52498a(z, vejVar);
                        } else if (new gf41(str7).f79270c == df41.TRACK) {
                            dbf0 dbf0VarM38368c3 = ebf0Var.m38368c(ks81.class, str7);
                            if (dbf0VarM38368c3 != null && (cbf0VarM35556a = dbf0VarM38368c3.m35556a()) != null) {
                                ks81Var = (ks81) cbf0VarM35556a.f36107a;
                            }
                            if (ks81Var != null && xud.m92145l(ks81Var)) {
                                z = true;
                            }
                            mna0VarM52499b = j5z.m52499b(z, vejVar);
                        }
                    }
                    riq0Var.f199603b = 1;
                    Object objEmit2 = nizVar2.emit(mna0VarM52499b, riq0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof xky0) {
                    xky0Var = (xky0) fbkVar;
                    int i8 = xky0Var.f262963b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        xky0Var.f262963b = i8 - Integer.MIN_VALUE;
                    } else {
                        xky0Var = new xky0(this, fbkVar);
                    }
                } else {
                    xky0Var = new xky0(this, fbkVar);
                }
                Object obj4 = xky0Var.f262962a;
                int i9 = xky0Var.f262963b;
                if (i9 == 0) {
                    bga.m29073P(obj4);
                    niz nizVar3 = (niz) this.f113458d;
                    PlayerState playerState = (PlayerState) obj;
                    ContextTrack contextTrack = (ContextTrack) playerState.track().mo49278b();
                    if (this.f113457c) {
                        ((wy3) ((xre) this.f113456b)).getClass();
                        Long l = (Long) playerState.position(System.currentTimeMillis()).mo49280e(new Long(0L));
                        Long l2 = (Long) playerState.duration().mo49280e(new Long(0L));
                        wj50.m88279p(l);
                        long jLongValue = l.longValue();
                        wj50.m88279p(l2);
                        jk81Var = new jk81(jLongValue, l2.longValue());
                    } else {
                        jk81Var = null;
                    }
                    jk81 jk81Var2 = jk81Var;
                    wj50.m88279p(contextTrack);
                    o0x o0xVar = new o0x(contextTrack, true, e72.m37994a0(contextTrack), hdi.m47220L(playerState), ((o040) this.f113459e).m65976a(playerState), hdi.m47214F(playerState) && !bm51.m29803n0(playerState.contextUri(), "spotify:lex-experiments:todays-feed", false), jk81Var2, (String) playerState.playbackId().mo49283h());
                    xky0Var.f262963b = 1;
                    Object objEmit3 = nizVar3.emit(o0xVar, xky0Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            default:
                ((Number) obj).intValue();
                xom0 xom0Var = (xom0) this.f113458d;
                if (this.f113457c) {
                    int i10 = 0;
                    Set setM43736n1 = g6f.m43736n1(new b450(Math.max(0, ((vum0) xom0Var.f264315d.f99667c).m86437v() - 1), Math.min(((AbstractC2282q6) ((qf40) this.f113456b)).mo33075a() - 1, ((vum0) xom0Var.f264315d.f99667c).m86437v() + 1), 1));
                    jom0 jom0Var = (jom0) this.f113459e;
                    for (Object obj5 : jom0Var.f114460i) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        jv50 jv50VarM53890a = jom0Var.m53890a(i10, (vwf) obj5);
                        Integer num = jom0Var.f114458g;
                        if (num != null && i10 == num.intValue()) {
                            jv50VarM53890a.m54371a(jxf.f117125d);
                            jom0Var.f114453b.f101069a.m97090l(jv50VarM53890a.f116265d);
                        } else {
                            Integer num2 = jom0Var.f114459h;
                            if (num2 != null && i10 == num2.intValue()) {
                                jv50VarM53890a.m54371a(jxf.f117124c);
                            } else if (setM43736n1.contains(Integer.valueOf(i10))) {
                                jv50VarM53890a.m54371a(jxf.f117123b);
                            } else {
                                jv50VarM53890a.m54371a(jxf.f117122a);
                            }
                        }
                        i10 = i11;
                    }
                }
                return w2a1.f247311a;
        }
    }

    public jl1(niz nizVar, uiq0 uiq0Var, String str, boolean z) {
        this.f113455a = 2;
        this.f113458d = nizVar;
        this.f113459e = uiq0Var;
        this.f113456b = str;
        this.f113457c = z;
    }

    public jl1(niz nizVar, boolean z, xre xreVar, o040 o040Var) {
        this.f113455a = 3;
        this.f113458d = nizVar;
        this.f113457c = z;
        this.f113456b = xreVar;
        this.f113459e = o040Var;
    }

    public jl1(boolean z, xom0 xom0Var, qf40 qf40Var, jom0 jom0Var) {
        this.f113455a = 4;
        this.f113457c = z;
        this.f113458d = xom0Var;
        this.f113456b = qf40Var;
        this.f113459e = jom0Var;
    }
}
