package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.Window;
import androidx.media3.session.legacy.MediaConstants;
import com.comscore.streaming.ContentType;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class brl0 implements ant, Function, BiFunction, el11, InterfaceC2207oa, Function3, SingleOnSubscribe, gie0, Function6 {

    /* JADX INFO: renamed from: c */
    public static final iql0 f30109c = new iql0();

    /* JADX INFO: renamed from: d */
    public static final hql0 f30110d = new hql0();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30111a;

    /* JADX INFO: renamed from: b */
    public final Object f30112b;

    public /* synthetic */ brl0(Object obj, int i) {
        this.f30111a = i;
        this.f30112b = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        fxx fxxVar = (fxx) obj2;
        ouo0 ouo0Var = (ouo0) obj3;
        yw3 yw3Var = (yw3) this.f30112b;
        ro80 ro80VarM44508o = geg1.m44508o();
        int i = 0;
        ro80VarM44508o.add(gao.m44175b(yw3Var.f276840a, (Map) obj, fxxVar.f74479a, false, 12));
        List list = fxxVar.f74479a;
        l0y l0yVar = new l0y(30, null, "YOUR_DOWNLOADS", null, null, null);
        ArrayList arrayList = new ArrayList();
        if (ouo0Var.f170328a != 1) {
            li80 li80Var = yw3Var.f276845f;
            String str = ouo0Var.f170331d;
            Uri uri = Uri.EMPTY;
            String str2 = ouo0Var.f170329b;
            Uri uriM34433d = ((czd0) li80Var.f133741c).m34433d(3, ouo0Var.f170330c);
            String str3 = null;
            Uri uri2 = null;
            Uri uri3 = null;
            int i2 = 2;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i3 = 4;
            Double d = null;
            Integer num = null;
            Integer num2 = null;
            boolean z5 = false;
            String str4 = null;
            String str5 = null;
            Integer num3 = null;
            arrayList.add(new axx(str, str3, str2, ((Context) li80Var.f133740b).getString(R.string.playlist_fallback_general_subtitle), uriM34433d, uri, uri, uri, uri2, uri3, i2, z, z2, z3, z4, 3, i3, d, num, num2, z5, str4, str5, num3, 0, null, null, null, null, null, null, null, null, 536870912, 2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : list) {
            ewk0 ewk0Var = yw3Var.f276846g;
            String str6 = ((axx) obj4).f21021a;
            ewk0Var.getClass();
            if (!ewk0.m40146b(str6)) {
                arrayList2.add(obj4);
            }
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (Object obj5 : arrayList) {
            int i4 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            axx axxVar = (axx) obj5;
            l0y l0yVar2 = new l0y(18, Integer.valueOf(i), "ITEM", null, axxVar.f21021a, null);
            Map mapM56695h0 = kkc0.m56695h0(new pqm0(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_PLAYABLE, 1), new pqm0(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_BROWSABLE, 1), new pqm0(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_SINGLE_ITEM, 2));
            exx exxVar = new exx(h6f.m46715L(l0yVar, l0yVar2));
            String string = yw3Var.f276841b.getString(R.string.android_auto_your_downloads_section);
            mec0 mec0Var = new mec0();
            mec0Var.putAll(axxVar.f21046z);
            mec0Var.putAll(mapM56695h0);
            arrayList3.add(axx.m27436b(axxVar, null, null, null, 0, null, null, 0, exxVar, string, mec0Var.m61540b(), null, -639631361, 3));
            i = i4;
        }
        ro80VarM44508o.addAll(arrayList3);
        return new fxx(geg1.m44506m(ro80VarM44508o), null, null, null);
    }

    @Override // p204p.el11
    /* JADX INFO: renamed from: a */
    public tjo mo27669a() {
        return (tjo) this.f30112b;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((my00) ((pgq0) this.f30112b).f177385b).f148246b.m95562c();
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        String str = (String) obj;
        xul0 xul0Var = (xul0) obj2;
        r0e1 r0e1Var = (r0e1) this.f30112b;
        return new f12(str.length() == 0 ? ((Resources) r0e1Var.f194479c).getString(R.string.advertisement_text) : str, str.length() == 0 ? fzg1.m43215r((Resources) r0e1Var.f194479c, fzg1.m43201d(xul0Var), false, null) : fzg1.m43203f((Resources) r0e1Var.f194479c, fzg1.m43201d(xul0Var), false, null));
    }

    @Override // p204p.gie0
    /* JADX INFO: renamed from: b */
    public void mo29244b(zge0 zge0Var, boolean z) {
        ((l65) this.f30112b).m58301p(zge0Var);
    }

    @Override // io.reactivex.rxjava3.functions.Function6
    /* JADX INFO: renamed from: c */
    public Object mo23411c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        tco tcoVar = (tco) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj6).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
        qd6 qd6Var = (qd6) this.f30112b;
        boolean zMo82482m = qd6Var.f187497e.mo82482m();
        jys0 jys0Var = qd6Var.f187493a;
        boolean z = jys0Var.f117482d;
        boolean z2 = jys0Var.f117483e;
        return new tco(tcoVar.f219119a, tcoVar.f219120b, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, tcoVar.f219125g, (bep0) obj3, zMo82482m, z, z2);
    }

    /* JADX INFO: renamed from: d */
    public u790 m30302d() {
        return (jbb) this.f30112b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public Object m30303e(n4e1 n4e1Var, ibk ibkVar) {
        lw6 lw6Var;
        if (ibkVar instanceof lw6) {
            lw6Var = (lw6) ibkVar;
            int i = lw6Var.f137458d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lw6Var.f137458d = i - Integer.MIN_VALUE;
            } else {
                lw6Var = new lw6(this, ibkVar);
            }
        } else {
            lw6Var = new lw6(this, ibkVar);
        }
        Object objM76582d = lw6Var.f137456b;
        int i2 = lw6Var.f137458d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76582d);
                rwt0 rwt0Var = (rwt0) this.f30112b;
                String str = n4e1Var.f150329a;
                lw6Var.f137455a = n4e1Var;
                lw6Var.f137458d = 1;
                objM76582d = rwt0Var.m76582d(str, lw6Var);
                Object obj = yuk.f276404a;
                if (objM76582d == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n4e1Var = lw6Var.f137455a;
                bga.m29073P(objM76582d);
            }
            return new e6e1(n4e1Var.f150330b, (byte[]) objM76582d);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            r0m r0mVarM76887a = s0m.m76887a(6, e2);
            String message = e2.getMessage();
            if (message == null) {
                message = "Download failed";
            }
            return new f6e1(r0mVarM76887a.f194523a, message, r0mVarM76887a.f194524b, n4e1Var.f150330b);
        }
    }

    @Override // p204p.gie0
    /* JADX INFO: renamed from: f */
    public boolean mo29245f(zge0 zge0Var) {
        Window.Callback callback = ((l65) this.f30112b).f130202Y.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, zge0Var);
        return true;
    }

    @Override // p204p.el11
    /* JADX INFO: renamed from: m */
    public boolean mo27680m(Object obj) {
        String str;
        w46 w46Var = ((v03) obj).f235895b;
        return (w46Var == null || (str = w46Var.f247713a) == null || str.length() <= 0) ? false : true;
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        bji bjiVar;
        bji bjiVar2;
        bji bjiVar3;
        bji bjiVar4;
        switch (this.f30111a) {
            case 16:
                c54 c54Var = (c54) this.f30112b;
                fnk0 fnk0Var = c54Var.f34074c;
                if (fnk0Var == null || !fnk0Var.m42228h("android-feature-kidsmode.debug_is_in_kids_mode")) {
                    bjiVar = fnk0Var;
                    bjiVar = c54Var.f34075d;
                }
                if (bjiVar != null) {
                }
                break;
            case 17:
                b94 b94Var = (b94) this.f30112b;
                fnk0 fnk0Var2 = b94Var.f24761g;
                if (fnk0Var2 == null || !fnk0Var2.m42228h("android-gen-alpha.use_kids_view_get_children")) {
                    bjiVar2 = fnk0Var2;
                    bjiVar2 = b94Var.f24762h;
                }
                if (bjiVar2 != null) {
                }
                break;
            case 18:
            default:
                gi5 gi5Var = (gi5) this.f30112b;
                fnk0 fnk0Var3 = gi5Var.f80068r;
                if (fnk0Var3 == null || !fnk0Var3.m42228h("apps-music-libs-eventsender.rate_limiting_rule_3_events_per_time_unit")) {
                    bjiVar4 = fnk0Var3;
                    bjiVar4 = gi5Var.f80069s;
                }
                if (bjiVar4 != null) {
                }
                break;
            case 19:
                ol4 ol4Var = (ol4) this.f30112b;
                fnk0 fnk0Var4 = ol4Var.f166750b;
                if (fnk0Var4 == null || !fnk0Var4.m42228h("android-player-settings-automix.automix_enabled")) {
                    bjiVar3 = fnk0Var4;
                    bjiVar3 = ol4Var.f166751c;
                }
                if (bjiVar3 != null) {
                }
                break;
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        ((yum0) ((C2223op) this.f30112b).f167727h).setValue(bool);
    }

    public brl0(x03 x03Var) {
        this.f30111a = 11;
        this.f30112b = (tjo) x03Var.f256790d;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        ws0 ws0Var;
        z650 z650Var;
        String str;
        ContextTrack contextTrack;
        int i = this.f30111a;
        boolean z = false;
        z = false;
        String str2 = null;
        int i2 = 1;
        Object obj2 = this.f30112b;
        switch (i) {
            case 3:
                af0 af0Var = (af0) obj;
                if (wj50.m88271j(af0Var.f14994a, ((Activity) obj2).toString()) && af0Var.f14995b == fb80.f67754e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                x02 x02Var = (x02) obj;
                kc5 kc5Var = (kc5) obj2;
                zs0 zs0Var = (zs0) kc5Var.f121371g;
                if (zs0Var != null) {
                    if (x02Var.f256763Z instanceof kdl) {
                        ws0Var = new ws0(true);
                    } else {
                        ws0Var = new ws0(false);
                    }
                    zs0Var.f285801h = ws0Var;
                }
                l1m0 l1m0Var = (l1m0) kc5Var.f121372h;
                l1m0 l1m0Var2 = l1m0.f128755a;
                if (l1m0Var != l1m0Var2) {
                    if (zs0Var != null) {
                        zs0Var.m96801E(false);
                    }
                    kc5Var.f121372h = l1m0Var2;
                }
                return !(x02Var.f256754N0 instanceof jr20) ? Observable.empty() : Observable.timer(2000L, TimeUnit.MILLISECONDS, (Scheduler) kc5Var.f121367c);
            case 5:
                return new vhj0((Throwable) obj, ((jya0) obj2).f117347i);
            case 6:
                hj7 hj7Var = (hj7) obj;
                Iterator it = ((Set) ((dz0) obj2).f54471e.get()).iterator();
                while (it.hasNext()) {
                    ((em7) it.next()).mo24337a(hj7Var.f91975a);
                }
                return jj7.f112940a;
            case 8:
                eqy0 eqy0Var = (eqy0) obj;
                ol1 ol1Var = (ol1) obj2;
                psp pspVar = (psp) ol1Var.f166728b;
                String str3 = eqy0Var.f61977d;
                kbm0 kbm0Var = ((nbm0) ol1Var.f166729c).get();
                String str4 = kbm0Var != null ? kbm0Var.f121231a : null;
                if (str4 == null) {
                    str4 = "";
                }
                d850 d850Var = eqy0Var.f61978e;
                if (d850Var != null && (z650Var = d850Var.f46380a) != null) {
                    str2 = z650Var.f279709a;
                }
                return pspVar.m70885b(str3, str4, 2, str2 != null ? str2 : "").m23307y().onErrorResumeNext(pqa.f180238e);
            case 12:
                if (((Boolean) obj).booleanValue()) {
                    ik40 ik40Var = (ik40) obj2;
                    x5n0 x5n0Var = (x5n0) ik40Var.f103008d;
                    b6n0 b6n0Var = x5n0Var.f258476a;
                    return Single.defer(new yh1(b6n0Var, 20)).subscribeOn(b6n0Var.f23995a).map(new g4n0(x5n0Var, i2)).map(new vbu0(ik40Var, 13)).doOnSuccess(new C1666ag(ik40Var, 15));
                }
                return Single.just(Boolean.FALSE);
            case 13:
                ac3 ac3Var = (ac3) obj;
                ic3 ic3Var = (ic3) obj2;
                wj50.m88279p(ac3Var);
                xqb xqbVar = ic3Var.f100717a;
                EntryPoint entryPoint = ac3Var.f14229a;
                hv31 hv31Var = ic3Var.f100718b.f133944a;
                String strMo48716k = hv31Var != null ? hv31Var.mo48716k(lj3.f133943b) : "";
                if (wl51.m88460J0(strMo48716k)) {
                    str = strMo48716k;
                } else {
                    Set set = dd41.f47702f;
                    String strM35694A = r46.m74726U(strMo48716k).m35694A();
                    if (strM35694A == null) {
                        str = "";
                    } else {
                        str2 = wl51.m88460J0(strM35694A) ? null : strM35694A;
                        if (str2 == null) {
                            str = "";
                        } else {
                            str = str2;
                        }
                    }
                }
                Optional optional = (Optional) xqbVar.f264946c;
                if (!optional.isPresent()) {
                    r0e1 r0e1Var = (r0e1) xqbVar.f264945b;
                    return hdi.m47222N(kc3.m55981d((kc3) r0e1Var.f194478b, entryPoint.getEndpointPath(), ((thm0) r0e1Var.f194479c).m80861b(j101.f107584a).toString(), str, entryPoint.getLabel(), null, null, null, ContentType.LONG_FORM_ON_DEMAND, null).map(new c961(entryPoint, 12))).map(new lh51(17, ic3Var, ac3Var)).doOnSubscribe(new fc3(ic3Var, i2));
                }
                optional.get().getClass();
                throw new ClassCastException();
            case 18:
                PlayerState playerState = (PlayerState) obj;
                ch4 ch4Var = (ch4) obj2;
                if (playerState.isPlaying() && !playerState.isPaused() && (contextTrack = (ContextTrack) playerState.track().mo49283h()) != null && e72.m37978L(contextTrack) && ch4Var.f37904k.m38895a()) {
                    return Flowable.m23312H(60L, 60L, TimeUnit.SECONDS, ch4Var.f37895b).m23331J(new vbu0(playerState, 19)).m23340U(playerState);
                }
                return Flowable.m23313I(playerState);
            case 23:
                return ((r06) obj2).m74365a(Collections.singletonList((String) obj)).toObservable();
            case 26:
                return k0e1.m54986e(((nh61) obj2).m64442q((PlayerState) obj), dau.f47107a);
            case 27:
                return new CompletableFromAction(new sf7((hv31) obj, (tf7) obj2, z ? 1 : 0));
            case 28:
                Object obj3 = ((s6x0) obj).f206218a;
                hua0 hua0Var = (hua0) obj2;
                Throwable thM77348a = s6x0.m77348a(obj3);
                if (thM77348a == null) {
                    return ((Single) hua0Var.f95357b.f91055m.invoke((byte[]) obj3)).map(v4g1.f237175i).onErrorReturn(new vbu0(hua0Var, 29));
                }
                try {
                    hua0Var.f95357b.f91056n.invoke();
                    break;
                } catch (Throwable unused) {
                }
                return Single.just(new zua0(wze1.m89423D(thM77348a)));
            default:
                Throwable th = (Throwable) obj;
                Logger.m3966b("Error when authorizing client %s %s", ((vq7) obj2).f243884a, th);
                return new cr7(zew.f282132Y, edb.m38564m("Error when authorizing: ", th.getMessage()), null);
        }
    }
}
