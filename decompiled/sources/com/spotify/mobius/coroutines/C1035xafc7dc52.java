package com.spotify.mobius.coroutines;

import kotlin.Metadata;
import p204p.bga;
import p204p.bqa;
import p204p.bqz0;
import p204p.fbk;
import p204p.kk40;
import p204p.kpo;
import p204p.mb61;
import p204p.th00;
import p204p.upa;
import p204p.w2a1;
import p204p.xuk;
import p204p.yuk;

/* JADX INFO: renamed from: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunConcurrently */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0005\u0010\u0001*\u00028\u0006*\u0004\b\u0006\u0010\u0002*\u0004\b\u0007\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"com/spotify/mobius/coroutines/CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunConcurrently", "G", "F", "E", "", "<init>", "()V", "mobius-coroutines"}, m24213k = 1, m24214mv = {1, 9, 0}, m24216xi = 48)
public final class C1035xafc7dc52<G extends F, F, E> {
    /* JADX INFO: renamed from: a */
    public final CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler m15632a(final CoroutinesSubtypeEffectHandlerBuilder.EffectHandler effectHandler) {
        return new CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler() { // from class: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunConcurrently$createEffectsHandler$1

            /* JADX INFO: renamed from: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunConcurrently$createEffectsHandler$1$1, reason: invalid class name */
            @kpo(m57054c = "com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunConcurrently$createEffectsHandler$1$1", m57055f = "CoroutinesSubtypeEffectHandlerBuilder.kt", m57056l = {331}, m57057m = "invokeSuspend")
            @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0006\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\b\b\u0003\u0010\u0000*\u00028\u0006\"\u0004\b\u0004\u0010\u0001\"\u0004\b\u0005\u0010\u0002\"\b\b\u0006\u0010\u0001*\u00020\u0003\"\b\b\u0007\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m24212d2 = {"G", "F", "E", "", "Lp/xuk;", "Lp/w2a1;", "<anonymous>", "(Lp/xuk;)V"}, m24213k = 3, m24214mv = {1, 9, 0})
            final class AnonymousClass1 extends mb61 implements th00 {

                /* JADX INFO: renamed from: a */
                public upa f5659a;

                /* JADX INFO: renamed from: b */
                public int f5660b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f5661c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ bqa f5662d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder.EffectHandler f5663e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ bqz0 f5664f;

                /* JADX INFO: renamed from: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunConcurrently$createEffectsHandler$1$1$1, reason: invalid class name and collision with other inner class name */
                @kpo(m57054c = "com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunConcurrently$createEffectsHandler$1$1$1", m57055f = "CoroutinesSubtypeEffectHandlerBuilder.kt", m57056l = {332}, m57057m = "invokeSuspend")
                @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0006\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\b\b\u0003\u0010\u0000*\u00028\u0006\"\u0004\b\u0004\u0010\u0001\"\u0004\b\u0005\u0010\u0002\"\b\b\u0006\u0010\u0001*\u00020\u0003\"\b\b\u0007\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m24212d2 = {"G", "F", "E", "", "Lp/xuk;", "Lp/w2a1;", "<anonymous>", "(Lp/xuk;)V"}, m24213k = 3, m24214mv = {1, 9, 0})
                final class C27051 extends mb61 implements th00 {

                    /* JADX INFO: renamed from: a */
                    public int f5665a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder.EffectHandler f5666b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ Object f5667c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ bqz0 f5668d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C27051(CoroutinesSubtypeEffectHandlerBuilder.EffectHandler effectHandler, Object obj, bqz0 bqz0Var, fbk fbkVar) {
                        super(2, fbkVar);
                        this.f5666b = effectHandler;
                        this.f5667c = obj;
                        this.f5668d = bqz0Var;
                    }

                    @Override // p204p.ly8
                    public final fbk create(Object obj, fbk fbkVar) {
                        return new C27051(this.f5666b, this.f5667c, this.f5668d, fbkVar);
                    }

                    @Override // p204p.th00
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C27051) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
                    }

                    @Override // p204p.ly8
                    public final Object invokeSuspend(Object obj) {
                        int i = this.f5665a;
                        if (i == 0) {
                            bga.m29073P(obj);
                            this.f5665a = 1;
                            Object objMo15629a = this.f5666b.mo15629a(this.f5667c, this.f5668d, this);
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
                    this.f5662d = bqaVar;
                    this.f5663e = effectHandler;
                    this.f5664f = bqz0Var;
                }

                @Override // p204p.ly8
                public final fbk create(Object obj, fbk fbkVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5662d, this.f5663e, this.f5664f, fbkVar);
                    anonymousClass1.f5661c = obj;
                    return anonymousClass1;
                }

                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass1) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0036 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:14:0x003f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0034 -> B:12:0x0037). Please report as a decompilation issue!!! */
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
                        int r0 = r7.f5660b
                        r1 = 1
                        if (r0 == 0) goto L19
                        if (r0 != r1) goto L11
                        p.upa r0 = r7.f5659a
                        java.lang.Object r2 = r7.f5661c
                        p.xuk r2 = (p204p.xuk) r2
                        p204p.bga.m29073P(r8)
                        goto L37
                    L11:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L19:
                        p204p.bga.m29073P(r8)
                        java.lang.Object r8 = r7.f5661c
                        p.xuk r8 = (p204p.xuk) r8
                        p.upa r0 = new p.upa
                        p.bqa r2 = r7.f5662d
                        r0.<init>(r2)
                        r2 = r8
                    L28:
                        r7.f5661c = r2
                        r7.f5659a = r0
                        r7.f5660b = r1
                        java.lang.Object r8 = r0.m83652a(r7)
                        p.yuk r3 = p204p.yuk.f276404a
                        if (r8 != r3) goto L37
                        return r3
                    L37:
                        java.lang.Boolean r8 = (java.lang.Boolean) r8
                        boolean r8 = r8.booleanValue()
                        if (r8 == 0) goto L53
                        java.lang.Object r8 = r0.m83653c()
                        com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunConcurrently$createEffectsHandler$1$1$1 r3 = new com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunConcurrently$createEffectsHandler$1$1$1
                        com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$EffectHandler r4 = r7.f5663e
                        p.bqz0 r5 = r7.f5664f
                        r6 = 0
                        r3.<init>(r4, r8, r5, r6)
                        r8 = 3
                        r4 = 0
                        p204p.x0h1.m89578u(r2, r6, r4, r3, r8)
                        goto L28
                    L53:
                        p.w2a1 r8 = p204p.w2a1.f247311a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobius.coroutines.C1036x3159bc23.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
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
