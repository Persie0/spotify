package p204p;

import android.app.Application;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class jf90 {

    /* JADX INFO: renamed from: a */
    public final gfi0 f111860a;

    /* JADX INFO: renamed from: b */
    public final twx0 f111861b;

    /* JADX INFO: renamed from: c */
    public final wb11 f111862c;

    /* JADX INFO: renamed from: d */
    public final Flowable f111863d;

    /* JADX INFO: renamed from: e */
    public final Application f111864e;

    public jf90(gfi0 gfi0Var, twx0 twx0Var, wb11 wb11Var, Flowable flowable, Application application) {
        this.f111860a = gfi0Var;
        this.f111861b = twx0Var;
        this.f111862c = wb11Var;
        this.f111863d = flowable;
        this.f111864e = application;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m53156a(ibk ibkVar) {
        ff90 ff90Var;
        wb11 wb11Var;
        Application application;
        if (ibkVar instanceof ff90) {
            ff90Var = (ff90) ibkVar;
            int i = ff90Var.f68955e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ff90Var.f68955e = i - Integer.MIN_VALUE;
            } else {
                ff90Var = new ff90(this, ibkVar);
            }
        } else {
            ff90Var = new ff90(this, ibkVar);
        }
        Object objM86756u = ff90Var.f68953c;
        int i2 = ff90Var.f68955e;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            d0k[] d0kVarArr = bmu0.f28619a;
            onc oncVar = new onc(this.f111863d);
            nx70 nx70Var = new nx70(2, 4, null);
            wb11 wb11Var2 = this.f111862c;
            ff90Var.f68951a = wb11Var2;
            Application application2 = this.f111864e;
            ff90Var.f68952b = application2;
            ff90Var.f68955e = 1;
            objM86756u = vyf1.m86756u(oncVar, nx70Var, ff90Var);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
            wb11Var = wb11Var2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = ff90Var.f68952b;
            wb11Var = ff90Var.f68951a;
            bga.m29073P(objM86756u);
        }
        return wb11Var.mo35842b(application, ((e301) objM86756u).f55571a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m53157b(boolean z, boolean z2, ibk ibkVar) {
        gf90 gf90Var;
        if (ibkVar instanceof gf90) {
            gf90Var = (gf90) ibkVar;
            int i = gf90Var.f79312e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gf90Var.f79312e = i - Integer.MIN_VALUE;
            } else {
                gf90Var = new gf90(this, ibkVar);
            }
        } else {
            gf90Var = new gf90(this, ibkVar);
        }
        Object objM53156a = gf90Var.f79310c;
        int i2 = gf90Var.f79312e;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM53156a);
            if (!z) {
                this.f111861b.m81761a("share-listening-activity", "1");
                if (z2) {
                    gf90Var.f79308a = z;
                    gf90Var.f79309b = z2;
                    gf90Var.f79312e = 3;
                    if (m53160e(null, gf90Var) == obj) {
                    }
                }
                return w2a1Var;
            }
            gf90Var.f79308a = z;
            gf90Var.f79309b = z2;
            gf90Var.f79312e = 1;
            objM53156a = m53156a(gf90Var);
            if (objM53156a != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                bga.m29073P(objM53156a);
                return w2a1Var;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM53156a);
            return w2a1Var;
        }
        z2 = gf90Var.f79309b;
        z = gf90Var.f79308a;
        bga.m29073P(objM53156a);
        hv31 hv31Var = (hv31) objM53156a;
        fv31 fv31Var = kb90.f121154a;
        if (!hv31Var.mo48713h(fv31Var, false)) {
            lv31 lv31VarEdit = hv31Var.edit();
            lv31VarEdit.m60048a(fv31Var, true);
            lv31VarEdit.m60054g();
            gf90Var.f79308a = z;
            gf90Var.f79309b = z2;
            gf90Var.f79312e = 2;
            if (m53159d(null, gf90Var) == obj) {
                return obj;
            }
            return w2a1Var;
        }
        this.f111861b.m81761a("share-listening-activity", "1");
        if (z2) {
            gf90Var.f79308a = z;
            gf90Var.f79309b = z2;
            gf90Var.f79312e = 3;
            if (m53160e(null, gf90Var) == obj) {
                return obj;
            }
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m53158c(boolean z, ibk ibkVar) {
        hf90 hf90Var;
        jf90 jf90Var;
        if (ibkVar instanceof hf90) {
            hf90Var = (hf90) ibkVar;
            int i = hf90Var.f90648e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hf90Var.f90648e = i - Integer.MIN_VALUE;
            } else {
                hf90Var = new hf90(this, ibkVar);
            }
        } else {
            hf90Var = new hf90(this, ibkVar);
        }
        Object objM53156a = hf90Var.f90646c;
        int i2 = hf90Var.f90648e;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM53156a);
            twx0 twx0Var = this.f111861b;
            twx0Var.m81761a("share-listening-activity", "1");
            twx0Var.m81761a("view-listening-activity", "1");
            hf90Var.f90645b = this;
            hf90Var.f90644a = z;
            hf90Var.f90648e = 1;
            objM53156a = m53156a(hf90Var);
            if (objM53156a != yukVar) {
                jf90Var = this;
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM53156a);
            return w2a1Var;
        }
        z = hf90Var.f90644a;
        jf90Var = hf90Var.f90645b;
        bga.m29073P(objM53156a);
        jf90Var.getClass();
        lv31 lv31VarEdit = ((hv31) objM53156a).edit();
        lv31VarEdit.m60048a(kb90.f121154a, true);
        lv31VarEdit.m60054g();
        if (z) {
            hf90Var.f90645b = null;
            hf90Var.f90644a = z;
            hf90Var.f90648e = 2;
            if (m53160e(null, hf90Var) == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: d */
    public final Object m53159d(d850 d850Var, ibk ibkVar) throws Throwable {
        gfi0 gfi0Var = this.f111860a;
        yuk yukVar = yuk.f276404a;
        if (d850Var == null) {
            String str = xoc1.f264155o4.f243453a;
            if (str == null) {
                throw new IllegalStateException("uri was not set!");
            }
            Object objM44622b = gfi0Var.m44622b(new p6j0(str, "", false, false, 0, 0, false, null, null, null), null, ibkVar);
            if (objM44622b == yukVar) {
                return objM44622b;
            }
        } else {
            Object objM44623d = gfi0Var.m44623d(xoc1.f264155o4.f243453a, d850Var, null, ibkVar);
            if (objM44623d == yukVar) {
                return objM44623d;
            }
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m53160e(d850 d850Var, ibk ibkVar) throws Throwable {
        Set set = dd41.f47702f;
        String strM35694A = r46.m74726U("spotify:listening-activity:settings").m35694A();
        if (strM35694A == null) {
            strM35694A = xoc1.f264163p4.f243453a;
        }
        String str = strM35694A;
        gfi0 gfi0Var = this.f111860a;
        yuk yukVar = yuk.f276404a;
        if (d850Var != null) {
            Object objM44623d = gfi0Var.m44623d(str, d850Var, null, ibkVar);
            if (objM44623d == yukVar) {
                return objM44623d;
            }
        } else {
            if (str == null) {
                throw new IllegalStateException("uri was not set!");
            }
            Object objM44622b = gfi0Var.m44622b(new p6j0(str, "", false, false, 0, 0, false, null, null, null), null, ibkVar);
            if (objM44622b == yukVar) {
                return objM44622b;
            }
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m53161f(d850 d850Var, ibk ibkVar) {
        if90 if90Var;
        if (ibkVar instanceof if90) {
            if90Var = (if90) ibkVar;
            int i = if90Var.f101734d;
            if ((i & Integer.MIN_VALUE) != 0) {
                if90Var.f101734d = i - Integer.MIN_VALUE;
            } else {
                if90Var = new if90(this, ibkVar);
            }
        } else {
            if90Var = new if90(this, ibkVar);
        }
        Object obj = if90Var.f101732b;
        int i2 = if90Var.f101734d;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return w2a1Var;
            }
            d850 d850Var2 = if90Var.f101731a;
            bga.m29073P(obj);
            hv31 hv31Var = (hv31) obj;
            fv31 fv31Var = kb90.f121154a;
            if (!hv31Var.mo48713h(fv31Var, false)) {
                lv31 lv31VarEdit = hv31Var.edit();
                lv31VarEdit.m60048a(fv31Var, true);
                lv31VarEdit.m60054g();
                if90Var.f101731a = null;
                if90Var.f101734d = 2;
                if (m53159d(d850Var2, if90Var) == obj2) {
                    return obj2;
                }
                return w2a1Var;
            }
            d850Var = d850Var2;
        }
        if90Var.f101731a = null;
        if90Var.f101734d = 3;
        if (m53160e(d850Var, if90Var) == obj2) {
            return obj2;
        }
        return w2a1Var;
    }
}
