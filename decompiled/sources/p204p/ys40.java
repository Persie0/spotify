package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class ys40 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f275682a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ at40 f275683b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys40(at40 at40Var, int i) {
        super(0);
        this.f275682a = i;
        this.f275683b = at40Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f275682a) {
            case 0:
                this.f275683b.m27114c();
                return w2a1.f247311a;
            case 1:
                this.f275683b.m27114c();
                return w2a1.f247311a;
            default:
                at40 at40Var = this.f275683b;
                pqm0 pqm0Var = at40Var.f19598f;
                if (pqm0Var == null) {
                    throw new IllegalStateException("Message data must be bound before accessing the view.");
                }
                return new bt40(at40Var.f19593a, at40Var.f19597e, new zs40(at40Var), (MessageResponseToken) pqm0Var.f180350a);
        }
    }
}
