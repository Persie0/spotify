package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto.ClientMessagingPlatformDisplayStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto.ClientMessagingPlatformRequestErrorEvent;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class swa {

    /* JADX INFO: renamed from: a */
    public final qre0 f214632a;

    public swa(qre0 qre0Var) {
        this.f214632a = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m79533a(v2a1 v2a1Var, LoggingData loggingData, DiscardReason discardReason) {
        if (loggingData.isPreview()) {
            return;
        }
        vke vkeVarM15254C = ClientMessagingPlatformDisplayStatus.m15254C();
        vkeVarM15254C.m85821B(v2a1Var.f236592a.toLowerCase(Locale.ROOT));
        vkeVarM15254C.m85823D(v2a1Var.f236593b);
        vkeVarM15254C.m85827s(v2a1Var.f236596e);
        vkeVarM15254C.m85834z(loggingData.getMessageId());
        vkeVarM15254C.m85820A(loggingData.getMessageUuid());
        vkeVarM15254C.m85833y(loggingData.getFormatType().name());
        vkeVarM15254C.m85824m(loggingData.getMessageSource().name());
        vkeVarM15254C.m85822C(false);
        vkeVarM15254C.m85825q(mwh0.m63046c(discardReason));
        vkeVarM15254C.m85826r(mwh0.m63049f(discardReason));
        vkeVarM15254C.m85828t(loggingData.getLocale());
        vkeVarM15254C.m85830v(loggingData.getCreativeId());
        vkeVarM15254C.m85832x(loggingData.getCreativeVersion());
        vkeVarM15254C.m85831w(loggingData.getCreativeTemplateId());
        vkeVarM15254C.m85829u(loggingData.getCreativeCampaignId());
        this.f214632a.m73616a(vkeVarM15254C.build());
    }

    /* JADX INFO: renamed from: b */
    public final void m79534b(v2a1 v2a1Var, DiscardReason discardReason) {
        gle gleVarM15296r = ClientMessagingPlatformRequestErrorEvent.m15296r();
        gleVarM15296r.m45129r(v2a1Var.f236592a.toLowerCase(Locale.ROOT));
        gleVarM15296r.m45130s(v2a1Var.f236593b);
        gleVarM15296r.m45128q(mwh0.m63049f(discardReason));
        gleVarM15296r.m45127m(mwh0.m63046c(discardReason));
        this.f214632a.m73616a(gleVarM15296r.build());
    }
}
