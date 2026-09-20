package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes4.dex */
public final class ikb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hun0 f103084a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ up0 f103085b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hrw f103086c;

    public ikb1(hun0 hun0Var, up0 up0Var, hrw hrwVar) {
        this.f103084a = hun0Var;
        this.f103085b = up0Var;
        this.f103086c = hrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r3.f103085b.m83640a(r3.f103086c, r5, r4) == r2) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        hkb1 hkb1Var;
        int i;
        if (ibkVar instanceof hkb1) {
            hkb1Var = (hkb1) ibkVar;
            int i2 = hkb1Var.f92412b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hkb1Var.f92412b = i2 - Integer.MIN_VALUE;
            } else {
                hkb1Var = new hkb1(this, ibkVar);
            }
        } else {
            hkb1Var = new hkb1(this, ibkVar);
        }
        Object objM96567o = hkb1Var.f92411a;
        int i3 = hkb1Var.f92412b;
        yuk yukVar = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = hkb1Var.f92414d;
                bga.m29073P(objM96567o);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM96567o);
        Single singleM23327A = ((Flowable) this.f103084a.f95431b).m23348j(d3v.f45011Y).m23327A();
        i = 0;
        hkb1Var.f92414d = 0;
        hkb1Var.f92412b = 1;
        objM96567o = zn91.m96567o(singleM23327A, hkb1Var);
        if (objM96567o != yukVar) {
        }
        return yukVar;
        boolean zBooleanValue = ((Boolean) objM96567o).booleanValue();
        hkb1Var.f92414d = i;
        hkb1Var.f92412b = 2;
    }
}
