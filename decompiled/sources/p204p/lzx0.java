package p204p;

import com.spotify.mobius.Connection;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class lzx0 implements Connection, gh00 {

    /* JADX INFO: renamed from: a */
    public final gh00 f138467a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f138468b = new AtomicBoolean(true);

    public lzx0(gh00 gh00Var) {
        this.f138467a = gh00Var;
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        if (this.f138468b.get()) {
            this.f138467a.invoke(obj);
        }
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        this.f138468b.set(false);
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        if (this.f138468b.get()) {
            this.f138467a.invoke(obj);
        }
        return w2a1.f247311a;
    }
}
