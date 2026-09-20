package com.spotify.performancesdk.observationplatform.integrations.cpp;

import kotlin.Metadata;
import p204p.eh00;
import p204p.qe70;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m24212d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"}, m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CppOopsForwarderDaemon$createObservableCounter$handle$1 extends qe70 implements eh00 {
    final /* synthetic */ long $pollPtr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CppOopsForwarderDaemon$createObservableCounter$handle$1(long j) {
        super(0);
        this.$pollPtr = j;
    }

    @Override // p204p.eh00
    public final Double invoke() {
        return OopsBridge.INSTANCE.pollNative(this.$pollPtr);
    }
}
