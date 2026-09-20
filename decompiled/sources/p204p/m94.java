package p204p;

import android.content.Context;
import android.content.Intent;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.net.http.UrlResponseInfo;
import android.os.SystemClock;
import android.os.Trace;
import androidx.car.app.model.Alert;
import com.google.android.gms.tasks.Task;
import com.spotify.appauthorization.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.support.assertion.Assertion$RecoverableAssertionError;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableIgnoreElementsCompletable;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m94 implements otl, Function, im6, hbb, rwf, l890, k890, dfp, f5y, r861, ant, r7l0, gbk, xt31, lk30 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f141207b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f141208c;

    public /* synthetic */ m94(int i, Object obj, Object obj2) {
        this.f141206a = i;
        this.f141207b = obj;
        this.f141208c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        boolean zEquals;
        int i = 0;
        switch (this.f141206a) {
            case 2:
                ob5 ob5Var = (ob5) this.f141207b;
                fy7 fy7Var = (fy7) this.f141208c;
                f301 f301Var = (f301) obj;
                int iOrdinal = f301Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        return Completable.m23286j(new BuiltInAuthException(2, "The user must go to the Spotify and log-in"));
                    }
                    if (iOrdinal == 2) {
                        return Completable.m23286j(new BuiltInAuthException(3, "Spotify must be online to verify this authorization request."));
                    }
                    if (iOrdinal != 3) {
                        throw new RuntimeException(edb.m38564m("Unknown session state result: ", f301Var.name()));
                    }
                    int i2 = BuiltInAuthException.f2949c;
                    Locale locale = Locale.ENGLISH;
                    return Completable.m23286j(new BuiltInAuthException(4, "Could not authenticate within 60 s. It is possible that there's an issue with Spotify auth services or the connection is unstable"));
                }
                String str = fy7Var.f74535a;
                Map map = fy7Var.f74536b;
                if (map == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Object obj2 = map.get("redirect_uri");
                if (obj2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                String str2 = (String) obj2;
                hg40 hg40VarM93795k0 = yif1.m93795k0(fy7Var);
                cke ckeVar = fy7Var.f74538d;
                String string = (String) map.get("state");
                if (string == null) {
                    string = UUID.randomUUID().toString();
                }
                wj50.m88279p(str);
                vq7 vq7Var = new vq7(str, 1, str2, ckeVar, string, new ArrayList(hg40VarM93795k0), false, 4032);
                boolean z = Boolean.parseBoolean((String) map.get("show_auth_view"));
                i0d i0dVar = ob5Var.f163538b;
                cke ckeVar2 = fy7Var.f74538d;
                ckeVar2.getClass();
                FlowableIgnoreElementsCompletable flowableIgnoreElementsCompletableM49366k = i0dVar.m49366k(ckeVar2.f38937a, vq7Var);
                r0e1 r0e1Var = ob5Var.f163539c;
                Context context = ob5Var.f163540d;
                d97 d97Var = (d97) r0e1Var.f194478b;
                int i3 = 25;
                return flowableIgnoreElementsCompletableM49366k.m23292c(((my71) d97Var.f46706b).mo63160c().map(net.f153086X).flatMap(new c961(d97Var, i3)).flatMap(new gr7(r0e1Var, context, vq7Var, z, 0)).onErrorReturn(new s5f1(vq7Var, i3)).flatMapCompletable(new q95(16)).m23296h(new mb5(i, ob5Var, fy7Var)).m23295g(new nb5(i, ob5Var, fy7Var)));
            case 7:
                lzb lzbVar = (lzb) this.f141207b;
                fxx fxxVar = (fxx) obj;
                if (!((roa) this.f141208c).f201204g && !fxxVar.f74479a.isEmpty()) {
                    return Single.just(fxxVar);
                }
                Uri uri = Uri.EMPTY;
                Context context2 = lzbVar.f138298a;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                exx exxVar = null;
                Integer num = null;
                String str6 = null;
                String str7 = null;
                boolean z2 = false;
                Integer num2 = null;
                Integer num3 = null;
                Double d = null;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                Uri uri2 = null;
                Uri uri3 = null;
                String str8 = null;
                String str9 = null;
                int i4 = 2;
                boolean z6 = false;
                axx axxVar = new axx("com.spotify.inter-app.home", str9, context2.getString(R.string.home_title), str8, pvf1.m71160p(context2, R.drawable.ic_eis_home), uri, uri, uri, uri3, uri2, i4, z5, z4, z3, z6, 3, 4, d, num3, num2, z2, str7, str6, num, 0, exxVar, str5, null, str3, null, str4, null, null, 536870912, 2);
                String string2 = context2.getString(R.string.recently_played_title_short);
                Uri uriM71160p = pvf1.m71160p(context2, R.drawable.ic_eis_recently_played);
                int i5 = 2;
                int i6 = 0;
                int i7 = 4;
                int i8 = 3;
                int i9 = 2;
                ix0 ix0Var = null;
                String str10 = null;
                String str11 = null;
                boolean z7 = false;
                Integer num4 = null;
                boolean z8 = false;
                Uri uri4 = null;
                Uri uri5 = null;
                String str12 = null;
                boolean z9 = false;
                int i10 = 536870912;
                Object[] objArr = null == true ? 1 : 0;
                Object[] objArr2 = null == true ? 1 : 0;
                Object[] objArr3 = null == true ? 1 : 0;
                axx axxVar2 = new axx("com.spotify.recently-played", str8, string2, str12, uriM71160p, uri, uri, uri, uri5, uri4, i9, z3, z6, z8, z9, i8, i7, null == true ? 1 : 0, num4, null == true ? 1 : 0, z7, null == true ? 1 : 0, str11, null == true ? 1 : 0, i6, objArr3, str3, null == true ? 1 : 0, str4, objArr2, objArr, str10, ix0Var, i10, i5);
                Object[] objArr4 = null == true ? 1 : 0;
                Object[] objArr5 = null == true ? 1 : 0;
                Object[] objArr6 = null == true ? 1 : 0;
                axx axxVar3 = new axx("com.spotify.your-library", str8, context2.getString(R.string.collection_title_your_library), str12, pvf1.m71160p(context2, R.drawable.ic_eis_your_library), uri, uri, uri, uri5, uri4, i9, true, z6, z8, z9, i8, i7, null == true ? 1 : 0, num4, null == true ? 1 : 0, z7, null == true ? 1 : 0, str11, null == true ? 1 : 0, i6, objArr6, str3, null == true ? 1 : 0, str4, objArr5, objArr4, str10, ix0Var, i10, i5);
                String str13 = null;
                Object[] objArr7 = null == true ? 1 : 0;
                Object[] objArr8 = null == true ? 1 : 0;
                Object[] objArr9 = null == true ? 1 : 0;
                return Single.just(new fxx(pmf0.m70336v(axxVar, axxVar2, axxVar3, new axx("com.spotify.browse", str13, pvf1.m71156l(context2.getString(R.string.externalintegration_browse_title), Locale.getDefault()), str12, pvf1.m71160p(context2, R.drawable.ic_eis_browse), uri, uri, uri, uri5, uri4, i9, false, z6, z8, z9, i8, i7, null == true ? 1 : 0, num4, null == true ? 1 : 0, z7, null == true ? 1 : 0, str11, null == true ? 1 : 0, i6, objArr9, str3, null == true ? 1 : 0, str4, objArr8, objArr7, str10, ix0Var, i10, i5)), null, null, null));
            case 9:
                gd8 gd8Var = (gd8) this.f141207b;
                py7 py7Var = (py7) this.f141208c;
                Throwable th = (Throwable) obj;
                synchronized (gd8Var) {
                    new IllegalStateException("command failed", th);
                }
                rcf rcfVar = (rcf) gd8Var.f78759b;
                if (rcfVar == null) {
                    return th;
                }
                try {
                    rcfVar.mo75298b(py7Var, th);
                    return th;
                } catch (RuntimeException e) {
                    return e instanceof Assertion$RecoverableAssertionError ? e : new scf(e);
                }
            case 15:
                bgp bgpVar = (bgp) this.f141207b;
                String str14 = (String) this.f141208c;
                PlayerState playerState = (PlayerState) obj;
                xul0 xul0VarTrack = playerState.track();
                if (xul0VarTrack.mo49279c()) {
                    ContextTrack contextTrack = (ContextTrack) xul0VarTrack.mo49278b();
                    String strUri = (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_PARENT_EPISODE_URI);
                    if (strUri == null) {
                        strUri = contextTrack.uri();
                    }
                    zEquals = strUri.equals(str14);
                } else {
                    zEquals = false;
                }
                if (!zEquals) {
                    return e6w.f56770a;
                }
                boolean z10 = !playerState.isPaused() && playerState.isPlaying();
                ((wy3) bgpVar.f26982b).getClass();
                return new g6w(((Long) playerState.position(System.currentTimeMillis()).mo49280e(0L)).longValue(), ((Long) playerState.duration().mo49280e(0L)).longValue(), str14, z10);
            default:
                gqp gqpVar = (gqp) this.f141207b;
                LoggingParams loggingParams = (LoggingParams) obj;
                return new t0h1(gqpVar.f83510i, 1, ((ExternalAccessoryDescription) this.f141208c).integrationType, (String) loggingParams.interactionId().mo49278b(), 2).m79819z(((c0y) gqpVar.f83503b.f235651a.f246568h).m31199h(loggingParams)).flatMap(new ori(loggingParams, 19));
        }
    }

    @Override // p204p.hbb
    public Object attachCompleter(gbb gbbVar) {
        ygb ygbVar = (ygb) this.f141207b;
        Context context = (Context) this.f141208c;
        Executor executor = ygbVar.f272539d;
        executor.execute(new xgb(ygbVar, context, executor, 1, gbbVar, SystemClock.elapsedRealtime()));
        return "CameraX initInternal";
    }

    @Override // p204p.gbk
    /* JADX INFO: renamed from: b */
    public Object mo25397b(Task task) {
        return (u1h1.m82225t() && ((Integer) task.mo1515g()).intValue() == 402) ? etq.m39960c((Context) this.f141207b, (Intent) this.f141208c).m92994o(new lrl(), new eqp(28)) : task;
    }

    @Override // p204p.dfp
    /* JADX INFO: renamed from: c */
    public int mo25822c(MediaCodecInfo mediaCodecInfo) {
        String str = (String) this.f141207b;
        p7f p7fVar = (p7f) this.f141208c;
        p7fVar.getClass();
        if (jeu.m53116h(mediaCodecInfo, str, p7fVar)) {
            return 0;
        }
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // p204p.l890
    /* JADX INFO: renamed from: d */
    public void mo39734d(Object obj, kfz kfzVar) {
        op3 op3Var = (op3) obj;
        op3Var.mo49684o((g7p0) this.f141208c, new lh51(kfzVar, ((xwo) this.f141207b).f266714e));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX INFO: renamed from: e */
    public void m61139e() {
        boolean z;
        boolean zM34117a;
        lty ltyVar = (lty) this.f141207b;
        String str = (String) this.f141208c;
        Set set = p2l.f173365a;
        if (set.contains(zwe.class)) {
            return;
        }
        int i = 0;
        if (ltyVar != null) {
            try {
                if (ltyVar.f136911g) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                p2l.m68953a(zwe.class, th);
            }
        } else {
            z = false;
        }
        p8y p8yVar = p8y.f175080a;
        dwa1 dwa1Var = dwa1.f53653a;
        if (set.contains(dwa1.class)) {
            zM34117a = false;
        } else {
            try {
                dwa1.f53653a.m37146e();
                zM34117a = dwa1.f53659g.m34117a();
            } catch (Throwable th2) {
                p2l.m68953a(dwa1.class, th2);
                zM34117a = false;
            }
        }
        if (z && zM34117a) {
            zwe zweVar = zwe.f286964a;
            if (p2l.f173365a.contains(zweVar)) {
                return;
            }
            try {
                if (zwe.f286971h) {
                    return;
                }
                zwe.f286971h = true;
                p8y.m69345c().execute(new ywe(str, i));
                return;
            } catch (Throwable th3) {
                p2l.m68953a(zweVar, th3);
                return;
            }
            p2l.m68953a(zwe.class, th);
        }
    }

    @Override // p204p.r861
    /* JADX INFO: renamed from: f */
    public void mo54268f(p28 p28Var) {
        cbq cbqVar = (cbq) this.f141207b;
        s861 s861Var = (s861) this.f141208c;
        cbqVar.getClass();
        cl00 cl00Var = (s861Var.f206578c.m33466a() && p28Var.f173278d) ? cl00.f39141c : cl00.f39140b;
        sol0 sol0Var = cbqVar.f36174a;
        fl00.m41971d((AtomicBoolean) sol0Var.f211214c, true);
        fl00.m41970c((Thread) sol0Var.f211216e);
        if (((cl00) sol0Var.f211211Z) != cl00Var) {
            sol0Var.f211211Z = cl00Var;
            sol0Var.m78667u(sol0Var.f211212a);
        }
    }

    @Override // p204p.f5y
    /* JADX INFO: renamed from: g */
    public c5y[] mo25402g() {
        lqp lqpVar = (lqp) this.f141207b;
        r300 r300Var = (r300) this.f141208c;
        return new c5y[]{lqpVar.f136101c.mo45920g(r300Var) ? new qv51(lqpVar.f136101c.mo45921i(r300Var), null) : new x3a(r300Var)};
    }

    @Override // p204p.rwf
    /* JADX INFO: renamed from: h */
    public Object mo1885h(sef0 sef0Var) {
        String str = (String) this.f141207b;
        svf svfVar = (svf) this.f141208c;
        try {
            Trace.beginSection(str);
            return svfVar.f214425f.mo1885h(sef0Var);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m61140i(String str, String str2) {
        switch (this.f141206a) {
            case 18:
                zwp zwpVar = (zwp) this.f141207b;
                mwx0 mwx0Var = (mwx0) this.f141208c;
                i26 i26Var = zwpVar.f287023V0;
                if (i26Var != null) {
                    kv91 kv91Var = (kv91) i26Var.f97752b;
                    xxg0 xxg0Var = (xxg0) i26Var.f97753c;
                    xxg0Var.getClass();
                    yt91 yt91VarM96903c = xxg0Var.f267003b.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("toast", str, null, null, str2));
                    yt91VarM96903c.f276056j = true;
                    yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("toast_button", null, null, null, null));
                    yt91VarM96903c2.f276056j = false;
                    kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                }
                if (mwx0Var.f147896c != null) {
                    mwx0Var.m63071c();
                    if (mwx0Var.f147896c != null) {
                        throw new IllegalStateException("Loader is already running.");
                    }
                    mwx0Var.f147896c = mwx0Var.f147894a.subscribe(new xc5(mwx0Var, 17));
                    return;
                }
                return;
            default:
                zwp zwpVar2 = (zwp) this.f141207b;
                ndg1 ndg1Var = (ndg1) this.f141208c;
                if (ndg1Var instanceof pi50) {
                    pi50 pi50Var = (pi50) ndg1Var;
                    i26 i26Var2 = zwpVar2.f287023V0;
                    if (i26Var2 != null) {
                        kv91 kv91Var2 = (kv91) i26Var2.f97752b;
                        xxg0 xxg0Var2 = (xxg0) i26Var2.f97753c;
                        xxg0Var2.getClass();
                        yt91 yt91VarM96903c3 = xxg0Var2.f267003b.m96903c();
                        yt91VarM96903c3.f276055i.add(new bu91("toast", "network error", null, null, str2));
                        yt91VarM96903c3.f276056j = true;
                        yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                        yt91VarM96903c4.f276055i.add(new bu91("toast_button", null, null, null, null));
                        yt91VarM96903c4.f276056j = false;
                        kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("open_os_settings", 1, nau.f152117a), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                    }
                    pi50Var.f177831d.invoke();
                    return;
                }
                return;
        }
    }

    @Override // p204p.k890
    public void invoke(Object obj) {
        switch (this.f141206a) {
            case 12:
                ((op3) obj).mo49683n((np3) this.f141207b, (lhd0) this.f141208c);
                break;
            default:
                ((op3) obj).mo49685p((lhd0) this.f141207b, (IOException) this.f141208c);
                break;
        }
    }

    @Override // p204p.xt31
    /* JADX INFO: renamed from: j */
    public awr mo61141j(m94 m94Var) {
        return ((ck00) this.f141207b).m33011a(new m94(27, (yh00) this.f141208c, m94Var));
    }

    @Override // p204p.lk30
    /* JADX INFO: renamed from: k */
    public int mo25406k(fk30 fk30Var) {
        return kk30.lambda$withFallback$1((lk30) this.f141207b, (lk30) this.f141208c, fk30Var);
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        ((j9v) this.f141207b).m52768a((Intent) this.f141208c);
    }

    @Override // p204p.otl
    public Object run() {
        switch (this.f141206a) {
            case 0:
                return ((n94) this.f141207b).f151700a.openConnection((URL) this.f141208c);
            default:
                kt4 kt4Var = (kt4) this.f141207b;
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) this.f141208c;
                kt4Var.getClass();
                kt4Var.f126136a.onResponseStarted(kt4Var.f126137b, nt4.m65596b(urlResponseInfo));
                return null;
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f141206a) {
            case 22:
                ((xir) this.f141207b).m91159e(((yh00) this.f141208c).apply(obj));
                break;
            case 26:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f141207b;
                ant antVar = (ant) this.f141208c;
                if (!atomicBoolean.get()) {
                    antVar.mo25099t(obj);
                }
                break;
            default:
                ((m94) this.f141208c).mo25099t(((yh00) this.f141207b).apply(obj));
                break;
        }
    }

    public /* synthetic */ m94(np3 np3Var, o0a0 o0a0Var, lhd0 lhd0Var, IOException iOException, boolean z) {
        this.f141206a = 13;
        this.f141207b = lhd0Var;
        this.f141208c = iOException;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public u790 mo98394apply(Object obj) {
        lwb lwbVar = (lwb) this.f141207b;
        ue40 ue40Var = (ue40) this.f141208c;
        lwbVar.m60104a();
        ue40Var.mo61983a();
        return lwbVar.m60112m();
    }
}
