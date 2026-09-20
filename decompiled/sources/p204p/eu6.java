package p204p;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class eu6 {

    /* JADX INFO: renamed from: a */
    public boolean f62876a;

    /* JADX INFO: renamed from: b */
    public final Object f62877b;

    /* JADX INFO: renamed from: c */
    public final Object f62878c;

    /* JADX INFO: renamed from: d */
    public final Object f62879d;

    /* JADX INFO: renamed from: e */
    public final Object f62880e;

    /* JADX INFO: renamed from: f */
    public final Object f62881f;

    /* JADX INFO: renamed from: g */
    public final Object f62882g;

    /* JADX INFO: renamed from: h */
    public Object f62883h;

    /* JADX INFO: renamed from: i */
    public Object f62884i;

    /* JADX INFO: renamed from: j */
    public Object f62885j;

    /* JADX INFO: renamed from: k */
    public Object f62886k;

    public eu6(ViewGroup viewGroup, View view, View view2, FlowableFilter flowableFilter, y54 y54Var, luk lukVar, yas0 yas0Var, djs djsVar) {
        this.f62877b = viewGroup;
        this.f62878c = view;
        this.f62879d = view2;
        this.f62880e = flowableFilter;
        this.f62881f = y54Var;
        this.f62882g = lukVar;
        this.f62883h = yas0Var;
        this.f62884i = djsVar;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ AudioDeviceInfo m40027a(eu6 eu6Var) {
        return (AudioDeviceInfo) eu6Var.f62885j;
    }

    /* JADX INFO: renamed from: c */
    public static void m40029c(eu6 eu6Var) {
        List listM40033g = eu6Var.m40033g();
        Context context = (Context) eu6Var.f62877b;
        xs6 xs6Var = (xs6) eu6Var.f62886k;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) eu6Var.f62885j;
        wsv0 wsv0Var = bu6.f31027e;
        eu6Var.m40034h(bu6.m30504b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), xs6Var, audioDeviceInfo, listM40033g));
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ zw41 m40030d(eu6 eu6Var) {
        return (zw41) eu6Var.f62878c;
    }

    /* JADX INFO: renamed from: e */
    public Single m40031e(ExternalAccessoryDescription externalAccessoryDescription, sr4 sr4Var) {
        Observable observableDoOnSubscribe = ((Observable) this.f62877b).doOnSubscribe(new cx31(sr4Var, 5));
        isc1 isc1Var = isc1.f105224h;
        return observableDoOnSubscribe.map(new jsc1()).take(1L).single("local_device").timeout(100L, TimeUnit.MILLISECONDS, (Scheduler) this.f62880e, Single.just("local_device")).map(new yb81(sr4Var, externalAccessoryDescription, this, 27)).observeOn((Scheduler) this.f62879d);
    }

    /* JADX INFO: renamed from: f */
    public Observable m40032f(String str, String str2, sr4 sr4Var, String str3) {
        Flowable flowableM23343X = ((Flowable) this.f62878c).m23359w(new cx31(sr4Var, 3)).m23343X(alq0.f16928W0);
        flowableM23343X.getClass();
        return new ObservableFromPublisher(flowableM23343X.m23356t(Functions.f7225a)).doOnNext(new cx31(sr4Var, 4)).onErrorResumeNext(new iqp0(sr4Var, str, str2, str3, this, 23));
    }

    /* JADX INFO: renamed from: g */
    public List m40033g() {
        uw31 uw31Var;
        if (Build.VERSION.SDK_INT >= 32 && (uw31Var = (uw31) this.f62883h) != null) {
            return uw31Var.m84085b();
        }
        kf40 kf40Var = pf40.f176960b;
        return wsv0.f254763e;
    }

    /* JADX INFO: renamed from: h */
    public void m40034h(bu6 bu6Var) {
        if (!this.f62876a || bu6Var.equals((bu6) this.f62884i)) {
            return;
        }
        this.f62884i = bu6Var;
        l77 l77Var = (l77) ((nc5) this.f62878c).f152430b;
        l77Var.m58398f();
        bu6 bu6Var2 = l77Var.f130592h;
        if (bu6Var2 == null || bu6Var.equals(bu6Var2)) {
            return;
        }
        l77Var.f130592h = bu6Var;
        n890 n890Var = l77Var.f130590f;
        if (n890Var != null) {
            n890Var.m63839j(-1, new q95(29));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m40035i() {
        yas0 yas0Var = (yas0) this.f62883h;
        yas0Var.m93220c();
        ContextTrack contextTrack = (ContextTrack) this.f62886k;
        if (contextTrack != null && this.f62876a && ((y54) this.f62881f).m92837k() && ((djs) this.f62884i).m36213a(contextTrack)) {
            yas0Var.m93221d(contextTrack.uri(), (ViewGroup) this.f62877b, (View) this.f62878c, (View) this.f62879d);
        }
    }

    public eu6(Context context, zw41 zw41Var, m9r m9rVar, eu3 eu3Var, Scheduler scheduler, gb80 gb80Var, Observable observable, Handler handler) {
        this.f62877b = context;
        this.f62878c = zw41Var;
        this.f62880e = m9rVar;
        this.f62881f = scheduler;
        this.f62882g = gb80Var;
        this.f62883h = observable;
        this.f62879d = handler;
        this.f62884i = new iwr();
        this.f62876a = eu3Var.m40019b();
        this.f62886k = new ow41(this);
    }

    public eu6(Observable observable, boolean z, Flowable flowable, Scheduler scheduler, Scheduler scheduler2, i391 i391Var, khy0 khy0Var, s8b1 s8b1Var, iea0 iea0Var, ac6 ac6Var, zw31 zw31Var) {
        this.f62877b = observable;
        this.f62876a = z;
        this.f62878c = flowable;
        this.f62879d = scheduler;
        this.f62880e = scheduler2;
        this.f62881f = i391Var;
        this.f62882g = iea0Var;
        this.f62883h = ac6Var;
        this.f62884i = zw31Var;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f62885j = atomicBoolean;
        this.f62886k = new dx31((vw31) khy0Var.f122742b, (fsc1) s8b1Var.mo24510D0(iea0Var, ac6Var, atomicBoolean), (Scheduler) khy0Var.f122743c, new kq11(5, 100L, 3), new kq11(5, 100L, 3));
    }

    public eu6(bii0 bii0Var, b2s0 b2s0Var, m06 m06Var, oy80 oy80Var, rkn rknVar, oyn oynVar, oyn oynVar2, oyn oynVar3, mt5 mt5Var, boolean z, ub80 ub80Var) {
        this.f62877b = bii0Var;
        this.f62878c = b2s0Var;
        this.f62879d = m06Var;
        this.f62880e = oy80Var;
        this.f62881f = oynVar;
        this.f62882g = oynVar2;
        this.f62883h = oynVar3;
        this.f62884i = mt5Var;
        this.f62876a = z;
        this.f62885j = ub80Var;
        this.f62886k = new wg61(new dp80(2, rknVar, this));
    }

    public eu6(Context context, nc5 nc5Var, xs6 xs6Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f62877b = applicationContext;
        this.f62878c = nc5Var;
        this.f62886k = xs6Var;
        this.f62885j = audioDeviceInfo;
        Handler handlerM46331s = h0b1.m46331s(null);
        this.f62879d = handlerM46331s;
        this.f62880e = new cu6(this);
        this.f62881f = new o4a(this, 3);
        wsv0 wsv0Var = bu6.f31027e;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f62882g = uriFor != null ? new du6(this, handlerM46331s, applicationContext.getContentResolver(), uriFor) : null;
    }

    public eu6(rkn rknVar, bii0 bii0Var, m500 m500Var, aaq0 aaq0Var, bwt0 bwt0Var, be41 be41Var, pgo pgoVar, String str, boolean z, bc91 bc91Var, pc91 pc91Var) {
        this.f62877b = rknVar;
        this.f62878c = bii0Var;
        this.f62879d = m500Var;
        this.f62880e = aaq0Var;
        this.f62881f = bwt0Var;
        this.f62882g = be41Var;
        this.f62883h = pgoVar;
        this.f62884i = str;
        this.f62876a = z;
        this.f62885j = bc91Var;
        this.f62886k = pc91Var;
    }

    public eu6(C2065kt c2065kt, clj cljVar, xci0 xci0Var, fbn fbnVar, pgo pgoVar, boolean z, suj sujVar, nsb nsbVar, hc80 hc80Var, ic4 ic4Var, qce0 qce0Var) {
        this.f62877b = c2065kt;
        this.f62878c = cljVar;
        this.f62879d = xci0Var;
        this.f62880e = fbnVar;
        this.f62881f = pgoVar;
        this.f62876a = z;
        this.f62882g = sujVar;
        this.f62883h = nsbVar;
        this.f62884i = hc80Var;
        this.f62885j = ic4Var;
        this.f62886k = qce0Var;
    }

    public eu6(Flowable flowable, voc1 voc1Var, oy80 oy80Var, l3v l3vVar, rkn rknVar, t5k t5kVar, boolean z, ke81 ke81Var, Scheduler scheduler, fiz fizVar, tsb tsbVar) {
        this.f62877b = flowable;
        this.f62878c = voc1Var;
        this.f62879d = oy80Var;
        this.f62880e = l3vVar;
        this.f62881f = rknVar;
        this.f62882g = t5kVar;
        this.f62876a = z;
        this.f62883h = ke81Var;
        this.f62884i = scheduler;
        this.f62885j = fizVar;
        this.f62886k = tsbVar;
    }
}
