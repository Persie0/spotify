package com.spotify.mobius.coroutines;

import kotlin.Metadata;
import p204p.bqz0;
import p204p.ibk;
import p204p.kpo;
import p204p.upa;

/* JADX INFO: renamed from: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1$handleEffects$1 */
/* JADX INFO: loaded from: classes2.dex */
@kpo(m57054c = "com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1", m57055f = "CoroutinesSubtypeEffectHandlerBuilder.kt", m57056l = {317, 318}, m57057m = "handleEffects")
@Metadata(m24213k = 3, m24214mv = {1, 9, 0}, m24216xi = 48)
final class C1039xbe3d82fe extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f5670a;

    /* JADX INFO: renamed from: b */
    public bqz0 f5671b;

    /* JADX INFO: renamed from: c */
    public upa f5672c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f5673d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1038x155001db f5674e;

    /* JADX INFO: renamed from: f */
    public int f5675f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1039xbe3d82fe(C1038x155001db c1038x155001db, ibk ibkVar) {
        super(ibkVar);
        this.f5674e = c1038x155001db;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f5673d = obj;
        this.f5675f |= Integer.MIN_VALUE;
        return this.f5674e.mo15630a(null, null, this);
    }
}
