package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto.ClientMessagingPlatformDismissEvent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto.ClientMessagingPlatformDisplayStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto.ClientMessagingPlatformInteractionEvent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto.ClientMessagingPlatformRequestEvent;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import p204p.hle;
import p204p.oxa;
import p204p.pxa;
import p204p.qre0;
import p204p.qxa;
import p204p.rxa;
import p204p.s571;
import p204p.swa;
import p204p.sxa;
import p204p.txa;
import p204p.uke;
import p204p.uxa;
import p204p.v2a1;
import p204p.vke;
import p204p.yke;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C0989n {

    /* JADX INFO: renamed from: a */
    public final swa f5502a;

    public C0989n(swa swaVar) {
        this.f5502a = swaVar;
    }

    /* JADX INFO: renamed from: a */
    public final Consumer m15315a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.LogEventEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(uxa uxaVar) {
                String strM77251j;
                if (uxaVar instanceof oxa) {
                    oxa oxaVar = (oxa) uxaVar;
                    this.this$0.f5502a.m79533a(oxaVar.f170939b, oxaVar.f170940c, oxaVar.f170941d);
                    return;
                }
                if (uxaVar instanceof txa) {
                    txa txaVar = (txa) uxaVar;
                    this.this$0.f5502a.m79534b(txaVar.f224629b, txaVar.f224630c);
                    return;
                }
                if (uxaVar instanceof pxa) {
                    swa swaVar = this.this$0.f5502a;
                    pxa pxaVar = (pxa) uxaVar;
                    v2a1 v2a1Var = pxaVar.f182245b;
                    LoggingData loggingData = pxaVar.f182246c;
                    DismissReason dismissReason = pxaVar.f182247d;
                    if (loggingData.isPreview()) {
                        return;
                    }
                    qre0 qre0Var = swaVar.f214632a;
                    uke ukeVarM15238B = ClientMessagingPlatformDismissEvent.m15238B();
                    ukeVarM15238B.m83321B(v2a1Var.f236592a.toLowerCase(Locale.ROOT));
                    ukeVarM15238B.m83322C(v2a1Var.f236593b);
                    ukeVarM15238B.m83326s(v2a1Var.f236596e);
                    ukeVarM15238B.m83333z(loggingData.getMessageId());
                    ukeVarM15238B.m83320A(loggingData.getMessageUuid());
                    ukeVarM15238B.m83332y(loggingData.getFormatType().name());
                    ukeVarM15238B.m83324q(loggingData.getMessageSource().name());
                    if (dismissReason instanceof DismissReason.BackgroundViewTapped) {
                        strM77251j = "background_view_tapped";
                    } else if (dismissReason instanceof DismissReason.FooterTapped) {
                        strM77251j = "footer_tapped";
                    } else if (dismissReason instanceof DismissReason.MessageButtonTapped) {
                        strM77251j = s571.m77251j("message_", ((DismissReason.MessageButtonTapped) dismissReason).getButton().getIdentifier(), "_button_tapped");
                    } else if (dismissReason instanceof DismissReason.MessageSwiped) {
                        strM77251j = "message_swiped";
                    } else if (dismissReason instanceof DismissReason.ProgrammaticDismissal) {
                        strM77251j = "programmatic_dismissal";
                    } else if (dismissReason instanceof DismissReason.WebViewMessageNavigatedToCloseUrl) {
                        strM77251j = "webview_message_navigated_to_close_url";
                    } else if (dismissReason instanceof DismissReason.ContextChanged) {
                        strM77251j = "context_changed";
                    } else if (dismissReason instanceof DismissReason.MessageContentTapped) {
                        strM77251j = "message_content_view_tapped";
                    } else if (dismissReason instanceof DismissReason.BackButtonTapped) {
                        strM77251j = "back_button_tapped";
                    } else if (dismissReason instanceof DismissReason.AutoDismissingMessageTimerElapsed) {
                        strM77251j = "auto_dismissing_message_timer_elapsed";
                    } else if (dismissReason instanceof DismissReason.WebViewCloseBarButtonItemTapped) {
                        strM77251j = "webview_message_close_bar_button_item_tapped";
                    } else if (dismissReason instanceof DismissReason.SurfaceOvertakenOrBackgrounded) {
                        strM77251j = "surface_overtaken_or_backgrounded";
                    } else if (dismissReason instanceof DismissReason.SessionEnded) {
                        strM77251j = "session_ended";
                    } else if (dismissReason instanceof DismissReason.MessageCleanup) {
                        strM77251j = "message_cleanup";
                    } else {
                        if (!(dismissReason instanceof DismissReason.UserLoggingOut)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        strM77251j = "user_logging_out";
                    }
                    ukeVarM15238B.m83325r(strM77251j);
                    ukeVarM15238B.m83327t(loggingData.getLocale());
                    ukeVarM15238B.m83329v(loggingData.getCreativeId());
                    ukeVarM15238B.m83331x(loggingData.getCreativeVersion());
                    ukeVarM15238B.m83330w(loggingData.getCreativeTemplateId());
                    ukeVarM15238B.m83328u(loggingData.getCreativeCampaignId());
                    if (dismissReason instanceof DismissReason.MessageButtonTapped) {
                        ukeVarM15238B.m83323m(((DismissReason.MessageButtonTapped) dismissReason).getButton().getIdentifier());
                    }
                    qre0Var.m73616a(ukeVarM15238B.build());
                    return;
                }
                if (uxaVar instanceof qxa) {
                    swa swaVar2 = this.this$0.f5502a;
                    qxa qxaVar = (qxa) uxaVar;
                    v2a1 v2a1Var2 = qxaVar.f193601b;
                    LoggingData loggingData2 = qxaVar.f193602c;
                    if (loggingData2.isPreview()) {
                        return;
                    }
                    qre0 qre0Var2 = swaVar2.f214632a;
                    vke vkeVarM15254C = ClientMessagingPlatformDisplayStatus.m15254C();
                    vkeVarM15254C.m85821B(v2a1Var2.f236592a.toLowerCase(Locale.ROOT));
                    vkeVarM15254C.m85823D(v2a1Var2.f236593b);
                    vkeVarM15254C.m85827s(v2a1Var2.f236596e);
                    vkeVarM15254C.m85834z(loggingData2.getMessageId());
                    vkeVarM15254C.m85820A(loggingData2.getMessageUuid());
                    vkeVarM15254C.m85833y(loggingData2.getFormatType().name());
                    vkeVarM15254C.m85824m(loggingData2.getMessageSource().name());
                    vkeVarM15254C.m85822C(true);
                    vkeVarM15254C.m85825q("");
                    vkeVarM15254C.m85826r("");
                    vkeVarM15254C.m85828t(loggingData2.getLocale());
                    vkeVarM15254C.m85830v(loggingData2.getCreativeId());
                    vkeVarM15254C.m85832x(loggingData2.getCreativeVersion());
                    vkeVarM15254C.m85831w(loggingData2.getCreativeTemplateId());
                    vkeVarM15254C.m85829u(loggingData2.getCreativeCampaignId());
                    qre0Var2.m73616a(vkeVarM15254C.build());
                    return;
                }
                if (!(uxaVar instanceof rxa)) {
                    if (!(uxaVar instanceof sxa)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    swa swaVar3 = this.this$0.f5502a;
                    sxa sxaVar = (sxa) uxaVar;
                    String str = sxaVar.f214857b;
                    String str2 = sxaVar.f214858c;
                    qre0 qre0Var3 = swaVar3.f214632a;
                    hle hleVarM15299p = ClientMessagingPlatformRequestEvent.m15299p();
                    hleVarM15299p.m47878m(str);
                    hleVarM15299p.m47879q(str2);
                    qre0Var3.m73616a(hleVarM15299p.build());
                    return;
                }
                swa swaVar4 = this.this$0.f5502a;
                rxa rxaVar = (rxa) uxaVar;
                v2a1 v2a1Var3 = rxaVar.f203566b;
                LoggingData loggingData3 = rxaVar.f203567c;
                Button button = rxaVar.f203568d;
                if (loggingData3.isPreview()) {
                    return;
                }
                qre0 qre0Var4 = swaVar4.f214632a;
                yke ykeVarM15271D = ClientMessagingPlatformInteractionEvent.m15271D();
                ykeVarM15271D.m93974D(v2a1Var3.f236592a.toLowerCase(Locale.ROOT));
                ykeVarM15271D.m93975E(v2a1Var3.f236593b);
                ykeVarM15271D.m93980t(v2a1Var3.f236596e);
                ykeVarM15271D.m93972B(loggingData3.getMessageId());
                ykeVarM15271D.m93973C(loggingData3.getMessageUuid());
                ykeVarM15271D.m93971A(loggingData3.getFormatType().name());
                ykeVarM15271D.m93977q(loggingData3.getMessageSource().name());
                ykeVarM15271D.m93981u("message_" + button.getIdentifier() + "_tapped");
                ykeVarM15271D.m93976m(button.getIdentifier());
                ykeVarM15271D.m93978r(button.getClickAction().getClickActionIdentifier());
                String actionUrl = button.getClickAction().getActionUrl();
                ykeVarM15271D.m93979s(actionUrl != null ? actionUrl : "");
                ykeVarM15271D.m93982v(loggingData3.getLocale());
                ykeVarM15271D.m93984x(loggingData3.getCreativeId());
                ykeVarM15271D.m93986z(loggingData3.getCreativeVersion());
                ykeVarM15271D.m93985y(loggingData3.getCreativeTemplateId());
                ykeVarM15271D.m93983w(loggingData3.getCreativeCampaignId());
                qre0Var4.m73616a(ykeVarM15271D.build());
            }
        };
    }
}
