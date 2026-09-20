package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class p7d {

    /* JADX INFO: renamed from: a */
    public final hd41 f174647a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f174648b;

    public p7d(hd41 hd41Var, ron ronVar) {
        this.f174647a = hd41Var;
        this.f174648b = ronVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static Object m69253a(p7d p7dVar, String str, ibk ibkVar) {
        n7d n7dVar;
        if (ibkVar instanceof n7d) {
            n7dVar = (n7d) ibkVar;
            int i = n7dVar.f151136c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n7dVar.f151136c = i - Integer.MIN_VALUE;
            } else {
                n7dVar = new n7d(p7dVar, ibkVar);
            }
        } else {
            n7dVar = new n7d(p7dVar, ibkVar);
        }
        Object objM69254b = n7dVar.f151134a;
        int i2 = n7dVar.f151136c;
        if (i2 == 0) {
            bga.m29073P(objM69254b);
            n7dVar.f151136c = 1;
            objM69254b = p7dVar.m69254b(str, n7dVar);
            Object obj = yuk.f276404a;
            if (objM69254b == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM69254b);
        }
        return Boolean.valueOf(((svc) objM69254b).f214378a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m69254b(String str, ibk ibkVar) {
        o7d o7dVar;
        Object objM47167c;
        if (ibkVar instanceof o7d) {
            o7dVar = (o7d) ibkVar;
            int i = o7dVar.f162517c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7dVar.f162517c = i - Integer.MIN_VALUE;
            } else {
                o7dVar = new o7d(this, ibkVar);
            }
        } else {
            o7dVar = new o7d(this, ibkVar);
        }
        Object obj = o7dVar.f162515a;
        int i2 = o7dVar.f162517c;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (!((af4) this.f174648b.get()).m25798a()) {
                return new svc(false, false);
            }
            o7dVar.f162517c = 1;
            objM47167c = this.f174647a.m47167c(str, o7dVar);
            yuk yukVar = yuk.f276404a;
            if (objM47167c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            objM47167c = ((s6x0) obj).f206218a;
        }
        if (!(objM47167c instanceof c6x0)) {
            List list = (List) objM47167c;
            objM47167c = new svc(list.contains(tn3.f221868a), list.contains(tn3.f221872e));
        }
        return objM47167c instanceof c6x0 ? new svc(false, false) : objM47167c;
    }
}
