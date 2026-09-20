package p204p;

import android.media.AudioDescriptor;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;
import android.os.Handler;
import android.os.IInterface;
import android.os.SystemClock;
import androidx.car.app.IAppHost;
import com.spotify.appauthorization.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q95 implements egy, Function, db30, yi5, k890 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f186493a;

    public /* synthetic */ q95(int i) {
        this.f186493a = i;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ AudioDescriptor m72353b(Object obj) {
        return (AudioDescriptor) obj;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ AudioManager$OnCommunicationDeviceChangedListener m72354c(Object obj) {
        return (AudioManager$OnCommunicationDeviceChangedListener) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012 A[PHI: r1 r3
      0x0012: PHI (r1v2 float) = (r1v0 float), (r1v4 float) binds: [B:11:0x0024, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE]
      0x0012: PHI (r3v5 float) = (r3v2 float), (r3v8 float) binds: [B:11:0x0024, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p204p.yi5
    /* JADX INFO: renamed from: a */
    public int mo64121a(int i, ko70 ko70Var) {
        float f;
        float f2;
        switch (this.f186493a) {
            case 18:
                f = i / 2.0f;
                f2 = -1.0f;
                if (ko70Var != ko70.f124556a) {
                    f2 *= -1;
                }
                break;
            default:
                f = (i + 0) / 2.0f;
                f2 = 1.0f;
                if (ko70Var != ko70.f124556a) {
                    f2 *= -1;
                }
                break;
        }
        return ms2.m62681f(1, f2, f);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f186493a) {
            case 16:
                er7 er7Var = (er7) obj;
                return ((er7Var instanceof ar7) || (er7Var instanceof zq7)) ? CompletableEmpty.f7437a : Completable.m23286j(new BuiltInAuthException(1, "Explicit user authorization is required to use Spotify. The user has to complete the auth-flow to allow the app to use Spotify on their behalf"));
            case 21:
                PlayerState playerState = (PlayerState) obj;
                return Boolean.valueOf(playerState.track().mo49279c() && e72.m37986T((ContextTrack) playerState.track().mo49278b()));
            default:
                return new z7p0(((Long) obj).longValue());
        }
    }

    @Override // p204p.db30
    /* JADX INFO: renamed from: h */
    public Object mo35521h(IInterface iInterface) {
        ((IAppHost) iInterface).invalidate();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.egy
    /* JADX INFO: renamed from: i */
    public void mo25404i(boolean z) {
        HashSet hashSet;
        HashSet hashSetM63365e;
        Object[] objArr = 0;
        switch (this.f186493a) {
            case 0:
                if (z) {
                    d7f0 d7f0Var = d7f0.f46160b;
                    if (!p2l.f173365a.contains(d7f0.class)) {
                        try {
                            try {
                                p8y.m69345c().execute(new RunnableC2034k(11));
                            } catch (Exception unused) {
                                p8y p8yVar = p8y.f175080a;
                                return;
                            }
                        } catch (Throwable th) {
                            p2l.m68953a(d7f0.class, th);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (z) {
                    ft8 ft8Var = ft8.f73132a;
                    Set set = p2l.f173365a;
                    if (!set.contains(ft8.class)) {
                        try {
                            if (!ft8.f73133b) {
                                ft8 ft8Var2 = ft8.f73132a;
                                if (!set.contains(ft8Var2)) {
                                    try {
                                        lty ltyVarM71031k = pty.m71031k(p8y.m69344b(), false);
                                        if (ltyVarM71031k != null) {
                                            JSONArray jSONArray = ltyVarM71031k.f136923s;
                                            HashSet hashSet2 = null;
                                            if (!set.contains(ft8Var2)) {
                                                try {
                                                    try {
                                                        hashSet = n0b1.m63365e(jSONArray);
                                                        if (hashSet == null) {
                                                            hashSet = new HashSet();
                                                        }
                                                    } catch (Exception unused2) {
                                                        hashSet = new HashSet();
                                                    }
                                                    hashSet2 = hashSet;
                                                } catch (Throwable th2) {
                                                    p2l.m68953a(ft8Var2, th2);
                                                }
                                            }
                                            ft8.f73134c = hashSet2;
                                            break;
                                        }
                                    } catch (Throwable th3) {
                                        p2l.m68953a(ft8Var2, th3);
                                    }
                                }
                                ft8.f73133b = !ft8.f73134c.isEmpty();
                            }
                        } catch (Throwable th4) {
                            p2l.m68953a(ft8.class, th4);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 2:
                if (z) {
                    hk40 hk40Var = hk40.f92342a;
                    if (!p2l.f173365a.contains(hk40.class)) {
                        try {
                            if (m68.m60950c()) {
                                hk40.f92346e.set(true);
                                hk40.m47739d();
                            } else {
                                gk40.m45032h();
                            }
                        } catch (Throwable th5) {
                            p2l.m68953a(hk40.class, th5);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 3:
                if (z) {
                    g151 g151Var = g151.f75530a;
                    Set set2 = p2l.f173365a;
                    if (!set2.contains(g151.class)) {
                        try {
                            if (!g151.f75531b) {
                                g151 g151Var2 = g151.f75530a;
                                if (!set2.contains(g151Var2)) {
                                    try {
                                        lty ltyVarM71031k2 = pty.m71031k(p8y.m69344b(), false);
                                        if (ltyVarM71031k2 != null) {
                                            g151Var2.m43341a(ltyVarM71031k2.f136922r);
                                            break;
                                        }
                                    } catch (Throwable th6) {
                                        p2l.m68953a(g151Var2, th6);
                                    }
                                }
                                g151.f75531b = (g151.f75532c.isEmpty() && g151.f75533d.isEmpty()) ? false : true;
                            }
                        } catch (Throwable th7) {
                            p2l.m68953a(g151.class, th7);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 4:
                if (z) {
                    ozs0 ozs0Var = ozs0.f172353a;
                    if (!p2l.f173365a.contains(ozs0.class)) {
                        try {
                            ozs0.f172354b = true;
                            ozs0.f172353a.m68663a();
                        } catch (Throwable th8) {
                            p2l.m68953a(ozs0.class, th8);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 5:
                if (z) {
                    Set set3 = p2l.f173365a;
                    if (!set3.contains(wqb0.class)) {
                        try {
                            wqb0 wqb0Var = wqb0.f253980b;
                            if (!set3.contains(wqb0Var)) {
                                try {
                                    lty ltyVarM71031k3 = pty.m71031k(p8y.m69344b(), false);
                                    if (ltyVarM71031k3 != null) {
                                        wqb0.f253984d = ltyVarM71031k3.f136918n;
                                        break;
                                    }
                                } catch (Throwable th9) {
                                    p2l.m68953a(wqb0Var, th9);
                                }
                            }
                            if (wqb0.f253984d != null) {
                                wqb0.f253982c = true;
                            }
                        } catch (Throwable th10) {
                            p2l.m68953a(wqb0.class, th10);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 6:
                if (z) {
                    qs9 qs9Var = qs9.f192042a;
                    Set set4 = p2l.f173365a;
                    if (!set4.contains(qs9.class)) {
                        try {
                            qs9 qs9Var2 = qs9.f192042a;
                            if (!set4.contains(qs9Var2)) {
                                try {
                                    lty ltyVarM71031k4 = pty.m71031k(p8y.m69344b(), false);
                                    if (ltyVarM71031k4 != null && (hashSetM63365e = n0b1.m63365e(ltyVarM71031k4.f136919o)) != null) {
                                        qs9.f192044c = hashSetM63365e;
                                    }
                                } catch (Throwable th11) {
                                    p2l.m68953a(qs9Var2, th11);
                                }
                            }
                            HashSet hashSet3 = qs9.f192044c;
                            if (hashSet3 != null && !hashSet3.isEmpty()) {
                                qs9.f192043b = true;
                            }
                        } catch (Throwable th12) {
                            p2l.m68953a(qs9.class, th12);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 7:
                if (z) {
                    pkv0 pkv0Var = pkv0.f178585a;
                    if (!p2l.f173365a.contains(pkv0.class)) {
                        try {
                            pkv0.f178585a.m70227a();
                            if (!pkv0.f178587c.isEmpty()) {
                                pkv0.f178586b = true;
                            }
                        } catch (Throwable th13) {
                            p2l.m68953a(pkv0.class, th13);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 8:
                if (z) {
                    lsz0 lsz0Var = lsz0.f136636a;
                    if (!p2l.f173365a.contains(lsz0.class)) {
                        try {
                            lsz0.f136636a.m59851a();
                            if (lsz0.f136638c.isEmpty() && lsz0.f136639d.isEmpty()) {
                                lsz0.f136637b = false;
                            } else {
                                lsz0.f136637b = true;
                            }
                        } catch (Throwable th14) {
                            p2l.m68953a(lsz0.class, th14);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 9:
                if (z) {
                    try {
                        dx10 dx10Var = new dx10(null, p8y.m69344b().concat("/cloudbridge_settings"), null, eh30.f59473a, new f95(objArr == true ? 1 : 0), 32);
                        iq3 iq3Var = tra0.f223025b;
                        synchronized (p8y.f175081b) {
                        }
                        dx10Var.m37182d();
                    } catch (JSONException e) {
                        iq3 iq3Var2 = tra0.f223025b;
                        y85.m93049F(e);
                        synchronized (p8y.f175081b) {
                            return;
                        }
                    }
                }
                break;
            case 10:
                if (z) {
                    aq10 aq10Var = aq10.f18053a;
                    if (!p2l.f173365a.contains(aq10.class)) {
                        try {
                            aq10.f18054b = true;
                            aq10.f18055c = new bq10(p8y.m69343a());
                            aq10.f18056d = "https://www." + p8y.f175098s + "/privacy_sandbox/mobile/register/trigger";
                        } catch (Throwable th15) {
                            p2l.m68953a(aq10.class, th15);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 11:
                if (z) {
                    k2m0.m55195a();
                }
                break;
            case 12:
                if (z) {
                    AtomicBoolean atomicBoolean = cq10.f40699a;
                    if (!p2l.f173365a.contains(cq10.class)) {
                        try {
                            cq10.f40699a.set(true);
                        } catch (Throwable th16) {
                            p2l.m68953a(cq10.class, th16);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 13:
                if (z) {
                    l5x0 l5x0Var = l5x0.f130106a;
                    if (!p2l.f173365a.contains(l5x0.class)) {
                        try {
                            l5x0.f130107b = true;
                            l5x0.f130106a.m58267b();
                        } catch (Throwable th17) {
                            p2l.m68953a(l5x0.class, th17);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 14:
                if (z) {
                    swh0 swh0Var = swh0.f214669a;
                    if (!p2l.f173365a.contains(swh0.class)) {
                        try {
                            try {
                                p8y.m69345c().execute(new RunnableC2034k(12));
                            } catch (Exception unused3) {
                                return;
                            }
                        } catch (Throwable th18) {
                            p2l.m68953a(swh0.class, th18);
                            return;
                        }
                        break;
                    }
                }
                break;
            default:
                if (z) {
                    z4x z4xVar = z4x.f279397a;
                    if (!p2l.f173365a.contains(z4x.class)) {
                        try {
                            z4x.f279398b = true;
                            z4x.f279397a.m95381a();
                        } catch (Throwable th19) {
                            p2l.m68953a(z4x.class, th19);
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // p204p.k890
    public void invoke(Object obj) {
        long jM46308e0;
        l3d0 l3d0Var;
        jjx jjxVar;
        req reqVar;
        switch (this.f186493a) {
            case 25:
                wxo wxoVar = (wxo) obj;
                ayo ayoVar = wxoVar.f256082a;
                if (wxoVar.equals(ayoVar.f21315k) && ayoVar.f21319o != null) {
                    yxo yxoVar = ayoVar.f21321q;
                    int i = yxoVar.f277288d;
                    if (i != -1) {
                        long j = yxoVar.f277289e.f117912f / i;
                        i77 i77Var = ayoVar.f21325u;
                        i77Var.getClass();
                        jM46308e0 = h0b1.m46308e0(i77Var.f99441a.getSampleRate(), j);
                    } else {
                        jM46308e0 = -9223372036854775807L;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - ayoVar.f21299Y;
                    l3d0 l3d0Var2 = ayoVar.f21319o;
                    int i2 = ayoVar.f21321q.f277289e.f117912f;
                    long jM46326n0 = h0b1.m46326n0(jM46308e0);
                    fw40 fw40Var = ((rad0) l3d0Var2.f129295b).f197272i2;
                    Handler handler = (Handler) fw40Var.f73934b;
                    if (handler != null) {
                        handler.post(new e57(i2, 0, jM46326n0, jElapsedRealtime, fw40Var));
                        return;
                    }
                    return;
                }
                return;
            case 26:
                wxo wxoVar2 = (wxo) obj;
                wxoVar2.getClass();
                ayo.f21274e0.getAndDecrement();
                l3d0 l3d0Var3 = wxoVar2.f256082a.f21319o;
                if (l3d0Var3 != null) {
                    d67 d67Var = new d67(0);
                    fw40 fw40Var2 = ((rad0) l3d0Var3.f129295b).f197272i2;
                    Handler handler2 = (Handler) fw40Var2.f73934b;
                    if (handler2 != null) {
                        handler2.post(new g57(fw40Var2, d67Var, 0));
                        return;
                    }
                    return;
                }
                return;
            case 27:
                wxo wxoVar3 = (wxo) obj;
                ayo ayoVar2 = wxoVar3.f256082a;
                if (wxoVar3.equals(ayoVar2.f21315k) && (l3d0Var = ayoVar2.f21319o) != null && ayoVar2.f21291Q && (jjxVar = ((rad0) l3d0Var.f129295b).f239236h1) != null) {
                    jjxVar.m53580a();
                    return;
                }
                return;
            case 28:
                wxo wxoVar4 = (wxo) obj;
                ayo ayoVar3 = wxoVar4.f256082a;
                if (wxoVar4.equals(ayoVar3.f21315k) && ayoVar3.f21289O) {
                    ayoVar3.f21290P = true;
                    return;
                }
                return;
            default:
                l3d0 l3d0Var4 = ((vxo) obj).f245792a.f21319o;
                if (l3d0Var4 != null) {
                    rad0 rad0Var = (rad0) l3d0Var4.f129295b;
                    synchronized (rad0Var.f160287a) {
                        reqVar = rad0Var.f160283Q0;
                        break;
                    }
                    if (reqVar != null) {
                        reqVar.f198410g.getClass();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
