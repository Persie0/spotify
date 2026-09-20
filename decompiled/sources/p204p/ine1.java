package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class ine1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: b */
    public static final ine1 f103961b;

    /* JADX INFO: renamed from: c */
    public static final ine1 f103962c;

    /* JADX INFO: renamed from: d */
    public static final ine1 f103963d;

    /* JADX INFO: renamed from: e */
    public static final ine1 f103964e;

    /* JADX INFO: renamed from: f */
    public static final ine1 f103965f;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103966a;

    static {
        int i = 0;
        f103961b = new ine1(i, 0);
        f103962c = new ine1(i, 1);
        f103963d = new ine1(i, 2);
        f103964e = new ine1(i, 3);
        f103965f = new ine1(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ine1(int i, int i2) {
        super(i);
        this.f103966a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = 0;
        switch (this.f103966a) {
            case 0:
                jne1[] jne1VarArrValues = jne1.values();
                ArrayList arrayList = new ArrayList(jne1VarArrValues.length);
                int length = jne1VarArrValues.length;
                while (i < length) {
                    jne1 jne1Var = jne1VarArrValues[i];
                    arrayList.add(new pqm0(jne1Var.f114099b, jne1Var));
                    i++;
                }
                return kkc0.m56705r0(arrayList);
            case 1:
                jne1[] jne1VarArrValues2 = jne1.values();
                ArrayList arrayList2 = new ArrayList(jne1VarArrValues2.length);
                int length2 = jne1VarArrValues2.length;
                while (i < length2) {
                    jne1 jne1Var2 = jne1VarArrValues2[i];
                    arrayList2.add(new pqm0(jne1Var2.f114100c, jne1Var2));
                    i++;
                }
                return kkc0.m56705r0(arrayList2);
            case 2:
                jne1[] jne1VarArrValues3 = jne1.values();
                ArrayList arrayList3 = new ArrayList(jne1VarArrValues3.length);
                int length3 = jne1VarArrValues3.length;
                while (i < length3) {
                    jne1 jne1Var3 = jne1VarArrValues3[i];
                    arrayList3.add(new pqm0(jne1Var3.f114100c.f121029c, jne1Var3));
                    i++;
                }
                return kkc0.m56705r0(arrayList3);
            case 3:
                return new voc1("spotify:internal:your-library:messaging");
            case 4:
                return w2a1.f247311a;
            case 5:
                return new wum0(0L);
            case 6:
                n5q n5qVar = xsr.f265651a;
                return kk40.m56661c(cct.m32296A(tlp.f221498c, new uuk("AndroidTimeKeeper")));
            case 7:
                return new q4k(null, false, false, true, false, false, false, null, false, false, 0, false, false, false, false, false, null, false, false, null, false, null, null, null, false, false, 1073741813);
            case 8:
                int i2 = fee.f68747h;
                return new y6u();
            case 9:
                return new cjc0(new tk9(3), x2e.f257434U0);
            case 10:
                return new oxh();
            case 11:
                return new oxh();
            case 12:
                return new oxh();
            case 13:
                return new ysk(pso.f180897a, 27);
            case 14:
                return w2a1.f247311a;
            case 15:
                long jM60216a = ly5.m60216a();
                hvi0 hvi0Var = cks.f39079b;
                return Long.valueOf(cks.m33199r(jM60216a, ils.MICROSECONDS));
            case 16:
                int i3 = o240.f160932h;
                return new a7u();
            case 17:
                return new yw70(0, 0);
            case 18:
                return qlg1.m73202g();
            case 19:
                return kk40.m56661c(mlg1.m62205A(qlg1.m73202g(), xsr.f265652b));
            default:
                zv41 zv41Var = o210.f160911b;
                Boolean bool = Boolean.FALSE;
                zv41Var.getClass();
                zv41Var.m97091m(null, bool);
                o210.f160912c = null;
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ine1(Object obj, int i) {
        super(0);
        this.f103966a = i;
    }
}
