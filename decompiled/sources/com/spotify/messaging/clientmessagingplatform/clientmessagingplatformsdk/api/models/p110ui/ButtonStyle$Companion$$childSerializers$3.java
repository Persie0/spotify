package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui;

import kotlin.Metadata;
import p204p.eh00;
import p204p.qe70;
import p204p.rr60;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ButtonStyle$Companion$$childSerializers$3 extends qe70 implements eh00 {
    public static final ButtonStyle$Companion$$childSerializers$3 INSTANCE = new ButtonStyle$Companion$$childSerializers$3();

    public ButtonStyle$Companion$$childSerializers$3() {
        super(0);
    }

    @Override // p204p.eh00
    public final rr60 invoke() {
        return ButtonIconAlignment.INSTANCE.serializer();
    }
}
