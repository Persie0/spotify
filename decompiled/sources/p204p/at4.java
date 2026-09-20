package p204p;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes3.dex */
public final class at4 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hqb f19591a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f19592b;

    public at4(hqb hqbVar, ct4 ct4Var, gh00 gh00Var) {
        this.f19591a = hqbVar;
        this.f19592b = gh00Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object c6x0Var;
        try {
            c6x0Var = this.f19592b.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        this.f19591a.resumeWith(c6x0Var);
    }
}
