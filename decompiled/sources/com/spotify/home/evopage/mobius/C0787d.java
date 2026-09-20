package com.spotify.home.evopage.mobius;

import io.reactivex.rxjava3.functions.Function;
import java.util.Set;

/* JADX INFO: renamed from: com.spotify.home.evopage.mobius.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0787d implements Function {

    /* JADX INFO: renamed from: a */
    public static final C0787d f4156a = new C0787d();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        return new Event.ExplicitFeedbackListChanged((Set) obj);
    }
}
