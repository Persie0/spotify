package p204p;

import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.PlatformSpanStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.music.R;
import com.spotify.playbacknative.AudioDriver;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class qgj0 implements ant, Function, qt8, iab, p690, Producer, SingleOnSubscribe, qio, t6l0, InterfaceC2207oa, BiFunction {

    /* JADX INFO: renamed from: c */
    public static final Object f188481c = new Object();

    /* JADX INFO: renamed from: d */
    public static qgj0 f188482d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f188483a;

    /* JADX INFO: renamed from: b */
    public final Object f188484b;

    public /* synthetic */ qgj0(Object obj, int i) {
        this.f188483a = i;
        this.f188484b = obj;
    }

    /* JADX INFO: renamed from: g */
    public static c730 m72743g() {
        return new c730(new BitSet(), 23);
    }

    /* JADX INFO: renamed from: h */
    public static String m72744h(String str, xvy xvyVar, boolean z) {
        String strConcat = xvyVar.f266538a;
        if (z) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return s571.m77251j("lottie_cache_", strReplaceAll, strConcat);
    }

    /* JADX INFO: renamed from: j */
    public static qgj0 m72745j() {
        qgj0 qgj0Var;
        synchronized (f188481c) {
            try {
                if (f188482d == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f188482d = new qgj0(handlerThread.getLooper());
                }
                qgj0Var = f188482d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qgj0Var;
    }

    /* JADX INFO: renamed from: m */
    public static ps5 m72746m(kuh kuhVar) {
        if (kuhVar == null) {
            return null;
        }
        eoo eooVar = kuhVar.f126616b;
        String str = kuhVar.f126615a;
        String str2 = kuhVar.f126617c;
        String str3 = kuhVar.f126618d;
        String str4 = eooVar.f61453a;
        int i = eooVar.f61454b;
        bno bnoVar = bno.f28901j;
        lba0 lba0VarM58644y6 = lba0.m58644y6(str4, bnoVar);
        hze1 hze1Var = hze1.f96907f;
        lba0VarM58644y6.getClass();
        String strM40313f = new d4l0(lba0VarM58644y6, hze1Var).m34925s6(i).f45197d.m58653r6().m40313f(hf71.f90619c, Locale.getDefault());
        lba0 lba0VarM58644y7 = lba0.m58644y6(eooVar.f61453a, bnoVar);
        lba0VarM58644y7.getClass();
        return new ps5(str, str2, str3, strM40313f, String.valueOf(new d4l0(lba0VarM58644y7, hze1Var).m34925s6(i).m34923n6()));
    }

    /* JADX INFO: renamed from: p */
    public static y7h1 m72747p(Callable callable) {
        ev61 ev61Var = new ev61();
        f8g1.f66988a.execute(new wpa1(14, callable, ev61Var));
        return ev61Var.f63172a;
    }

    @Override // p204p.p690
    /* JADX INFO: renamed from: a */
    public void mo47102a(int i, int i2) {
        ((hjv0) this.f188484b).m47715k(i, i2);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((td4) this.f188484b).m80489a();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        ycb1 ycb1Var;
        vig1 ycb1Var2;
        switch (this.f188483a) {
            case 3:
                return ((vsk) ((C2471uu) this.f188484b).f234047f.get()).m86359b(((e301) obj).f55571a);
            case 7:
                rua0 rua0Var = (rua0) obj;
                dz0 dz0Var = (dz0) this.f188484b;
                dva0 dva0Var = dz0Var.f54473g;
                cva0 cva0Var = rua0Var.f202784b;
                w0b0 w0b0Var = cva0Var.f42343a;
                dva0Var.f53406a = w0b0Var;
                dva0Var.f53407b = Boolean.valueOf(cva0Var.f42344b);
                dva0Var.f53406a = w0b0Var;
                lg7 lg7Var = dz0Var.f54472f;
                geg1 geg1Var = rua0Var.f202783a;
                lg7Var.f133106a = geg1Var;
                return new yua0(geg1Var);
            case 9:
                Observable observable = (Observable) obj;
                C2263po c2263po = (C2263po) this.f188484b;
                ((ki1) c2263po.f179550b).getClass();
                return Observable.merge(observable, Observable.timer(800L, TimeUnit.MILLISECONDS, (Scheduler) c2263po.f179551c).map(zp7.f284988e).takeUntil(observable));
            case 10:
                return new pqm0(new so0(((so0) obj).f211068a), (Boolean) this.f188484b);
            case 11:
                dvy dvyVar = (dvy) obj;
                avy avyVar = dvyVar instanceof avy ? (avy) dvyVar : null;
                if (avyVar == null) {
                    Logger.m3966b(s571.m77251j("Unexpected FieldValidationResponse type: ", dvyVar.getClass().getSimpleName(), ". Expected FieldValidationResponse.Age for Birthdate validation."), new Object[0]);
                    avyVar = new avy(me2.f142573b);
                }
                qa2 qa2Var = (qa2) this.f188484b;
                int i = qa2Var.f186714a;
                int i2 = qa2Var.f186715b;
                int i3 = qa2Var.f186716c;
                w1h1 w1h1Var = avyVar.f20295a;
                if (w1h1Var instanceof ke2) {
                    ycb1Var2 = zcb1.f281494c;
                } else {
                    if (w1h1Var instanceof le2) {
                        ycb1Var = new ycb1(new ol50(((le2) w1h1Var).f132435b));
                    } else if (w1h1Var instanceof me2) {
                        ycb1Var2 = new ycb1(pl50.f178644a);
                    } else if (w1h1Var.equals(je2.f111436b)) {
                        ycb1Var2 = new ycb1(nl50.f155007a);
                    } else {
                        if (!(w1h1Var instanceof ie2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ycb1Var = new ycb1(new ml50(((ie2) w1h1Var).f101301b));
                    }
                    ycb1Var2 = ycb1Var;
                }
                return new ec2(i, i2, i3, ycb1Var2);
            case 12:
                return new oev(((cq50) this.f188484b).f40737b, (List) obj);
            case 19:
                ContextTrack contextTrack = (ContextTrack) obj;
                ch4 ch4Var = (ch4) this.f188484b;
                wj50.m88279p(contextTrack);
                return bm51.m29803n0(contextTrack.uri(), "spotify:kallax:", false) ? k0e1.m54988g(ch4Var.f37914u.m34421h(e72.m38002e0(contextTrack)), dau.f47107a).map(new c730(ch4Var, 18)).toFlowable(BackpressureStrategy.f7190d) : Flowable.m23313I("");
            default:
                y5f y5fVar = (y5f) ((Map) obj).get(((cp7) this.f188484b).f40474a);
                return Boolean.valueOf(y5fVar != null ? y5fVar.f269417a : false);
        }
    }

    @Override // p204p.qt8
    /* JADX INFO: renamed from: b */
    public j15 mo26895b(xq00 xq00Var) {
        xq00Var.m91771i0(-1391172658);
        sc0 sc0Var = (sc0) this.f188484b;
        g15 g15Var = new g15();
        String strM54977L = k0e1.m54977L(R.string.maps_back_banner_header_waze, xq00Var);
        ew31 ew31Var = new ew31(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, AudioDriver.SPOTIFY_MAX_VOLUME);
        boolean zM91770i = xq00Var.m91770i(sc0Var);
        Object objM91750T = xq00Var.m91750T();
        if (zM91770i || objM91750T == t6x0.f217647t) {
            objM91750T = new rc0(sc0Var, 0);
            xq00Var.m91793t0(objM91750T);
        }
        vie.m85608a(g15Var, strM54977L, ContextTrack.Metadata.KEY_TITLE, ew31Var, (gh00) objM91750T);
        j15 j15VarM43339o = g15Var.m43339o();
        xq00Var.m91788r(false);
        return j15VarM43339o;
    }

    @Override // p204p.p690
    /* JADX INFO: renamed from: c */
    public void mo47104c(int i, int i2) {
        ((hjv0) this.f188484b).m47716l(i, i2);
    }

    @Override // p204p.p690
    /* JADX INFO: renamed from: d */
    public void mo47105d(int i, int i2, Object obj) {
        ((hjv0) this.f188484b).f92278a.m50840d(i, i2, obj);
    }

    @Override // p204p.p690
    /* JADX INFO: renamed from: e */
    public void mo47106e(int i, int i2) {
        ((hjv0) this.f188484b).m47714j(i, i2);
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: f */
    public void mo31884f(y8b y8bVar, IOException iOException) {
        SingleEmitter singleEmitter = (SingleEmitter) this.f188484b;
        String message = iOException.getMessage();
        if (message == null) {
            message = "Http request failed";
        }
        singleEmitter.onSuccess(new zka1(null, message));
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return new SchedulerWorkRunner(((oj3) this.f188484b).f165942c);
    }

    /* JADX INFO: renamed from: i */
    public File m72748i(String str) {
        File file = new File(m72752o(), m72744h(str, xvy.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m72752o(), m72744h(str, xvy.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(m72752o(), m72744h(str, xvy.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public xqb m72749k() {
        return new xqb(this, "hit");
    }

    /* JADX INFO: renamed from: l */
    public oij m72750l(zbv zbvVar, aq5 aq5Var, boolean z, rcm0 rcm0Var, String str, int i, Integer num, String str2) {
        qs5 qs5Var;
        ouh ouhVar = aq5Var.f18082e;
        String str3 = zbvVar.f281396a;
        String str4 = zbvVar.f281397b;
        t2z0 t2z0Var = (t2z0) this.f188484b;
        String strM79943h = t2z0Var.m79943h(zbvVar, false);
        String strM79943h2 = t2z0Var.m79943h(zbvVar, false);
        boolean z2 = aq5Var.f18078a;
        boolean z3 = aq5Var.f18079b;
        boolean z4 = aq5Var.f18080c;
        String str5 = zbvVar.f281398c;
        is9 is9Var = z ? new is9(Collections.singletonList(zbvVar.f281396a), true) : new is9(lau.f131415a, false);
        ps5 ps5VarM72746m = ouhVar != null ? null : m72746m(aq5Var.f18081d);
        if (ouhVar != null) {
            qs5Var = new qs5(ouhVar.f170289a, ouhVar.f170290b, ouhVar.f170291c, ouhVar.f170292d, ouhVar.f170294f, ouhVar.f170293e);
        } else {
            qs5Var = null;
        }
        return new oij(new ws5(str3, str4, strM79943h, strM79943h2, str5, z2, z3, z4, is9Var, str, rcm0Var, i, ps5VarM72746m, qs5Var, num, str2));
    }

    /* JADX INFO: renamed from: n */
    public c730 m72751n() {
        return new c730((BitSet) ((BitSet) this.f188484b).clone(), 23);
    }

    /* JADX INFO: renamed from: o */
    public File m72752o() {
        File file = new File(((qd70) this.f188484b).f187502a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // p204p.qio
    /* JADX INFO: renamed from: p0 */
    public uio mo30418p0() {
        return new fua((byte[]) this.f188484b);
    }

    /* JADX INFO: renamed from: q */
    public File m72753q(String str, InputStream inputStream, xvy xvyVar) throws IOException {
        File file = new File(m72752o(), m72744h(str, xvyVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        bji bjiVar;
        bji bjiVar2;
        bji bjiVar3;
        switch (this.f188483a) {
            case 16:
                singleEmitter.onSuccess(new fv3(((Boolean) Single.create(new ihj0((hv3) this.f188484b, 14)).blockingGet()).booleanValue()));
                break;
            case 17:
            case 19:
            default:
                gi5 gi5Var = (gi5) this.f188484b;
                fnk0 fnk0Var = gi5Var.f80068r;
                if (fnk0Var == null || !fnk0Var.m42228h("apps-music-libs-eventsender.rate_limiting_rule_1_time_unit_seconds")) {
                    bjiVar3 = fnk0Var;
                    bjiVar3 = gi5Var.f80069s;
                }
                if (bjiVar3 != null) {
                }
                break;
            case 18:
                z84 z84Var = (z84) this.f188484b;
                fnk0 fnk0Var2 = z84Var.f280356g;
                if (fnk0Var2 == null || !fnk0Var2.m42228h("android-gen-alpha-blocking.is_my_allowlisting_requests_page_enabled")) {
                    bjiVar = fnk0Var2;
                    bjiVar = z84Var.f280357h;
                }
                if (bjiVar != null) {
                }
                break;
            case 20:
                bl4 bl4Var = (bl4) this.f188484b;
                fnk0 fnk0Var3 = bl4Var.f28087l;
                if (fnk0Var3 == null || !fnk0Var3.m42228h("android-perf-tracking.observability_platform_enabled")) {
                    bjiVar2 = fnk0Var3;
                    bjiVar2 = bl4Var.f28088m;
                }
                if (bjiVar2 != null) {
                }
                break;
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        C2223op c2223op = (C2223op) this.f188484b;
        C2655zm c2655zm = new C2655zm((List) obj, (C2098lp) c2223op.f167722c, new C2135mp(c2223op, 2), 0);
        hol0 hol0Var = (hol0) c2223op.f167721b;
        RecyclerView recyclerView = (RecyclerView) hol0Var.f93565e;
        ((ConstraintLayout) hol0Var.f93562b).getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(c2655zm);
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        AppBarLayout appBarLayout = (AppBarLayout) this.f188484b;
        WeakHashMap weakHashMap = mec1.f142677a;
        swd1 swd1Var2 = appBarLayout.getFitsSystemWindows() ? swd1Var : null;
        if (!Objects.equals(appBarLayout.f1938g, swd1Var2)) {
            appBarLayout.f1938g = swd1Var2;
            appBarLayout.setWillNotDraw(!(appBarLayout.f1931S0 != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return swd1Var;
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: y */
    public void mo31897y(y8b y8bVar, n2x0 n2x0Var) {
        Object zka1Var;
        p3x0 p3x0Var = n2x0Var.f149863g;
        SingleEmitter singleEmitter = (SingleEmitter) this.f188484b;
        int i = n2x0Var.f149860d;
        if (200 > i || i >= 300) {
            zka1Var = new zka1(Long.valueOf(i), p3x0Var.toString());
        } else {
            zka1Var = ala1.f16827a;
        }
        singleEmitter.onSuccess(zka1Var);
        try {
            p3x0Var.close();
        } catch (Throwable unused) {
        }
    }

    public qgj0(va2 va2Var, qa2 qa2Var) {
        this.f188483a = 11;
        this.f188484b = qa2Var;
    }

    public qgj0(Looper looper) {
        this.f188483a = 1;
        ywh0 ywh0Var = new ywh0(looper, 3, false);
        Looper.getMainLooper();
        this.f188484b = ywh0Var;
    }

    public qgj0(c730 c730Var) {
        this.f188483a = 24;
        this.f188484b = (BitSet) c730Var.f34733b;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (((Boolean) obj).booleanValue()) {
            return pj7.f178191b;
        }
        if (bool.booleanValue()) {
            b5t0 b5t0Var = ((vj7) this.f188484b).f241886D1;
            if (b5t0Var != null) {
                if (!b5t0Var.m28202a().f34286i) {
                    return pj7.f178192c;
                }
            } else {
                wj50.m88260d0("psesApi");
                throw null;
            }
        }
        return pj7.f178190a;
    }
}
