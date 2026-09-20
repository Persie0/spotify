package com.spotify.mobius.coroutines;

import kotlin.Metadata;
import p204p.bga;
import p204p.bqa;
import p204p.bqz0;
import p204p.eg60;
import p204p.fbk;
import p204p.kk40;
import p204p.kpo;
import p204p.mb61;
import p204p.th00;
import p204p.upa;
import p204p.w2a1;
import p204p.xuk;
import p204p.yuk;

/* JADX INFO: renamed from: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0005\u0010\u0001*\u00028\u0006*\u0004\b\u0006\u0010\u0002*\u0004\b\u0007\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"com/spotify/mobius/coroutines/CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious", "G", "F", "E", "", "<init>", "()V", "mobius-coroutines"}, m24213k = 1, m24214mv = {1, 9, 0}, m24216xi = 48)
public final class C1033x3ae6ae8e<G extends F, F, E> {
    /* JADX INFO: renamed from: a */
    public final CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler m15631a(final CoroutinesSubtypeEffectHandlerBuilder.EffectHandler effectHandler) {
        return new CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler() { // from class: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1

            /* JADX INFO: renamed from: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1$1, reason: invalid class name */
            @kpo(m57054c = "com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1$1", m57055f = "CoroutinesSubtypeEffectHandlerBuilder.kt", m57056l = {347}, m57057m = "invokeSuspend")
            @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0006\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\b\b\u0003\u0010\u0000*\u00028\u0006\"\u0004\b\u0004\u0010\u0001\"\u0004\b\u0005\u0010\u0002\"\b\b\u0006\u0010\u0001*\u00020\u0003\"\b\b\u0007\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m24212d2 = {"G", "F", "E", "", "Lp/xuk;", "Lp/w2a1;", "<anonymous>", "(Lp/xuk;)V"}, m24213k = 3, m24214mv = {1, 9, 0})
            final class AnonymousClass1 extends mb61 implements th00 {

                /* JADX INFO: renamed from: a */
                public eg60 f5647a;

                /* JADX INFO: renamed from: b */
                public upa f5648b;

                /* JADX INFO: renamed from: c */
                public int f5649c;

                /* JADX INFO: renamed from: d */
                public /* synthetic */ Object f5650d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ bqa f5651e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder.EffectHandler f5652f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ bqz0 f5653g;

                /* JADX INFO: renamed from: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1$1$1, reason: invalid class name and collision with other inner class name */
                @kpo(m57054c = "com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1$1$1", m57055f = "CoroutinesSubtypeEffectHandlerBuilder.kt", m57056l = {349}, m57057m = "invokeSuspend")
                @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0006\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\b\b\u0003\u0010\u0000*\u00028\u0006\"\u0004\b\u0004\u0010\u0001\"\u0004\b\u0005\u0010\u0002\"\b\b\u0006\u0010\u0001*\u00020\u0003\"\b\b\u0007\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m24212d2 = {"G", "F", "E", "", "Lp/xuk;", "Lp/w2a1;", "<anonymous>", "(Lp/xuk;)V"}, m24213k = 3, m24214mv = {1, 9, 0})
                final class C27041 extends mb61 implements th00 {

                    /* JADX INFO: renamed from: a */
                    public int f5654a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder.EffectHandler f5655b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ Object f5656c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ bqz0 f5657d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C27041(CoroutinesSubtypeEffectHandlerBuilder.EffectHandler effectHandler, Object obj, bqz0 bqz0Var, fbk fbkVar) {
                        super(2, fbkVar);
                        this.f5655b = effectHandler;
                        this.f5656c = obj;
                        this.f5657d = bqz0Var;
                    }

                    @Override // p204p.ly8
                    public final fbk create(Object obj, fbk fbkVar) {
                        return new C27041(this.f5655b, this.f5656c, this.f5657d, fbkVar);
                    }

                    @Override // p204p.th00
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C27041) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
                    }

                    @Override // p204p.ly8
                    public final Object invokeSuspend(Object obj) {
                        int i = this.f5654a;
                        if (i == 0) {
                            bga.m29073P(obj);
                            this.f5654a = 1;
                            Object objMo15629a = this.f5655b.mo15629a(this.f5656c, this.f5657d, this);
                            yuk yukVar = yuk.f276404a;
                            if (objMo15629a == yukVar) {
                                return yukVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bga.m29073P(obj);
                        }
                        return w2a1.f247311a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(bqa bqaVar, CoroutinesSubtypeEffectHandlerBuilder.EffectHandler effectHandler, bqz0 bqz0Var, fbk fbkVar) {
                    super(2, fbkVar);
                    this.f5651e = bqaVar;
                    this.f5652f = effectHandler;
                    this.f5653g = bqz0Var;
                }

                @Override // p204p.ly8
                public final fbk create(Object obj, fbk fbkVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5651e, this.f5652f, this.f5653g, fbkVar);
                    anonymousClass1.f5650d = obj;
                    return anonymousClass1;
                }

                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass1) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0041 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:14:0x004a  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003f -> B:12:0x0042). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // p204p.ly8
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        int r0 = r7.f5649c
                        r1 = 1
                        if (r0 == 0) goto L1b
                        if (r0 != r1) goto L13
                        p.upa r0 = r7.f5648b
                        p.eg60 r2 = r7.f5647a
                        java.lang.Object r3 = r7.f5650d
                        p.xuk r3 = (p204p.xuk) r3
                        p204p.bga.m29073P(r8)
                        goto L42
                    L13:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L1b:
                        p204p.bga.m29073P(r8)
                        java.lang.Object r8 = r7.f5650d
                        p.xuk r8 = (p204p.xuk) r8
                        p.uf60 r0 = p204p.qlg1.m73202g()
                        p.upa r2 = new p.upa
                        p.bqa r3 = r7.f5651e
                        r2.<init>(r3)
                        r3 = r2
                        r2 = r0
                        r0 = r3
                        r3 = r8
                    L31:
                        r7.f5650d = r3
                        r7.f5647a = r2
                        r7.f5648b = r0
                        r7.f5649c = r1
                        java.lang.Object r8 = r0.m83652a(r7)
                        p.yuk r4 = p204p.yuk.f276404a
                        if (r8 != r4) goto L42
                        return r4
                    L42:
                        java.lang.Boolean r8 = (java.lang.Boolean) r8
                        boolean r8 = r8.booleanValue()
                        if (r8 == 0) goto L62
                        java.lang.Object r8 = r0.m83653c()
                        p204p.mlg1.m62224q(r2)
                        com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1$1$1 r2 = new com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1$1$1
                        com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$EffectHandler r4 = r7.f5652f
                        p.bqz0 r5 = r7.f5653g
                        r6 = 0
                        r2.<init>(r4, r8, r5, r6)
                        r8 = 3
                        r4 = 0
                        p.di41 r2 = p204p.x0h1.m89578u(r3, r6, r4, r2, r8)
                        goto L31
                    L62:
                        p.w2a1 r8 = p204p.w2a1.f247311a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobius.coroutines.C1034x5c0c2667.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler
            /* JADX INFO: renamed from: a */
            public final Object mo15630a(bqa bqaVar, bqz0 bqz0Var, fbk fbkVar) {
                Object objM56684z = kk40.m56684z(new AnonymousClass1(bqaVar, effectHandler, bqz0Var, null), fbkVar);
                return objM56684z == yuk.f276404a ? objM56684z : w2a1.f247311a;
            }
        };
    }
}
