package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes7.dex */
public final class w71 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ y71 f248511a;

    public w71(y71 y71Var) {
        this.f248511a = y71Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f248511a.f269932b);
    }
}
