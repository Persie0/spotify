package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class s700 implements x7l0, x700 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f206249a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f206250b;

    /* JADX INFO: renamed from: c */
    public final WeakReference f206251c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f206252d;

    /* JADX INFO: renamed from: e */
    public WeakReference f206253e = new WeakReference(null);

    /* JADX INFO: renamed from: f */
    public int f206254f;

    public s700(WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3, WeakReference weakReference4) {
        this.f206249a = weakReference;
        this.f206250b = weakReference2;
        this.f206251c = weakReference3;
        this.f206252d = weakReference4;
    }

    /* JADX INFO: renamed from: a */
    public final void m77353a() {
        i500 i500Var = (i500) this.f206249a.get();
        if (i500Var == null) {
            return;
        }
        q700 q700VarM96015d = zfg1.m96015d(i500Var, (i500) this.f206253e.get(), (l5j0) this.f206251c.get(), this.f206254f);
        ObservableEmitter observableEmitter = (ObservableEmitter) this.f206250b.get();
        if (observableEmitter != null) {
            observableEmitter.onNext(q700VarM96015d);
        }
    }

    @Override // p204p.x7l0
    /* JADX INFO: renamed from: b */
    public final void mo24810b(String str, i500 i500Var) {
        this.f206253e = new WeakReference(i500Var);
        m77353a();
    }

    @Override // p204p.x700
    /* JADX INFO: renamed from: c */
    public final void mo43791c(i500 i500Var) {
        p7j0 p7j0Var;
        i500 i500Var2 = (i500) this.f206249a.get();
        if (!(i500Var instanceof ugr) || i500Var == i500Var2) {
            return;
        }
        this.f206254f++;
        WeakReference weakReference = this.f206252d;
        if (weakReference != null && (p7j0Var = (p7j0) weakReference.get()) != null) {
            p7j0Var.f174709c.onNext(Boolean.TRUE);
        }
        m77353a();
        i500Var.f98716q1.mo31986a(new dz2(this, 7));
    }
}
