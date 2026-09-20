package p204p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseIntArray;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes11.dex */
public final class red1 implements Function, el11, lhf1, r7l0, r9w0, gbk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f198347a;

    /* JADX INFO: renamed from: b */
    public Object f198348b;

    /* JADX INFO: renamed from: c */
    public Object f198349c;

    public /* synthetic */ red1(int i, Object obj, Object obj2) {
        this.f198347a = i;
        this.f198348b = obj;
        this.f198349c = obj2;
    }

    @Override // p204p.el11
    /* JADX INFO: renamed from: a */
    public tjo mo27669a() {
        return (tjo) this.f198348b;
    }

    @Override // p204p.r9w0
    public void accept(Object obj, Object obj2) {
        g8g1 g8g1Var = new g8g1((bqg1) this.f198348b, (ev61) obj2, 0);
        wdf1 wdf1Var = (wdf1) ((yrg1) obj).m37438q();
        j45 j45VarM44803n = gif1.m44803n();
        String[] strArr = (String[]) this.f198349c;
        Parcel parcelM43604d2 = wdf1Var.m43604d2();
        fmf1.m42108c(parcelM43604d2, g8g1Var);
        parcelM43604d2.writeStringArray(strArr);
        fmf1.m42107b(parcelM43604d2, j45VarM44803n);
        wdf1Var.m43607g2(6, parcelM43604d2);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f198347a) {
            case 3:
                prd1 prd1Var = (prd1) this.f198348b;
                voi voiVar = prd1Var.f180563b;
                Observable observableM77299i = ((s5p) voiVar).m77299i();
                s5p s5pVar = (s5p) voiVar;
                return Observable.combineLatest(observableM77299i, s5pVar.m77297d(), s5pVar.m77301k().map(wsq0.f254701X0), k0e1.m54988g(prd1Var.f180567f.f141818c.available(), dau.f47107a), prd1Var.f180566e.mo27556b().map(wvq0.f255563X0), new ord1()).debounce(500L, TimeUnit.MILLISECONDS, prd1Var.f180568g).map(new uj81(25, prd1Var, (nrd1) this.f198349c));
            case 7:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return nau.f152117a;
                }
                b1i0 b1i0Var = (b1i0) this.f198348b;
                String str = b1i0Var.f22362g.f204979a;
                nd6 nd6Var = b1i0Var.f22360e;
                int i = nd6Var.f152688e;
                z2c z2cVar = new z2c(list, true, null, gbu.f78413a, nd6Var);
                z2c z2cVarMo34825c = z2cVar.mo34825c((List) this.f198349c);
                if ((2 & 1) == 0) {
                    z2cVar = z2cVarMo34825c;
                }
                if ((2 & 2) == 0) {
                    i = 0;
                }
                return Collections.singletonMap(str, new rnm0(z2cVar, i));
            case 8:
                return ((vse1) this.f198348b).f244422f.m43376g((String) obj, (roa) this.f198349c);
            default:
                return new fxx(tuo0.m81591c((tuo0) this.f198348b, (YourLibraryResponse) obj, (roa) this.f198349c), null, null, null);
        }
    }

    @Override // p204p.gbk
    /* JADX INFO: renamed from: b */
    public Object mo25397b(Task task) {
        Bundle bundle;
        ntx0 ntx0Var = (ntx0) this.f198348b;
        Bundle bundle2 = (Bundle) this.f198349c;
        ntx0Var.getClass();
        return (task.mo1518j() && (bundle = (Bundle) task.mo1515g()) != null && bundle.containsKey("google.messenger")) ? ntx0Var.m65645a(bundle2).mo1519k(dkr.f50014c, dlr0.f50340c1) : task;
    }

    @Override // p204p.lhf1
    /* JADX INFO: renamed from: c */
    public void mo29655c(long j, long j2, String str, long j3) {
        lhf1 lhf1Var = (lhf1) this.f198348b;
        if (lhf1Var != null) {
            lhf1Var.mo29655c(j, j2, str, j3);
        }
    }

    @Override // p204p.lhf1
    /* JADX INFO: renamed from: d */
    public void mo29656d(String str, long j, int i, Object obj, long j2, long j3) {
        ((dhf1) this.f198349c).f49087g = null;
        lhf1 lhf1Var = (lhf1) this.f198348b;
        if (lhf1Var != null) {
            lhf1Var.mo29656d(str, j, i, obj, j2, j3);
        }
    }

    /* JADX INFO: renamed from: e */
    public zc50 m75388e() {
        return new zc50(cyf1.m34374j(new nzx0(new gud1(this, null, 9)), (luk) this.f198349c), 1);
    }

    /* JADX INFO: renamed from: f */
    public void m75389f(zas0 zas0Var) {
        zas0Var.toString();
        ndh0 ndh0Var = (ndh0) this.f198349c;
        String str = zas0Var.f281121a;
        ndh0Var.getClass();
        yt91 yt91VarM96903c = ndh0Var.f152779b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("content", null, null, null, str));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = zt91VarM94607a;
        nu91Var.f248108b = st91.f213865b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        ((kv91) this.f198348b).mo57449i((ou91) nu91Var.m87248a(), null);
    }

    /* JADX INFO: renamed from: g */
    public int m75390g(Context context, o35 o35Var) {
        ig31.m50506x(context);
        ig31.m50506x(o35Var);
        int iM85679c = 0;
        if (!o35Var.mo37428a()) {
            return 0;
        }
        int iMo24793d = o35Var.mo24793d();
        int iM75391h = m75391h(iMo24793d);
        if (iM75391h != -1) {
            return iM75391h;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f198348b;
        synchronized (sparseIntArray) {
            int i = 0;
            while (true) {
                try {
                    if (i >= sparseIntArray.size()) {
                        iM85679c = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iMo24793d && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iM85679c == -1) {
                iM85679c = ((uj10) this.f198349c).m85679c(context, iMo24793d);
            }
            sparseIntArray.put(iMo24793d, iM85679c);
        }
        return iM85679c;
    }

    /* JADX INFO: renamed from: h */
    public int m75391h(int i) {
        int i2;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f198348b;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public void m75392i() {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f198348b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m75393j(zhg1 zhg1Var) {
        this.f198348b = zhg1Var;
    }

    /* JADX INFO: renamed from: k */
    public void m75394k(dcf1 dcf1Var) {
        this.f198349c = dcf1Var;
    }

    /* JADX INFO: renamed from: l */
    public t2h1 m75395l() {
        return new t2h1((zhg1) this.f198348b, (dcf1) this.f198349c);
    }

    @Override // p204p.el11
    /* JADX INFO: renamed from: m */
    public boolean mo27680m(Object obj) {
        uj81 uj81Var = ((eae1) this.f198349c).f57647b;
        return ((p3e1) uj81Var.f230941c).m69001a(((cae1) obj).f35810a.f96822X);
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        qrg1 qrg1Var = (qrg1) this.f198348b;
        ev61 ev61Var = (ev61) this.f198349c;
        synchronized (qrg1Var.f191842f) {
            qrg1Var.f191841e.remove(ev61Var);
        }
    }

    public red1(g2a1 g2a1Var) {
        this.f198347a = 13;
        bka1 bka1Var = (bka1) g2a1Var.f75877c;
        bka1Var.getClass();
        this.f198348b = new yya1(bka1Var);
        this.f198349c = (String) g2a1Var.f75876b;
    }

    public red1(f7d1 f7d1Var) {
        this.f198347a = 16;
        this.f198349c = new mqw0();
        this.f198348b = f7d1Var;
        opg1.m67527a();
    }

    public red1(dhf1 dhf1Var, lhf1 lhf1Var) {
        this.f198347a = 12;
        this.f198348b = lhf1Var;
        Objects.requireNonNull(dhf1Var);
        this.f198349c = dhf1Var;
    }

    public red1(kv91 kv91Var) {
        this.f198347a = 4;
        this.f198348b = kv91Var;
        st91 st91Var = st91.f213865b;
        this.f198349c = new ndh0(8, (byte) 0);
    }

    public red1(a5j0 a5j0Var, oxe1 oxe1Var, luk lukVar) {
        this.f198347a = 10;
        this.f198348b = a5j0Var;
        this.f198349c = lukVar;
    }

    public red1(eae1 eae1Var) {
        this.f198347a = 6;
        this.f198349c = eae1Var;
        this.f198348b = eae1Var.f57650e;
    }

    public red1(ArrayList arrayList, ArrayList arrayList2, WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface) {
        this.f198347a = 2;
        this.f198348b = arrayList2;
        this.f198349c = webViewStartUpResultBoundaryInterface;
    }

    public red1(int i) {
        this.f198347a = i;
        switch (i) {
            case 11:
                uj10 uj10Var = uj10.f230858e;
                this.f198348b = new SparseIntArray();
                this.f198349c = uj10Var;
                break;
            case 17:
                break;
            default:
                List list = Collections.EMPTY_LIST;
                this.f198348b = list;
                this.f198349c = list;
                break;
        }
    }
}
