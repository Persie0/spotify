package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class g7d implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h7d f77244a;

    public g7d(h7d h7dVar) {
        this.f77244a = h7dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        f7d f7dVar;
        if (ibkVar instanceof f7d) {
            f7dVar = (f7d) ibkVar;
            int i = f7dVar.f66653b;
            if ((i & Integer.MIN_VALUE) != 0) {
                f7dVar.f66653b = i - Integer.MIN_VALUE;
            } else {
                f7dVar = new f7d(this, ibkVar);
            }
        } else {
            f7dVar = new f7d(this, ibkVar);
        }
        Object obj2 = f7dVar.f66652a;
        int i2 = f7dVar.f66653b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            e5d e5dVar = (e5d) obj;
            he90 he90Var = this.f77244a.f88429r;
            String str = e5dVar.f56353a;
            boolean z = e5dVar.f56354b;
            fiz fizVarM86024a = ((vmz) he90Var.f90379c).m86024a("share-listening-activity", false);
            gzj0 gzj0Var = (gzj0) ((ryj0) he90Var.f90384h);
            fbk fbkVar = null;
            fiz fizVarM46214k = gzj0Var.m46214k(mjd.m61968d(6, str, null), new dzj0(gzj0Var, fbkVar, 1));
            iud iudVar = (iud) ((fud) he90Var.f90380d);
            vjz vjzVar = new vjz(new mp80(mvl0.m62953p(g0g1.m43301f(fizVarM86024a, fizVarM46214k, mvl0.m62953p(new vjz(new C2373se(((mv31) iudVar.f105947b).m62899t(iud.f105943h), 24), new b6b(iudVar, fbkVar, 21))), (lqi0) iudVar.f105948c.getValue(), new fe90(he90Var, z, str, null))), 14), new ga2(3, 14, fbkVar), 2);
            z6d z6dVar = new z6d(bqz0Var, 4);
            f7dVar.f66653b = 1;
            Object objCollect = vjzVar.collect(z6dVar, f7dVar);
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
