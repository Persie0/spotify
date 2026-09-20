package p204p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class y2f implements Function {

    /* JADX INFO: renamed from: a */
    public final List f268600a;

    public y2f(List list) {
        this.f268600a = list;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return kkc0.m56705r0(g6f.m43746s1(this.f268600a, ((CollectionPlatformEsperantoContainsResponse) obj).m6873o().m6864p()));
    }

    public y2f() {
        this.f268600a = h6f.m46715L(new mi5(1), new mi5(0), new mi5(2), new mi5(3), new mi5(4));
    }
}
