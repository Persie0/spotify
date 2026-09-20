package p204p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class s221 {

    /* JADX INFO: renamed from: a */
    public final unn f204889a;

    /* JADX INFO: renamed from: b */
    public final vnn f204890b;

    /* JADX INFO: renamed from: c */
    public final xnn f204891c;

    public s221(unn unnVar, vnn vnnVar, xnn xnnVar) {
        this.f204889a = unnVar;
        this.f204890b = vnnVar;
        this.f204891c = xnnVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m77002a(String str, ArrayList arrayList, ibk ibkVar) {
        r221 r221Var;
        r0e1 r0e1Var;
        unn unnVar;
        if (ibkVar instanceof r221) {
            r221Var = (r221) ibkVar;
            int i = r221Var.f195041e;
            if ((i & Integer.MIN_VALUE) != 0) {
                r221Var.f195041e = i - Integer.MIN_VALUE;
            } else {
                r221Var = new r221(this, ibkVar);
            }
        } else {
            r221Var = new r221(this, ibkVar);
        }
        Object obj = r221Var.f195039c;
        int i2 = r221Var.f195041e;
        if (i2 == 0) {
            bga.m29073P(obj);
            son sonVar = this.f204890b.f243179a.f201303a;
            r0e1 r0e1Var2 = new r0e1((Context) sonVar.f212437t1.f246642a, (xre) sonVar.f211251B1.get(), (wb11) sonVar.f212198k3.get(), str);
            ezw0 ezw0Var = new ezw0(new mpk((xre) this.f204891c.f263693a.f201303a.f211251B1.get()), r0e1Var2);
            unn unnVar2 = this.f204889a;
            r221Var.f195037a = unnVar2;
            r221Var.f195038b = r0e1Var2;
            r221Var.f195041e = 1;
            Object objM40416j = ezw0Var.m40416j(arrayList, r221Var);
            yuk yukVar = yuk.f276404a;
            if (objM40416j == yukVar) {
                return yukVar;
            }
            obj = objM40416j;
            r0e1Var = r0e1Var2;
            unnVar = unnVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r0e1Var = r221Var.f195038b;
            unnVar = r221Var.f195037a;
            bga.m29073P(obj);
        }
        unnVar.getClass();
        return new t221(r0e1Var, (Map) obj);
    }
}
