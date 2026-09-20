package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class ps40 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f180741a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xze0 f180742b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f180743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps40(xze0 xze0Var, gh00 gh00Var, int i) {
        super(0);
        this.f180741a = i;
        this.f180742b = xze0Var;
        this.f180743c = gh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f180741a) {
            case 0:
                Button button = this.f180742b.f267612i;
                if (button != null) {
                    this.f180743c.invoke(new yze0(button));
                }
                break;
            default:
                Button button2 = this.f180742b.f267612i;
                if (button2 != null) {
                    this.f180743c.invoke(new yze0(button2));
                }
                break;
        }
        return w2a1.f247311a;
    }
}
