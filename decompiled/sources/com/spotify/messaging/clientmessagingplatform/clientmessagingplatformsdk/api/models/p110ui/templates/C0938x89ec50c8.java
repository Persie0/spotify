package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContent;
import kotlin.Metadata;
import p204p.eh00;
import p204p.qe70;
import p204p.rr60;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate$BaseBottomSheet$Companion$$childSerializers$2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class C0938x89ec50c8 extends qe70 implements eh00 {
    public static final C0938x89ec50c8 INSTANCE = new C0938x89ec50c8();

    public C0938x89ec50c8() {
        super(0);
    }

    @Override // p204p.eh00
    public final rr60 invoke() {
        return AccessoryContent.INSTANCE.serializer();
    }
}
