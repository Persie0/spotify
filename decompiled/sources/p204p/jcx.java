package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;

/* JADX INFO: loaded from: classes8.dex */
public final class jcx implements Producer {

    /* JADX INFO: renamed from: a */
    public static final jcx f111198a = new jcx();

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
        return new ImmediateWorkRunner();
    }
}
