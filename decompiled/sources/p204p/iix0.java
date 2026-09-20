package p204p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class iix0 implements uv01 {

    /* JADX INFO: renamed from: a */
    public final aw01 f102646a;

    /* JADX INFO: renamed from: b */
    public final ynb f102647b;

    public iix0(aw01 aw01Var, ynb ynbVar) {
        this.f102646a = aw01Var;
        this.f102647b = ynbVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.uv01
    /* JADX INFO: renamed from: a */
    public final Object mo27271a(List list, ibk ibkVar) {
        hix0 hix0Var;
        String strM35712j;
        if (ibkVar instanceof hix0) {
            hix0Var = (hix0) ibkVar;
            int i = hix0Var.f91894c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hix0Var.f91894c = i - Integer.MIN_VALUE;
            } else {
                hix0Var = new hix0(this, ibkVar);
            }
        } else {
            hix0Var = new hix0(this, ibkVar);
        }
        Object objMo27271a = hix0Var.f91892a;
        int i2 = hix0Var.f91894c;
        if (i2 == 0) {
            bga.m29073P(objMo27271a);
            hix0Var.f91894c = 1;
            objMo27271a = this.f102646a.mo27271a(list, hix0Var);
            yuk yukVar = yuk.f276404a;
            if (objMo27271a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo27271a);
        }
        Map map = (Map) objMo27271a;
        l44 l44Var = this.f102647b.f274426a;
        if (!l44Var.m58075h() || !l44Var.m58058X()) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            tv01 tv01Var = (tv01) entry.getKey();
            rv01 rv01VarM55224z = (rv01) entry.getValue();
            String str = tv01Var.f224020a;
            if (hyv.m49209i(str)) {
                Set set = dd41.f47702f;
                strM35712j = r46.m74726U(str).m35712j();
            } else {
                strM35712j = null;
            }
            if (strM35712j != null) {
                rv01VarM55224z = k2z0.m55224z(rv01VarM55224z, strM35712j);
            }
            linkedHashMap.put(key, rv01VarM55224z);
        }
        return linkedHashMap;
    }
}
