package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o6z {

    /* JADX INFO: renamed from: a */
    public final ljx0 f162439a;

    /* JADX INFO: renamed from: b */
    public final ar0 f162440b = new ar0(5);

    public o6z(ljx0 ljx0Var) {
        this.f162439a = ljx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static Object m66370a(o6z o6zVar, String str, ibk ibkVar) {
        l6z l6zVar;
        if (ibkVar instanceof l6z) {
            l6zVar = (l6z) ibkVar;
            int i = l6zVar.f130508e;
            if ((i & Integer.MIN_VALUE) != 0) {
                l6zVar.f130508e = i - Integer.MIN_VALUE;
            } else {
                l6zVar = new l6z(o6zVar, ibkVar);
            }
        } else {
            l6zVar = new l6z(o6zVar, ibkVar);
        }
        Object obj = l6zVar.f130506c;
        int i2 = l6zVar.f130508e;
        w2a1 w2a1Var = w2a1.f247311a;
        boolean z = true;
        char c = 1;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            l6zVar.f130504a = o6zVar;
            l6zVar.f130505b = str;
            l6zVar.f130508e = 1;
            Object objM65530p = nsf1.m65530p(l6zVar, new m6z(c == true ? 1 : 0, 0), o6zVar.f162439a, false, true);
            if (objM65530p != yukVar) {
                objM65530p = w2a1Var;
            }
            if (objM65530p != yukVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        str = l6zVar.f130505b;
        o6zVar = l6zVar.f130504a;
        bga.m29073P(obj);
        l6zVar.f130504a = null;
        l6zVar.f130505b = null;
        l6zVar.f130508e = 2;
        Object objM65530p2 = nsf1.m65530p(l6zVar, new cj1(z, str, 13), o6zVar.f162439a, false, true);
        if (objM65530p2 != yukVar) {
            objM65530p2 = w2a1Var;
        }
        return objM65530p2 == yukVar ? yukVar : w2a1Var;
    }
}
