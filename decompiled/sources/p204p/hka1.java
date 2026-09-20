package p204p;

import android.net.Uri;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class hka1 implements ic50 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.ic50
    /* JADX INFO: renamed from: a */
    public final Object mo44137a(lvu0 lvu0Var, fbk fbkVar) {
        gka1 gka1Var;
        if (fbkVar instanceof gka1) {
            gka1Var = (gka1) fbkVar;
            int i = gka1Var.f80773f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gka1Var.f80773f = i - Integer.MIN_VALUE;
            } else {
                gka1Var = new gka1(this, (ibk) fbkVar);
            }
        } else {
            gka1Var = new gka1(this, (ibk) fbkVar);
        }
        Object objM60083c = gka1Var.f80771d;
        int i2 = gka1Var.f80773f;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM60083c);
            Object obj2 = lvu0Var.f137396d.f239400b;
            gka1Var.f80768a = null;
            gka1Var.f80773f = 1;
            Object objM60083c2 = lvu0Var.m60083c(gka1Var);
            if (objM60083c2 != obj) {
                return objM60083c2;
            }
        } else {
            if (i2 == 1) {
                bga.m29073P(objM60083c);
                return objM60083c;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it = gka1Var.f80770c;
            rlv0 rlv0Var = gka1Var.f80769b;
            lvu0 lvu0Var2 = gka1Var.f80768a;
            bga.m29073P(objM60083c);
            do {
                ec40 ec40Var = (ec40) objM60083c;
                if (!(ec40Var instanceof fgw)) {
                    return ec40Var;
                }
                rlv0Var.f200373a = ec40Var;
                if (!it.hasNext()) {
                    Object obj3 = rlv0Var.f200373a;
                    wj50.m88279p(obj3);
                    return obj3;
                }
                Uri uri = (Uri) it.next();
                rb40 rb40VarM85111a = vb40.m85111a(lvu0Var2.f137396d);
                rb40VarM85111a.f197443c = uri;
                vb40 vb40VarM75137a = rb40VarM85111a.m75137a();
                int i3 = lvu0Var2.f137395c;
                if (i3 > 0) {
                    lvu0Var2.m60082a(vb40VarM75137a, (ic50) lvu0Var2.f137394b.get(i3 - 1));
                }
                lvu0 lvu0VarM60081b = lvu0.m60081b(lvu0Var2, 0, vb40VarM75137a, 5);
                gka1Var.f80768a = lvu0Var2;
                gka1Var.f80769b = rlv0Var;
                gka1Var.f80770c = it;
                gka1Var.f80773f = 2;
                objM60083c = lvu0VarM60081b.m60083c(gka1Var);
            } while (objM60083c != obj);
        }
        return obj;
    }
}
