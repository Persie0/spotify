package p204p;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class est0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final Context f62465a;

    /* JADX INFO: renamed from: b */
    public final n6q f62466b;

    /* JADX INFO: renamed from: c */
    public final zc21 f62467c;

    /* JADX INFO: renamed from: d */
    public final lyh f62468d;

    /* JADX INFO: renamed from: e */
    public final c4b0 f62469e;

    /* JADX INFO: renamed from: f */
    public final w54 f62470f;

    /* JADX INFO: renamed from: g */
    public final boolean f62471g;

    /* JADX INFO: renamed from: h */
    public final yum0 f62472h;

    /* JADX INFO: renamed from: i */
    public boolean f62473i;

    /* JADX INFO: renamed from: j */
    public pr0 f62474j;

    /* JADX INFO: renamed from: k */
    public final Handler f62475k;

    /* JADX INFO: renamed from: l */
    public final cjs0 f62476l;

    /* JADX INFO: renamed from: m */
    public final n890 f62477m;

    /* JADX INFO: renamed from: n */
    public final wg61 f62478n;

    public est0(Context context, n6q n6qVar, zc21 zc21Var, lyh lyhVar, c4b0 c4b0Var, krt0 krt0Var, w54 w54Var) {
        this.f62465a = context;
        this.f62466b = n6qVar;
        this.f62467c = zc21Var;
        this.f62468d = lyhVar;
        this.f62469e = c4b0Var;
        this.f62470f = w54Var;
        boolean z = krt0Var.m57172c() == 2;
        this.f62471g = z;
        this.f62472h = sam.m77645B(Boolean.valueOf(!z || n6qVar.f150936a.mo33098e() == bda.f26062b));
        this.f62473i = z;
        this.f62475k = new Handler(Looper.getMainLooper());
        this.f62476l = new cjs0(this, 3);
        this.f62477m = new n890(new dst0(this, 1), new s4r0(this, 7), new s4r0(this, 8), new s4r0(this, 9), new s4r0(this, 10), z, m39917e(), new s4r0(this, 11));
        this.f62478n = new wg61(new dst0(this, 0));
    }

    /* JADX INFO: renamed from: c */
    public static final void m39915c(est0 est0Var) {
        if (est0Var.f62473i) {
            est0Var.m39916d();
            pr0 pr0Var = est0Var.f62474j;
            if (pr0Var != null) {
                pr0Var.invoke();
            }
            est0Var.f62474j = null;
            est0Var.f62473i = false;
            est0Var.f62472h.setValue(Boolean.TRUE);
            ((pfm0) est0Var.f62478n.getValue()).m69810a(new fda(Integer.valueOf((int) (est0Var.f62465a.getResources().getDisplayMetrics().heightPixels * 0.66f)), null, null, 1, null, est0Var.f62466b, false, false, false, 2006));
        }
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return (pfm0) this.f62478n.getValue();
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        if (this.f62471g) {
            pr0 pr0Var = this.f62474j;
            if (pr0Var != null) {
                pr0Var.invoke();
            }
            this.f62474j = this.f62466b.m63785d(new ast0(this, 3));
        }
        return this.f62467c.m95896a(new ast0(this, 0), new wc21(new cst0(this), new ast0(this, 1), qyq0.f194009e));
    }

    /* JADX INFO: renamed from: d */
    public final void m39916d() {
        this.f62475k.removeCallbacks(this.f62476l);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m39917e() {
        return this.f62471g && this.f62465a.getResources().getConfiguration().orientation != 2;
    }
}
