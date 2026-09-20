package p204p;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.recaptcha.internal.zzad;
import com.google.android.recaptcha.internal.zzhg;
import com.spotify.cosmos.cosmos.Request;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes9.dex */
public final class rpe1 implements Function, oal0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f201571a;

    /* JADX INFO: renamed from: b */
    public final Object f201572b;

    public rpe1() {
        this.f201571a = 2;
        this.f201572b = new ArrayDeque();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public Object m76139a(ibk ibkVar) throws zzhg {
        dpg1 dpg1Var;
        if (ibkVar instanceof dpg1) {
            dpg1Var = (dpg1) ibkVar;
            int i = dpg1Var.f51332c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dpg1Var.f51332c = i - Integer.MIN_VALUE;
            } else {
                dpg1Var = new dpg1(this, ibkVar);
            }
        } else {
            dpg1Var = new dpg1(this, ibkVar);
        }
        dpg1 dpg1Var2 = dpg1Var;
        Object objM45437b = dpg1Var2.f51330a;
        int i2 = dpg1Var2.f51332c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM45437b);
                gqg1 gqg1Var = (gqg1) this.f201572b;
                dpg1Var2.f51332c = 1;
                objM45437b = gqg1Var.m45437b("https://www.gstatic.com/recaptcha/verify_key/orcas/prod/android/verify_key.txt", Request.GET, null, nau.f152117a, dpg1Var2);
                yuk yukVar = yuk.f276404a;
                if (objM45437b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM45437b);
            }
            jqg1 jqg1Var = (jqg1) objM45437b;
            jqg1Var.m54090a();
            return new String(jqg1Var.f114914b, vuc.f244913a);
        } catch (zzhg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzhg(zz11.f287826e2, zz11.f287788O1, e2.getMessage(), 8);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Observable observableJust;
        switch (this.f201571a) {
            case 0:
                List<zyk0> list = (List) obj;
                spe1 spe1Var = (spe1) this.f201572b;
                if (list.isEmpty()) {
                    return Observable.just(lau.f131415a);
                }
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (zyk0 zyk0Var : list) {
                    if (zyk0Var.f287610d == 5 && spe1Var.f212832a.f180024b) {
                        uh80 uh80Var = (uh80) spe1Var.f212834c.get();
                        fbk fbkVar = null;
                        observableJust = Observable.combineLatest(uh80Var.f230384a.toObservable(), k0e1.m54988g(new vjz(xtm0.m92103x(((mu80) uh80Var.f230385b).m62846k("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", vh80.f241441a), new nx70(2, 2, fbkVar)), new th80(3, 0, fbkVar), 2), dau.f47107a), new csy(zyk0Var, 18));
                    } else {
                        observableJust = Observable.just(zyk0Var);
                    }
                    arrayList.add(observableJust);
                }
                return Observable.combineLatest(arrayList, pmr0.f179215Y0);
            default:
                nvl0 nvl0Var = (nvl0) obj;
                return (nvl0Var == null ? -1 : aze1.f21504a[nvl0Var.ordinal()]) == 1 ? new vgy0(new b4e1((ygy0) this.f201572b, 14)) : wgy0.f251200a;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m76140b(long j, long j2, long j3) {
        int[] iArr = {2077486715, 1348529152, 196553492, 1547748370, 218381171, -1556364309, 1117142618, 1713258270, 1573363368};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        j8f1 j8f1Var = new j8f1(j, j2, j3);
        ArrayDeque arrayDeque = (ArrayDeque) this.f201572b;
        if (arrayDeque.size() >= (t3d1.m79992g((i2 & (~i)) | i3, (i & i4) | i5, i6, i7) ^ (i8 % 1573363368))) {
            throw new zzad();
        }
        arrayDeque.push(j8f1Var);
    }

    /* JADX INFO: renamed from: c */
    public j8f1 m76141c() {
        return (j8f1) Optional.ofNullable((j8f1) ((ArrayDeque) this.f201572b).peek()).orElseThrow(z7f1.f280192b);
    }

    @Override // p204p.oal0
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void mo27479o(Exception exc) {
        ev61 ev61Var = (ev61) this.f201572b;
        hpf1.f93774d.m83849b("get checkbox consent failed", new Object[0]);
        ev61Var.m40099d(Boolean.FALSE);
    }

    public /* synthetic */ rpe1(Object obj, int i) {
        this.f201571a = i;
        this.f201572b = obj;
    }

    public rpe1(AppMeasurementSdk appMeasurementSdk, ydi ydiVar) {
        this.f201571a = 4;
        this.f201572b = ydiVar;
        appMeasurementSdk.m1507a(new py51(this, 22));
    }
}
