package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fpo implements iys0 {

    /* JADX INFO: renamed from: a */
    public final epo f71935a;

    /* JADX INFO: renamed from: b */
    public final wy91 f71936b;

    /* JADX INFO: renamed from: c */
    public final wg61 f71937c = new wg61(new sho(this, 7));

    public fpo(epo epoVar, saw0 saw0Var) {
        this.f71935a = epoVar;
        this.f71936b = saw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final epo m42380a() {
        epo epoVarM42380a;
        fpo fpoVar = (fpo) this.f71937c.getValue();
        return (fpoVar == null || (epoVarM42380a = fpoVar.m42380a()) == null) ? this.f71935a : epoVarM42380a;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m42380a().f61681a;
        epo[] epoVarArrValues = epo.values();
        ArrayList arrayList = new ArrayList(epoVarArrValues.length);
        for (epo epoVar : epoVarArrValues) {
            arrayList.add(epoVar.f61681a);
        }
        return geg1.m44518y(new k8a("unauth_color", "debug-feature", str, arrayList));
    }
}
