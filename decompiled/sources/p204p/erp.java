package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class erp implements hze0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hze0 f62154a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ grp f62155b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f62156c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f62157d;

    public erp(grp grpVar, gh00 gh00Var, kqi0 kqi0Var) {
        this.f62155b = grpVar;
        this.f62156c = gh00Var;
        this.f62157d = kqi0Var;
        this.f62154a = (hze0) grpVar.f83810e;
    }

    @Override // p204p.hze0
    /* JADX INFO: renamed from: a */
    public final void mo39813a(MessageResponseToken messageResponseToken, DiscardReason.PresentationFailed presentationFailed) {
        this.f62154a.mo39813a(messageResponseToken, presentationFailed);
    }

    @Override // p204p.hze0
    /* JADX INFO: renamed from: c */
    public final void mo39814c(MessageResponseToken messageResponseToken) {
        this.f62154a.mo39814c(messageResponseToken);
    }

    @Override // p204p.hze0
    /* JADX INFO: renamed from: d */
    public final void mo39815d(Set set) {
        this.f62156c.invoke(new j2f0(set));
    }

    @Override // p204p.hze0
    /* JADX INFO: renamed from: e */
    public final void mo39816e() {
        ((hze0) this.f62155b.f83810e).mo39816e();
        this.f62157d.setValue(Boolean.TRUE);
    }

    @Override // p204p.hze0
    /* JADX INFO: renamed from: f */
    public final void mo39817f(MessageResponseToken messageResponseToken, Button button) {
        this.f62154a.mo39817f(messageResponseToken, button);
    }

    @Override // p204p.hze0
    /* JADX INFO: renamed from: g */
    public final void mo39818g(MessageResponseToken messageResponseToken) {
        this.f62154a.mo39818g(messageResponseToken);
    }

    @Override // p204p.hze0
    /* JADX INFO: renamed from: h */
    public final void mo39819h(Bundle bundle, DismissType dismissType, MessageResponseToken messageResponseToken, Button button) {
        this.f62154a.mo39819h(bundle, dismissType, messageResponseToken, button);
    }

    @Override // p204p.hze0
    /* JADX INFO: renamed from: i */
    public final void mo39820i(int i) {
        this.f62154a.mo39820i(i);
    }

    @Override // p204p.hze0
    /* JADX INFO: renamed from: j */
    public final void mo39821j(MessageResponseToken messageResponseToken) {
        this.f62154a.mo39821j(messageResponseToken);
    }

    @Override // p204p.hze0
    /* JADX INFO: renamed from: k */
    public final void mo39822k() {
        ((hze0) this.f62155b.f83810e).mo39822k();
        this.f62156c.invoke(g2f0.f75921a);
    }

    @Override // p204p.hze0
    /* JADX INFO: renamed from: l */
    public final void mo39823l(MessageResponseToken messageResponseToken) {
        this.f62154a.mo39823l(messageResponseToken);
    }
}
