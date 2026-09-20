package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t3u implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f216838a;

    public t3u(List list) {
        this.f216838a = list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        s3u s3uVar;
        if (ibkVar instanceof s3u) {
            s3uVar = (s3u) ibkVar;
            int i = s3uVar.f205342b;
            if ((i & Integer.MIN_VALUE) != 0) {
                s3uVar.f205342b = i - Integer.MIN_VALUE;
            } else {
                s3uVar = new s3u(this, ibkVar);
            }
        } else {
            s3uVar = new s3u(this, ibkVar);
        }
        Object obj2 = s3uVar.f205341a;
        int i2 = s3uVar.f205342b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new sqt(this.f216838a, ((kyq0) obj).f127903a, (fbk) null, 1));
            d6i d6iVar = new d6i(bqz0Var, 26);
            s3uVar.f205342b = 1;
            Object objCollect = nzx0Var.collect(d6iVar, s3uVar);
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
