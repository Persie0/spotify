package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class dja0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c0v0 f49627a;

    public dja0(c0v0 c0v0Var) {
        this.f49627a = c0v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0098 A[Catch: Exception -> 0x00b2, LOOP:0: B:36:0x0092->B:38:0x0098, LOOP_END, TryCatch #0 {Exception -> 0x00b2, blocks: (B:18:0x003e, B:35:0x0081, B:36:0x0092, B:38:0x0098, B:39:0x00ab), top: B:48:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        cja0 cja0Var;
        int i;
        bqz0 bqz0Var2;
        bka0 bka0Var;
        ArrayList arrayList;
        zrr0 zrr0Var = this.f49627a.f32886a;
        if (ibkVar instanceof cja0) {
            cja0Var = (cja0) ibkVar;
            int i2 = cja0Var.f38550b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cja0Var.f38550b = i2 - Integer.MIN_VALUE;
            } else {
                cja0Var = new cja0(this, ibkVar);
            }
        } else {
            cja0Var = new cja0(this, ibkVar);
        }
        Object objM96771i = cja0Var.f38549a;
        int i3 = cja0Var.f38550b;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        Object obj2 = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(objM96771i);
                int i4 = ((zha0) obj).f282859c;
                cja0Var.f38552d = bqz0Var;
                cja0Var.f38553e = 0;
                cja0Var.f38550b = 1;
                n5q n5qVar = xsr.f265651a;
                Object objM89557A = x0h1.m89557A(tlp.f221498c, new nm8(i4, 9, zrr0Var, fbkVar), cja0Var);
                if (objM89557A != obj2) {
                    objM89557A = w2a1Var;
                }
                if (objM89557A != obj2) {
                    objM89557A = w2a1Var;
                }
                if (objM89557A != obj2) {
                    i = 0;
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM96771i);
                    return w2a1Var;
                }
                bqz0Var2 = cja0Var.f38552d;
                try {
                    bga.m29073P(objM96771i);
                    Iterable<zzu0> iterable = (Iterable) objM96771i;
                    arrayList = new ArrayList(i6f.m49804T(iterable, 10));
                    for (zzu0 zzu0Var : iterable) {
                        arrayList.add(new d510(zzu0Var.f288115b, zzu0Var.f288114a));
                    }
                    bka0Var = new bka0(arrayList);
                } catch (Exception unused) {
                    bka0Var = new bka0(lau.f131415a);
                }
                cja0Var.f38552d = null;
                cja0Var.f38550b = 3;
                if (bqz0Var2.mo30229d(bka0Var, cja0Var) != obj2) {
                    return obj2;
                }
                return w2a1Var;
            }
            i = cja0Var.f38553e;
            bqz0Var = cja0Var.f38552d;
            bga.m29073P(objM96771i);
            cja0Var.f38552d = bqz0Var;
            cja0Var.f38553e = i;
            cja0Var.f38550b = 2;
            objM96771i = zrr0Var.m96771i(cja0Var);
            if (objM96771i != obj2) {
                bqz0Var2 = bqz0Var;
                Iterable<zzu0> iterable2 = (Iterable) objM96771i;
                arrayList = new ArrayList(i6f.m49804T(iterable2, 10));
                while (r13.hasNext()) {
                    arrayList.add(new d510(zzu0Var.f288115b, zzu0Var.f288114a));
                }
                bka0Var = new bka0(arrayList);
                cja0Var.f38552d = null;
                cja0Var.f38550b = 3;
                if (bqz0Var2.mo30229d(bka0Var, cja0Var) != obj2) {
                    return w2a1Var;
                }
            }
        } catch (Exception unused2) {
            bqz0Var2 = bqz0Var;
            bka0Var = new bka0(lau.f131415a);
        }
        return obj2;
    }
}
