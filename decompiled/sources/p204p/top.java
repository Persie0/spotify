package p204p;

import android.text.TextUtils;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.searchview.proto.AudioEpisode;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class top implements j0a0 {

    /* JADX INFO: renamed from: r */
    public static final wsv0 f222293r;

    /* JADX INFO: renamed from: a */
    public final mp71 f222294a;

    /* JADX INFO: renamed from: b */
    public final bp71 f222295b;

    /* JADX INFO: renamed from: c */
    public final owo f222296c;

    /* JADX INFO: renamed from: d */
    public final long f222297d;

    /* JADX INFO: renamed from: e */
    public final long f222298e;

    /* JADX INFO: renamed from: f */
    public final long f222299f;

    /* JADX INFO: renamed from: g */
    public final long f222300g;

    /* JADX INFO: renamed from: h */
    public final long f222301h;

    /* JADX INFO: renamed from: i */
    public final long f222302i;

    /* JADX INFO: renamed from: j */
    public final long f222303j;

    /* JADX INFO: renamed from: k */
    public final long f222304k;

    /* JADX INFO: renamed from: l */
    public final int f222305l;

    /* JADX INFO: renamed from: m */
    public final boolean f222306m;

    /* JADX INFO: renamed from: n */
    public final long f222307n;

    /* JADX INFO: renamed from: o */
    public final xf40 f222308o;

    /* JADX INFO: renamed from: p */
    public final ConcurrentHashMap f222309p;

    /* JADX INFO: renamed from: q */
    public long f222310q;

    static {
        kf40 kf40Var = pf40.f176960b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        jhl0.m53415i(6, objArr);
        f222293r = pf40.m69787l(6, objArr);
    }

    public top() {
        this(new owo(), 50000, 1000, 50000, 50000, 1000, 1000, AudioEpisode.SHOW_URI_FIELD_NUMBER, 1000, 0);
    }

    /* JADX INFO: renamed from: g */
    public static void m81203g(int i, String str, int i2, String str2) {
        c95.m31846l(i >= i2, "%s cannot be less than %s", str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    @Override // p204p.j0a0
    /* JADX INFO: renamed from: a */
    public boolean mo41356a(i0a0 i0a0Var) {
        int i;
        boolean z;
        int i2;
        w9p0 w9p0Var = i0a0Var.f97182a;
        sop sopVar = (sop) this.f222309p.get(w9p0Var);
        sopVar.getClass();
        sop sopVar2 = (sop) this.f222309p.get(w9p0Var);
        sopVar2.getClass();
        synchronized (sopVar2) {
            i = sopVar2.f212627d;
        }
        int i3 = i * this.f222296c.f170742a;
        sop sopVar3 = (sop) this.f222309p.get(w9p0Var);
        sopVar3.getClass();
        boolean z2 = i3 >= sopVar3.f212626c;
        if (w9p0Var.equals(w9p0.f249228d)) {
            return !z2;
        }
        boolean zM81205i = m81205i(i0a0Var);
        long jMin = zM81205i ? this.f222298e : this.f222297d;
        long j = zM81205i ? this.f222300g : this.f222299f;
        float f = i0a0Var.f97187f;
        if (f > 1.0f) {
            jMin = Math.min(h0b1.m46280H(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = i0a0Var.f97186e;
        if (j2 < jMax) {
            boolean z3 = zM81205i ? this.f222306m : false;
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            if (runtime.totalMemory() >= jMaxMemory) {
                long jFreeMemory = runtime.freeMemory();
                owo owoVar = this.f222296c;
                synchronized (owoVar) {
                    i2 = owoVar.f170745d * owoVar.f170742a;
                }
                if (jFreeMemory + ((long) i2) >= jMaxMemory / 25) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            boolean z4 = (z3 && z) || !z2;
            sopVar.f212625b = z4;
            if (!z4 && z3 && !z) {
                yif1.m93818w("Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!sopVar.f212625b && i0a0Var.f97186e < 500000) {
                yif1.m93819w0("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z2) {
            sopVar.f212625b = false;
        }
        return sopVar.f212625b;
    }

    @Override // p204p.j0a0
    /* JADX INFO: renamed from: b */
    public void mo41357b(w9p0 w9p0Var) {
        long id = Thread.currentThread().getId();
        long j = this.f222310q;
        c95.m31856v(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f222310q = id;
        ConcurrentHashMap concurrentHashMap = this.f222309p;
        sop sopVar = (sop) concurrentHashMap.get(w9p0Var);
        if (sopVar == null) {
            sop sopVar2 = new sop();
            sopVar2.f212624a = 1;
            concurrentHashMap.put(w9p0Var, sopVar2);
        } else {
            sopVar.f212624a++;
        }
        sop sopVar3 = (sop) concurrentHashMap.get(w9p0Var);
        sopVar3.getClass();
        Integer num = (Integer) this.f222308o.get(w9p0Var.f249229a);
        int iIntValue = (num == null || num.intValue() == -1) ? this.f222305l : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        sopVar3.f212626c = iIntValue;
        sopVar3.f212625b = false;
    }

    @Override // p204p.j0a0
    /* JADX INFO: renamed from: c */
    public boolean mo52041c(i0a0 i0a0Var) {
        long jMin;
        int i;
        boolean zM81205i = m81205i(i0a0Var);
        w9p0 w9p0Var = i0a0Var.f97182a;
        long jM46282J = h0b1.m46282J(i0a0Var.f97186e, i0a0Var.f97187f);
        if (i0a0Var.f97188g) {
            jMin = zM81205i ? this.f222304k : this.f222303j;
        } else {
            jMin = zM81205i ? this.f222302i : this.f222301h;
        }
        long j = i0a0Var.f97189h;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin <= 0 || jM46282J >= jMin) {
            return true;
        }
        if (!(zM81205i ? this.f222306m : false)) {
            sop sopVar = (sop) this.f222309p.get(w9p0Var);
            sopVar.getClass();
            synchronized (sopVar) {
                i = sopVar.f212627d;
            }
            int i2 = i * this.f222296c.f170742a;
            sop sopVar2 = (sop) this.f222309p.get(w9p0Var);
            sopVar2.getClass();
            if (i2 >= sopVar2.f212626c) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.j0a0
    /* JADX INFO: renamed from: d */
    public void mo41358d(w9p0 w9p0Var) {
        m81206j(w9p0Var);
        if (this.f222309p.isEmpty()) {
            this.f222310q = -1L;
        }
    }

    @Override // p204p.j0a0
    /* JADX INFO: renamed from: e */
    public void mo41359e(w9p0 w9p0Var) {
        m81206j(w9p0Var);
    }

    @Override // p204p.j0a0
    /* JADX INFO: renamed from: f */
    public void mo41360f(i0a0 i0a0Var, lf81 lf81Var, xjx[] xjxVarArr) {
        w9p0 w9p0Var = i0a0Var.f97182a;
        Integer num = (Integer) this.f222308o.get(w9p0Var.f249229a);
        int iIntValue = (num == null || num.intValue() == -1) ? this.f222305l : num.intValue();
        sop sopVar = (sop) this.f222309p.get(w9p0Var);
        sopVar.getClass();
        if (iIntValue == -1) {
            iIntValue = m81204h(i0a0Var, xjxVarArr);
        }
        sopVar.f212626c = iIntValue;
        m81207k();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: h */
    public final int m81204h(i0a0 i0a0Var, xjx[] xjxVarArr) {
        boolean zM81205i = m81205i(i0a0Var);
        int length = xjxVarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i >= length) {
                return h0b1.m46317j(i2, 13107200, 210239488);
            }
            xjx xjxVar = xjxVarArr[i];
            if (xjxVar != null) {
                switch (xjxVar.mo34618n().f122101c) {
                    case SplitInstallErrorCode.MODULE_UNAVAILABLE /* -2 */:
                        i3 = 0;
                        i2 += i3;
                        break;
                    case -1:
                    case 1:
                        i2 += i3;
                        break;
                    case 0:
                        i3 = 144310272;
                        i2 += i3;
                        break;
                    case 2:
                        i3 = zM81205i ? 19660800 : 131072000;
                        i2 += i3;
                        break;
                    case 3:
                    case 5:
                    case 6:
                        i3 = 131072;
                        i2 += i3;
                        break;
                    case 4:
                        i3 = 26214400;
                        i2 += i3;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m81205i(i0a0 i0a0Var) {
        qp71 qp71Var = i0a0Var.f97183b;
        ofd0 ofd0Var = qp71Var.mo26654n(qp71Var.mo46978g(i0a0Var.f97184c.f244408a, this.f222295b).f29345c, this.f222294a, 0L).f145928c.f229763b;
        if (ofd0Var == null) {
            return false;
        }
        String scheme = ofd0Var.f164727a.getScheme();
        return TextUtils.isEmpty(scheme) || f222293r.contains(scheme);
    }

    /* JADX INFO: renamed from: j */
    public final void m81206j(w9p0 w9p0Var) {
        ConcurrentHashMap concurrentHashMap = this.f222309p;
        sop sopVar = (sop) concurrentHashMap.get(w9p0Var);
        if (sopVar != null) {
            int i = sopVar.f212624a - 1;
            sopVar.f212624a = i;
            if (i == 0) {
                concurrentHashMap.remove(w9p0Var);
                m81207k();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m81207k() {
        int i = 0;
        if (this.f222309p.isEmpty()) {
            owo owoVar = this.f222296c;
            synchronized (owoVar) {
                if (owoVar.f170746e) {
                    owoVar.m68177g(0);
                }
            }
            return;
        }
        owo owoVar2 = this.f222296c;
        Iterator it = this.f222309p.values().iterator();
        while (it.hasNext()) {
            i += ((sop) it.next()).f212626c;
        }
        owoVar2.m68177g(i);
    }

    public top(owo owoVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        m81203g(i5, "bufferForPlaybackMs", 0, "0");
        m81203g(i6, "bufferForPlaybackForLocalPlaybackMs", 0, "0");
        m81203g(i7, "bufferForPlaybackAfterRebufferMs", 0, "0");
        m81203g(i8, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", 0, "0");
        m81203g(i, "minBufferMs", i5, "bufferForPlaybackMs");
        m81203g(i2, "minBufferForLocalPlaybackMs", i6, "bufferForPlaybackForLocalPlaybackMs");
        m81203g(i, "minBufferMs", i7, "bufferForPlaybackAfterRebufferMs");
        m81203g(i2, "minBufferForLocalPlaybackMs", i8, "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        m81203g(i3, "maxBufferMs", i, "minBufferMs");
        m81203g(i4, "maxBufferForLocalPlaybackMs", i2, "minBufferForLocalPlaybackMs");
        m81203g(i9, "backBufferDurationMs", 0, "0");
        this.f222294a = new mp71();
        this.f222295b = new bp71();
        this.f222296c = owoVar;
        this.f222297d = h0b1.m46295W(i);
        this.f222298e = h0b1.m46295W(i2);
        this.f222299f = h0b1.m46295W(i3);
        this.f222300g = h0b1.m46295W(i4);
        this.f222301h = h0b1.m46295W(i5);
        this.f222302i = h0b1.m46295W(i6);
        this.f222303j = h0b1.m46295W(i7);
        this.f222304k = h0b1.m46295W(i8);
        this.f222305l = -1;
        this.f222306m = true;
        this.f222307n = h0b1.m46295W(i9);
        this.f222309p = new ConcurrentHashMap();
        this.f222308o = xf40.m90451c(btv0.f30940g);
        this.f222310q = -1L;
    }
}
