package p204p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class sr0 implements zb80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f213196a;

    /* JADX INFO: renamed from: b */
    public final Object f213197b;

    /* JADX INFO: renamed from: c */
    public final Object f213198c;

    public /* synthetic */ sr0(int i, Object obj, Object obj2) {
        this.f213196a = i;
        this.f213197b = obj;
        this.f213198c = obj2;
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        switch (this.f213196a) {
            case 0:
                if (ta80Var == ta80.ON_STOP) {
                    ((wum0) this.f213198c).m89068w(((Number) ((kqi0) this.f213197b).getValue()).longValue());
                }
                break;
            case 1:
                ((kqi0) this.f213197b).setValue(Boolean.valueOf(((gb80) this.f213198c).mo31987b().m41223a(fb80.f67753d)));
                break;
            case 2:
                cob cobVar = ((hmd) this.f213197b).f92900H;
                int i = vld.f242456a[ta80Var.ordinal()];
                if (i == 1) {
                    cobVar.f40220a = ((kjd) this.f213198c).f123327a.f203049a;
                    break;
                } else if (i == 2) {
                    cobVar.f40220a = null;
                    break;
                }
                break;
            case 3:
                if (ta80Var == ta80.ON_START) {
                    ((gb80) this.f213197b).mo31988d(this);
                    ((f9y0) this.f213198c).m41111d();
                }
                break;
            case 4:
                dxk0 dxk0Var = (dxk0) this.f213197b;
                lwr lwrVar = dxk0Var.f54015o;
                int i2 = bxk0.f31887a[ta80Var.ordinal()];
                if (i2 == 1) {
                    if (lwrVar.f137623a.m23397i() == 0) {
                        dxk0Var.m37265f();
                        dxk0Var.m37264e();
                        dxk0Var.m37263d();
                    }
                    break;
                } else if (i2 == 2) {
                    lwrVar.m60129c();
                    break;
                } else if (i2 == 3) {
                    lwrVar.m60129c();
                    ((m500) this.f213198c).f31643a.mo31988d(this);
                    break;
                }
                break;
            case 5:
                HashMap map = ((gge) this.f213198c).f79649a;
                List list = (List) map.get(ta80Var);
                Object obj = this.f213197b;
                gge.m44698a(list, hc80Var, ta80Var, obj);
                gge.m44698a((List) map.get(ta80.ON_ANY), hc80Var, ta80Var, obj);
                break;
            case 6:
                if (ta80Var == ta80.ON_STOP) {
                    ((CompositeDisposable) ((bsa) ((mp11) this.f213197b).f145831f).f30269e).m23396g();
                    ((gb80) this.f213198c).mo31988d(this);
                }
                break;
            default:
                pa9 pa9Var = (pa9) this.f213198c;
                int i3 = q641.f185678a[ta80Var.ordinal()];
                if (i3 == 1) {
                    if (!((Boolean) ((kqi0) this.f213197b).getValue()).booleanValue()) {
                        pa9Var.m69450p(1);
                        pa9Var.m69447l();
                    }
                    break;
                } else if (i3 == 2) {
                    pa9Var.m69441f();
                    pa9Var.m69450p(3);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sr0(Object obj, kqi0 kqi0Var, int i) {
        this.f213196a = i;
        this.f213198c = obj;
        this.f213197b = kqi0Var;
    }

    public sr0(gc80 gc80Var) {
        this.f213196a = 5;
        this.f213197b = gc80Var;
        ige igeVar = ige.f101970c;
        Class<?> cls = gc80Var.getClass();
        gge ggeVar = (gge) igeVar.f101971a.get(cls);
        this.f213198c = ggeVar == null ? igeVar.m50513a(cls, null) : ggeVar;
    }
}
