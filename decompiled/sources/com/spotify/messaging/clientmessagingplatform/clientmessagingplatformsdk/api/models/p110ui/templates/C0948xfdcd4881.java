package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.BackgroundColor;
import kotlin.Metadata;
import p204p.eh00;
import p204p.qe70;
import p204p.rr60;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate$StandardInlineCard$Companion$$childSerializers$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class C0948xfdcd4881 extends qe70 implements eh00 {
    public static final C0948xfdcd4881 INSTANCE = new C0948xfdcd4881();

    public C0948xfdcd4881() {
        super(0);
    }

    @Override // p204p.eh00
    public final rr60 invoke() {
        return BackgroundColor.INSTANCE.serializer();
    }
}
