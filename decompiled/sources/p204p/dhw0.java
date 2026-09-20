package p204p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class dhw0 implements BiFunction, Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ContextTrack f49184a;

    public /* synthetic */ dhw0(ContextTrack contextTrack) {
        this.f49184a = contextTrack;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return new pqm0(this.f49184a.uri(), (bz31) obj);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        ContextTrack contextTrack = this.f49184a;
        wj50.m88279p(contextTrack);
        return new bhw0(contextTrack, ((u331) obj).f226265a, (fb3) obj2);
    }
}
