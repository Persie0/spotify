package p204p;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class sev {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f208389a;

    /* JADX INFO: renamed from: b */
    public final Object f208390b;

    public /* synthetic */ sev(Object obj, int i) {
        this.f208389a = i;
        this.f208390b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX INFO: renamed from: a */
    public final Object m77963a(String str, xr01 xr01Var, hwv hwvVar, v311 v311Var, fbk fbkVar) {
        dc81 dc81Var;
        String str2;
        xr01 xr01Var2;
        v311 v311Var2;
        hwv hwvVar2;
        switch (this.f208389a) {
            case 0:
                return kk40.m56684z(new gnq(6, (Object) hwvVar, (Object) this, (Object) xr01Var, (Object) v311Var, str, (fbk) null), fbkVar);
            case 1:
                v811 v811Var = (v811) this.f208390b;
                int i = hwvVar.f96058c;
                int i2 = i == 0 ? -1 : jrp0.f115253a[edb.m38547C(i)];
                if (i2 == 1 || i2 == 2) {
                    return v811Var.m84905d(str, xr01Var, hwvVar, v311Var, (ibk) fbkVar);
                }
                if (i2 == 3 || i2 == 4) {
                    return v811Var.m84904c(str, xr01Var, hwvVar, v311Var, (ibk) fbkVar);
                }
                return i2 != 5 ? v811Var.m84906e(str, xr01Var, hwvVar, null, v311Var, (ibk) fbkVar) : v811Var.m84906e(str, xr01Var, hwvVar, null, v311Var, (ibk) fbkVar);
            case 2:
                v811 v811Var2 = (v811) this.f208390b;
                if (fbkVar instanceof dc81) {
                    dc81Var = (dc81) fbkVar;
                    int i3 = dc81Var.f47458g;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dc81Var.f47458g = i3 - Integer.MIN_VALUE;
                    } else {
                        dc81Var = new dc81(this, (ibk) fbkVar);
                    }
                } else {
                    dc81Var = new dc81(this, (ibk) fbkVar);
                }
                dc81 dc81Var2 = dc81Var;
                Object objM56684z = dc81Var2.f47456e;
                int i4 = dc81Var2.f47458g;
                yuk yukVar = yuk.f276404a;
                if (i4 == 0) {
                    bga.m29073P(objM56684z);
                    dc81Var2.f47452a = str;
                    dc81Var2.f47453b = xr01Var;
                    dc81Var2.f47454c = hwvVar;
                    dc81Var2.f47455d = v311Var;
                    dc81Var2.f47458g = 1;
                    String str3 = hwvVar.f96056a;
                    if (str3 == null) {
                        str3 = str;
                    }
                    objM56684z = kk40.m56684z(new kr4(3, v311Var, hwvVar, v811Var2, str3, xr01Var, null), dc81Var2);
                    if (objM56684z != yukVar) {
                        str2 = str;
                        xr01Var2 = xr01Var;
                        v311Var2 = v311Var;
                        v811Var2 = v811Var2;
                        hwvVar2 = hwvVar;
                    }
                    return yukVar;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM56684z);
                    return objM56684z;
                }
                v311 v311Var3 = dc81Var2.f47455d;
                hwv hwvVar3 = dc81Var2.f47454c;
                xr01Var2 = dc81Var2.f47453b;
                String str4 = dc81Var2.f47452a;
                bga.m29073P(objM56684z);
                hwvVar2 = hwvVar3;
                str2 = str4;
                v311Var2 = v311Var3;
                ww01 ww01Var = (ww01) objM56684z;
                if (ww01Var != null) {
                    return ww01Var;
                }
                dc81Var2.f47452a = null;
                dc81Var2.f47453b = null;
                dc81Var2.f47454c = null;
                dc81Var2.f47455d = null;
                dc81Var2.f47458g = 2;
                Object objM84906e = v811Var2.m84906e(str2, xr01Var2, hwvVar2, null, v311Var2, dc81Var2);
                if (objM84906e != yukVar) {
                    return objM84906e;
                }
                return yukVar;
            default:
                for (pqm0 pqm0Var : (List) this.f208390b) {
                    if (((gsb) pqm0Var.f180350a).m45643a(str)) {
                        return ((sev) pqm0Var.f180351b).m77963a(str, xr01Var, hwvVar, v311Var, fbkVar);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
