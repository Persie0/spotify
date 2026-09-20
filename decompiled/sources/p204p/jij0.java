package p204p;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class jij0 {

    /* JADX INFO: renamed from: f */
    public static jij0 f112771f;

    /* JADX INFO: renamed from: a */
    public int f112772a;

    /* JADX INFO: renamed from: b */
    public boolean f112773b;

    /* JADX INFO: renamed from: c */
    public final Object f112774c;

    /* JADX INFO: renamed from: d */
    public final Object f112775d;

    /* JADX INFO: renamed from: e */
    public Object f112776e;

    public jij0(mqi0 mqi0Var, fzj fzjVar, gey[] geyVarArr, boolean z, int i) {
        this.f112776e = mqi0Var;
        this.f112774c = fzjVar;
        this.f112775d = geyVarArr;
        this.f112773b = z;
        this.f112772a = i;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized jij0 m53454a(Context context) {
        try {
            if (f112771f == null) {
                f112771f = new jij0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f112771f;
    }

    /* JADX INFO: renamed from: b */
    public i890 m53455b() {
        return (i890) ((fzj) this.f112774c).f75031b;
    }

    /* JADX INFO: renamed from: c */
    public int m53456c() {
        int i;
        synchronized (this.f112776e) {
            i = this.f112772a;
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public gey[] m53457d() {
        return (gey[]) this.f112775d;
    }

    /* JADX INFO: renamed from: e */
    public void m53458e(o35 o35Var, ev61 ev61Var) {
        ((r9w0) ((mqi0) this.f112776e).f146298c).accept(o35Var, ev61Var);
    }

    /* JADX INFO: renamed from: f */
    public vc61 m53459f() {
        if (this.f112773b) {
            return (vc61) ((wg61) this.f112775d).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m53460g(int i) {
        CopyOnWriteArrayList<iij0> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f112775d;
        for (iij0 iij0Var : copyOnWriteArrayList) {
            if (iij0Var.f102595a.get() == null) {
                copyOnWriteArrayList.remove(iij0Var);
            }
        }
        synchronized (this.f112776e) {
            try {
                if (this.f112773b && this.f112772a == i) {
                    return;
                }
                this.f112773b = true;
                this.f112772a = i;
                for (iij0 iij0Var2 : (CopyOnWriteArrayList) this.f112775d) {
                    iij0Var2.f102596b.execute(new ig10(iij0Var2, 22));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public int m53461h() {
        return this.f112772a;
    }

    public jij0(Context context, int i) {
        this.f112774c = context;
        this.f112772a = i;
        this.f112775d = new wg61(new cd61(this, 2));
        this.f112776e = uv51.f234345M0;
    }

    public jij0(Context context) {
        Executor executorM42077t = fm8.m42077t();
        this.f112774c = executorM42077t;
        this.f112775d = new CopyOnWriteArrayList();
        this.f112776e = new Object();
        this.f112772a = 0;
        executorM42077t.execute(new mpd0(8, this, context));
    }

    public jij0(so80 so80Var, List list, int i, b450 b450Var, boolean z) {
        this.f112774c = so80Var;
        this.f112775d = list;
        this.f112772a = i;
        this.f112776e = b450Var;
        this.f112773b = z;
    }
}
