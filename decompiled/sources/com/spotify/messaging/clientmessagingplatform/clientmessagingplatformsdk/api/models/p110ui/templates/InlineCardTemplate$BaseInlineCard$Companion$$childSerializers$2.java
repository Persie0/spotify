package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.BackgroundColor;
import kotlin.Metadata;
import p204p.eh00;
import p204p.qe70;
import p204p.rr60;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class InlineCardTemplate$BaseInlineCard$Companion$$childSerializers$2 extends qe70 implements eh00 {
    public static final InlineCardTemplate$BaseInlineCard$Companion$$childSerializers$2 INSTANCE = new InlineCardTemplate$BaseInlineCard$Companion$$childSerializers$2();

    public InlineCardTemplate$BaseInlineCard$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // p204p.eh00
    public final rr60 invoke() {
        return BackgroundColor.INSTANCE.serializer();
    }
}
