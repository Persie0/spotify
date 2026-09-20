package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes7.dex */
public final class x71 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ y71 f258788a;

    public x71(y71 y71Var) {
        this.f258788a = y71Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f258788a.f269933c);
    }
}
