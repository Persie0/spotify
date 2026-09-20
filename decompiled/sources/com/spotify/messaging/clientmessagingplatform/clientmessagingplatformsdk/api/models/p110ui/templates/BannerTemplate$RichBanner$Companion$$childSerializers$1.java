package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContent;
import kotlin.Metadata;
import p204p.eh00;
import p204p.qe70;
import p204p.rr60;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class BannerTemplate$RichBanner$Companion$$childSerializers$1 extends qe70 implements eh00 {
    public static final BannerTemplate$RichBanner$Companion$$childSerializers$1 INSTANCE = new BannerTemplate$RichBanner$Companion$$childSerializers$1();

    public BannerTemplate$RichBanner$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // p204p.eh00
    public final rr60 invoke() {
        return AccessoryContent.INSTANCE.serializer();
    }
}
