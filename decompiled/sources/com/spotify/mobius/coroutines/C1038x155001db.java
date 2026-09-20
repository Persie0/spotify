package com.spotify.mobius.coroutines;

import kotlin.Metadata;
import p204p.bga;
import p204p.bqa;
import p204p.bqz0;
import p204p.fbk;
import p204p.ibk;
import p204p.upa;
import p204p.w2a1;
import p204p.yuk;

/* JADX INFO: renamed from: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0000*\u00028\u0006\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0001\"\b\b\u0003\u0010\u0000*\u00028\u0006\"\u0004\b\u0004\u0010\u0002\"\u0004\b\u0005\u0010\u0003\"\b\b\u0006\u0010\u0002*\u00020\u0001\"\b\b\u0007\u0010\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00060\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00070\u0006H\u008a@¢\u0006\u0004\b\t\u0010\n"}, m24212d2 = {"G", "", "F", "E", "Lp/nzu0;", "effectChannel", "Lp/bqz0;", "eventsChannel", "Lp/w2a1;", "handleEffects", "(Lp/nzu0;Lp/bqz0;Lp/fbk;)Ljava/lang/Object;", "<anonymous>"}, m24213k = 3, m24214mv = {1, 9, 0})
final class C1038x155001db<F, E> implements CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder.EffectHandler f5669a;

    public C1038x155001db(CoroutinesSubtypeEffectHandlerBuilder.EffectHandler effectHandler) {
        this.f5669a = effectHandler;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r5.mo15629a(r10, r9, r0) == r4) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:13:0x0033). Please report as a decompilation issue!!! */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15630a(bqa bqaVar, bqz0 bqz0Var, fbk fbkVar) throws Throwable {
        C1039xbe3d82fe c1039xbe3d82fe;
        upa upaVar;
        C1038x155001db<F, E> c1038x155001db;
        upa upaVar2;
        C1038x155001db<F, E> c1038x155001db2;
        Object objM83652a;
        if (fbkVar instanceof C1039xbe3d82fe) {
            c1039xbe3d82fe = (C1039xbe3d82fe) fbkVar;
            int i = c1039xbe3d82fe.f5675f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1039xbe3d82fe.f5675f = i - Integer.MIN_VALUE;
            } else {
                c1039xbe3d82fe = new C1039xbe3d82fe(this, (ibk) fbkVar);
            }
        } else {
            c1039xbe3d82fe = new C1039xbe3d82fe(this, (ibk) fbkVar);
        }
        Object obj = c1039xbe3d82fe.f5673d;
        int i2 = c1039xbe3d82fe.f5675f;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            bqaVar.getClass();
            upaVar = new upa(bqaVar);
            c1038x155001db = this;
            c1039xbe3d82fe.f5670a = c1038x155001db;
            c1039xbe3d82fe.f5671b = bqz0Var;
            c1039xbe3d82fe.f5672c = upaVar;
            c1039xbe3d82fe.f5675f = 1;
            objM83652a = upaVar.m83652a(c1039xbe3d82fe);
            if (objM83652a != yukVar) {
                c1038x155001db2 = c1038x155001db;
                upaVar2 = upaVar;
                obj = objM83652a;
                if (!((Boolean) obj).booleanValue()) {
                    return w2a1.f247311a;
                }
                Object objM83653c = upaVar2.m83653c();
                CoroutinesSubtypeEffectHandlerBuilder.EffectHandler effectHandler = c1038x155001db2.f5669a;
                c1039xbe3d82fe.f5670a = c1038x155001db2;
                c1039xbe3d82fe.f5671b = bqz0Var;
                c1039xbe3d82fe.f5672c = upaVar2;
                c1039xbe3d82fe.f5675f = 2;
            }
            return yukVar;
        }
        if (i2 == 1) {
            upaVar2 = c1039xbe3d82fe.f5672c;
            bqz0Var = c1039xbe3d82fe.f5671b;
            c1038x155001db2 = (C1038x155001db) c1039xbe3d82fe.f5670a;
            bga.m29073P(obj);
            if (!((Boolean) obj).booleanValue()) {
                return w2a1.f247311a;
            }
            Object objM83653c2 = upaVar2.m83653c();
            CoroutinesSubtypeEffectHandlerBuilder.EffectHandler effectHandler2 = c1038x155001db2.f5669a;
            c1039xbe3d82fe.f5670a = c1038x155001db2;
            c1039xbe3d82fe.f5671b = bqz0Var;
            c1039xbe3d82fe.f5672c = upaVar2;
            c1039xbe3d82fe.f5675f = 2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            upaVar2 = c1039xbe3d82fe.f5672c;
            bqz0Var = c1039xbe3d82fe.f5671b;
            c1038x155001db2 = (C1038x155001db) c1039xbe3d82fe.f5670a;
            bga.m29073P(obj);
        }
        upaVar = upaVar2;
        c1038x155001db = c1038x155001db2;
        c1039xbe3d82fe.f5670a = c1038x155001db;
        c1039xbe3d82fe.f5671b = bqz0Var;
        c1039xbe3d82fe.f5672c = upaVar;
        c1039xbe3d82fe.f5675f = 1;
        objM83652a = upaVar.m83652a(c1039xbe3d82fe);
        if (objM83652a != yukVar) {
            c1038x155001db2 = c1038x155001db;
            upaVar2 = upaVar;
            obj = objM83652a;
            if (!((Boolean) obj).booleanValue()) {
                return w2a1.f247311a;
            }
            Object objM83653c3 = upaVar2.m83653c();
            CoroutinesSubtypeEffectHandlerBuilder.EffectHandler effectHandler3 = c1038x155001db2.f5669a;
            c1039xbe3d82fe.f5670a = c1038x155001db2;
            c1039xbe3d82fe.f5671b = bqz0Var;
            c1039xbe3d82fe.f5672c = upaVar2;
            c1039xbe3d82fe.f5675f = 2;
        }
        return yukVar;
    }
}
