package com.spotify.mobius.coroutines;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import p204p.bqa;
import p204p.bqz0;
import p204p.fbk;
import p204p.ibk;
import p204p.up60;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m24212d2 = {"Lcom/spotify/mobius/coroutines/CoroutinesSubtypeEffectHandlerBuilder;", "", "F", "E", "<init>", "()V", "EffectHandler", "EffectsHandler", "mobius-coroutines"}, m24213k = 1, m24214mv = {1, 9, 0}, m24216xi = 48)
public final class CoroutinesSubtypeEffectHandlerBuilder<F, E> {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f5645a = new LinkedHashMap();

    @Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/mobius/coroutines/CoroutinesSubtypeEffectHandlerBuilder$EffectHandler;", "F", "E", "", "mobius-coroutines"}, m24213k = 1, m24214mv = {1, 9, 0}, m24216xi = 48)
    public interface EffectHandler<F, E> {
        /* JADX INFO: renamed from: a */
        Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar);
    }

    @Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/mobius/coroutines/CoroutinesSubtypeEffectHandlerBuilder$EffectsHandler;", "F", "E", "", "mobius-coroutines"}, m24213k = 1, m24214mv = {1, 9, 0}, m24216xi = 48)
    public interface EffectsHandler<F, E> {
        /* JADX INFO: renamed from: a */
        Object mo15630a(bqa bqaVar, bqz0 bqz0Var, fbk fbkVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m15628a(up60 up60Var, EffectsHandler effectsHandler) {
        if (((EffectsHandler) this.f5645a.put(up60Var, effectsHandler)) == null) {
            return;
        }
        throw new IllegalStateException(("Trying to add more than one handler for the effect " + up60Var.mo29111F()).toString());
    }
}
