package p204p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.facebook.FacebookException;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.UbiProd1Impression;
import com.spotify.music.R;
import com.spotify.pending_events.esperanto.proto.AddPendingEventResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase;
import com.spotify.thestage.vtec.datasource.Site;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class uj81 implements Function, yut, el11, fld1, kc41, egz0 {

    /* JADX INFO: renamed from: d */
    public static JSONObject f230937d;

    /* JADX INFO: renamed from: e */
    public static uj81 f230938e;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f230939a;

    /* JADX INFO: renamed from: b */
    public final Object f230940b;

    /* JADX INFO: renamed from: c */
    public Object f230941c;

    public /* synthetic */ uj81(int i, Object obj, Object obj2) {
        this.f230939a = i;
        this.f230940b = obj;
        this.f230941c = obj2;
    }

    /* JADX INFO: renamed from: l */
    public static void m83236l(Context context) {
        try {
            new a3a1(context).m93702a(new Void[0]);
        } catch (Exception e) {
            syg1.m79688g(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: p */
    public static uj81 m83237p(Context context) {
        if (f230938e == null) {
            f230938e = new uj81(context);
        }
        return f230938e;
    }

    @Override // p204p.el11
    /* JADX INFO: renamed from: a */
    public tjo mo27669a() {
        switch (this.f230939a) {
            case 13:
                break;
        }
        return (tjo) this.f230940b;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        r8 = "";
     */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo98394apply(Object obj) {
        String strConcat;
        boolean z;
        String strM38000d0;
        switch (this.f230939a) {
            case 0:
                f5w f5wVar = (f5w) this.f230940b;
                String str = (String) this.f230941c;
                return ((jpx) ((epx) f5wVar.f57320b)).m53978b(new C1668ai("save-for-later", false, (gh00) new e151(str, 24))).filter(tp20.f222400Z0).map(new dh31(19, str, f5wVar)).map(new gc41((ha3) obj, 12));
            case 1:
                en81 en81Var = (en81) this.f230941c;
                dd41 dd41Var = (dd41) this.f230940b;
                return (((Boolean) obj).booleanValue() || dd41Var.m35724v()) ? en81Var.m39478d(dd41Var).map(wjr0.f252016S0).timeout(10L, TimeUnit.SECONDS, en81Var.f61097b).onErrorResumeNext(tjr0.f220991S0).map(ujr0.f231090T0) : en81.m39476b(en81Var, dd41Var);
            case 7:
                AddPendingEventResponse addPendingEventResponse = (AddPendingEventResponse) obj;
                return addPendingEventResponse.m16962o() ? Single.just(new bw91((zv91) this.f230940b, (UbiProd1Impression) this.f230941c, new aw91(addPendingEventResponse.m16963p(), addPendingEventResponse.m16964q()))) : Single.error(new cw91("Can't add pending event", addPendingEventResponse.m16961n()));
            case 14:
                String str2 = (String) obj;
                a531 a531Var = (a531) this.f230941c;
                Scheduler scheduler = (Scheduler) a531Var.f12417e;
                HeadphoneFilterStateDatabase headphoneFilterStateDatabase = (HeadphoneFilterStateDatabase) a531Var.f12414b;
                jp20 jp20Var = (jp20) this.f230940b;
                if (jp20Var instanceof hp20) {
                    return q0f1.m71846z(headphoneFilterStateDatabase.mo20002z().f148950a, new String[]{"BluetoothHeadphoneFilterStateEntity"}, new C2026js(((hp20) jp20Var).f93686a, str2, 3)).subscribeOn(scheduler).map(new w221(a531Var, 22)).publish(new m57(29));
                }
                if (jp20Var instanceof ip20) {
                    return q0f1.m71846z(headphoneFilterStateDatabase.mo20001A().f64352a, new String[]{"WiredHeadphoneFilterStateEntity"}, new dzd1(((ip20) jp20Var).f104368a, str2, 0)).subscribeOn(scheduler).map(new d501(a531Var, 25)).publish(new m57(29));
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, "Couldn't create request for prepare", new Object[0]);
                ((ac6) ((eu6) this.f230940b).f62883h).m25441d(th, (VoiceAssistantLoggingContext) this.f230941c);
                return CompletableEmpty.f7437a;
            case 21:
                Site site = (Site) this.f230940b;
                Uri.Builder builder = (Uri.Builder) this.f230941c;
                String str3 = ((ky71) obj).f127714a;
                String fragment = builder.build().getFragment();
                if (fragment == null || (strConcat = fragment.concat("&")) == null) {
                    strConcat = "";
                }
                return Single.just(new fs41(site, builder.encodedFragment(strConcat + "id_token=" + str3).build().toString(), null));
            case 22:
                ContextTrack contextTrack = (ContextTrack) this.f230941c;
                oyp0 oyp0Var = (oyp0) this.f230940b;
                if (!hdi.m47215G((PlayerState) obj) && !((vnt0) oyp0Var.f171834d).m86062a(contextTrack) && ((j7c) oyp0Var.f171835e).f109559a.m79380d()) {
                    if (!e72.m37986T(contextTrack)) {
                    }
                    if (strM38000d0.length() <= 0 || ((mb80) oyp0Var.f171836f).f141817b.current().getValue() != null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                yk91 yk91Var = (yk91) obj;
                List list = (List) yk91Var.f273650a;
                xul0 xul0Var = (xul0) yk91Var.f273651b;
                xul0 xul0Var2 = (xul0) yk91Var.f273652c;
                prd1 prd1Var = (prd1) this.f230940b;
                prd1Var.f180571j = list;
                wj50.m88279p(xul0Var2);
                prd1Var.f180572k = xul0Var2;
                prd1Var.f180573l = xul0Var;
                return (nrd1) this.f230941c;
            default:
                rnm0 rnm0Var = (rnm0) this.f230940b;
                rnm0 rnm0VarM76005j = rnm0.m76005j(rnm0Var, rnm0Var.f200942a.m95183k((List) obj), 0, 2);
                return rnm0.m76005j(rnm0VarM76005j, null, rnm0VarM76005j.f200943b + ((b1i0) this.f230941c).f22360e.f152686c, 1);
        }
    }

    @Override // p204p.egz0
    /* JADX INFO: renamed from: b */
    public int mo30540b(int i) {
        CharSequence charSequence = (CharSequence) this.f230940b;
        do {
            i = ((w780) this.f230941c).m87386z(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // p204p.kc41
    /* JADX INFO: renamed from: c */
    public ihs mo27467c(ygs ygsVar, int i, ka80 ka80Var, String str) {
        na80 na80Var = (na80) this.f230941c;
        String str2 = i == 2 ? na80Var.f151968a : na80Var.f151969b;
        zz11 zz11Var = new zz11(-1, 10);
        UUID uuid = mva.f147548e;
        jbr0 jbr0Var = jbr0.f110856X0;
        uuid.getClass();
        lep lepVar = new lep(uuid, jbr0Var, new dc31(ygsVar, (z4l0) this.f230940b, str2), new HashMap(), false, new int[0], true, zz11Var);
        if (ka80Var != null) {
            lepVar.m58808l(ka80Var.m55871b(), 0);
        }
        return lepVar;
    }

    @Override // p204p.yut
    public void cancel() {
        wx81 wx81Var = (wx81) this.f230941c;
        if (wx81Var != null) {
            wx81Var.f255968a = true;
            tf60 tf60Var = wx81Var.f255969b;
            if (tf60Var != null) {
                tf60Var.mo26601e(null);
            }
        }
    }

    @Override // p204p.egz0
    /* JADX INFO: renamed from: d */
    public int mo30541d(int i) {
        do {
            i = ((w780) this.f230941c).m87333E(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f230940b).charAt(i)));
        return i;
    }

    @Override // p204p.egz0
    /* JADX INFO: renamed from: e */
    public int mo30542e(int i) {
        do {
            i = ((w780) this.f230941c).m87386z(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f230940b).charAt(i - 1)));
        return i;
    }

    @Override // p204p.fld1
    /* JADX INFO: renamed from: f */
    public void mo41999f(Bundle bundle, FacebookException facebookException) {
        ((vmd1) this.f230940b).m51843R((awa0) this.f230941c, bundle, facebookException);
    }

    @Override // p204p.yut
    /* JADX INFO: renamed from: g */
    public void mo80773g(gh00 gh00Var, eh00 eh00Var) {
        wx81 wx81Var = (wx81) this.f230941c;
        if (wx81Var != null) {
            wx81Var.f255968a = true;
            tf60 tf60Var = wx81Var.f255969b;
            if (tf60Var != null) {
                tf60Var.mo26601e(null);
            }
        }
        long j = cks.m33185d(0L, 0L) ? ((zx81) this.f230940b).f287244c : 0L;
        zx81 zx81Var = (zx81) this.f230940b;
        fiz fizVarM62953p = mvl0.m62953p((fiz) eh00Var.invoke());
        if (zx81Var.f287250i) {
            throw new IllegalStateException("TrampolineScope is cancelled");
        }
        wx81 wx81Var2 = new wx81();
        zx81Var.f287248g.add(new xx81(zx81Var.m97168b(j) + zx81Var.f287251j, wx81Var2, new gny0(zx81Var, wx81Var2, fizVarM62953p, gh00Var)));
        zx81Var.m97169c();
        this.f230941c = wx81Var2;
    }

    @Override // p204p.egz0
    /* JADX INFO: renamed from: h */
    public int mo30543h(int i) {
        do {
            i = ((w780) this.f230941c).m87333E(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f230940b).charAt(i - 1)));
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r7 == r2) goto L35;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m83238k(rn1 rn1Var, ibk ibkVar) {
        i2b1 i2b1Var;
        boolean zBooleanValue;
        if (ibkVar instanceof i2b1) {
            i2b1Var = (i2b1) ibkVar;
            int i = i2b1Var.f97795d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i2b1Var.f97795d = i - Integer.MIN_VALUE;
            } else {
                i2b1Var = new i2b1(this, ibkVar);
            }
        } else {
            i2b1Var = new i2b1(this, ibkVar);
        }
        Object objM93177k = i2b1Var.f97793b;
        int i2 = i2b1Var.f97795d;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    rn1Var = i2b1Var.f97792a;
                    bga.m29073P(objM93177k);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM93177k);
                }
                return yp1.f274790a;
            }
            bga.m29073P(objM93177k);
            ya3 ya3Var = (ya3) this.f230940b;
            x93 x93Var = rn1Var.f200691a;
            i2b1Var.f97792a = rn1Var;
            i2b1Var.f97795d = 1;
            objM93177k = ya3Var.m93177k(x93Var, i2b1Var);
            if (objM93177k == yukVar) {
            }
            return yukVar;
            zBooleanValue = ((Boolean) objM93177k).booleanValue();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            return new up1(new ggm(null));
        }
        ut1 ut1Var = (ut1) this.f230941c;
        kn1 kn1Var = new kn1(rn1Var.f200692b, rn1Var.f200693c);
        i2b1Var.f97792a = null;
        i2b1Var.f97795d = 2;
        Object objMo30229d = ut1Var.f233737a.mo30229d(kn1Var, i2b1Var);
        if (objMo30229d != yukVar) {
            objMo30229d = w2a1.f247311a;
        }
    }

    @Override // p204p.el11
    /* JADX INFO: renamed from: m */
    public boolean mo27680m(Object obj) {
        switch (this.f230939a) {
            case 13:
                hz80 hz80Var = (hz80) obj;
                return m3l.m60707n(hz80Var.f96812M0, in80.f103923d, in80.f103927h) && !((mm90) ((yk1) this.f230941c).f273535g).m62274a(hz80Var.f96822X);
            default:
                hz80 hz80Var2 = (hz80) obj;
                if (hz80Var2.f96821V0 && !m3l.m60715v(hz80Var2.f96812M0)) {
                    pxi0 pxi0Var = ((xjs) this.f230941c).f262223c;
                    boolean z = hz80Var2.f96819T0;
                    List list = hz80Var2.f96811L0;
                    noa1 noa1Var = hz80Var2.f96834t;
                    Map map = hz80Var2.f96822X;
                    ve4 ve4Var = (ve4) pxi0Var.f182313d;
                    if (!Boolean.parseBoolean((String) map.get("is_video_first")) && !f3h1.m40678c(map) && (ve4Var.m85277c() ? (!ve4Var.m85278d() || z) && !((urt0) pxi0Var.f182314e).m83868l(list, map) : z && noa1Var.f156638b)) {
                        return true;
                    }
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public View m83239n(int i, int i2, int i3, int i4) {
        nn81 nn81Var = (nn81) this.f230941c;
        udc1 udc1Var = (udc1) this.f230940b;
        int iMo61125c = udc1Var.mo61125c();
        int iMo61127h = udc1Var.mo61127h();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo61128i = udc1Var.mo61128i(i);
            int iMo61124b = udc1Var.mo61124b(viewMo61128i);
            int iMo61129j = udc1Var.mo61129j(viewMo61128i);
            nn81Var.f156358b = iMo61125c;
            nn81Var.f156359c = iMo61127h;
            nn81Var.f156360d = iMo61124b;
            nn81Var.f156361e = iMo61129j;
            if (i3 != 0) {
                nn81Var.f156357a = i3;
                if (nn81Var.m65193a()) {
                    return viewMo61128i;
                }
            }
            if (i4 != 0) {
                nn81Var.f156357a = i4;
                if (nn81Var.m65193a()) {
                    view = viewMo61128i;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: o */
    public String m83240o(String str) {
        Context context = (Context) this.f230940b;
        if (((ynb) this.f230941c).f274426a.m58075h()) {
            String string = context.getString(R.string.unblock_user_confirmation_dialog_body_with_messaging, str);
            wj50.m88279p(string);
            return string;
        }
        String string2 = context.getString(R.string.unblock_user_confirmation_dialog_body);
        wj50.m88279p(string2);
        return string2;
    }

    /* JADX INFO: renamed from: q */
    public String m83241q(String str) {
        String string;
        ArrayList arrayList = (ArrayList) this.f230940b;
        try {
            JSONArray jSONArrayOptJSONArray = f230937d.optJSONArray("uri_skip_list");
            if (jSONArrayOptJSONArray == null) {
                string = null;
                break;
            }
            int i = 0;
            while (true) {
                if (i >= jSONArrayOptJSONArray.length()) {
                    string = null;
                    break;
                }
                try {
                    string = jSONArrayOptJSONArray.getString(i);
                    if (Pattern.compile(string).matcher(str).find()) {
                        break;
                    }
                    i++;
                } catch (JSONException e) {
                    syg1.m79688g(e.getMessage());
                }
            }
            if (string == null) {
                if (arrayList.size() <= 0) {
                    return str;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (str.matches((String) it.next())) {
                        return str;
                    }
                }
            }
            return string;
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m83242r(View view) {
        nn81 nn81Var = (nn81) this.f230941c;
        udc1 udc1Var = (udc1) this.f230940b;
        int iMo61125c = udc1Var.mo61125c();
        int iMo61127h = udc1Var.mo61127h();
        int iMo61124b = udc1Var.mo61124b(view);
        int iMo61129j = udc1Var.mo61129j(view);
        nn81Var.f156358b = iMo61125c;
        nn81Var.f156359c = iMo61127h;
        nn81Var.f156360d = iMo61124b;
        nn81Var.f156361e = iMo61129j;
        nn81Var.f156357a = 24579;
        return nn81Var.m65193a();
    }

    /* JADX INFO: renamed from: s */
    public d850 m83243s(wbv wbvVar, String str) {
        kv91 kv91Var = (kv91) this.f230940b;
        hog0 hog0Var = (hog0) this.f230941c;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("related_content", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        String str2 = wbvVar.f249856b;
        yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("row", null, null, str2, null));
        yt91VarM96903c2.f276056j = true;
        zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        return kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a2, hog0Var.f93537b, System.currentTimeMillis()), null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r0.m55834a(r3, r1) == r6) goto L25;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m83244t(ibk ibkVar) {
        ij91 ij91Var;
        int i;
        k9l0 k9l0Var = (k9l0) this.f230940b;
        if (ibkVar instanceof ij91) {
            ij91Var = (ij91) ibkVar;
            int i2 = ij91Var.f102764d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ij91Var.f102764d = i2 - Integer.MIN_VALUE;
            } else {
                ij91Var = new ij91(this, ibkVar);
            }
        } else {
            ij91Var = new ij91(this, ibkVar);
        }
        Object objM55837d = ij91Var.f102762b;
        int i3 = ij91Var.f102764d;
        ii91 ii91Var = ii91.SHUFFLE_SNACKBAR;
        yuk yukVar = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = ij91Var.f102761a;
                bga.m29073P(objM55837d);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM55837d);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM55837d);
        i = 0;
        ij91Var.f102761a = 0;
        ij91Var.f102764d = 1;
        objM55837d = k9l0Var.m55837d(ii91Var, ij91Var);
        if (objM55837d != yukVar) {
        }
        return yukVar;
        if (((Boolean) objM55837d).booleanValue() && ((a5j0) this.f230941c).m24808g(1, mg91.f143405i)) {
            ij91Var.f102761a = i;
            ij91Var.f102764d = 2;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r9 == r4) goto L29;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m83245u(String str, b791 b791Var, ibk ibkVar) {
        z991 z991Var;
        if (ibkVar instanceof z991) {
            z991Var = (z991) ibkVar;
            int i = z991Var.f280728d;
            if ((i & Integer.MIN_VALUE) != 0) {
                z991Var.f280728d = i - Integer.MIN_VALUE;
            } else {
                z991Var = new z991(this, ibkVar);
            }
        } else {
            z991Var = new z991(this, ibkVar);
        }
        Object objM49966c = z991Var.f280726b;
        int i2 = z991Var.f280728d;
        boolean z = true;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM49966c);
            i8z i8zVar = (i8z) this.f230940b;
            z991Var.f280725a = str;
            z991Var.f280728d = 1;
            objM49966c = i8zVar.m49966c(str, b791Var, z991Var);
            if (objM49966c != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str = z991Var.f280725a;
            bga.m29073P(objM49966c);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM49966c);
        }
        p2x0 p2x0Var = (p2x0) objM49966c;
        if (!(p2x0Var instanceof m2x0)) {
            if (!(p2x0Var instanceof k2x0)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        return Boolean.valueOf(z);
        List<p891> list = (List) objM49966c;
        if (list.isEmpty()) {
            return Boolean.TRUE;
        }
        ArrayList arrayList = new ArrayList();
        for (p891 p891Var : list) {
            j6f.m52564V(h6f.m46715L(p891Var.f174900a, p891Var.f174901b), arrayList);
        }
        yz80 yz80Var = (yz80) this.f230941c;
        z991Var.f280725a = null;
        z991Var.f280728d = 2;
        objM49966c = ((n090) yz80Var).m63318o(str, arrayList, z991Var);
    }

    public uj81(Site site, x1p0 x1p0Var, Uri.Builder builder) {
        this.f230939a = 21;
        this.f230940b = site;
        this.f230941c = builder;
    }

    public uj81(k9l0 k9l0Var, a5j0 a5j0Var, luk lukVar, luk lukVar2) {
        this.f230939a = 4;
        this.f230940b = k9l0Var;
        this.f230941c = a5j0Var;
    }

    public uj81(Flowable flowable, q9e1 q9e1Var, p3e1 p3e1Var) {
        this.f230939a = 28;
        this.f230940b = q9e1Var;
        this.f230941c = p3e1Var;
        d0k[] d0kVarArr = bmu0.f28619a;
        xtm0.m92074U(mvl0.m62953p(new p741(new onc(flowable), 8)), new zf01((fbk) null, this, 27));
    }

    public uj81(zx81 zx81Var) {
        this.f230939a = 2;
        this.f230940b = zx81Var;
    }

    public uj81(yk1 yk1Var) {
        this.f230939a = 13;
        this.f230941c = yk1Var;
        this.f230940b = yk1Var.f273533e;
    }

    public uj81(Context context) {
        this.f230939a = 11;
        JSONObject jSONObject = new JSONObject();
        this.f230941c = jSONObject;
        try {
            jSONObject.putOpt("version", 0);
            JSONArray jSONArray = new JSONArray();
            jSONObject.putOpt("uri_skip_list", jSONArray);
            jSONArray.put("^fb\\d+:((?!campaign_ids).)*$");
            jSONArray.put("^li\\d+:");
            jSONArray.put("^pdk\\d+:");
            jSONArray.put("^twitterkit-.*:");
            jSONArray.put("^com\\.googleusercontent\\.apps\\.\\d+-.*:\\/oauth");
            jSONArray.put("^(?i)(?!(http|https):).*(:|:.*\\b)(password|o?auth|o?auth.?token|access|access.?token)\\b");
            jSONArray.put("^(?i)((http|https):\\/\\/).*[\\/|?|#].*\\b(password|o?auth|o?auth.?token|access|access.?token)\\b");
        } catch (JSONException e) {
            syg1.m79688g(e.getMessage());
        }
        C2529wd c2529wdM87767C = C2529wd.m87767C(context);
        JSONObject jSONObject2 = new JSONObject();
        String strM87778I = c2529wdM87767C.m87778I("skip_url_format_key");
        if (!TextUtils.isEmpty(strM87778I) && !"bnc_no_value".equals(strM87778I)) {
            try {
                jSONObject2 = new JSONObject(strM87778I);
            } catch (JSONException e2) {
                syg1.m79688g(e2.getMessage());
            }
        } else {
            jSONObject2 = (JSONObject) this.f230941c;
        }
        f230937d = jSONObject2;
        this.f230940b = new ArrayList();
    }

    public uj81(xjs xjsVar) {
        this.f230939a = 16;
        this.f230941c = xjsVar;
        this.f230940b = xjsVar.f262226f;
    }

    public uj81(udc1 udc1Var) {
        this.f230939a = 18;
        this.f230940b = udc1Var;
        nn81 nn81Var = new nn81();
        nn81Var.f156357a = 0;
        this.f230941c = nn81Var;
    }
}
