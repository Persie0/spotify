package p204p;

import android.view.View;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class x10 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f257020a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f257021b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x10(int i, eh00 eh00Var) {
        super(1);
        this.f257020a = i;
        switch (i) {
            case 17:
                this.f257021b = (qe70) eh00Var;
                super(1);
                break;
            case 21:
                this.f257021b = (qe70) eh00Var;
                super(1);
                break;
            case 23:
                this.f257021b = (qe70) eh00Var;
                super(1);
                break;
            case 24:
                this.f257021b = (qe70) eh00Var;
                super(1);
                break;
            default:
                this.f257021b = (qe70) eh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [p.eh00, p.gh00, p.qe70, p.th00, p.vh00] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object nlvVar;
        int i = this.f257020a;
        boolean zBooleanValue = false;
        w2a1 w2a1Var = w2a1.f247311a;
        ?? r4 = this.f257021b;
        switch (i) {
            case 0:
                r4.invoke(v10.f236204a);
                return w2a1Var;
            case 1:
                r4.invoke(v10.f236205b);
                return w2a1Var;
            case 2:
                r4.invoke(Integer.valueOf((int) (((g450) obj).f76347a & 4294967295L)));
                return w2a1Var;
            case 3:
                r4.invoke(new zp1((String) obj));
                return w2a1Var;
            case 4:
                r4.invoke(((gw4) obj).m45912e());
                return w2a1Var;
            case 5:
                return (CharSequence) r4.invoke(obj);
            case 6:
                r4.invoke();
                return w2a1Var;
            case 7:
                return r4.invoke((hz80) obj);
            case 8:
                return new lf7((ir91) r4.invoke((rmm0) obj), 2);
            case 9:
                g66 g66Var = (g66) obj;
                if (g66Var instanceof c66) {
                    nlvVar = new nlv(((c66) g66Var).f34400a);
                } else if (g66Var.equals(d66.f45596a)) {
                    nlvVar = olv.f166927a;
                } else {
                    if (!g66Var.equals(f66.f66285a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nlvVar = olv.f166928b;
                }
                r4.invoke(nlvVar);
                return w2a1Var;
            case 10:
                r4.invoke(new v8w((t8w) obj));
                return w2a1Var;
            case 11:
                return new ojo(r4.invoke(obj));
            case 12:
                List<pqm0> list = (List) obj;
                List list2 = iay.f100364a;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (pqm0 pqm0Var : list) {
                    ex80 ex80Var = (ex80) pqm0Var.f180350a;
                    pjo pjoVar = (pjo) pqm0Var.f180351b;
                    arrayList.add((iay.m50105a(ex80Var.f63714a) && (pjoVar instanceof mjo)) ? new pqm0(ex80Var, new ojo(lau.f131415a)) : new pqm0(ex80Var, pjoVar));
                }
                r4.invoke(arrayList);
                return w2a1Var;
            case 13:
                r4.invoke((plp) obj);
                return w2a1Var;
            case 14:
                return new kk90((ck90) r4.invoke(obj));
            case 15:
                r4.invoke((up60) obj, hda1.f90099i);
                return w2a1Var;
            case 16:
                return (fiz) r4.invoke((p7e0) obj);
            case 17:
                return c0h1.m31144B((p7e0) obj, (n7e0) r4.invoke());
            case 18:
                return Collections.singletonMap(w2a1Var, r4.invoke(obj));
            case 19:
                Throwable th = (Throwable) obj;
                if (th instanceof CompositeException) {
                    List<Throwable> list3 = ((CompositeException) th).f7213a;
                    if (list3.isEmpty()) {
                        zBooleanValue = true;
                    } else {
                        for (Throwable th2 : list3) {
                            wj50.m88279p(th2);
                            if (!((Boolean) r4.invoke(th2)).booleanValue()) {
                            }
                        }
                        zBooleanValue = true;
                    }
                } else {
                    zBooleanValue = ((Boolean) r4.invoke(th)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 20:
                return Boolean.valueOf(((Boolean) r4.invoke(p1m0.m68839t((o1m0) obj).f87941b)).booleanValue());
            case 21:
                r4.invoke();
                return w2a1Var;
            case 22:
                r4.invoke((q9r0) obj);
                return w2a1Var;
            case 23:
                r4.invoke();
                return w2a1Var;
            case 24:
                r4.invoke();
                return w2a1Var;
            case 25:
                return (av91) r4.invoke(new rch0((sch0) obj));
            case 26:
                return new ed01(r4.invoke(obj));
            case 27:
                r4.invoke((View) obj);
                return w2a1Var;
            case 28:
                ((icp) obj).f100858d = new r4w0((vh00) r4, (fbk) null);
                return w2a1Var;
            default:
                r4.invoke((zvw0) obj);
                return w2a1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x10(int i, gh00 gh00Var) {
        super(1);
        this.f257020a = i;
        switch (i) {
            case 1:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 2:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 3:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 4:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 5:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 6:
            case 15:
            case 17:
            case 21:
            case 23:
            case 24:
            case 28:
            default:
                this.f257021b = (qe70) gh00Var;
                break;
            case 7:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 8:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 9:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 10:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 11:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 12:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 13:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 14:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 16:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 18:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 19:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 20:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 22:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 25:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 26:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 27:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
            case 29:
                this.f257021b = (qe70) gh00Var;
                super(1);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x10(th00 th00Var) {
        super(1);
        this.f257020a = 15;
        this.f257021b = (qe70) th00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x10(vh00 vh00Var) {
        super(1);
        this.f257020a = 28;
        this.f257021b = (qe70) vh00Var;
    }
}
