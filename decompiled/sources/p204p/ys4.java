package p204p;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ys4 extends luk {

    /* JADX INFO: renamed from: Y */
    public final ct4 f275673Y;

    /* JADX INFO: renamed from: c */
    public final Choreographer f275674c;

    /* JADX INFO: renamed from: d */
    public final Handler f275675d;

    /* JADX INFO: renamed from: i */
    public boolean f275680i;

    /* JADX INFO: renamed from: t */
    public boolean f275681t;

    /* JADX INFO: renamed from: Z */
    public static final wg61 f275671Z = new wg61(l12.f128585a1);

    /* JADX INFO: renamed from: L0 */
    public static final q32 f275670L0 = new q32(7);

    /* JADX INFO: renamed from: e */
    public final Object f275676e = new Object();

    /* JADX INFO: renamed from: f */
    public final hj5 f275677f = new hj5();

    /* JADX INFO: renamed from: g */
    public ArrayList f275678g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public ArrayList f275679h = new ArrayList();

    /* JADX INFO: renamed from: X */
    public final ws4 f275672X = new ws4(this);

    public ys4(Choreographer choreographer, Handler handler) {
        this.f275674c = choreographer;
        this.f275675d = handler;
        this.f275673Y = new ct4(choreographer, this);
    }

    /* JADX INFO: renamed from: U */
    public static final void m94428U(ys4 ys4Var) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (ys4Var.f275676e) {
                hj5 hj5Var = ys4Var.f275677f;
                runnable = (Runnable) (hj5Var.isEmpty() ? null : hj5Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (ys4Var.f275676e) {
                    hj5 hj5Var2 = ys4Var.f275677f;
                    runnable = (Runnable) (hj5Var2.isEmpty() ? null : hj5Var2.removeFirst());
                }
            }
            synchronized (ys4Var.f275676e) {
                if (ys4Var.f275677f.isEmpty()) {
                    z = false;
                    ys4Var.f275680i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: r */
    public final void mo30646r(juk jukVar, Runnable runnable) {
        synchronized (this.f275676e) {
            this.f275677f.addLast(runnable);
            if (!this.f275680i) {
                this.f275680i = true;
                this.f275675d.post(this.f275672X);
                if (!this.f275681t) {
                    this.f275681t = true;
                    this.f275674c.postFrameCallback(this.f275672X);
                }
            }
        }
    }
}
