package p204p;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class xp60 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f264513a;

    /* JADX INFO: renamed from: b */
    public final zp60 f264514b;

    public /* synthetic */ xp60(zp60 zp60Var, int i) {
        this.f264513a = i;
        this.f264514b = zp60Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f264513a) {
            case 0:
                zp60 zp60Var = this.f264514b;
                boolean zM96662e = zp60Var.m96662e();
                if (zM96662e) {
                    lpv0 lpv0Var = zp60Var.f284953o;
                    qr60[] qr60VarArr = zp60.f284940x;
                    qr60 qr60Var = qr60VarArr[11];
                    Collection collection = (Collection) lpv0Var.invoke();
                    lpv0 lpv0Var2 = zp60Var.f284955q;
                    qr60 qr60Var2 = qr60VarArr[13];
                    return g6f.m43700N0((Collection) lpv0Var2.invoke(), collection);
                }
                if (zM96662e) {
                    throw new NoWhenBranchMatchedException();
                }
                lpv0 lpv0Var3 = zp60Var.f284959u;
                qr60 qr60Var3 = zp60.f284940x[17];
                Collection collection2 = (Collection) lpv0Var3.invoke();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collection2) {
                    if (lay.m58583e((tvq) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                zp60 zp60Var2 = this.f264514b;
                Collection collectionM96658a = zp60Var2.m96658a();
                lpv0 lpv0Var4 = zp60Var2.f284953o;
                qr60 qr60Var4 = zp60.f284940x[11];
                return g6f.m43700N0((Collection) lpv0Var4.invoke(), collectionM96658a);
        }
    }
}
