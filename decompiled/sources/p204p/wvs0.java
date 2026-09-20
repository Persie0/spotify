package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class wvs0 {

    /* JADX INFO: renamed from: a */
    public final r3n0 f255589a;

    /* JADX INFO: renamed from: b */
    public final cdv f255590b;

    /* JADX INFO: renamed from: c */
    public final eoi f255591c;

    /* JADX INFO: renamed from: d */
    public final luk f255592d;

    public wvs0(r3n0 r3n0Var, cdv cdvVar, eoi eoiVar, luk lukVar) {
        this.f255589a = r3n0Var;
        this.f255590b = cdvVar;
        this.f255591c = eoiVar;
        this.f255592d = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m89157a(wvs0 wvs0Var, yvs0 yvs0Var, ibk ibkVar) {
        vvs0 vvs0Var;
        if (ibkVar instanceof vvs0) {
            vvs0Var = (vvs0) ibkVar;
            int i = vvs0Var.f245303c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vvs0Var.f245303c = i - Integer.MIN_VALUE;
            } else {
                vvs0Var = new vvs0(wvs0Var, ibkVar);
            }
        } else {
            vvs0Var = new vvs0(wvs0Var, ibkVar);
        }
        Object objM39571b = vvs0Var.f245301a;
        int i2 = vvs0Var.f245303c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM39571b);
                eoi eoiVar = wvs0Var.f255591c;
                String str = yvs0Var.f276716a;
                vvs0Var.f245303c = 1;
                objM39571b = eoiVar.m39571b(str, vvs0Var);
                yuk yukVar = yuk.f276404a;
                if (objM39571b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM39571b);
            }
            bus0 bus0Var = (bus0) objM39571b;
            String str2 = bus0Var.f31206c;
            String str3 = bus0Var.f31204a;
            String str4 = bus0Var.f31205b;
            List<zts0> list = bus0Var.f31207d;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            for (zts0 zts0Var : list) {
                String str5 = zts0Var.f286254b;
                if (str5.length() <= 0) {
                    str5 = null;
                }
                arrayList.add(new hws0(str5, zts0Var.f286253a, zts0Var.f286255c, zts0Var.f286256d));
            }
            return new bws0(str2, str3, str4, arrayList);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return aws0.f20667a;
        }
    }
}
