package p204p;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import io.reactivex.rxjava3.core.MaybeEmitter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class rqc extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f201797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f201798b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rqc(Object obj, int i) {
        super(1);
        this.f201797a = i;
        this.f201798b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        xcl0 ocl0Var;
        p151 m151Var;
        d850 d850VarMo57453r;
        String string;
        String string2;
        int i = this.f201797a;
        int i2 = 2;
        int i3 = 8;
        int i4 = 6;
        int i5 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f201798b;
        switch (i) {
            case 0:
                return ((fjh0) obj).m41842a(((loc) obj2).f135379a);
            case 1:
                kkx0 kkx0Var = (kkx0) obj2;
                qho qhoVarM25241r = aag1.m25241r((pgo) kkx0Var.f123726b, (tjo) kkx0Var.f123732h, (String) obj);
                oho ohoVar = qhoVarM25241r instanceof oho ? (oho) qhoVarM25241r : null;
                if (ohoVar != null) {
                    return (y6s0) ohoVar.f165512a;
                }
                return null;
            case 2:
                qsp qspVar = (qsp) ((hmh0) obj);
                qspVar.f192162a = new whb((hsc) obj2, i3);
                qspVar.f192165d = yva.f276600R0;
                qspVar.f192166e = yva.f276601S0;
                return w2a1Var;
            case 3:
                String str = (String) ((k35) obj).f118763b;
                Set set = dd41.f47702f;
                String strM35694A = r46.m74724S("podcast-chapters", str).m35694A();
                Set setSingleton = strM35694A != null ? Collections.singleton(new k35((jqx) obj2, strM35694A)) : null;
                return setSingleton == null ? gbu.f78413a : setSingleton;
            case 4:
                qsp qspVar2 = (qsp) ((hmh0) obj);
                qspVar2.f192162a = f4c.f65735W0;
                mpd mpdVar = (mpd) obj2;
                qspVar2.f192165d = new lpd(mpdVar, objArr6 == true ? 1 : 0);
                qspVar2.f192166e = new lpd(mpdVar, i5);
                opd opdVar = mpdVar.f145980d;
                FlowEventSources.Companion companion = FlowEventSources.f5713a;
                luk lukVar = opdVar.f167871b;
                fiz[] fizVarArr = {new yxb(opdVar.f167870a.f274427b, 9)};
                companion.getClass();
                qspVar2.f192163b = new C1045b(lukVar, fizVarArr);
                return w2a1Var;
            case 5:
                ((icp) obj).f100858d = new C1825es(obj2, (fbk) (objArr == true ? 1 : 0), i4);
                return w2a1Var;
            case 6:
                Bundle bundle = (Bundle) obj;
                qtd qtdVar = (qtd) ((ycc) obj2).f271454c;
                String strMo65613a = qtdVar.mo65613a();
                boolean z = qtdVar instanceof ptd;
                if (z) {
                    ocl0Var = ((ptd) qtdVar).f181104b;
                } else if (qtdVar instanceof otd) {
                    ocl0Var = ((otd) qtdVar).f169037b;
                } else {
                    if (!(qtdVar instanceof ntd)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ocl0Var = new ocl0(mjd.m61968d(6, ((ntd) qtdVar).f158050b, null), null, null, null, null, 120);
                }
                if (bundle == null || (m151Var = (p151) zn91.m96523K(bundle, "chat_share_step", p151.class)) == null) {
                    if (z) {
                        m151Var = o151.f160620a;
                    } else if (qtdVar instanceof otd) {
                        m151Var = new n151(objArr2 == true ? 1 : 0, i5, ((otd) qtdVar).f169038c);
                    } else {
                        if (!(qtdVar instanceof ntd)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ntd ntdVar = (ntd) qtdVar;
                        m151Var = new m151(ntdVar.f158050b, ntdVar.f158051c);
                    }
                }
                return new ftd(strMo65613a, ocl0Var, m151Var);
            case 7:
                qsp qspVar3 = (qsp) ((hmh0) obj);
                qspVar3.f192162a = evd.f63208h;
                bmh bmhVar = (bmh) obj2;
                qspVar3.f192165d = new fvd(bmhVar, objArr7 == true ? 1 : 0);
                qspVar3.f192166e = new fvd(bmhVar, i5);
                qspVar3.m73754a(fcd.f68074X0, fcd.f68076Y0);
                return w2a1Var;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((fkz0) obj2).f70644f.invoke(bool);
                return w2a1Var;
            case 9:
                return new d2e(objArr8 == true ? 1 : 0, (rmm0) obj, (q1e) ((ycc) ((y1e) obj2).f268243b.f104533a.f210441c).f271453b);
            case 10:
                ((w2e) obj2).f247326b.getClass();
                return new u2e(false, false, false);
            case 11:
                ChoiceScreenUcActivity choiceScreenUcActivity = (ChoiceScreenUcActivity) obj2;
                choiceScreenUcActivity.f4129t1 = (View) obj;
                choiceScreenUcActivity.m11166q0().m15621f(p8e.f174946a);
                return w2a1Var;
            case 12:
                wqb wqbVarM31107v = ((DrawScope) obj).mo291d1().m31107v();
                Canvas canvas = ly3.f137948a;
                ((ky3) wqbVarM31107v).f127640a.drawBitmap((Bitmap) obj2, 0.0f, 0.0f, (Paint) null);
                return w2a1Var;
            case 13:
                ybv ybvVar = ((qu80) obj).f192599e;
                String str2 = ybvVar.f271257b;
                qla1 qla1Var = ybvVar.f271260e;
                if (qla1Var == null) {
                    qla1Var = new qla1(127, null, null, null, null, null);
                }
                noa1 noa1Var = (noa1) obj2;
                return new ree(str2, qla1Var, ybvVar.f271259d.m84311c(1), noa1Var != null ? noa1Var.f156638b : false);
            case 14:
                xee xeeVar = (xee) obj2;
                pee peeVar = (pee) xeeVar.f260700e;
                if (wee.f250516a[((cjp0) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z2 = peeVar.f176741c;
                m47 m47Var = (m47) xeeVar.f260698c;
                kv91 kv91Var = (kv91) m47Var.f139856b;
                r2h0 r2h0Var = (r2h0) m47Var.f139857c;
                if (z2) {
                    r2h0Var.getClass();
                    yt91 yt91VarM96903c = r2h0Var.f195145c.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("error_view", null, null, null, null));
                    yt91VarM96903c.f276056j = true;
                    yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("find_playlists_button", null, null, null, null));
                    yt91VarM96903c2.f276056j = false;
                    d850VarMo57453r = kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", WidgetInteraction.Background.DESTINATION_HOME)), yt91VarM96903c2.m94607a(), r2h0Var.f195144b, System.currentTimeMillis()), null);
                } else {
                    if (z2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r2h0Var.getClass();
                    yt91 yt91VarM96903c3 = r2h0Var.f195145c.m96903c();
                    yt91VarM96903c3.f276055i.add(new bu91("error_view", null, null, null, null));
                    yt91VarM96903c3.f276056j = true;
                    yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                    yt91VarM96903c4.f276055i.add(new bu91("try_again_button", null, null, null, null));
                    yt91VarM96903c4.f276056j = false;
                    d850VarMo57453r = kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nau.f152117a), yt91VarM96903c4.m94607a(), r2h0Var.f195144b, System.currentTimeMillis()), null);
                }
                boolean z3 = peeVar.f176741c;
                if (z3) {
                    ((z9j0) xeeVar.f260697b).mo47342b(WidgetInteraction.Background.DESTINATION_HOME, d850VarMo57453r, null);
                } else {
                    if (z3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i780 i780Var = (i780) xeeVar.f260699d;
                    z9j0 z9j0Var = (z9j0) i780Var.f99465b;
                    String str3 = (String) i780Var.f99466c;
                    n6j0 n6j0Var = new n6j0(d850VarMo57453r);
                    if (str3 == null) {
                        throw new IllegalStateException("uri was not set!");
                    }
                    z9j0Var.mo63651f(new p6j0(str3, "", false, false, 0, 0, true, null, null, n6j0Var));
                }
                return w2a1Var;
            case 15:
                return new gdc(i2, (zee) obj2, (rmm0) obj);
            case 16:
                dfe dfeVar = (dfe) obj2;
                z9j0 z9j0Var2 = dfeVar.f48580a;
                m47 m47Var2 = dfeVar.f48581b;
                int iOrdinal = ((ffe) obj).ordinal();
                if (iOrdinal == 0) {
                    m47Var2.m60782q();
                    z9j0Var2.mo47345e();
                } else if (iOrdinal == 1) {
                    String str4 = dfeVar.f48585f.f15135a;
                    r2h0 r2h0Var2 = (r2h0) m47Var2.f139857c;
                    r2h0Var2.getClass();
                    yt91 yt91VarM96903c5 = r2h0Var2.f195145c.m96903c();
                    yt91VarM96903c5.f276055i.add(new bu91("join_button", null, null, null, null));
                    yt91VarM96903c5.f276056j = false;
                    zt91 zt91VarM94607a = yt91VarM96903c5.m94607a();
                    dv91 dv91Var = new dv91("hit", 1);
                    String string3 = str4.toString();
                    if (string3 == null) {
                        string3 = "";
                    }
                    d850 d850VarMo57453r2 = ((kv91) m47Var2.f139856b).mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string3)), zt91VarM94607a, r2h0Var2.f195144b, System.currentTimeMillis()), null);
                    hfe hfeVar = dfeVar.f48588i;
                    Button button = hfeVar.f90708M0;
                    hfeVar.f90707L0.setEnabled(false);
                    button.setCompoundDrawablesWithIntrinsicBounds(hfeVar.f90717f, (Drawable) null, (Drawable) null, (Drawable) null);
                    button.setOnClickListener(null);
                    ((Animator) hfeVar.f90719h.getValue()).start();
                    np7 np7Var = new np7(21, dfeVar, d850VarMo57453r2);
                    dfeVar.f48589j.m51848b(np7Var.m65285b().observeOn(dfeVar.f48586g).onErrorResumeNext(new flw0(dfeVar.f48582c, new uvb(24, dfeVar, d850VarMo57453r2), np7Var, 5)).subscribe());
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r2h0 r2h0Var3 = (r2h0) m47Var2.f139857c;
                    r2h0Var3.getClass();
                    yt91 yt91VarM96903c6 = r2h0Var3.f195145c.m96903c();
                    yt91VarM96903c6.f276055i.add(new bu91("not_now_button", null, null, null, null));
                    yt91VarM96903c6.f276056j = false;
                    z9j0Var2.mo47342b(WidgetInteraction.Background.DESTINATION_HOME, ((kv91) m47Var2.f139856b).mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", WidgetInteraction.Background.DESTINATION_HOME)), yt91VarM96903c6.m94607a(), r2h0Var3.f195144b, System.currentTimeMillis()), null), null);
                }
                return w2a1Var;
            case 17:
                g66 g66Var = (g66) obj;
                hfe hfeVar2 = (hfe) obj2;
                ArtworkShadow artworkShadow = hfeVar2.f90711Z;
                ArtworkView artworkView = hfeVar2.f90721t;
                if (g66Var instanceof c66) {
                    View view = hfeVar2.f90715d;
                    Integer num = ((c66) g66Var).f34400a;
                    view.setBackground(num != null ? new ColorDrawable(num.intValue()) : hfeVar2.f90718g);
                } else if (g66Var instanceof d66) {
                    artworkView.setVisibility(0);
                    artworkShadow.setVisibility(0);
                } else {
                    if (!(g66Var instanceof f66)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    artworkView.setVisibility(8);
                    artworkShadow.setVisibility(8);
                }
                return w2a1Var;
            case 18:
                CharSequence charSequence = ((b0m) obj).f21967a;
                if (charSequence == null || (string = charSequence.toString()) == null || (string2 = wl51.m88491o1(string).toString()) == null) {
                    return null;
                }
                String str5 = string2.length() > 0 ? string2 : null;
                if (str5 == null) {
                    return null;
                }
                z0m z0mVar = (z0m) obj2;
                return new bne(z0mVar.f278137b, str5, z0mVar.f278139d);
            case 19:
                v0y.m84416d(((wne) obj2).f253163e, (String) obj, false, 6);
                return w2a1Var;
            case 20:
                Window window = (Window) obj2;
                window.addFlags(128);
                return new C1865fm(window, 17);
            case 21:
                azy azyVar = (azy) obj;
                sqe sqeVar = (sqe) obj2;
                nr31 nr31Var = azyVar.f21708a;
                c9k c9kVar = sqeVar.f213081i;
                luk lukVar2 = sqeVar.f213075c;
                if (c9kVar != null) {
                    kk40.m56680v(c9kVar, null);
                }
                c9k c9kVarM56661c = kk40.m56661c(lukVar2);
                x0h1.m89578u(c9kVarM56661c, null, 0, new wbe((Object) sqeVar, (Object) nr31Var, (fbk) (objArr4 == true ? 1 : 0), 3), 3);
                sqeVar.f213081i = c9kVarM56661c;
                List list = azyVar.f21709b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((n2z) obj3).f149876b) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((n2z) it.next()).f149877c);
                }
                ro80 ro80VarM44508o = geg1.m44508o();
                if (arrayList2.contains(new j2z())) {
                    if (arrayList2.contains(new k2z())) {
                        ro80VarM44508o.add(gt80.f84105a);
                    } else {
                        ro80VarM44508o.add(ft80.f73135a);
                    }
                } else if (arrayList2.contains(new k2z())) {
                    ro80VarM44508o.add(lt80.f136724a);
                }
                if (arrayList2.contains(new i2z())) {
                    ro80VarM44508o.add(et80.f62664a);
                }
                ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
                di41 di41Var = sqeVar.f213082j;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                sqeVar.f213082j = x0h1.m89578u(kk40.m56661c(lukVar2), null, 0, new q91((Object) sqeVar, (Object) ro80VarM44506m, (fbk) (objArr3 == true ? 1 : 0), 16), 3);
                return w2a1Var;
            case 22:
                return new C2498vj((xkb) obj2, 22);
            case 23:
                return new xkb((fiz) obj, (rre) obj2, 11);
            case 24:
                ((icp) obj).f100858d = new sse((li0) obj2, objArr5 == true ? 1 : 0, objArr9 == true ? 1 : 0);
                return w2a1Var;
            case 25:
                return new iz80(((t22) obj2).f216408b);
            case 26:
                return ((i2f) obj2).f97833c;
            case 27:
                Exception exc = (Exception) obj;
                MaybeEmitter maybeEmitter = (MaybeEmitter) obj2;
                if (exc != null) {
                    maybeEmitter.tryOnError(exc);
                } else {
                    maybeEmitter.onComplete();
                }
                return w2a1Var;
            case 28:
                v05 v05Var = (v05) obj;
                float f = v05Var.f235918b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = v05Var.f235919c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = v05Var.f235920d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = v05Var.f235917a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new n6f(n6f.m63764a(rfg1.m75431a(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, c9f.f35513x), (z8f) obj2));
            default:
                return new ybs(((f4m0) obj).mo29187c((ko70) obj2));
        }
    }
}
