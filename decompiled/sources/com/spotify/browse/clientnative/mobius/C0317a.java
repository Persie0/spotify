package com.spotify.browse.clientnative.mobius;

import io.reactivex.rxjava3.functions.Function;
import java.util.Set;

/* JADX INFO: renamed from: com.spotify.browse.clientnative.mobius.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C0317a implements Function {

    /* JADX INFO: renamed from: a */
    public static final C0317a f3111a = new C0317a();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        return new BrowseEvent.ExplicitFeedbackListChanged((Set) obj);
    }
}
