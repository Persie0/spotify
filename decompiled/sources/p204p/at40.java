package p204p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class at40 implements qte0 {

    /* JADX INFO: renamed from: a */
    public final Context f19593a;

    /* JADX INFO: renamed from: b */
    public final adl0 f19594b;

    /* JADX INFO: renamed from: c */
    public final jal0 f19595c;

    /* JADX INFO: renamed from: d */
    public final g7l0 f19596d;

    /* JADX INFO: renamed from: e */
    public final lr40 f19597e;

    /* JADX INFO: renamed from: f */
    public pqm0 f19598f;

    /* JADX INFO: renamed from: g */
    public eh00 f19599g;

    /* JADX INFO: renamed from: h */
    public final wg61 f19600h = new wg61(new ys40(this, 2));

    public at40(Context context, adl0 adl0Var, jal0 jal0Var, g7l0 g7l0Var, lr40 lr40Var) {
        this.f19593a = context;
        this.f19594b = adl0Var;
        this.f19595c = jal0Var;
        this.f19596d = g7l0Var;
        this.f19597e = lr40Var;
    }

    @Override // p204p.qte0
    /* JADX INFO: renamed from: a */
    public final void mo27112a(MessageResponseToken messageResponseToken, gh00 gh00Var) {
        this.f19598f = new pqm0(messageResponseToken, gh00Var.invoke(messageResponseToken));
    }

    @Override // p204p.qte0
    /* JADX INFO: renamed from: b */
    public final void mo27113b(eh00 eh00Var) {
        this.f19599g = eh00Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m27114c() {
        ((bt40) m27115d()).f30510b.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public final ive0 m27115d() {
        return (ive0) this.f19600h.getValue();
    }

    @Override // p204p.qte0
    public final void dismiss() {
        m27114c();
    }
}
