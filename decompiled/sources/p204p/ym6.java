package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ym6 {

    /* JADX INFO: renamed from: a */
    public static final ym6 f274165a = new ym6();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m94184a(f940 f940Var, vb40 vb40Var, ibk ibkVar) {
        xm6 xm6Var;
        if (ibkVar instanceof xm6) {
            xm6Var = (xm6) ibkVar;
            int i = xm6Var.f263299d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xm6Var.f263299d = i - Integer.MIN_VALUE;
            } else {
                xm6Var = new xm6(this, ibkVar);
            }
        } else {
            xm6Var = new xm6(this, ibkVar);
        }
        Object objM48898c = xm6Var.f263297b;
        int i2 = xm6Var.f263299d;
        if (i2 == 0) {
            bga.m29073P(objM48898c);
            xm6Var.f263296a = vb40Var;
            xm6Var.f263299d = 1;
            objM48898c = ((hvu0) f940Var).m48898c(vb40Var, xm6Var);
            yuk yukVar = yuk.f276404a;
            if (objM48898c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vb40Var = xm6Var.f263296a;
            bga.m29073P(objM48898c);
        }
        ec40 ec40Var = (ec40) objM48898c;
        if (ec40Var instanceof ny51) {
            ny51 ny51Var = (ny51) ec40Var;
            return new sm6(tw41.m81631e(ny51Var.f159718a, vb40Var.f239399a, 1), ny51Var);
        }
        if (!(ec40Var instanceof fgw)) {
            throw new NoWhenBranchMatchedException();
        }
        fgw fgwVar = (fgw) ec40Var;
        p340 p340Var = fgwVar.f69410a;
        return new qm6(p340Var != null ? tw41.m81631e(p340Var, vb40Var.f239399a, 1) : null, fgwVar);
    }
}
