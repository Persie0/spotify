package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class fod1 extends vc21 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hod1 f71517a;

    public fod1(hod1 hod1Var) {
        this.f71517a = hod1Var;
    }

    @Override // p204p.vc21, p204p.hze0
    /* JADX INFO: renamed from: a */
    public final void mo39813a(MessageResponseToken messageResponseToken, DiscardReason.PresentationFailed presentationFailed) {
        hod1 hod1Var = this.f71517a;
        hod1Var.f93511c.m52842a(mwh0.m63059p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), presentationFailed);
        hod1Var.f93512d.m71812a();
    }
}
