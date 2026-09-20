package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class ph1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e3p f177442a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kh1 f177443b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kh1 f177444c;

    public ph1(e3p e3pVar, kh1 kh1Var, kh1 kh1Var2) {
        this.f177442a = e3pVar;
        this.f177443b = kh1Var;
        this.f177444c = kh1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        oh1 oh1Var;
        Object c6x0Var;
        ug1 ug1Var;
        Object next;
        if (ibkVar instanceof oh1) {
            oh1Var = (oh1) ibkVar;
            int i = oh1Var.f165311b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oh1Var.f165311b = i - Integer.MIN_VALUE;
            } else {
                oh1Var = new oh1(this, ibkVar);
            }
        } else {
            oh1Var = new oh1(this, ibkVar);
        }
        Object objM59328c = oh1Var.f165310a;
        int i2 = oh1Var.f165311b;
        w2a1 w2a1Var = w2a1.f247311a;
        kh1 kh1Var = this.f177444c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM59328c);
                ug1Var = (ug1) obj;
                e3p e3pVar = this.f177442a;
                String str = ug1Var.f229943a;
                List list = ug1Var.f229944b;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pla1) it.next()).f178681a);
                }
                oh1Var.f165313d = ug1Var;
                oh1Var.f165311b = 1;
                objM59328c = e3pVar.f55841b.m59328c(str, arrayList, oh1Var);
                yuk yukVar = yuk.f276404a;
                if (objM59328c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ug1Var = oh1Var.f165313d;
                bga.m29073P(objM59328c);
            }
            gv1 gv1Var = (gv1) objM59328c;
            if (gv1Var instanceof fv1) {
                List<akk> list2 = ((fv1) gv1Var).f73617a.f203053e;
                ArrayList arrayList2 = new ArrayList();
                for (akk akkVar : list2) {
                    Iterator it2 = ug1Var.f229944b.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!wj50.m88271j(((pla1) next).f178681a, akkVar.f16560a.f178681a));
                    pla1 pla1Var = (pla1) next;
                    akk akkVarM26248c = pla1Var != null ? akk.m26248c(akkVar, pla1Var, null, 14) : null;
                    if (akkVarM26248c != null) {
                        arrayList2.add(akkVarM26248c);
                    }
                }
                this.f177443b.invoke(arrayList2);
            } else {
                if (!(gv1Var instanceof ev1)) {
                    throw new NoWhenBranchMatchedException();
                }
                kh1Var.invoke(((ev1) gv1Var).f63119a);
            }
            c6x0Var = w2a1Var;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            qlg1.m73220y(oh1Var.getContext());
            kh1Var.invoke(null);
        }
        return w2a1Var;
    }
}
