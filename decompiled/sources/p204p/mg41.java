package p204p;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class mg41 {

    /* JADX INFO: renamed from: p */
    public static final tls f143310p = new tls(1);

    /* JADX INFO: renamed from: q */
    public static final tls f143311q = new tls(2);

    /* JADX INFO: renamed from: r */
    public static final tls f143312r = new tls(3);

    /* JADX INFO: renamed from: s */
    public static final tls f143313s = new tls(4);

    /* JADX INFO: renamed from: t */
    public static final tls f143314t = new tls(5);

    /* JADX INFO: renamed from: u */
    public static final tls f143315u = new tls(0);

    /* JADX INFO: renamed from: a */
    public float f143316a;

    /* JADX INFO: renamed from: b */
    public float f143317b;

    /* JADX INFO: renamed from: c */
    public boolean f143318c;

    /* JADX INFO: renamed from: d */
    public final h4r f143319d;

    /* JADX INFO: renamed from: e */
    public final mvf1 f143320e;

    /* JADX INFO: renamed from: f */
    public boolean f143321f;

    /* JADX INFO: renamed from: g */
    public float f143322g;

    /* JADX INFO: renamed from: h */
    public float f143323h;

    /* JADX INFO: renamed from: i */
    public long f143324i;

    /* JADX INFO: renamed from: j */
    public float f143325j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f143326k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f143327l;

    /* JADX INFO: renamed from: m */
    public ng41 f143328m;

    /* JADX INFO: renamed from: n */
    public float f143329n;

    /* JADX INFO: renamed from: o */
    public boolean f143330o;

    public mg41(vi5 vi5Var) {
        this.f143316a = 0.0f;
        this.f143317b = Float.MAX_VALUE;
        this.f143318c = false;
        this.f143321f = false;
        this.f143322g = Float.MAX_VALUE;
        this.f143323h = -3.4028235E38f;
        this.f143324i = 0L;
        this.f143326k = new ArrayList();
        this.f143327l = new ArrayList();
        this.f143319d = null;
        this.f143320e = new uls(vi5Var);
        this.f143325j = 1.0f;
        this.f143328m = null;
        this.f143329n = Float.MAX_VALUE;
        this.f143330o = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m61688a(float f) {
        if (this.f143321f) {
            this.f143329n = f;
            return;
        }
        if (this.f143328m == null) {
            this.f143328m = new ng41(f);
        }
        this.f143328m.f153558i = f;
        m61692e();
    }

    /* JADX INFO: renamed from: b */
    public final void m61689b(boolean z) {
        ArrayList arrayList;
        int i = 0;
        this.f143321f = false;
        ThreadLocal threadLocal = vz4.f246377f;
        if (threadLocal.get() == null) {
            threadLocal.set(new vz4());
        }
        vz4 vz4Var = (vz4) threadLocal.get();
        vz4Var.f246378a.remove(this);
        ArrayList arrayList2 = vz4Var.f246379b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            vz4Var.f246382e = true;
        }
        this.f143324i = 0L;
        this.f143318c = false;
        while (true) {
            arrayList = this.f143326k;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((wls) arrayList.get(i)).mo40228a(this, z, this.f143317b);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m61690c(float f) {
        ArrayList arrayList;
        this.f143320e.mo43544n(this.f143319d, f);
        int i = 0;
        while (true) {
            arrayList = this.f143327l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((xls) arrayList.get(i)).mo37204h(this.f143317b);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m61691d() {
        if (this.f143328m.f153551b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f143321f) {
            this.f143330o = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m61692e() {
        ng41 ng41Var = this.f143328m;
        if (ng41Var == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) ng41Var.f153558i;
        if (d > this.f143322g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d < this.f143323h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f143325j * 0.75f);
        ng41Var.f153553d = dAbs;
        ng41Var.f153554e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.f143321f;
        if (z || z) {
            return;
        }
        this.f143321f = true;
        if (!this.f143318c) {
            this.f143317b = this.f143320e.mo43543j(this.f143319d);
        }
        float f = this.f143317b;
        if (f > this.f143322g || f < this.f143323h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = vz4.f246377f;
        if (threadLocal.get() == null) {
            threadLocal.set(new vz4());
        }
        vz4 vz4Var = (vz4) threadLocal.get();
        ArrayList arrayList = vz4Var.f246379b;
        if (arrayList.size() == 0) {
            if (vz4Var.f246381d == null) {
                vz4Var.f246381d = new ood0(vz4Var.f246380c);
            }
            ood0 ood0Var = vz4Var.f246381d;
            ((Choreographer) ood0Var.f167566c).postFrameCallback((uz4) ood0Var.f167567d);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public mg41(h4r h4rVar) {
        g4r g4rVar = h4r.f87628O0;
        this.f143316a = 0.0f;
        this.f143317b = Float.MAX_VALUE;
        this.f143318c = false;
        this.f143321f = false;
        this.f143322g = Float.MAX_VALUE;
        this.f143323h = -3.4028235E38f;
        this.f143324i = 0L;
        this.f143326k = new ArrayList();
        this.f143327l = new ArrayList();
        this.f143319d = h4rVar;
        this.f143320e = g4rVar;
        if (g4rVar != f143312r && g4rVar != f143313s && g4rVar != f143314t) {
            if (g4rVar != f143315u && g4rVar != f143310p && g4rVar != f143311q) {
                this.f143325j = 1.0f;
            } else {
                this.f143325j = 0.00390625f;
            }
        } else {
            this.f143325j = 0.1f;
        }
        this.f143328m = null;
        this.f143329n = Float.MAX_VALUE;
        this.f143330o = false;
    }
}
