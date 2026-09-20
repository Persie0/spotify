package p204p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class zbk0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qyr f281341a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f281342b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eqb f281343c;

    public zbk0(qyr qyrVar, Context context, eqb eqbVar) {
        this.f281341a = qyrVar;
        this.f281342b = context;
        this.f281343c = eqbVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        ybk0 ybk0Var;
        if (ibkVar instanceof ybk0) {
            ybk0Var = (ybk0) ibkVar;
            int i = ybk0Var.f271207b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ybk0Var.f271207b = i - Integer.MIN_VALUE;
            } else {
                ybk0Var = new ybk0(this, ibkVar);
            }
        } else {
            ybk0Var = new ybk0(this, ibkVar);
        }
        Object obj2 = ybk0Var.f271206a;
        int i2 = ybk0Var.f271207b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            qyr qyrVar = this.f281341a;
            fbk fbkVar = null;
            vjz vjzVar = new vjz(new r1a(new xif0(9, new tjz(new r1a(mvl0.m62953p(new g7p(qyrVar.f194018c, 19)), new ta1(qyrVar, fbkVar, 9), 8), new aw0(qyrVar, fbkVar, 7)), this.f281342b), new qff0(this.f281343c, fbkVar, 21), 8), new yzb0(3, 4, fbkVar), 2);
            mwa0 mwa0Var = new mwa0(bqz0Var, 22);
            ybk0Var.f271207b = 1;
            Object objCollect = vjzVar.collect(mwa0Var, ybk0Var);
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
