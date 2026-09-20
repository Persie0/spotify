package p204p;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class wul implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255225a;

    /* JADX INFO: renamed from: b */
    public final Object f255226b;

    public /* synthetic */ wul(Object obj, int i) {
        this.f255225a = i;
        this.f255226b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Class<?> enclosingClass;
        int i = this.f255225a;
        Object obj = this.f255226b;
        switch (i) {
            case 0:
                return ((c791) obj).f34830d.getValue();
            case 1:
                return j0b1.m52045d(((tvq) obj).mo54484I());
            case 2:
                uwq uwqVar = (uwq) obj;
                vfe vfeVar = mvx0.f147667a;
                nys0 nys0VarM84115Q = uwqVar.mo54484I();
                nq60 nq60Var = uwqVar.f234719h;
                iqg1 iqg1VarM62973b = mvx0.m62973b(nys0VarM84115Q);
                if (iqg1VarM62973b instanceof so60) {
                    so60 so60Var = (so60) iqg1VarM62973b;
                    nys0 nys0VarM78623v = so60Var.m78623v();
                    bux buxVar = gp60.f83091a;
                    fo60 fo60VarM45356b = gp60.m45356b(so60Var.m78625x(), so60Var.m78624w(), so60Var.m78627z(), true);
                    if (fo60VarM45356b != null) {
                        if (qmg1.m73287n(nys0VarM78623v) || gp60.m45359e(so60Var.m78625x())) {
                            enclosingClass = nq60Var.mo28587A().getEnclosingClass();
                        } else {
                            oqo oqoVarMo27379o = nys0VarM78623v.mo27379o();
                            enclosingClass = oqoVarMo27379o instanceof nfe ? j0b1.m52057p((nfe) oqoVarMo27379o) : nq60Var.mo28587A();
                        }
                        if (enclosingClass != null) {
                            try {
                                return enclosingClass.getDeclaredField(fo60VarM45356b.m42265B());
                            } catch (NoSuchFieldException unused) {
                            }
                        }
                    }
                } else {
                    if (iqg1VarM62973b instanceof qo60) {
                        return ((qo60) iqg1VarM62973b).m73368v();
                    }
                    if (!(iqg1VarM62973b instanceof ro60) && !(iqg1VarM62973b instanceof to60)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return null;
            case 3:
                return new swq((twq) obj);
            case 4:
                ArrayList arrayList = ((ar00) obj).f18886a;
                cqi0 cqi0VarM75627u = riw0.m75627u(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    hu60 hu60Var = (hu60) arrayList.get(i2);
                    cai0.m32058a(cqi0VarM75627u, riw0.m75624r(hu60Var), hu60Var);
                }
                return new cai0(cqi0VarM75627u);
            case 5:
                return new zp60((cq60) obj);
            case 6:
                zp60 zp60Var = (zp60) obj;
                boolean zM96662e = zp60Var.m96662e();
                if (zM96662e) {
                    Collection collectionM96658a = zp60Var.m96658a();
                    lpv0 lpv0Var = zp60Var.f284954p;
                    qr60 qr60Var = zp60.f284940x[12];
                    return g6f.m43700N0((Collection) lpv0Var.invoke(), collectionM96658a);
                }
                if (zM96662e) {
                    throw new NoWhenBranchMatchedException();
                }
                lpv0 lpv0Var2 = zp60Var.f284959u;
                qr60 qr60Var2 = zp60.f284940x[17];
                Collection collection = (Collection) lpv0Var2.invoke();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collection) {
                    if (!lay.m58583e((tvq) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            case 7:
                return cc70.m32214S((nq60) obj);
            case 8:
                return ((rwx0) ((qwx0) obj)).f203428a.map(m1y.f139147Y).distinctUntilChanged();
            default:
                return rm41.f200445l.m92785a(((her0) obj).f90500a);
        }
    }
}
