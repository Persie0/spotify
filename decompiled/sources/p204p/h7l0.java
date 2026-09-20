package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PresentationOperation;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class h7l0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DismissType f88483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MessageResponseToken f88484b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7l0 f88485c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Button f88486d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qe70 f88487e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h7l0(DismissType dismissType, MessageResponseToken messageResponseToken, i7l0 i7l0Var, Button button, eh00 eh00Var) {
        super(1);
        this.f88483a = dismissType;
        this.f88484b = messageResponseToken;
        this.f88485c = i7l0Var;
        this.f88486d = button;
        this.f88487e = (qe70) eh00Var;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [p.eh00, p.qe70] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        i7l0 i7l0Var = this.f88485c;
        kal0 kal0Var = i7l0Var.f99581e;
        DismissType dismissType = this.f88483a;
        if (!(dismissType instanceof DismissType.ActionDeterminedDismiss)) {
            if (!(dismissType instanceof DismissType.OverriddenDismiss)) {
                throw new NoWhenBranchMatchedException();
            }
            zBooleanValue = ((DismissType.OverriddenDismiss) dismissType).getShouldDismiss();
        }
        if (zBooleanValue) {
            MessageResponseToken messageResponseToken = this.f88484b;
            FormatType formatTypeM63045b = mwh0.m63045b(messageResponseToken.getMessageData());
            FormatType formatType = FormatType.INLINE_CARD;
            Button button = this.f88486d;
            if (formatTypeM63045b != formatType) {
                ((lal0) kal0Var).m58572a(messageResponseToken, new DismissReason.MessageButtonTapped(button));
            } else {
                sza szaVar = i7l0Var.f99579c;
                q3x0 q3x0Var = (q3x0) szaVar.f215440a.get(messageResponseToken.getRequestId());
                if (q3x0Var != null) {
                    q3x0Var.f184981b.onNext(new PresentationOperation.Dismiss(new DismissReason.MessageButtonTapped(button), kal0Var));
                }
            }
            this.f88487e.invoke();
        }
        return w2a1.f247311a;
    }
}
