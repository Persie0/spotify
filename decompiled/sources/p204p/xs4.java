package p204p;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xs4 extends luk {

    /* JADX INFO: renamed from: Z */
    public static final wg61 f265470Z = new wg61(new ts4(0));

    /* JADX INFO: renamed from: Y */
    public final bt4 f265472Y;

    /* JADX INFO: renamed from: c */
    public final Choreographer f265473c;

    /* JADX INFO: renamed from: d */
    public final Handler f265474d;

    /* JADX INFO: renamed from: i */
    public boolean f265479i;

    /* JADX INFO: renamed from: t */
    public boolean f265480t;

    /* JADX INFO: renamed from: e */
    public final Object f265475e = new Object();

    /* JADX INFO: renamed from: f */
    public final hj5 f265476f = new hj5();

    /* JADX INFO: renamed from: g */
    public ArrayList f265477g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public ArrayList f265478h = new ArrayList();

    /* JADX INFO: renamed from: X */
    public final vs4 f265471X = new vs4(this);

    public xs4(Choreographer choreographer, Handler handler) {
        this.f265473c = choreographer;
        this.f265474d = handler;
        this.f265472Y = new bt4(choreographer);
    }

    /* JADX INFO: renamed from: U */
    public static final void m91962U(xs4 xs4Var) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (xs4Var.f265475e) {
                hj5 hj5Var = xs4Var.f265476f;
                runnable = (Runnable) (hj5Var.isEmpty() ? null : hj5Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (xs4Var.f265475e) {
                    hj5 hj5Var2 = xs4Var.f265476f;
                    runnable = (Runnable) (hj5Var2.isEmpty() ? null : hj5Var2.removeFirst());
                }
            }
            synchronized (xs4Var.f265475e) {
                if (xs4Var.f265476f.isEmpty()) {
                    z = false;
                    xs4Var.f265479i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: r */
    public final void mo30646r(juk jukVar, Runnable runnable) {
        synchronized (this.f265475e) {
            this.f265476f.addLast(runnable);
            if (!this.f265479i) {
                this.f265479i = true;
                this.f265474d.post(this.f265471X);
                if (!this.f265480t) {
                    this.f265480t = true;
                    this.f265473c.postFrameCallback(this.f265471X);
                }
            }
        }
    }
}
