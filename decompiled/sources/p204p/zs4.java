package p204p;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class zs4 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hqb f285836a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f285837b;

    public zs4(hqb hqbVar, bt4 bt4Var, gh00 gh00Var) {
        this.f285836a = hqbVar;
        this.f285837b = gh00Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object c6x0Var;
        try {
            c6x0Var = this.f285837b.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        this.f285836a.resumeWith(c6x0Var);
    }
}
