package p204p;

import com.spotify.home.evopage.mobius.C0788e;
import com.spotify.home.evopage.mobius.Effect;
import com.spotify.home.evopage.mobius.Event;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;

/* JADX INFO: loaded from: classes2.dex */
public final class sex implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0788e f208397a;

    public sex(C0788e c0788e) {
        this.f208397a = c0788e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f7, code lost:
    
        if (r12.mo30229d(r13, r0) == r5) goto L45;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        rex rexVar;
        Object c6x0Var;
        if (ibkVar instanceof rex) {
            rexVar = (rex) ibkVar;
            int i = rexVar.f198447b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rexVar.f198447b = i - Integer.MIN_VALUE;
            } else {
                rexVar = new rex(this, ibkVar);
            }
        } else {
            rexVar = new rex(this, ibkVar);
        }
        Object gotHomeFeatureType = rexVar.f198446a;
        int i2 = rexVar.f198447b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = rexVar.f198449d;
                bga.m29073P(gotHomeFeatureType);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(gotHomeFeatureType);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(gotHomeFeatureType);
        Effect.TryAddingBrandAdPreview tryAddingBrandAdPreview = (Effect.TryAddingBrandAdPreview) obj;
        mja mjaVar = (mja) this.f208397a.f4158b.get();
        rexVar.f198449d = bqz0Var;
        rexVar.f198447b = 1;
        nja njaVar = (nja) mjaVar;
        njaVar.getClass();
        t3x0 responseInstrumentationData = tryAddingBrandAdPreview.getResponseInstrumentationData();
        try {
            g330 g330Var = njaVar.f154535a;
            MaybeSource maybeSourceOnErrorComplete = wl51.m88460J0(g330Var.f76083b) ? MaybeEmpty.f8264a : g330Var.f76082a.m47166a(g330Var.f76083b).map(ddy.f47908f).doFinally(new jo10(g330Var, 1)).onErrorComplete();
            maybeSourceOnErrorComplete.getClass();
            BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
            maybeSourceOnErrorComplete.subscribe(blockingMultiObserver);
            bu0 bu0Var = (bu0) blockingMultiObserver.m23463b();
            if (bu0Var == null) {
                c6x0Var = null;
            } else if (!bu0Var.f30969h.isEmpty()) {
                c6x0Var = nja.m64603a(bu0Var, responseInstrumentationData);
            } else {
                if (bu0Var.f30968g.isEmpty()) {
                    throw new IllegalStateException(("Preview is associated with an unexpected format " + bu0Var).toString());
                }
                c6x0Var = nja.m64604b(bu0Var, responseInstrumentationData);
            }
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        gotHomeFeatureType = c6x0Var != null ? new Event.GotHomeFeatureType((k330) c6x0Var, tryAddingBrandAdPreview.getFirstAnchorFeatureIndex() + 1) : new Event.GotHomeFeatureType(null, -1);
        if (gotHomeFeatureType != yukVar) {
        }
        return yukVar;
        rexVar.f198449d = null;
        rexVar.f198447b = 2;
    }
}
