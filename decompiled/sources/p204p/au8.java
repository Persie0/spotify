package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Disclaimer;

/* JADX INFO: loaded from: classes8.dex */
public final class au8 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19885a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Disclaimer f19886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f19887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au8(Disclaimer disclaimer, gh00 gh00Var, int i) {
        super(0);
        this.f19885a = i;
        this.f19886b = disclaimer;
        this.f19887c = gh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f19885a) {
            case 0:
                Button linkButton = this.f19886b.getLinkButton();
                if (linkButton != null) {
                    this.f19887c.invoke(new exe0(linkButton));
                }
                break;
            case 1:
                Button linkButton2 = this.f19886b.getLinkButton();
                if (linkButton2 != null) {
                    this.f19887c.invoke(new rxe0(linkButton2));
                }
                break;
            case 2:
                Button linkButton3 = this.f19886b.getLinkButton();
                if (linkButton3 != null) {
                    this.f19887c.invoke(new rze0(linkButton3));
                }
                break;
            default:
                Button linkButton4 = this.f19886b.getLinkButton();
                if (linkButton4 != null) {
                    this.f19887c.invoke(new j0f0(linkButton4));
                }
                break;
        }
        return w2a1.f247311a;
    }
}
