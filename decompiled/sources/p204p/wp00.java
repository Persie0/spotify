package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes7.dex */
public final class wp00 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xp00 f253635a;

    public wp00(xp00 xp00Var) {
        this.f253635a = xp00Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f253635a.f264404b);
    }
}
