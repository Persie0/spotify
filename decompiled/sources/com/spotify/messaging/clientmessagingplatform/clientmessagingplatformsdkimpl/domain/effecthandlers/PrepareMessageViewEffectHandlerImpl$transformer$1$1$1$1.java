package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import kotlin.Metadata;
import p204p.gh00;
import p204p.qe70;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m24212d2 = {"<anonymous>", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageTemplate;", "it", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponseToken;", "invoke"}, m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PrepareMessageViewEffectHandlerImpl$transformer$1$1$1$1 extends qe70 implements gh00 {
    final /* synthetic */ MessageTemplate $updatedTemplate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepareMessageViewEffectHandlerImpl$transformer$1$1$1$1(MessageTemplate messageTemplate) {
        super(1);
        this.$updatedTemplate = messageTemplate;
    }

    @Override // p204p.gh00
    public final MessageTemplate invoke(MessageResponseToken messageResponseToken) {
        return this.$updatedTemplate;
    }
}
