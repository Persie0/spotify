package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class eov extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pov f61481b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eov(pov povVar, int i) {
        super(2);
        this.f61480a = i;
        this.f61481b = povVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f61480a;
        pov povVar = this.f61481b;
        switch (i) {
            case 0:
                bov bovVar = (bov) obj;
                cov covVar = (cov) obj2;
                int i2 = bovVar.f29256b;
                Object obj3 = bovVar.f29259e;
                wf4 wf4Var = povVar.f179801d;
                boolean zM87936G = wf4Var.m87936G();
                tjo tjoVar = rov.f201355a;
                if (!zM87936G && (obj3 instanceof xnv)) {
                    obj3 = vnv.f243253b;
                }
                if (wj50.m88271j(bovVar.f29255a, covVar.f40345a) && i2 == covVar.f40346b && wj50.m88271j(obj3, covVar.f40356l)) {
                    return !wj50.m88271j(bovVar.f29257c, covVar.f40357m) ? Next.m15606h(cov.m33510a(covVar, null, null, null, false, false, null, null, null, null, bovVar.f29257c, 4095)) : Next.m15608j();
                }
                cov covVarM76083a = rov.m76083a(bovVar, wf4Var.m87936G());
                bov bovVar2 = i2 == 2 ? bovVar : null;
                return Next.m15607i(covVarM76083a, Collections.singleton(new rnv(bovVar, bovVar2 != null ? pov.m70490f(povVar, bovVar2) : null)));
            default:
                bov bovVar3 = (bov) obj;
                cov covVar2 = (cov) obj2;
                bov bovVar4 = bovVar3.f29256b == 2 ? bovVar3 : null;
                return First.m15575c(covVar2, Collections.singleton(new rnv(bovVar3, bovVar4 != null ? pov.m70490f(povVar, bovVar4) : null)));
        }
    }
}
