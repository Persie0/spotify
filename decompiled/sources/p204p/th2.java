package p204p;

import com.spotify.mobius.Connection;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes2.dex */
public final class th2 implements Connection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vh2 f220309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Disposable f220310b;

    public th2(vh2 vh2Var, Disposable disposable) {
        this.f220309a = vh2Var;
        this.f220310b = disposable;
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        vh2.m85504d(this.f220309a, (ic2) obj);
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        this.f220310b.dispose();
    }
}
