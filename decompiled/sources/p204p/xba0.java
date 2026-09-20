package p204p;

import android.content.Intent;
import android.graphics.Insets;
import android.media.MediaCodecInfo;
import android.media.MediaRoute2Info;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver;
import com.spotify.player.model.PlayerState;
import com.spotify.voiceassistants.playermodels.ParsedQueryKt;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xba0 implements Predicate, Function, BiPredicate, BiFunction, w1j0, knx0, u9d0, yad0, l890, k890, ocd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f259875a;

    public /* synthetic */ xba0(int i) {
        this.f259875a = i;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ Insets m90308f(Object obj) {
        return (Insets) obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m90309h(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ MediaRoute2Info m90310j(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // p204p.ocd0
    /* JADX INFO: renamed from: a */
    public void mo56040a(jcd0 jcd0Var) {
        switch (this.f259875a) {
            case 21:
                if (jcd0Var.m52958p()) {
                    lbd0 lbd0Var = jcd0Var.f111079a;
                    lbd0Var.getClass();
                    c95.m31855u(Looper.myLooper() == lbd0Var.f131637e.getLooper());
                    lbd0Var.f131636d.getClass();
                    return;
                }
                return;
            case 22:
                jcd0Var.f111087i.m63839j(26, new eqp(22));
                return;
            case 23:
                lbd0 lbd0Var2 = jcd0Var.f111079a;
                Objects.requireNonNull(lbd0Var2);
                lbd0Var2.m58660c1(new ig10(lbd0Var2, 16));
                return;
            default:
                throw new ClassCastException();
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f259875a) {
            case 4:
                return Boolean.valueOf(((e301) obj).f55578h);
            case 7:
                return new bsb0((nt30) obj, null);
            case 8:
                return new bsb0(null, (Throwable) obj);
            case 13:
                return xul0.m92201d((PlayerState) obj);
            default:
                return ((o9d0) obj).mo37698f();
        }
    }

    @Override // p204p.u9d0
    /* JADX INFO: renamed from: b */
    public void mo66935b() {
        int i = MediaButtonReceiver.f5459i;
    }

    @Override // p204p.yad0
    /* JADX INFO: renamed from: c */
    public int mo87593c(Object obj) {
        String str = ((tad0) obj).f218544a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // p204p.l890
    /* JADX INFO: renamed from: d */
    public void mo39734d(Object obj, kfz kfzVar) {
        ((d7p0) obj).mo35223r0(new c7p0(kfzVar));
    }

    /* JADX INFO: renamed from: e */
    public Object m90311e(Object obj, Object obj2) {
        switch (this.f259875a) {
            case 0:
                l3n l3nVar = (l3n) obj;
                l3nVar.getClass();
                ((tvp0) obj2).getClass();
                return new be80(l3nVar.f129350b, 1);
            case 1:
                ((l3n) obj).getClass();
                ((cu50) obj2).getClass();
                return new nvc(1);
            default:
                ((yww0) obj).getClass();
                ((oww0) obj2).getClass();
                return new gda0();
        }
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        String dataString = intent.getDataString();
        Set set = dd41.f47702f;
        return r46.m74726U(dataString).f47709c == gn80.CLUSTER_STATIONS_ROOT ? p1j0.f173119a : new s1j0(new Bundle(), rrb0.class);
    }

    @Override // p204p.knx0
    /* JADX INFO: renamed from: i */
    public Intent mo28051i(Intent intent) {
        return null;
    }

    @Override // p204p.k890
    public void invoke(Object obj) {
        switch (this.f259875a) {
            case 19:
                ((d7p0) obj).mo34736F(1);
                break;
            default:
                ((d7p0) obj).mo34766d0(0.0f);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        return ((Boolean) obj2).equals(bool) || bool.booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f259875a) {
            case 3:
                return ((Long) obj).longValue() > 0;
            case 28:
                sod0.m78644w(ParsedQueryKt.INTENT_PLAY, (Throwable) obj);
                return true;
            default:
                sod0.m78644w("SKIP_TO_PREVIOUS", (Throwable) obj);
                return true;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new qqm0((Boolean) obj, (nt30) obj2);
    }
}
