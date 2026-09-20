package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public final class oga0 {

    /* JADX INFO: renamed from: a */
    public final o7r f165072a;

    /* JADX INFO: renamed from: b */
    public final t4j f165073b;

    /* JADX INFO: renamed from: c */
    public final bga0 f165074c;

    /* JADX INFO: renamed from: d */
    public final e9r f165075d;

    /* JADX INFO: renamed from: e */
    public final j8r f165076e;

    /* JADX INFO: renamed from: f */
    public final k5m0 f165077f;

    /* JADX INFO: renamed from: g */
    public final gin0 f165078g;

    /* JADX INFO: renamed from: h */
    public final jts0 f165079h;

    /* JADX INFO: renamed from: i */
    public final luk f165080i;

    public oga0(o7r o7rVar, t4j t4jVar, bga0 bga0Var, e9r e9rVar, j8r j8rVar, k5m0 k5m0Var, gin0 gin0Var, jts0 jts0Var, luk lukVar) {
        this.f165072a = o7rVar;
        this.f165073b = t4jVar;
        this.f165074c = bga0Var;
        this.f165075d = e9rVar;
        this.f165076e = j8rVar;
        this.f165077f = k5m0Var;
        this.f165078g = gin0Var;
        this.f165079h = jts0Var;
        this.f165080i = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final Object m66875a(oga0 oga0Var, z7r z7rVar, fbk fbkVar) throws Throwable {
        lga0 lga0Var;
        j8r j8rVar = oga0Var.f165076e;
        if (fbkVar instanceof lga0) {
            lga0Var = (lga0) fbkVar;
            int i = lga0Var.f133190c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lga0Var.f133190c = i - Integer.MIN_VALUE;
            } else {
                lga0Var = new lga0(oga0Var, fbkVar);
            }
        } else {
            lga0Var = new lga0(oga0Var, fbkVar);
        }
        Object obj = lga0Var.f133188a;
        int i2 = lga0Var.f133190c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            Bundle bundle = new Bundle();
            bundle.putParcelable("device_location_permission_page_input", new y7r(z7rVar, null, 14));
            j8rVar.f109991a.mo46963e();
            luk lukVar = oga0Var.f165080i;
            no90 no90Var = new no90(oga0Var, bundle, 0 == true ? 1 : 0, 5);
            lga0Var.f133190c = 1;
            if (x0h1.m89557A(lukVar, no90Var, lga0Var) != yukVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        luu0 luu0VarM31020l = bzf1.m31020l(j8rVar.f109991a);
        lga0Var.f133190c = 2;
        Object objM86755t = vyf1.m86755t(luu0VarM31020l, lga0Var);
        return objM86755t == yukVar ? yukVar : objM86755t;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: b */
    public final Object m66876b(boolean z, String str, rqs0 rqs0Var, ibk ibkVar) {
        mga0 mga0Var;
        rqs0 rqs0Var2;
        String str2;
        boolean z2 = z;
        if (ibkVar instanceof mga0) {
            mga0Var = (mga0) ibkVar;
            int i = mga0Var.f143423f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mga0Var.f143423f = i - Integer.MIN_VALUE;
            } else {
                mga0Var = new mga0(this, ibkVar);
            }
        } else {
            mga0Var = new mga0(this, ibkVar);
        }
        mga0 mga0Var2 = mga0Var;
        Object obj = mga0Var2.f143421d;
        int i2 = mga0Var2.f143423f;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (z2) {
                yrv yrvVar = new yrv(2, this, oga0.class, "presentPermissionPage", "presentPermissionPage(Lcom/spotify/devicelocation/permissionpageapi/DeviceLocationPermissionPageMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 22);
                mga0Var2.f143419b = str;
                mga0Var2.f143420c = rqs0Var;
                mga0Var2.f143418a = z2;
                mga0Var2.f143423f = 1;
                Object objM29105a = this.f165074c.m29105a("p2p_load", yrvVar, mga0Var2);
                if (objM29105a != yukVar) {
                    rqs0Var2 = rqs0Var;
                    str2 = str;
                    obj = objM29105a;
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        boolean z3 = mga0Var2.f143418a;
        rqs0 rqs0Var3 = mga0Var2.f143420c;
        String str3 = mga0Var2.f143419b;
        bga.m29073P(obj);
        rqs0Var2 = rqs0Var3;
        str2 = str3;
        z2 = z3;
        rnj0 rnj0Var = rnj0.f200934b;
        gnq gnqVar = new gnq((hga0) obj, this, str2, rqs0Var2, (fbk) null);
        mga0Var2.f143419b = null;
        mga0Var2.f143420c = null;
        mga0Var2.f143418a = z2;
        mga0Var2.f143423f = 2;
        return x0h1.m89557A(rnj0Var, gnqVar, mga0Var2) == yukVar ? yukVar : w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m66877c(ibk ibkVar) {
        nga0 nga0Var;
        Object objM87199a;
        if (ibkVar instanceof nga0) {
            nga0Var = (nga0) ibkVar;
            int i = nga0Var.f153624c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nga0Var.f153624c = i - Integer.MIN_VALUE;
            } else {
                nga0Var = new nga0(this, ibkVar);
            }
        } else {
            nga0Var = new nga0(this, ibkVar);
        }
        Object obj = nga0Var.f153622a;
        int i2 = nga0Var.f153624c;
        boolean z = true;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (this.f165072a.m66383b()) {
                nga0Var.f153624c = 1;
                objM87199a = ((w4j) this.f165073b).m87199a("unspecified", nga0Var);
                Object obj2 = yuk.f276404a;
                if (objM87199a == obj2) {
                    return obj2;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        objM87199a = ((s6x0) obj).f206218a;
        if (objM87199a instanceof c6x0) {
            objM87199a = null;
        }
        if (objM87199a == a5j.f12526c) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
