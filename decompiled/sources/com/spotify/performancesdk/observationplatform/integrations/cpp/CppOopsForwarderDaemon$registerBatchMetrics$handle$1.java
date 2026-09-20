package com.spotify.performancesdk.observationplatform.integrations.cpp;

import kotlin.Metadata;
import p204p.dhv0;
import p204p.gh00;
import p204p.qe70;
import p204p.w2a1;
import p204p.w49;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m24212d2 = {"Lp/w49;", "platformObserver", "Lp/w2a1;", "invoke", "(Lp/w49;)V", "<anonymous>"}, m24213k = 3, m24214mv = {2, 3, 0})
public final class CppOopsForwarderDaemon$registerBatchMetrics$handle$1 extends qe70 implements gh00 {
    final /* synthetic */ long $callbackPtr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CppOopsForwarderDaemon$registerBatchMetrics$handle$1(long j) {
        super(1);
        this.$callbackPtr = j;
    }

    @Override // p204p.gh00
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((w49) obj);
        return w2a1.f247311a;
    }

    public final void invoke(final w49 w49Var) {
        OopsBridge.nativeBatchCallback(this.$callbackPtr, new OopsCppBatchObserver() { // from class: com.spotify.performancesdk.observationplatform.integrations.cpp.CppOopsForwarderDaemon$registerBatchMetrics$handle$1$adapter$1
            @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsCppBatchObserver
            public void observe(String key, double value) {
                ((dhv0) w49Var).m36059a(key, value);
            }
        });
    }
}
