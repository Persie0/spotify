package p204p;

import android.net.Uri;
import android.view.animation.Interpolator;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class gd30 implements SingleTransformer {

    /* JADX INFO: renamed from: a */
    public long f78717a;

    /* JADX INFO: renamed from: b */
    public boolean f78718b;

    /* JADX INFO: renamed from: c */
    public final Object f78719c;

    /* JADX INFO: renamed from: d */
    public Object f78720d;

    /* JADX INFO: renamed from: e */
    public Object f78721e;

    /* JADX INFO: renamed from: f */
    public Object f78722f;

    public gd30(gh00 gh00Var, xre xreVar) {
        this.f78719c = gh00Var;
        this.f78720d = xreVar;
    }

    @Override // io.reactivex.rxjava3.core.SingleTransformer
    /* JADX INFO: renamed from: V */
    public Single mo23389V(Single single) {
        return single.flatMap(new mm90(this, 22));
    }

    /* JADX INFO: renamed from: a */
    public void m44331a() {
        if (this.f78718b) {
            Iterator it = ((ArrayList) this.f78719c).iterator();
            while (it.hasNext()) {
                ((zkc1) it.next()).m96314c();
            }
            this.f78718b = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m44332b(String str, int i, boolean z, boolean z2) {
        int i2;
        gh00 gh00Var = (gh00) this.f78719c;
        Float f = (Float) this.f78721e;
        Float f2 = (Float) this.f78722f;
        boolean z3 = this.f78718b;
        this.f78718b = false;
        this.f78721e = null;
        this.f78722f = null;
        Set set = cf30.f37246a;
        if (z2) {
            i2 = 2;
        } else {
            i2 = (z3 && z) ? 1 : 3;
        }
        int i3 = i2;
        String scheme = Uri.parse(str).getScheme();
        if (!g6f.m43725i0(cf30.f37246a, scheme != null ? scheme.toLowerCase(Locale.ROOT) : null)) {
            gh00Var.invoke(new re30(str, 1, i3, i, f, f2));
            return;
        }
        if (!z || !z3) {
            gh00Var.invoke(new re30(str, 2, i3, i, f, f2));
            return;
        }
        ((wy3) ((xre) this.f78720d)).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f78717a < 500) {
            gh00Var.invoke(new re30(str, 3, i3, i, f, f2));
        } else {
            this.f78717a = jCurrentTimeMillis;
            gh00Var.invoke(new oe30(str, i3, i, f, f2));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m44333c() {
        if (this.f78718b) {
            return;
        }
        for (zkc1 zkc1Var : (ArrayList) this.f78719c) {
            long j = this.f78717a;
            if (j >= 0) {
                zkc1Var.m96315d(j);
            }
            Interpolator interpolator = (Interpolator) this.f78720d;
            if (interpolator != null) {
                zkc1Var.m96316e(interpolator);
            }
            if (((alc1) this.f78721e) != null) {
                zkc1Var.m96317f((m281) this.f78722f);
            }
            zkc1Var.m96318g();
        }
        this.f78718b = true;
    }

    public gd30() {
        this.f78717a = -1L;
        this.f78722f = new m281(this);
        this.f78719c = new ArrayList();
    }

    public gd30(v3j0 v3j0Var, String str, long j, fus0 fus0Var, jj4 jj4Var, boolean z) {
        this.f78719c = v3j0Var;
        this.f78720d = str;
        this.f78717a = j;
        this.f78721e = fus0Var;
        this.f78722f = jj4Var;
        this.f78718b = z;
    }
}
