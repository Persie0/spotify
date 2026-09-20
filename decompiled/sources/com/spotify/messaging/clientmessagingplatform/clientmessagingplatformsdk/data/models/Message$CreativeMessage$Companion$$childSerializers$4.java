package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageType;
import kotlin.Metadata;
import p204p.eh00;
import p204p.qe70;
import p204p.rr60;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class Message$CreativeMessage$Companion$$childSerializers$4 extends qe70 implements eh00 {
    public static final Message$CreativeMessage$Companion$$childSerializers$4 INSTANCE = new Message$CreativeMessage$Companion$$childSerializers$4();

    public Message$CreativeMessage$Companion$$childSerializers$4() {
        super(0);
    }

    @Override // p204p.eh00
    public final rr60 invoke() {
        return MessageType.INSTANCE.serializer();
    }
}
