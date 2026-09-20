package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class sip {

    /* JADX INFO: renamed from: a */
    public final wt80 f209581a;

    public sip(wt80 wt80Var) {
        this.f209581a = wt80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m78231a(String str, ibk ibkVar) {
        rip ripVar;
        Map map;
        if (ibkVar instanceof rip) {
            ripVar = (rip) ibkVar;
            int i = ripVar.f199584c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ripVar.f199584c = i - Integer.MIN_VALUE;
            } else {
                ripVar = new rip(this, ibkVar);
            }
        } else {
            ripVar = new rip(this, ibkVar);
        }
        Object objM62845j = ripVar.f199582a;
        int i2 = ripVar.f199584c;
        if (i2 == 0) {
            bga.m29073P(objM62845j);
            iz80 iz80Var = new iz80(str);
            ripVar.f199584c = 1;
            objM62845j = ((mu80) this.f209581a).m62845j(iz80Var, ripVar);
            yuk yukVar = yuk.f276404a;
            if (objM62845j == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62845j);
        }
        hz80 hz80Var = (hz80) ((p2x0) objM62845j).m68970c();
        return Boolean.valueOf(wj50.m88271j((hz80Var == null || (map = hz80Var.f96822X) == null) ? null : (String) map.get("is_genpods"), "true"));
    }
}
