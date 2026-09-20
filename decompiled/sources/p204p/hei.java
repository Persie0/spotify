package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hei implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f90439a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f90440b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zs70 f90441c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f90442d;

    public /* synthetic */ hei(String str, zs70 zs70Var, gh00 gh00Var, int i) {
        this.f90439a = i;
        this.f90440b = str;
        this.f90441c = zs70Var;
        this.f90442d = gh00Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        rs70 rs70Var;
        rs70 rs70Var2;
        switch (this.f90439a) {
            case 0:
                List list = (List) obj;
                String str = this.f90440b;
                if (str != null && !wl51.m88460J0(str) && (rs70Var = (rs70) g6f.m43689C0(list)) != null && rs70Var.f202194a >= this.f90441c.m96824h().f192027p - 6) {
                    this.f90442d.invoke(ndi.f152780a);
                }
                break;
            default:
                List list2 = (List) obj;
                String str2 = this.f90440b;
                if (str2 != null && !wl51.m88460J0(str2) && (rs70Var2 = (rs70) g6f.m43689C0(list2)) != null && rs70Var2.f202194a >= this.f90441c.m96824h().f192027p - 6) {
                    this.f90442d.invoke(tbx.f218965a);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
