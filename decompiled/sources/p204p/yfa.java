package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class yfa implements qte0 {

    /* JADX INFO: renamed from: a */
    public final m500 f272187a;

    /* JADX INFO: renamed from: b */
    public final q0f0 f272188b;

    /* JADX INFO: renamed from: c */
    public final jal0 f272189c;

    /* JADX INFO: renamed from: d */
    public MessageResponseToken f272190d;

    public yfa(m500 m500Var, q0f0 q0f0Var, jal0 jal0Var) {
        this.f272187a = m500Var;
        this.f272188b = q0f0Var;
        this.f272189c = jal0Var;
    }

    @Override // p204p.qte0
    /* JADX INFO: renamed from: a */
    public final void mo27112a(MessageResponseToken messageResponseToken, gh00 gh00Var) {
        this.f272190d = messageResponseToken;
    }

    @Override // p204p.qte0
    /* JADX INFO: renamed from: b */
    public final void mo27113b(eh00 eh00Var) {
        MessageResponseToken messageResponseToken = this.f272190d;
        if (messageResponseToken != null) {
            x0h1.m89578u(n5h1.m63737m(this.f272187a), null, 0, new xfa(this, messageResponseToken.getMessageData().getLoggingData().getMessageId(), messageResponseToken.getMessageRequest().getInteractionLoggingResult(), messageResponseToken.getMessageRequest().getOrchestrationMetadata().f19404a, messageResponseToken.getMessageRequest().getOrchestrationMetadata().f19405b, messageResponseToken, null), 3);
        }
    }

    @Override // p204p.qte0
    public final void dismiss() {
        this.f272188b.m71812a();
    }
}
