package p204p;

import com.spotify.martini.martinidata.model.Mode;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class njy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ojy f154672a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ voc1 f154673b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Mode f154674c;

    public njy(ojy ojyVar, voc1 voc1Var, Mode mode) {
        this.f154672a = ojyVar;
        this.f154673b = voc1Var;
        this.f154674c = mode;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r9.mo30229d(r10, r0) == r4) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        mjy mjyVar;
        Object vjyVar;
        ejy ejyVar;
        if (ibkVar instanceof mjy) {
            mjyVar = (mjy) ibkVar;
            int i = mjyVar.f144421b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mjyVar.f144421b = i - Integer.MIN_VALUE;
            } else {
                mjyVar = new mjy(this, ibkVar);
            }
        } else {
            mjyVar = new mjy(this, ibkVar);
        }
        Object objM37259d = mjyVar.f144420a;
        int i2 = mjyVar.f144421b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ejyVar = mjyVar.f144424e;
                    bqz0Var = mjyVar.f144423d;
                    bga.m29073P(objM37259d);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM37259d);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM37259d);
            ejyVar = (ejy) obj;
            dxj dxjVar = this.f154672a.f166174b;
            String str = ejyVar.f60317a;
            voc1 voc1Var = this.f154673b;
            Mode mode = this.f154674c;
            mjyVar.f144423d = bqz0Var;
            mjyVar.f144424e = ejyVar;
            mjyVar.f144421b = 1;
            objM37259d = dxjVar.m37259d(str, voc1Var, mode, mjyVar);
            if (objM37259d == yukVar) {
            }
            return yukVar;
            twj twjVar = (twj) objM37259d;
            if (twjVar instanceof swj) {
                vjyVar = new wjy(ejyVar.f60317a);
            } else {
                if (!(twjVar instanceof rwj)) {
                    throw new NoWhenBranchMatchedException();
                }
                vjyVar = new vjy(ejyVar.f60317a);
            }
        } catch (Exception unused) {
            vjyVar = new vjy(obj.f60317a);
        }
        mjyVar.f144423d = null;
        mjyVar.f144424e = null;
        mjyVar.f144421b = 2;
    }
}
