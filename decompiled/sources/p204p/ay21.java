package p204p;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.comscore.util.log.LogLevel;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.spotify.base.java.logging.Logger;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.culturalmoments.stories.p056v1.ShareData;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class ay21 implements Function, rdc1, oal0, kc41, co01, ObservableOnSubscribe, j130, vd21 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21066a;

    /* JADX INFO: renamed from: b */
    public final Object f21067b;

    /* JADX INFO: renamed from: c */
    public Object f21068c;

    /* JADX INFO: renamed from: d */
    public Object f21069d;

    public /* synthetic */ ay21(Object obj, Object obj2, Object obj3, int i) {
        this.f21066a = i;
        this.f21067b = obj;
        this.f21068c = obj2;
        this.f21069d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public static final Object m27464a(ay21 ay21Var, Bitmap bitmap, ibk ibkVar) {
        dc51 dc51Var;
        ovy ovyVar;
        Uri uri;
        pzs0 pzs0Var = (pzs0) ay21Var.f21069d;
        if (ibkVar instanceof dc51) {
            dc51Var = (dc51) ibkVar;
            int i = dc51Var.f47431e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dc51Var.f47431e = i - Integer.MIN_VALUE;
            } else {
                dc51Var = new dc51(ay21Var, ibkVar);
            }
        } else {
            dc51Var = new dc51(ay21Var, ibkVar);
        }
        Object objM71774l = dc51Var.f47429c;
        int i2 = dc51Var.f47431e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM71774l);
            String strM71778p = pzs0Var.m71778p(".png");
            dc51Var.f47427a = bitmap;
            dc51Var.f47431e = 1;
            objM71774l = pzs0Var.m71774l(strM71778p, dc51Var);
            if (objM71774l != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bitmap = dc51Var.f47427a;
            bga.m29073P(objM71774l);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ovyVar = dc51Var.f47428b;
            bga.m29073P(objM71774l);
        }
        uri = (Uri) objM71774l;
        if (uri != null) {
            return new ua6(ovyVar, uri);
        }
        ovyVar.deleteOnExit();
        throw new IllegalStateException("Failed to create StoryFileUriHolder");
        ovy ovyVar2 = (ovy) objM71774l;
        ki9 ki9Var = (ki9) ay21Var.f21068c;
        dc51Var.f47427a = null;
        dc51Var.f47428b = ovyVar2;
        dc51Var.f47431e = 2;
        Object objM53446a = ji9.m53446a(ki9Var, bitmap, ovyVar2, dc51Var);
        if (objM53446a != yukVar) {
            objM71774l = objM53446a;
            ovyVar = ovyVar2;
            uri = (Uri) objM71774l;
            if (uri != null) {
                return new ua6(ovyVar, uri);
            }
            ovyVar.deleteOnExit();
            throw new IllegalStateException("Failed to create StoryFileUriHolder");
        }
        return yukVar;
    }

    @Override // p204p.vd21
    /* JADX INFO: renamed from: V */
    public void mo27465V() {
        ParagraphView paragraphView = (ParagraphView) this.f21067b;
        paragraphView.setVisibility(0);
        paragraphView.setAlpha(0.0f);
        ex71 ex71Var = (ex71) this.f21068c;
        paragraphView.m4191u(ex71Var.f63696h);
        ParagraphView paragraphView2 = (ParagraphView) this.f21069d;
        paragraphView2.setVisibility(0);
        paragraphView2.setTranslationY(0.0f);
        paragraphView2.setAlpha(0.0f);
        paragraphView2.m4191u(ex71Var.f63697i);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        String strM38000d0;
        int i = this.f21066a;
        Object obj2 = this.f21067b;
        switch (i) {
            case 1:
                ContextTrack contextTrack = (ContextTrack) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                PlayerState playerState = (PlayerState) this.f21068c;
                wj50.m88279p(playerState);
                boolean zM47220L = hdi.m47220L(playerState);
                String strUri = contextTrack.uri();
                if (strUri == null) {
                    strUri = "";
                }
                String strM38000d1 = e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_ARTIST_URI);
                String str = strM38000d1 != null ? strM38000d1 : "";
                if (zBooleanValue && zM47220L && str.length() > 0 && wl51.m88496t0(strUri, "track", false) && (strM38000d0 = e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_CONTEXT_URI)) != null && strM38000d0.length() != 0) {
                    Set setM29624m1 = bk5.m29624m1(new gn80[]{gn80.SHOW_EPISODE, gn80.PODCAST_EPISODE});
                    Set set = dd41.f47702f;
                    if (!setM29624m1.contains(r46.m74726U(strUri).f47709c)) {
                        return ((we0) ((wg61) ((sef0) this.f21069d).f208289f).getValue()).m87854a(contextTrack).m23369g(dxq0.f54047N0);
                    }
                }
                return MaybeEmpty.f8264a;
            case 5:
                Scheduler scheduler = (Scheduler) this.f21068c;
                return gh31.m44711b(scheduler, (voi) obj2).compose(new b5y0(26, (khy0) this.f21069d, scheduler)).toObservable().onErrorReturn(jxq0.f117180Q0);
            case 6:
                nx50 nx50Var = (nx50) obj;
                String str2 = (String) obj2;
                if (!nx50Var.f159370c && !nx50Var.f159371d) {
                    return new lj31(str2);
                }
                if (str2 == null) {
                    return kj31.f123212a;
                }
                return new jj31(str2, (vj60) this.f21068c, ((dd41) this.f21069d).f47709c == gn80.NEARBY_JAM_INVITE);
            case 8:
                qqm0 qqm0Var = (qqm0) obj;
                String str3 = (String) this.f21068c;
                wj50.m88279p(str3);
                ExternalAccessoryDescription externalAccessoryDescription = ((roa) this.f21069d).f201202e;
                dh31 dh31Var = ((xv31) obj2).f266266d;
                Object obj3 = qqm0Var.f191620a;
                if (obj3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List list = (List) obj3;
                Object obj4 = qqm0Var.f191621b;
                if (obj4 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                String str4 = (String) obj4;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        return new fxx(arrayList, null, null, null);
                    }
                    sv31 sv31Var = (sv31) it.next();
                    if (str3.equals(sv31Var.getKey())) {
                        if (sv31Var instanceof eh41) {
                            ArrayList arrayList2 = ((eh41) sv31Var).f59502c;
                            ArrayList arrayList3 = new ArrayList(arrayList2.size());
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                axx axxVarM35971g = dh31Var.m35971g((avo0) it2.next(), str4);
                                if (axxVarM35971g != null) {
                                    arrayList3.add(axxVarM35971g);
                                }
                            }
                            arrayList.addAll(arrayList3);
                        } else if (sv31Var instanceof yrh) {
                            avo0 avo0Var = ((yrh) sv31Var).f275481d;
                            axx axxVarM35971g2 = avo0Var != null ? dh31Var.m35971g(avo0Var, str4) : null;
                            if (axxVarM35971g2 != null) {
                                arrayList.add(axxVarM35971g2);
                            }
                        }
                    }
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                Uri uri = (Uri) obj2;
                VoiceAssistantLoggingContext voiceAssistantLoggingContext = (VoiceAssistantLoggingContext) this.f21068c;
                Logger.m3967c(th, "Voice search error - Exception while calling prepare. uri=%s, interactionId=%s, packageId=%s, requestedUri=%s, userId=%s", uri, voiceAssistantLoggingContext.getInteractionId(), voiceAssistantLoggingContext.getPackageId(), voiceAssistantLoggingContext.getRequestedUri(), voiceAssistantLoggingContext.getUserId());
                dx31 dx31Var = (dx31) this.f21069d;
                dx31Var.f53845f.remove(uri);
                ac6 ac6Var = ((woy0) dx31Var.f53841b).f253625c;
                if (th != null) {
                    ac6Var.m25441d(th, voiceAssistantLoggingContext);
                } else {
                    ac6Var.m25440c(voiceAssistantLoggingContext);
                }
                return CompletableEmpty.f7437a;
        }
    }

    @Override // p204p.j130
    /* JADX INFO: renamed from: b */
    public sjp mo27466b(m030 m030Var, zz11 zz11Var, i130 i130Var) {
        sjp sjpVar = new sjp(m030Var, zz11Var, i130Var);
        sjpVar.f209913e.add(new is61((nsk) this.f21067b, sjpVar, (String) this.f21068c, (ygs) this.f21069d));
        return sjpVar;
    }

    @Override // p204p.kc41
    /* JADX INFO: renamed from: c */
    public ihs mo27467c(ygs ygsVar, int i, ka80 ka80Var, String str) {
        ppo0 ppo0Var;
        kc41 kc41Var = (uj81) this.f21067b;
        kc41 kc41Var2 = (kc41) this.f21068c;
        if (ka80Var == null && (((ppo0Var = (ppo0) this.f21069d) == ppo0.f180084b && i == 2) || ((ppo0Var == ppo0.f180085c && i == 3) || (ppo0Var == ppo0.f180086d && (i == 2 || i == 3))))) {
            kc41Var = kc41Var2;
        }
        return kc41Var.mo27467c(ygsVar, i, ka80Var, str);
    }

    @Override // p204p.co01
    public frv0 create() {
        ShareData shareData = (ShareData) this.f21067b;
        String title = shareData.getTitle();
        String description = shareData.getDescription();
        return new frv0(new n2m(title, shareData.m9093o(), shareData.m9094p(), description, (rgy) this.f21068c, (icr0) this.f21069d), 18);
    }

    /* JADX INFO: renamed from: d */
    public ey9 m27468d() {
        ov50 ov50Var = (ov50) this.f21069d;
        if (ov50Var != null) {
            return new ey9((Context) this.f21067b, (String) this.f21068c, ov50Var, false, false);
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }

    /* JADX INFO: renamed from: e */
    public void m27469e(ov50 ov50Var) {
        this.f21069d = ov50Var;
    }

    /* JADX INFO: renamed from: f */
    public void m27470f(v761 v761Var, Map.Entry entry) {
        v761 v761Var2 = (v761) entry.getValue();
        m28 m28Var = null;
        m28 m28Var2 = new m28(v761Var.f238074g.f107950a, ((o18) entry.getKey()).f160643d, v761Var.f238070c ? (ifb) this.f21068c : null, ((o18) entry.getKey()).f160645f, ((o18) entry.getKey()).f160646g);
        int i = ((o18) entry.getKey()).f160642c;
        v761Var2.getClass();
        hxg1.m49006s();
        v761Var2.m84841a();
        wj50.m88281r("Consumer can only be linked once.", !v761Var2.f238077j);
        v761Var2.f238077j = true;
        u761 u761Var = v761Var2.f238079l;
        jjc jjcVarM89929T = x4w0.m89929T(u761Var.m61985c(), new t761(v761Var2, u761Var, i, m28Var2, m28Var), e95.m38211p());
        jjcVarM89929T.mo28322a(new lk00(0, jjcVarM89929T, new wh51(this, v761Var2)), e95.m38211p());
    }

    /* JADX INFO: renamed from: g */
    public Object m27471g() {
        long jM40252u = exg1.m40252u();
        if (jM40252u == ah71.f15634a) {
            return this.f21069d;
        }
        ug71 ug71Var = (ug71) ((AtomicReference) this.f21067b).get();
        int iM83026a = ug71Var.m83026a(jM40252u);
        if (iM83026a >= 0) {
            return ug71Var.f230013c[iM83026a];
        }
        return null;
    }

    @Override // p204p.rdc1
    public View getRoot() {
        switch (this.f21066a) {
            case 2:
                return (LinearLayout) this.f21067b;
            default:
                return (ConstraintLayout) this.f21067b;
        }
    }

    /* JADX INFO: renamed from: h */
    public db71 m27472h(cb71 cb71Var) {
        db71 db71Var;
        n4b n4bVar = new n4b(cb71Var);
        oab0 oab0Var = (oab0) this.f21067b;
        if (oab0Var != null) {
            db71Var = (db71) oab0Var.m66541c(n4bVar);
        } else {
            if (!wj50.m88271j((n4b) this.f21068c, n4bVar)) {
                return null;
            }
            db71Var = (db71) this.f21069d;
        }
        if (db71Var == null || db71Var.f47231b.f279917a.mo29901a()) {
            return null;
        }
        return db71Var;
    }

    /* JADX INFO: renamed from: i */
    public long m27473i(long j) {
        long[] jArr = (long[]) this.f21068c;
        c95.m31843i((j == -9223372036854775807L || j == Long.MIN_VALUE) ? false : true);
        c95.m31843i(j >= 0);
        int iM46309f = h0b1.m46309f(jArr, j, true);
        return h0b1.m46282J(j - jArr[iM46309f], ((float[]) this.f21069d)[iM46309f]) + ((long[]) this.f21067b)[iM46309f];
    }

    /* JADX INFO: renamed from: j */
    public pqm0 m27474j(List list) {
        Iterator it;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f21068c;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("No base URLs");
        }
        int i = 0;
        String str = (String) list.get(0);
        Iterator it2 = list.iterator();
        int iIntValue = Integer.MAX_VALUE;
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            String strM55930a = kb41.m55930a(Uri.parse(str2));
            if (strM55930a != null) {
                Integer num = (Integer) linkedHashMap.get(strM55930a);
                int iIntValue2 = num != null ? num.intValue() : i;
                if (iIntValue2 >= 2) {
                    Long l = (Long) ((LinkedHashMap) this.f21067b).get(strM55930a);
                    long jLongValue = l != null ? l.longValue() : -1L;
                    if (jLongValue != -1) {
                        it = it2;
                        if (((long) LogLevel.NONE) * ((long) Math.pow(2.0d, Math.min(iIntValue2 - 2, 6))) > SystemClock.elapsedRealtime() - jLongValue) {
                            Integer num2 = (Integer) linkedHashMap.get(strM55930a);
                            if ((num2 != null ? num2.intValue() : Integer.MAX_VALUE) < iIntValue) {
                                Integer num3 = (Integer) linkedHashMap.get(strM55930a);
                                iIntValue = num3 != null ? num3.intValue() : Integer.MAX_VALUE;
                                it2 = it;
                                str = str2;
                            }
                            i = 0;
                        }
                    }
                }
                return new pqm0(str2, Boolean.FALSE);
            }
            it = it2;
            it2 = it;
            i = 0;
        }
        return new pqm0(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: k */
    public long m27475k(long j) {
        long[] jArr = (long[]) this.f21067b;
        c95.m31843i((j == -9223372036854775807L || j == Long.MIN_VALUE) ? false : true);
        c95.m31843i(j >= 0);
        int iM46309f = h0b1.m46309f(jArr, j, true);
        return h0b1.m46280H(j - jArr[iM46309f], ((float[]) this.f21069d)[iM46309f]) + ((long[]) this.f21068c)[iM46309f];
    }

    /* JADX INFO: renamed from: l */
    public void m27476l(String str) {
        this.f21068c = str;
    }

    /* JADX INFO: renamed from: m */
    public void m27477m(cb71 cb71Var, db71 db71Var) {
        oab0 oab0Var = (oab0) this.f21067b;
        if (oab0Var != null) {
            oab0Var.m66542d(new n4b(cb71Var), db71Var);
        } else {
            this.f21068c = new n4b(cb71Var);
            this.f21069d = db71Var;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m27478n(zx21 zx21Var) {
        if (((Subject) this.f21067b).mo23797a()) {
            ((Subject) this.f21067b).onNext(zx21Var);
            return;
        }
        synchronized (this.f21068c) {
            ((ArrayList) this.f21069d).add(zx21Var);
        }
    }

    @Override // p204p.oal0
    /* JADX INFO: renamed from: o */
    public void mo27479o(Exception exc) {
        String str = (String) this.f21067b;
        Logger.m3966b(edb.m38566o("Error requesting install of ", str, ": ", exc.getMessage()), new Object[0]);
        SplitInstallSessionState splitInstallSessionStateCreate = SplitInstallSessionState.create(0, 6, exc instanceof SplitInstallException ? ((SplitInstallException) exc).getErrorCode() : -100, 0L, 0L, Collections.singletonList(str), lau.f131415a);
        lqi0 lqi0Var = (lqi0) this.f21068c;
        e741 e741Var = (e741) this.f21069d;
        wj50.m88279p(splitInstallSessionStateCreate);
        ((zv41) lqi0Var).m97091m(null, e741.m38057c(e741Var, splitInstallSessionStateCreate));
    }

    /* JADX INFO: renamed from: p */
    public void m27480p(Object obj) {
        long jM40252u = exg1.m40252u();
        if (jM40252u == ah71.f15634a) {
            this.f21069d = obj;
            return;
        }
        synchronized (this.f21068c) {
            ug71 ug71Var = (ug71) ((AtomicReference) this.f21067b).get();
            int iM83026a = ug71Var.m83026a(jM40252u);
            if (iM83026a < 0) {
                ((AtomicReference) this.f21067b).set(ug71Var.m83027b(jM40252u, obj));
            } else {
                ug71Var.f230013c[iM83026a] = obj;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m27481q(String str, eh00 eh00Var, eh00 eh00Var2) {
        Activity activity = (Activity) this.f21067b;
        ih10 ih10VarM31832a0 = c95.m31832a0(activity, activity.getString(R.string.social_listening_leave_session_confirmation_dialog_title), str != null ? activity.getString(R.string.f6010xc3aa29bb, str) : activity.getString(R.string.social_listening_leave_session_confirmation_dialog_subtitle_jam));
        String string = activity.getString(R.string.f6009x46c06cc5);
        koi koiVar = new koi(5, eh00Var);
        ih10VarM31832a0.f102113a = string;
        ih10VarM31832a0.f102115c = koiVar;
        String string2 = activity.getString(android.R.string.cancel);
        koi koiVar2 = new koi(6, eh00Var2);
        ih10VarM31832a0.f102114b = string2;
        ih10VarM31832a0.f102116d = koiVar2;
        ih10VarM31832a0.m50574b().m58942b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public Object m27482r(gea0 gea0Var, ibk ibkVar) {
        ok71 ok71Var;
        if (ibkVar instanceof ok71) {
            ok71Var = (ok71) ibkVar;
            int i = ok71Var.f166293d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ok71Var.f166293d = i - Integer.MIN_VALUE;
            } else {
                ok71Var = new ok71(this, ibkVar);
            }
        } else {
            ok71Var = new ok71(this, ibkVar);
        }
        Object objM86755t = ok71Var.f166291b;
        int i2 = ok71Var.f166293d;
        boolean z = true;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVarM41185e = ((fal0) this.f21067b).m41185e();
            ok71Var.f166290a = gea0Var;
            ok71Var.f166293d = 1;
            objM86755t = vyf1.m86755t(fizVarM41185e, ok71Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gea0Var = ok71Var.f166290a;
            bga.m29073P(objM86755t);
        }
        icc0 icc0Var = (icc0) objM86755t;
        if (icc0Var instanceof gcc0) {
            ((z9j0) this.f21068c).mo47346g(dh91.f49023d.m53369g(((gcc0) icc0Var).f78535a));
            ((sv11) ((rv11) this.f21069d)).m79422b(gea0Var.f79066a, gea0Var.f79067b, gea0Var.f79068c);
        } else {
            if (!wj50.m88271j(icc0Var, hcc0.f89751a)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public Object m27483s(ibk ibkVar) {
        pk71 pk71Var;
        if (ibkVar instanceof pk71) {
            pk71Var = (pk71) ibkVar;
            int i = pk71Var.f178409c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pk71Var.f178409c = i - Integer.MIN_VALUE;
            } else {
                pk71Var = new pk71(this, ibkVar);
            }
        } else {
            pk71Var = new pk71(this, ibkVar);
        }
        Object objM86755t = pk71Var.f178407a;
        int i2 = pk71Var.f178409c;
        boolean z = true;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVarM41185e = ((fal0) this.f21067b).m41185e();
            pk71Var.f178409c = 1;
            objM86755t = vyf1.m86755t(fizVarM41185e, pk71Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        icc0 icc0Var = (icc0) objM86755t;
        if (icc0Var instanceof gcc0) {
            ((z9j0) this.f21068c).mo47346g(dh91.f49023d.m53369g(((gcc0) icc0Var).f78535a));
        } else {
            if (!wj50.m88271j(icc0Var, hcc0.f89751a)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        ku51 ku51Var = (ku51) this.f21067b;
        String str = (String) this.f21068c;
        Disposable disposableSubscribe = ((Observable) this.f21069d).subscribe(new hr5(observableEmitter, 2), new hr5(observableEmitter, 3), new y1s0(observableEmitter, 21));
        observableEmitter.setCancellable(new r700(str, ku51Var.m57380b(str, observableEmitter, disposableSubscribe), ku51Var, disposableSubscribe));
    }

    public ay21(int i, byte b) {
        this.f21066a = i;
        switch (i) {
            case 3:
                this.f21067b = new AtomicReference(z9g1.f280776a);
                this.f21068c = new Object();
                break;
            default:
                this.f21067b = new PublishSubject().m23811c();
                this.f21068c = new Object();
                this.f21069d = new ArrayList();
                break;
        }
    }

    public ay21(Activity activity, a660 a660Var) {
        this.f21066a = 4;
        this.f21067b = activity;
        this.f21068c = a660Var;
    }

    public ay21(xre xreVar) {
        this.f21066a = 14;
        this.f21067b = new LinkedHashMap();
        this.f21068c = new LinkedHashMap();
        this.f21069d = new ArrayList();
    }

    public ay21(ConstraintLayout constraintLayout, RecyclerView recyclerView, ImageView imageView, View view, FrameLayout frameLayout) {
        this.f21066a = 10;
        this.f21067b = constraintLayout;
        this.f21068c = imageView;
        this.f21069d = view;
    }

    public ay21(ifb ifbVar, cbq cbqVar) {
        this.f21066a = 23;
        this.f21068c = ifbVar;
        this.f21067b = cbqVar;
    }

    public ay21(kxq0 kxq0Var) {
        this.f21066a = 11;
        long[] jArrCopyOf = new long[32];
        long[] jArrCopyOf2 = new long[32];
        ArrayList arrayList = new ArrayList();
        float fM57638d = kxq0Var.m57638d(0L);
        jArrCopyOf[0] = 0;
        jArrCopyOf2[0] = 0;
        arrayList.add(Float.valueOf(fM57638d));
        long jM57637c = kxq0Var.m57637c(0L);
        c95.m31855u(fM57638d > 0.0f);
        long jM46282J = 0;
        int i = 1;
        int i2 = 1;
        long jM57637c2 = jM57637c;
        long j = 0;
        while (jM57637c2 != -9223372036854775807L) {
            c95.m31855u(jM57637c2 > j);
            c95.m31855u(fM57638d > 0.0f);
            jM46282J += h0b1.m46282J(jM57637c2 - j, fM57638d);
            fM57638d = kxq0Var.m57638d(jM57637c2);
            jArrCopyOf = i2 == jArrCopyOf.length ? Arrays.copyOf(jArrCopyOf, i2 * 2) : jArrCopyOf;
            int i3 = i2 + 1;
            jArrCopyOf[i2] = jM46282J;
            if (i == jArrCopyOf2.length) {
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i * 2);
            }
            jArrCopyOf2[i] = jM57637c2;
            arrayList.add(Float.valueOf(fM57638d));
            i2 = i3;
            i++;
            j = jM57637c2;
            jM57637c2 = kxq0Var.m57637c(jM57637c2);
        }
        this.f21067b = Arrays.copyOf(jArrCopyOf, i2);
        this.f21068c = Arrays.copyOf(jArrCopyOf2, i);
        this.f21069d = grl0.m45519O(arrayList);
    }

    public ay21(Context context) {
        this.f21066a = 22;
        this.f21067b = context;
    }

    public ay21(hv31 hv31Var, List list, eh00 eh00Var) {
        this.f21066a = 17;
        this.f21067b = hv31Var;
        this.f21069d = list;
        this.f21068c = eh00Var;
    }

    public ay21(int i) {
        this.f21066a = 27;
        this.f21067b = i != 1 ? new oab0(i) : null;
    }
}
