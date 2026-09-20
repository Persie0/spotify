package com.spotify.mobius.rx3;

import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: renamed from: com.spotify.mobius.rx3.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1060b implements Function {
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        return new RxMobius.SubtypeEffectHandlerBuilder.C10542((ObservableTransformer) obj);
    }
}
