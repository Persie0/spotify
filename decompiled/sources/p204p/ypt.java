package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ypt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bqt f275022a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f275023b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f275024c;

    public ypt(bqt bqtVar, String str, gh00 gh00Var) {
        this.f275022a = bqtVar;
        this.f275023b = str;
        this.f275024c = gh00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        wpt wptVar;
        if (ibkVar instanceof wpt) {
            wptVar = (wpt) ibkVar;
            int i = wptVar.f253838b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wptVar.f253838b = i - Integer.MIN_VALUE;
            } else {
                wptVar = new wpt(this, ibkVar);
            }
        } else {
            wptVar = new wpt(this, ibkVar);
        }
        Object obj2 = wptVar.f253837a;
        int i2 = wptVar.f253838b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            Set set = ((sok0) obj).f211206a;
            bqt bqtVar = this.f275022a;
            ia2 ia2Var = new ia2(xtm0.m92074U(nxf1.m65833l(new aqt(set, bqtVar, this.f275024c, null)), new hc0((fbk) null, bqtVar, this.f275023b, 17)), 8);
            xpt xptVar = new xpt(bqz0Var, 0);
            wptVar.f253838b = 1;
            Object objCollect = ia2Var.collect(xptVar, wptVar);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
