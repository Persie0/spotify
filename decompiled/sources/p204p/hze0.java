package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public interface hze0 {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m49265b(hze0 hze0Var, MessageResponseToken messageResponseToken, Button button, Bundle bundle, int i) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        hze0Var.mo39819h(bundle, DismissType.ActionDeterminedDismiss.INSTANCE, messageResponseToken, button);
    }

    /* JADX INFO: renamed from: a */
    void mo39813a(MessageResponseToken messageResponseToken, DiscardReason.PresentationFailed presentationFailed);

    /* JADX INFO: renamed from: c */
    void mo39814c(MessageResponseToken messageResponseToken);

    /* JADX INFO: renamed from: d */
    void mo39815d(Set set);

    /* JADX INFO: renamed from: e */
    void mo39816e();

    /* JADX INFO: renamed from: f */
    void mo39817f(MessageResponseToken messageResponseToken, Button button);

    /* JADX INFO: renamed from: g */
    void mo39818g(MessageResponseToken messageResponseToken);

    /* JADX INFO: renamed from: h */
    void mo39819h(Bundle bundle, DismissType dismissType, MessageResponseToken messageResponseToken, Button button);

    /* JADX INFO: renamed from: i */
    void mo39820i(int i);

    /* JADX INFO: renamed from: j */
    void mo39821j(MessageResponseToken messageResponseToken);

    /* JADX INFO: renamed from: k */
    void mo39822k();

    /* JADX INFO: renamed from: l */
    void mo39823l(MessageResponseToken messageResponseToken);
}
