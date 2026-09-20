package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.BottomSheetTemplate;

/* JADX INFO: loaded from: classes8.dex */
public final class cfa extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dfa f37315a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfa(dfa dfaVar) {
        super(1);
        this.f37315a = dfaVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        MessageResponseToken messageResponseToken;
        Bundle bundle = (Bundle) obj;
        dfa dfaVar = this.f37315a;
        if (bundle == null || (messageResponseToken = (MessageResponseToken) bundle.getParcelable("messaging_bottomsheet_token")) == null) {
            messageResponseToken = dfaVar.f48539b.f250772a;
        }
        dfaVar.f48547j = messageResponseToken;
        return new vfa(messageResponseToken, (BottomSheetTemplate) lq51.m59702h(messageResponseToken), false);
    }
}
