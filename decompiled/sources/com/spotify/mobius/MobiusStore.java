package com.spotify.mobius;

import com.spotify.mobius.internal_util.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
class MobiusStore<M, E, F> {

    /* JADX INFO: renamed from: a */
    public final Update f5613a;

    /* JADX INFO: renamed from: b */
    public Object f5614b;

    public MobiusStore(Update update, Object obj) {
        this.f5613a = update;
        Preconditions.m15649b(obj);
        this.f5614b = obj;
    }
}
