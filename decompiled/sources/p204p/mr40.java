package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mr40 {
    /* JADX INFO: renamed from: a */
    public static final void m62618a(DismissReason dismissReason, gh00 gh00Var, gh00 gh00Var2) {
        if (dismissReason instanceof DismissReason.MessageButtonTapped) {
            DismissReason.MessageButtonTapped messageButtonTapped = (DismissReason.MessageButtonTapped) dismissReason;
            if (messageButtonTapped.getButton().isCloseButton()) {
                gh00Var.invoke(messageButtonTapped.getButton());
            } else {
                gh00Var2.invoke(messageButtonTapped.getButton());
            }
        }
    }
}
