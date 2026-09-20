package p204p;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class rb20 extends luk implements tkq {

    /* JADX INFO: renamed from: c */
    public final Handler f197425c;

    /* JADX INFO: renamed from: d */
    public final String f197426d;

    /* JADX INFO: renamed from: e */
    public final boolean f197427e;

    /* JADX INFO: renamed from: f */
    public final rb20 f197428f;

    public rb20(Handler handler, String str, boolean z) {
        this.f197425c = handler;
        this.f197426d = str;
        this.f197427e = z;
        this.f197428f = z ? this : new rb20(handler, str, true);
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: P */
    public final boolean mo30645P(juk jukVar) {
        return (this.f197427e && wj50.m88271j(Looper.myLooper(), this.f197425c.getLooper())) ? false : true;
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: Q */
    public luk mo40637Q(int i) {
        jh3.m53313d(i);
        return this;
    }

    /* JADX INFO: renamed from: U */
    public final void m75131U(juk jukVar, Runnable runnable) {
        qlg1.m73210o(jukVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        n5q n5qVar = xsr.f265651a;
        tlp.f221498c.mo30646r(jukVar, runnable);
    }

    @Override // p204p.tkq
    /* JADX INFO: renamed from: c */
    public final void mo38885c(long j, hqb hqbVar) {
        zaz zazVar = new zaz(2, hqbVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f197425c.postDelayed(zazVar, j)) {
            hqbVar.mo42415l(new C1926h6(21, this, zazVar));
        } else {
            m75131U(hqbVar.f94086e, zazVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rb20)) {
            return false;
        }
        rb20 rb20Var = (rb20) obj;
        return rb20Var.f197425c == this.f197425c && rb20Var.f197427e == this.f197427e;
    }

    @Override // p204p.tkq
    /* JADX INFO: renamed from: g */
    public final hwr mo38886g(long j, final Runnable runnable, juk jukVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f197425c.postDelayed(runnable, j)) {
            return new hwr() { // from class: p.qb20
                @Override // p204p.hwr
                public final void dispose() {
                    this.f186982a.f197425c.removeCallbacks(runnable);
                }
            };
        }
        m75131U(jukVar, runnable);
        return unj0.f232184a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f197425c) ^ (this.f197427e ? 1231 : 1237);
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: r */
    public final void mo30646r(juk jukVar, Runnable runnable) {
        if (this.f197425c.post(runnable)) {
            return;
        }
        m75131U(jukVar, runnable);
    }

    @Override // p204p.luk
    public final String toString() {
        rb20 rb20Var;
        String str;
        n5q n5qVar = xsr.f265651a;
        rb20 rb20Var2 = pvb0.f181680a;
        if (this == rb20Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                rb20Var = rb20Var2.f197428f;
            } catch (UnsupportedOperationException unused) {
                rb20Var = null;
            }
            str = this == rb20Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f197426d;
        if (string == null) {
            string = this.f197425c.toString();
        }
        return this.f197427e ? s571.m77250i(string, ".immediate") : string;
    }

    public rb20(Handler handler) {
        this(handler, null, false);
    }
}
