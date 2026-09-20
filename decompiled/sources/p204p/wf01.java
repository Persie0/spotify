package p204p;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class wf01 {

    /* JADX INFO: renamed from: a */
    public final Context f250652a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f250653b = new LinkedHashMap();

    public wf01(Context context) {
        this.f250652a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m87918a(String str, wd01 wd01Var, vh00 vh00Var, ibk ibkVar) {
        vf01 vf01Var;
        tf01 tf01Var;
        Object obj;
        if (ibkVar instanceof vf01) {
            vf01Var = (vf01) ibkVar;
            int i = vf01Var.f240867e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vf01Var.f240867e = i - Integer.MIN_VALUE;
            } else {
                vf01Var = new vf01(this, ibkVar);
            }
        } else {
            vf01Var = new vf01(this, ibkVar);
        }
        Object objMo24510D0 = vf01Var.f240865c;
        int i2 = vf01Var.f240867e;
        LinkedHashMap linkedHashMap = this.f250653b;
        if (i2 == 0) {
            bga.m29073P(objMo24510D0);
            uf01 uf01Var = (uf01) linkedHashMap.get(str);
            if (uf01Var != null) {
                if (!wj50.m88271j(uf01Var.f229638a, wd01Var)) {
                    uf01Var = null;
                }
                if (uf01Var != null && (tf01Var = uf01Var.f229639b) != null) {
                    return tf01Var;
                }
            }
            vf01Var.f240863a = str;
            vf01Var.f240864b = wd01Var;
            vf01Var.f240867e = 1;
            objMo24510D0 = vh00Var.mo24510D0(this.f250652a, str, vf01Var);
            Object obj2 = yuk.f276404a;
            obj = wd01Var;
            if (objMo24510D0 == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj3 = vf01Var.f240864b;
            str = vf01Var.f240863a;
            bga.m29073P(objMo24510D0);
            obj = obj3;
        }
        tf01 tf01Var2 = (tf01) objMo24510D0;
        linkedHashMap.put(str, new uf01(obj, tf01Var2));
        return tf01Var2;
    }
}
