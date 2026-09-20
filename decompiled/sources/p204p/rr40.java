package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class rr40 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vr40 f201951a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MessageResponseToken f201952b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hc80 f201953c;

    public rr40(vr40 vr40Var, MessageResponseToken messageResponseToken, hc80 hc80Var) {
        this.f201951a = vr40Var;
        this.f201952b = messageResponseToken;
        this.f201953c = hc80Var;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        vr40 vr40Var = this.f201951a;
        LinkedHashMap linkedHashMap = vr40Var.f244080f;
        MessageResponseToken messageResponseToken = this.f201952b;
        linkedHashMap.remove(messageResponseToken.getRequestId());
        ((lal0) vr40Var.f244078d).m58572a(messageResponseToken, DismissReason.ContextChanged.INSTANCE);
        this.f201953c.getLifecycle().mo31988d(this);
    }
}
