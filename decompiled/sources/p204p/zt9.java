package p204p;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zt9 {

    /* JADX INFO: renamed from: a */
    public final z261 f286101a;

    /* JADX INFO: renamed from: b */
    public final boolean f286102b;

    public zt9(z261 z261Var, ot9 ot9Var) {
        this.f286101a = z261Var;
        this.f286102b = ot9Var.f169004a.m37728u() && !ot9Var.m67774a();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m96900a() {
        return this.f286102b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Serializable m96901b(ibk ibkVar) {
        yt9 yt9Var;
        if (ibkVar instanceof yt9) {
            yt9Var = (yt9) ibkVar;
            int i = yt9Var.f276045c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yt9Var.f276045c = i - Integer.MIN_VALUE;
            } else {
                yt9Var = new yt9(this, ibkVar);
            }
        } else {
            yt9Var = new yt9(this, ibkVar);
        }
        Object objM95178b = yt9Var.f276043a;
        int i2 = yt9Var.f276045c;
        if (i2 == 0) {
            bga.m29073P(objM95178b);
            yt9Var.f276045c = 1;
            objM95178b = this.f286101a.m95178b(yt9Var);
            yuk yukVar = yuk.f276404a;
            if (objM95178b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM95178b);
        }
        ArrayList<f781> arrayList = ((g781) objM95178b).f77210a;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (f781 f781Var : arrayList) {
            arrayList2.add(new w261(f781Var.f66591a, f781Var.f66592b, f781Var.f66593c));
        }
        return arrayList2;
    }
}
