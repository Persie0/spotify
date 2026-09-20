package p204p;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class sx71 {

    /* JADX INFO: renamed from: a */
    public final px00 f214836a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m79584a(String str, String str2, ibk ibkVar, boolean z) {
        rx71 rx71Var;
        if (ibkVar instanceof rx71) {
            rx71Var = (rx71) ibkVar;
            int i = rx71Var.f203521d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rx71Var.f203521d = i - Integer.MIN_VALUE;
            } else {
                rx71Var = new rx71(this, ibkVar);
            }
        } else {
            rx71Var = new rx71(this, ibkVar);
        }
        Object objM71342g = rx71Var.f203519b;
        int i2 = rx71Var.f203521d;
        if (i2 == 0) {
            bga.m29073P(objM71342g);
            Map mapSingletonMap = Collections.singletonMap(str, Boolean.valueOf(z));
            rx71Var.f203518a = str2;
            rx71Var.f203521d = 1;
            objM71342g = this.f214836a.m71342g(str2, mapSingletonMap, rx71Var);
            Object obj = yuk.f276404a;
            if (objM71342g == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = rx71Var.f203518a;
            bga.m29073P(objM71342g);
        }
        List list = (List) objM71342g;
        if (list.isEmpty()) {
            throw new IllegalStateException(edb.m38564m("returned no affected entities for URI: ", str2));
        }
        return list;
    }
}
