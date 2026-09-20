package p204p;

import com.spotify.musicappplatform.bottomsheet.compose.ReflectionBasedDragHandler;

/* JADX INFO: loaded from: classes8.dex */
public final class nca implements vfj0 {

    /* JADX INFO: renamed from: a */
    public final ReflectionBasedDragHandler f152481a;

    public nca(ReflectionBasedDragHandler reflectionBasedDragHandler) {
        this.f152481a = reflectionBasedDragHandler;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: P */
    public final long mo25861P(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        float fDispatchRawDelta = this.f152481a.dispatchRawDelta(fIntBitsToFloat);
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fDispatchRawDelta)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.vfj0
    /* JADX INFO: renamed from: S0 */
    public final Object mo25862S0(long j, long j2, fbk fbkVar) {
        lca lcaVar;
        if (fbkVar instanceof lca) {
            lcaVar = (lca) fbkVar;
            int i = lcaVar.f131885d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lcaVar.f131885d = i - Integer.MIN_VALUE;
            } else {
                lcaVar = new lca(this, (ibk) fbkVar);
            }
        } else {
            lcaVar = new lca(this, (ibk) fbkVar);
        }
        Object obj = lcaVar.f131883b;
        int i2 = lcaVar.f131885d;
        if (i2 == 0) {
            bga.m29073P(obj);
            float fM60855e = m5b1.m60855e(j2);
            lcaVar.f131882a = j2;
            lcaVar.f131885d = 1;
            Object obj2 = this.f152481a.settle(fM60855e, lcaVar);
            yuk yukVar = yuk.f276404a;
            if (obj2 == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = lcaVar.f131882a;
            bga.m29073P(obj);
        }
        return new m5b1(j2);
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: k0 */
    public final long mo25863k0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        return (4294967295L & ((long) Float.floatToRawIntBits(this.f152481a.dispatchRawDelta(Float.intBitsToFloat((int) (j2 & 4294967295L)))))) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.vfj0
    /* JADX INFO: renamed from: m0 */
    public final Object mo25864m0(long j, fbk fbkVar) {
        mca mcaVar;
        if (fbkVar instanceof mca) {
            mcaVar = (mca) fbkVar;
            int i = mcaVar.f142114d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mcaVar.f142114d = i - Integer.MIN_VALUE;
            } else {
                mcaVar = new mca(this, (ibk) fbkVar);
            }
        } else {
            mcaVar = new mca(this, (ibk) fbkVar);
        }
        Object obj = mcaVar.f142112b;
        int i2 = mcaVar.f142114d;
        if (i2 == 0) {
            bga.m29073P(obj);
            float fM60855e = m5b1.m60855e(j);
            ReflectionBasedDragHandler reflectionBasedDragHandler = this.f152481a;
            float fRequireOffset = reflectionBasedDragHandler.requireOffset();
            float minAnchor = reflectionBasedDragHandler.getMinAnchor();
            if (fM60855e >= 0.0f || fRequireOffset <= minAnchor) {
                j = 0;
            } else {
                mcaVar.f142111a = j;
                mcaVar.f142114d = 1;
                Object obj2 = reflectionBasedDragHandler.settle(fM60855e, mcaVar);
                yuk yukVar = yuk.f276404a;
                if (obj2 == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = mcaVar.f142111a;
            bga.m29073P(obj);
        }
        return new m5b1(j);
    }
}
