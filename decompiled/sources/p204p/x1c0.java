package p204p;

import android.content.res.Resources;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class x1c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a2c0 f257161a;

    public x1c0(a2c0 a2c0Var) {
        this.f257161a = a2c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        w1c0 w1c0Var;
        upg0 upg0Var;
        if (ibkVar instanceof w1c0) {
            w1c0Var = (w1c0) ibkVar;
            int i = w1c0Var.f247075b;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1c0Var.f247075b = i - Integer.MIN_VALUE;
            } else {
                w1c0Var = new w1c0(this, ibkVar);
            }
        } else {
            w1c0Var = new w1c0(this, ibkVar);
        }
        Object obj2 = w1c0Var.f247074a;
        int i2 = w1c0Var.f247075b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        e1c0 e1c0Var = (e1c0) obj;
        m1c0 m1c0Var = this.f257161a.f11623a;
        String str = e1c0Var.f55175c;
        k1n0 k1n0Var = e1c0Var.f55176d;
        nh61 nh61Var = m1c0Var.f138934d;
        String string = ((Resources) nh61Var.f153884b).getString(R.string.manage_blocked_content_snackbar_entity_removed);
        int iOrdinal = k1n0Var.ordinal();
        if (iOrdinal == 0) {
            upg0Var = upg0.REMOVE_FROM_APPROVED;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            upg0Var = upg0.REMOVE_FROM_BLOCKED;
        }
        nzx0 nzx0Var = new nzx0(new nd0(nh61Var, str, upg0Var, string, (fbk) null));
        mwa0 mwa0Var = new mwa0(bqz0Var, 6);
        w1c0Var.f247075b = 1;
        Object objCollect = nzx0Var.collect(new gtt(mwa0Var, str, 26), w1c0Var);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}
