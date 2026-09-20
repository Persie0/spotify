package com.spotify.esperanto.esperantoimpl;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import p204p.gh00;
import p204p.qe70;
import p204p.w2a1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m24212d2 = {"", "it", "Lp/w2a1;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m24213k = 3, m24214mv = {2, 3, 0})
public final class NativeCoroutineTransport$callSingle$2$1 extends qe70 implements gh00 {
    final /* synthetic */ AtomicBoolean $resumed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeCoroutineTransport$callSingle$2$1(AtomicBoolean atomicBoolean) {
        super(1);
        this.$resumed = atomicBoolean;
    }

    @Override // p204p.gh00
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return w2a1.f247311a;
    }

    public final void invoke(Throwable th) {
        this.$resumed.set(true);
    }
}
