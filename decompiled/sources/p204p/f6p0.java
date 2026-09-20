package p204p;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.C0067a;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class f6p0 implements gyb1 {

    /* JADX INFO: renamed from: B */
    public static final qgq f66455B = new qgq();

    /* JADX INFO: renamed from: A */
    public int f66456A;

    /* JADX INFO: renamed from: a */
    public final Context f66457a;

    /* JADX INFO: renamed from: b */
    public final oci0 f66458b;

    /* JADX INFO: renamed from: c */
    public final SparseArray f66459c;

    /* JADX INFO: renamed from: d */
    public final boolean f66460d;

    /* JADX INFO: renamed from: e */
    public final C0067a f66461e;

    /* JADX INFO: renamed from: f */
    public final y5p0 f66462f;

    /* JADX INFO: renamed from: g */
    public final gh61 f66463g;

    /* JADX INFO: renamed from: h */
    public final CopyOnWriteArraySet f66464h;

    /* JADX INFO: renamed from: i */
    public final long f66465i;

    /* JADX INFO: renamed from: j */
    public final zxb1 f66466j;

    /* JADX INFO: renamed from: k */
    public w780 f66467k = new w780(10, (byte) 0);

    /* JADX INFO: renamed from: l */
    public r300 f66468l;

    /* JADX INFO: renamed from: m */
    public final pmr0 f66469m;

    /* JADX INFO: renamed from: n */
    public final wsv0 f66470n;

    /* JADX INFO: renamed from: o */
    public kh61 f66471o;

    /* JADX INFO: renamed from: p */
    public hyb1 f66472p;

    /* JADX INFO: renamed from: q */
    public oxb1 f66473q;

    /* JADX INFO: renamed from: r */
    public long f66474r;

    /* JADX INFO: renamed from: s */
    public int f66475s;

    /* JADX INFO: renamed from: t */
    public Pair f66476t;

    /* JADX INFO: renamed from: u */
    public int f66477u;

    /* JADX INFO: renamed from: v */
    public int f66478v;

    /* JADX INFO: renamed from: w */
    public long f66479w;

    /* JADX INFO: renamed from: x */
    public long f66480x;

    /* JADX INFO: renamed from: y */
    public boolean f66481y;

    /* JADX INFO: renamed from: z */
    public int f66482z;

    public f6p0(z5p0 z5p0Var) {
        this.f66457a = z5p0Var.f279597a;
        oci0 oci0Var = z5p0Var.f279599c;
        oci0Var.getClass();
        this.f66458b = oci0Var;
        this.f66459c = new SparseArray();
        kf40 kf40Var = pf40.f176960b;
        this.f66470n = wsv0.f254763e;
        this.f66469m = pmr0.f179210V0;
        this.f66460d = z5p0Var.f279600d;
        gh61 gh61Var = z5p0Var.f279601e;
        this.f66463g = gh61Var;
        long j = z5p0Var.f279603g;
        this.f66465i = j != -9223372036854775807L ? -j : -9223372036854775807L;
        zxb1 zxb1Var = z5p0Var.f279604h;
        this.f66466j = zxb1Var;
        this.f66461e = new C0067a(z5p0Var.f279598b, zxb1Var, gh61Var);
        this.f66462f = new y5p0(this);
        this.f66464h = new CopyOnWriteArraySet();
        this.f66468l = new r300(new p300());
        this.f66474r = -9223372036854775807L;
        this.f66479w = -9223372036854775807L;
        this.f66480x = -9223372036854775807L;
        this.f66482z = -1;
        this.f66478v = 0;
    }

    /* JADX INFO: renamed from: f */
    public static void m40870f(f6p0 f6p0Var, boolean z) {
        if (f6p0Var.f66478v == 1) {
            f6p0Var.f66477u++;
            f6p0Var.f66461e.mo797t(z);
            while (f6p0Var.f66467k.m87341M() > 1) {
                f6p0Var.f66467k.m87330B();
            }
            if (f6p0Var.f66467k.m87341M() == 1) {
                e6p0 e6p0Var = (e6p0) f6p0Var.f66467k.m87330B();
                e6p0Var.getClass();
                f6p0Var.f66474r = e6p0Var.f56683a;
                f6p0Var.f66475s = e6p0Var.f56684b;
                f6p0Var.m40877h();
            }
            f6p0Var.f66479w = -9223372036854775807L;
            if (z) {
                f6p0Var.f66480x = -9223372036854775807L;
                f6p0Var.f66481y = false;
            }
            kh61 kh61Var = f6p0Var.f66471o;
            kh61Var.getClass();
            kh61Var.m56388f(new ig10(f6p0Var, 23));
        }
    }

    @Override // p204p.gyb1
    /* JADX INFO: renamed from: a */
    public final void mo40871a(VideoFrameProcessingException videoFrameProcessingException) {
        for (c6p0 c6p0Var : this.f66464h) {
            c6p0Var.f34596i.execute(new kgd0(c6p0Var, c6p0Var.f34595h, videoFrameProcessingException, 10));
        }
    }

    @Override // p204p.gyb1
    /* JADX INFO: renamed from: b */
    public final void mo40872b(long j, boolean z) {
        if (this.f66477u > 0) {
            return;
        }
        for (c6p0 c6p0Var : this.f66464h) {
            g9c1 g9c1Var = c6p0Var.f34595h;
            Executor executor = c6p0Var.f34596i;
            Objects.requireNonNull(g9c1Var);
            executor.execute(new b6p0(g9c1Var, 0));
        }
        if (z) {
            oxb1 oxb1Var = this.f66473q;
            if (oxb1Var != null) {
                oxb1Var.mo33002a(j, -9223372036854775807L, this.f66468l, null);
                return;
            }
            return;
        }
        this.f66479w = j;
        e6p0 e6p0Var = (e6p0) this.f66467k.m87331C(j);
        if (e6p0Var != null) {
            this.f66474r = e6p0Var.f56683a;
            this.f66475s = e6p0Var.f56684b;
            m40877h();
        }
        y5p0 y5p0Var = this.f66462f;
        C0067a c0067a = this.f66461e;
        c0067a.mo785h(j, y5p0Var);
        long j2 = this.f66480x;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        c0067a.mo778a();
        this.f66481y = true;
    }

    @Override // p204p.gyb1
    /* JADX INFO: renamed from: c */
    public final void mo40873c(long j) {
        Iterator it = this.f66464h.iterator();
        while (it.hasNext()) {
            ((c6p0) it.next()).getClass();
        }
    }

    @Override // p204p.gyb1
    /* JADX INFO: renamed from: d */
    public final void mo40874d(int i, int i2) {
        p300 p300VarM74564a = this.f66468l.m74564a();
        p300VarM74564a.f173534v = i;
        p300VarM74564a.f173535w = i2;
        this.f66468l = new r300(p300VarM74564a);
        m40877h();
    }

    @Override // p204p.gyb1
    /* JADX INFO: renamed from: e */
    public final void mo40875e(float f) {
        p300 p300VarM74564a = this.f66468l.m74564a();
        p300VarM74564a.m68976c(f);
        this.f66468l = new r300(p300VarM74564a);
        m40877h();
    }

    /* JADX INFO: renamed from: g */
    public final void m40876g(Surface surface, int i, int i2) {
        hyb1 hyb1Var = this.f66472p;
        if (hyb1Var == null) {
            return;
        }
        C0067a c0067a = this.f66461e;
        if (surface != null) {
            hyb1Var.mo49171m(new w761(surface, i, i2, 0, false));
            c0067a.mo790m(surface, new di21(i, i2));
        } else {
            hyb1Var.mo49171m(null);
            c0067a.mo796s();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m40877h() {
        r300 r300Var = this.f66468l;
        long j = this.f66474r;
        int i = this.f66475s;
        kf40 kf40Var = pf40.f176960b;
        this.f66461e.mo792o(i, j, wsv0.f254763e, r300Var);
    }
}
