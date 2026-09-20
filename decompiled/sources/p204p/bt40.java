package p204p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.comscore.streaming.ContentType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.InlineCardTemplate;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class bt40 implements ive0 {

    /* JADX INFO: renamed from: a */
    public final View f30509a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f30510b;

    public bt40(Context context, lr40 lr40Var, zs40 zs40Var, MessageResponseToken messageResponseToken) {
        Object c6x0Var;
        InlineCardTemplate inlineCardTemplate = (InlineCardTemplate) lq51.m59702h(messageResponseToken);
        lr40Var.getClass();
        int i = 1;
        if (inlineCardTemplate instanceof InlineCardTemplate.CompactInlineCard) {
            InlineCardTemplate.CompactInlineCard compactInlineCard = (InlineCardTemplate.CompactInlineCard) inlineCardTemplate;
            c6x0Var = new gut(new c0f0(messageResponseToken, new xze0(compactInlineCard.getSignifier(), null, compactInlineCard.getHeadline(), compactInlineCard.getBackgroundColor(), compactInlineCard.getBody(), compactInlineCard.getAccessoryContent(), null, null, compactInlineCard.getCardButton(), null, 706), "messaging_inlinecard_compact"), new kr40(lr40Var, 0));
        } else if (inlineCardTemplate instanceof InlineCardTemplate.StandardInlineCard) {
            InlineCardTemplate.StandardInlineCard standardInlineCard = (InlineCardTemplate.StandardInlineCard) inlineCardTemplate;
            c6x0Var = new gut(new c0f0(messageResponseToken, new xze0(standardInlineCard.getSignifier(), null, standardInlineCard.getHeadline(), standardInlineCard.getBackgroundColor(), standardInlineCard.getBody(), standardInlineCard.getAccessoryContent(), standardInlineCard.getPrimaryButton(), null, null, standardInlineCard.getCloseButton(), 386), "messaging_inlinecard_standard"), new kr40(lr40Var, i));
        } else if (inlineCardTemplate instanceof InlineCardTemplate.MicroCompactInlineCard) {
            InlineCardTemplate.MicroCompactInlineCard microCompactInlineCard = (InlineCardTemplate.MicroCompactInlineCard) inlineCardTemplate;
            c6x0Var = new gut(new c0f0(messageResponseToken, new xze0(microCompactInlineCard.getSignifier(), null, microCompactInlineCard.getHeadline(), microCompactInlineCard.getBackgroundColor(), null, microCompactInlineCard.getAccessoryContent(), null, null, microCompactInlineCard.getCardButton(), null, 722), "messaging_inlinecard_micro_compact"), new kr40(lr40Var, 2));
        } else if (inlineCardTemplate instanceof InlineCardTemplate.BaseInlineCard) {
            InlineCardTemplate.BaseInlineCard baseInlineCard = (InlineCardTemplate.BaseInlineCard) inlineCardTemplate;
            c6x0Var = new gut(new c0f0(messageResponseToken, new xze0(null, baseInlineCard.getHeaderContent(), baseInlineCard.getHeadline(), baseInlineCard.getBackgroundColor(), baseInlineCard.getBody(), baseInlineCard.getAccessoryContent(), baseInlineCard.getPrimaryButton(), baseInlineCard.getSecondaryButton(), baseInlineCard.getCardButton(), baseInlineCard.getDismissButton(), 1), "messaging_inlinecard_base"), new kr40(lr40Var, 3));
        } else {
            if (!(inlineCardTemplate instanceof InlineCardTemplate.Undefined)) {
                throw new NoWhenBranchMatchedException();
            }
            c6x0Var = new c6x0(new IllegalArgumentException("Undefined template cannot be used to create an element"));
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        View view = null;
        if (thM77348a != null) {
            zs40Var.mo39813a(messageResponseToken, new DiscardReason.PresentationFailed(edb.m38564m("Unable to create Element for InlineCardTemplate: ", thM77348a.getMessage())));
            c6x0Var = null;
        }
        gut gutVar = (gut) c6x0Var;
        if (gutVar != null) {
            Object obj = gutVar.f84542b;
            up60 up60Var = hxt.f96286w;
            view = ia7.m50020m(context, new FrameLayout(context), new rxt((ry8) gutVar.f84541a.invoke(zs40Var), new ViewGroup.LayoutParams(-1, -2), ((c0f0) obj).f32773c), obj, null, ContentType.LONG_FORM_ON_DEMAND).f96307t;
        }
        this.f30509a = view;
        this.f30510b = (ViewGroup) new wg61(new el40(i, this, context)).getValue();
    }
}
