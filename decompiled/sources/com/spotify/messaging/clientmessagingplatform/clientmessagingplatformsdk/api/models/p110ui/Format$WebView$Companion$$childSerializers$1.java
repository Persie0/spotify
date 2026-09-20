package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.WebViewTemplate;
import kotlin.Metadata;
import p204p.eh00;
import p204p.qe70;
import p204p.rr60;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class Format$WebView$Companion$$childSerializers$1 extends qe70 implements eh00 {
    public static final Format$WebView$Companion$$childSerializers$1 INSTANCE = new Format$WebView$Companion$$childSerializers$1();

    public Format$WebView$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // p204p.eh00
    public final rr60 invoke() {
        return WebViewTemplate.INSTANCE.serializer();
    }
}
