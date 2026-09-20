package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class w381 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b481 f247522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pqm0 f247523b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w381(pqm0 pqm0Var, b481 b481Var) {
        super(0);
        this.f247522a = b481Var;
        this.f247523b = pqm0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        b481 b481Var = this.f247522a;
        ((lal0) b481Var.f23251d).m58572a((MessageResponseToken) this.f247523b.f180350a, DismissReason.BackgroundViewTapped.INSTANCE);
        b481Var.m28076d();
        return w2a1.f247311a;
    }
}
