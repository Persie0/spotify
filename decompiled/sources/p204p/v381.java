package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class v381 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b481 f236810a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pqm0 f236811b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v381(pqm0 pqm0Var, b481 b481Var) {
        super(1);
        this.f236810a = b481Var;
        this.f236811b = pqm0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        b481 b481Var = this.f236810a;
        ((lal0) b481Var.f23251d).m58572a((MessageResponseToken) this.f236811b.f180350a, DismissReason.MessageSwiped.INSTANCE);
        b481Var.m28076d();
        return w2a1.f247311a;
    }
}
