package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class mth0 implements qte0 {

    /* JADX INFO: renamed from: a */
    public final m500 f147080a;

    /* JADX INFO: renamed from: b */
    public final q0f0 f147081b;

    /* JADX INFO: renamed from: c */
    public final jal0 f147082c;

    /* JADX INFO: renamed from: d */
    public MessageResponseToken f147083d;

    public mth0(m500 m500Var, q0f0 q0f0Var, jal0 jal0Var) {
        this.f147080a = m500Var;
        this.f147081b = q0f0Var;
        this.f147082c = jal0Var;
    }

    @Override // p204p.qte0
    /* JADX INFO: renamed from: a */
    public final void mo27112a(MessageResponseToken messageResponseToken, gh00 gh00Var) {
        this.f147083d = messageResponseToken;
    }

    @Override // p204p.qte0
    /* JADX INFO: renamed from: b */
    public final void mo27113b(eh00 eh00Var) {
        MessageResponseToken messageResponseToken = this.f147083d;
        if (messageResponseToken != null) {
            x0h1.m89578u(n5h1.m63737m(this.f147080a), null, 0, new lth0(this, messageResponseToken.getMessageData().getLoggingData().getMessageId(), messageResponseToken.getMessageRequest().getInteractionLoggingResult(), messageResponseToken.getMessageRequest().getOrchestrationMetadata().f19404a, messageResponseToken.getMessageRequest().getOrchestrationMetadata().f19405b, messageResponseToken, null), 3);
        }
    }

    @Override // p204p.qte0
    public final void dismiss() {
        this.f147081b.m71812a();
    }
}
