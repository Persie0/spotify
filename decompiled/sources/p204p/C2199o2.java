package p204p;

import android.os.Bundle;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: p.o2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C2199o2 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f160896a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f160897b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2199o2(Object obj, int i) {
        super(1);
        this.f160896a = i;
        this.f160897b = obj;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Exception {
        LinkedHashSet linkedHashSet;
        int i = this.f160896a;
        fbk fbkVar = null;
        int i2 = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f160897b;
        switch (i) {
            case 0:
                cqx cqxVar = (cqx) obj;
                C2323r2 c2323r2 = (C2323r2) obj2;
                cqxVar.m33646a(c2323r2.f194988g, p3r.class, false);
                cqxVar.m33646a(c2323r2.f194988g, v140.class, false);
                return w2a1Var;
            case 1:
                C1654a4 c1654a4 = (C1654a4) obj2;
                return fag1.m41151B(c1654a4.f12089a, c1654a4.f12096h, (C2558x3) obj);
            case 2:
                qsp qspVar = (qsp) ((hmh0) obj);
                qspVar.f192162a = C1965i3.f97970e;
                qspVar.f192165d = C2439u4.f226511b;
                qspVar.f192166e = C2439u4.f226513c;
                C1729c5 c1729c5 = (C1729c5) obj2;
                q2c q2cVar = c1729c5.f34038c;
                n5q n5qVar = xsr.f265651a;
                qspVar.f192164c = new l2c(q2cVar, tlp.f221498c, new C2482v4(c1729c5, fbkVar, i2));
                return w2a1Var;
            case 3:
                InterfaceC2573xi interfaceC2573xi = (InterfaceC2573xi) obj;
                C1939hj c1939hj = (C1939hj) obj2;
                Consumer consumer = c1939hj.f91918d;
                if (consumer != null) {
                    c1939hj.f91917c.getClass();
                    consumer.accept(new rto(interfaceC2573xi));
                }
                return w2a1Var;
            case 4:
                return new C1865fm((C2020jm) obj2, i2);
            case 5:
                k35 k35Var = (k35) obj;
                j50 j50Var = (j50) obj2;
                n50 n50Var = j50Var.f108829l;
                a6a1 a6a1Var = n50Var.f150440a;
                if (a6a1Var.mo24862e(k35Var) && ((linkedHashSet = j50Var.f108828k) == null || !linkedHashSet.contains(k35Var))) {
                    Object objM51546c = n50Var.f150442c.m51546c(k35Var);
                    if (objM51546c != null) {
                        j50Var.m52428e(Collections.singletonMap(k35Var, new ojo(objM51546c)));
                    } else {
                        j50Var.f108826i.mo28290b(Collections.singleton(k35Var));
                        Object obj3 = (pjo) a6a1Var.mo24860b(Collections.singleton(k35Var)).get(k35Var);
                        if (obj3 == null) {
                            obj3 = njo.f154639a;
                        }
                        j50Var.m52428e(Collections.singletonMap(k35Var, obj3));
                    }
                }
                return w2a1Var;
            case 6:
                ce0 ce0Var = (ce0) obj2;
                return fag1.m41151B(ce0Var.f36976a, ce0Var.f36977b, (yd0) obj);
            case 7:
                return new f1k(((v6w0) obj).f237979a, ((voc1) ((twz0) obj2).f224525b).f243453a, (String) null, (d1k) null, (eh00) null, (eh00) C2439u4.f226521t, false, (String) null, 476);
            case 8:
                ((nx0) obj2).mo46878a(((Number) obj).intValue());
                return w2a1Var;
            case 9:
                C1947hm c1947hm = (C1947hm) obj2;
                xj0 xj0Var = (xj0) c1947hm.f92783c;
                return g0g1.m43302g(xj0Var.f261979c, xj0Var.f261980d, ((r1j) c1947hm.f92784d).m74483a(), mj0.f144139h);
            case 10:
                vj0 vj0Var = (vj0) ((Map) obj).get((String) ((xaa0) obj2).f259634b);
                return vj0Var != null ? new ed01(vj0Var) : new dd01(0, Integer.valueOf(R.string.ad_category_disabled_reason_missing));
            case 11:
                pjf1.m70155l((icp) obj, new C2279q3((pk0) obj2, 9));
                return w2a1Var;
            case 12:
                pjf1.m70155l((icp) obj, new tk0((wk0) obj2, i2));
                return w2a1Var;
            case 13:
                ((icp) obj).f100858d = new kl0((ol0) obj2, fbkVar, i2);
                return w2a1Var;
            case 14:
                ((icp) obj).f100858d = new rn0((vn0) obj2, fbkVar, i2);
                return w2a1Var;
            case 15:
                return (zvo) ((b7v0) obj2).f24399d;
            case 16:
                ezx0 ezx0VarMo63454G1 = ((yyx0) obj).mo63454G1("UPDATE AdOnAppOpenEntity SET isShown = ? WHERE id = ?");
                try {
                    ezx0VarMo63454G1.mo24846u(1, 1);
                    ezx0VarMo63454G1.mo24846u(2, ((Date) obj2).getTime());
                    ezx0VarMo63454G1.mo24841E1();
                    return w2a1Var;
                } finally {
                    ezx0VarMo63454G1.close();
                }
            case 17:
                pjf1.m70155l((icp) obj, new C2279q3((C1947hm) obj2, 13));
                return w2a1Var;
            case 18:
                pjf1.m70155l((icp) obj, new C2279q3((lq0) obj2, 14));
                return w2a1Var;
            case 19:
                pjf1.m70155l((icp) obj, new C2279q3((qu0) obj2, 16));
                return w2a1Var;
            case 20:
                pjf1.m70155l((icp) obj, new C2279q3((uu0) obj2, 17));
                return w2a1Var;
            case 21:
                pjf1.m70155l((icp) obj, new C2279q3((vu0) obj2, 18));
                return w2a1Var;
            case 22:
                pjf1.m70155l((icp) obj, new C2279q3((yu0) obj2, 19));
                return w2a1Var;
            case 23:
                return (ovf) ((iv0) obj2).f106058d;
            case 24:
                pjf1.m70155l((icp) obj, new C2279q3((jv0) obj2, 20));
                return w2a1Var;
            case 25:
                return (g1p) ((iv0) obj2).f106058d;
            case 26:
                Bundle bundle = (Bundle) obj;
                c81 c81Var = (c81) obj2;
                if (bundle == null) {
                    return c81.m31768c(c81Var);
                }
                z71 z71Var = (z71) zn91.m96523K(bundle, "AddBlockedContentModel", z71.class);
                return z71Var == null ? c81.m31768c(c81Var) : z71Var;
            case 27:
                return new iz80(((fa1) obj2).f67403a);
            default:
                ((tho) obj2).invoke();
                return w2a1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2199o2(br0 br0Var, Date date) {
        super(1);
        this.f160896a = 16;
        this.f160897b = date;
    }
}
