package p204p;

import com.spotify.browse.clientnative.mobius.BrowseEffect;
import com.spotify.browse.clientnative.mobius.BrowseEvent;

/* JADX INFO: loaded from: classes5.dex */
public final class pz90 {

    /* JADX INFO: renamed from: a */
    public final vsk f183639a;

    /* JADX INFO: renamed from: b */
    public final boa f183640b;

    /* JADX INFO: renamed from: c */
    public final cgm f183641c;

    /* JADX INFO: renamed from: d */
    public final String f183642d;

    public pz90(vsk vskVar, boa boaVar, cgm cgmVar, String str) {
        this.f183639a = vskVar;
        this.f183640b = boaVar;
        this.f183641c = cgmVar;
        this.f183642d = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71697a(BrowseEffect.Load load, ibk ibkVar) {
        mz90 mz90Var;
        Object c6x0Var;
        if (ibkVar instanceof mz90) {
            mz90Var = (mz90) ibkVar;
            int i = mz90Var.f148661d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mz90Var.f148661d = i - Integer.MIN_VALUE;
            } else {
                mz90Var = new mz90(this, ibkVar);
            }
        } else {
            mz90Var = new mz90(this, ibkVar);
        }
        Object objM56684z = mz90Var.f148659b;
        int i2 = mz90Var.f148661d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM56684z);
                oz90 oz90Var = new oz90(this, load, null);
                mz90Var.f148658a = load;
                mz90Var.f148661d = 1;
                objM56684z = kk40.m56684z(oz90Var, mz90Var);
                yuk yukVar = yuk.f276404a;
                if (objM56684z == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                load = mz90Var.f148658a;
                bga.m29073P(objM56684z);
            }
            c6x0Var = (BrowseEvent.StructureLoaded) objM56684z;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        return thM77348a == null ? c6x0Var : new BrowseEvent.StructureLoadFailed(load.getLoadingStrategy(), thM77348a);
    }
}
