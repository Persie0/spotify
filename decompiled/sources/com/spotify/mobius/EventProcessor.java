package com.spotify.mobius;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.internal_util.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
class EventProcessor<M, E, F> {

    /* JADX INFO: renamed from: a */
    public final MobiusStore f5551a;

    /* JADX INFO: renamed from: b */
    public final Consumer f5552b;

    /* JADX INFO: renamed from: c */
    public final Consumer f5553c;

    public static class Factory<M, E, F> {

        /* JADX INFO: renamed from: a */
        public final MobiusStore f5555a;

        public Factory(MobiusStore mobiusStore) {
            this.f5555a = mobiusStore;
        }
    }

    public EventProcessor(MobiusStore mobiusStore, Consumer consumer, Consumer consumer2) {
        Preconditions.m15649b(mobiusStore);
        this.f5551a = mobiusStore;
        this.f5552b = consumer;
        this.f5553c = consumer2;
    }
}
