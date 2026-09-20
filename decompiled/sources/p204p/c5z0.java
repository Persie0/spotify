package p204p;

import com.spotify.gander.p072v2.proto.SecondaryAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class c5z0 {

    /* JADX INFO: renamed from: a */
    public final vxe1 f34317a;

    /* JADX INFO: renamed from: b */
    public final sn91 f34318b;

    public c5z0(vxe1 vxe1Var, sn91 sn91Var) {
        this.f34317a = vxe1Var;
        this.f34318b = sn91Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m31495a(y4z0 y4z0Var, ibk ibkVar) {
        b5z0 b5z0Var;
        if (ibkVar instanceof b5z0) {
            b5z0Var = (b5z0) ibkVar;
            int i = b5z0Var.f23795c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b5z0Var.f23795c = i - Integer.MIN_VALUE;
            } else {
                b5z0Var = new b5z0(this, ibkVar);
            }
        } else {
            b5z0Var = new b5z0(this, ibkVar);
        }
        Object objM86652a = b5z0Var.f23793a;
        int i2 = b5z0Var.f23795c;
        if (i2 == 0) {
            bga.m29073P(objM86652a);
            String str = y4z0Var.f269281a;
            b5z0Var.f23795c = 1;
            objM86652a = this.f34317a.m86652a(str, b5z0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86652a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86652a);
        }
        List list = ((bsy) objM86652a).f30427a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v4z0 v4z0Var = (v4z0) this.f34318b.invoke((SecondaryAction) it.next());
            if (v4z0Var != null) {
                arrayList.add(v4z0Var);
            }
        }
        return new x4z0(arrayList);
    }
}
