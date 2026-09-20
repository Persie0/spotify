package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes2.dex */
public final class goh0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hoh0 f82962a;

    public goh0(hoh0 hoh0Var) {
        this.f82962a = hoh0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f82962a.f93543d);
    }
}
