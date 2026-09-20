package p204p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class yva extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final yva f276594L0;

    /* JADX INFO: renamed from: M0 */
    public static final yva f276595M0;

    /* JADX INFO: renamed from: N0 */
    public static final yva f276596N0;

    /* JADX INFO: renamed from: O0 */
    public static final yva f276597O0;

    /* JADX INFO: renamed from: P0 */
    public static final yva f276598P0;

    /* JADX INFO: renamed from: Q0 */
    public static final yva f276599Q0;

    /* JADX INFO: renamed from: R0 */
    public static final yva f276600R0;

    /* JADX INFO: renamed from: S0 */
    public static final yva f276601S0;

    /* JADX INFO: renamed from: T0 */
    public static final yva f276602T0;

    /* JADX INFO: renamed from: U0 */
    public static final yva f276603U0;

    /* JADX INFO: renamed from: V0 */
    public static final yva f276604V0;

    /* JADX INFO: renamed from: W0 */
    public static final yva f276605W0;

    /* JADX INFO: renamed from: X */
    public static final yva f276606X;

    /* JADX INFO: renamed from: X0 */
    public static final yva f276607X0;

    /* JADX INFO: renamed from: Y */
    public static final yva f276608Y;

    /* JADX INFO: renamed from: Y0 */
    public static final yva f276609Y0;

    /* JADX INFO: renamed from: Z */
    public static final yva f276610Z;

    /* JADX INFO: renamed from: Z0 */
    public static final yva f276611Z0;

    /* JADX INFO: renamed from: a1 */
    public static final yva f276612a1;

    /* JADX INFO: renamed from: b */
    public static final yva f276613b;

    /* JADX INFO: renamed from: b1 */
    public static final yva f276614b1;

    /* JADX INFO: renamed from: c */
    public static final yva f276615c;

    /* JADX INFO: renamed from: c1 */
    public static final yva f276616c1;

    /* JADX INFO: renamed from: d */
    public static final yva f276617d;

    /* JADX INFO: renamed from: e */
    public static final yva f276618e;

    /* JADX INFO: renamed from: f */
    public static final yva f276619f;

    /* JADX INFO: renamed from: g */
    public static final yva f276620g;

    /* JADX INFO: renamed from: h */
    public static final yva f276621h;

    /* JADX INFO: renamed from: i */
    public static final yva f276622i;

    /* JADX INFO: renamed from: t */
    public static final yva f276623t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f276624a;

    static {
        int i = 0;
        f276613b = new yva(i, 0);
        f276615c = new yva(i, 1);
        f276617d = new yva(i, 2);
        f276618e = new yva(i, 3);
        f276619f = new yva(i, 4);
        f276620g = new yva(i, 5);
        f276621h = new yva(i, 6);
        f276622i = new yva(i, 7);
        f276623t = new yva(i, 8);
        f276606X = new yva(i, 9);
        f276608Y = new yva(i, 10);
        f276610Z = new yva(i, 11);
        f276594L0 = new yva(i, 12);
        f276595M0 = new yva(i, 13);
        f276596N0 = new yva(i, 14);
        f276597O0 = new yva(i, 15);
        f276598P0 = new yva(i, 16);
        f276599Q0 = new yva(i, 17);
        f276600R0 = new yva(i, 18);
        f276601S0 = new yva(i, 19);
        f276602T0 = new yva(i, 20);
        f276603U0 = new yva(i, 21);
        f276604V0 = new yva(i, 22);
        f276605W0 = new yva(i, 23);
        f276607X0 = new yva(i, 24);
        f276609Y0 = new yva(i, 25);
        f276611Z0 = new yva(i, 26);
        f276612a1 = new yva(i, 27);
        f276614b1 = new yva(i, 28);
        f276616c1 = new yva(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yva(int i, int i2) {
        super(i);
        this.f276624a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f276624a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                return Float.valueOf(0.0f);
            case 1:
                return Float.valueOf(0.0f);
            case 2:
                return new pn80(ql51.f189738a, m3b.f139580a);
            case 3:
                return new mj5(q5b.f185492a, 0);
            case 4:
                return w2a1Var;
            case 5:
                throw new IllegalStateException("No BitmapStorage in local composition");
            case 6:
                return w2a1Var;
            case 7:
                return WorkRunners.m15651a();
            case 8:
                return WorkRunners.m15651a();
            case 9:
                return null;
            case 10:
                return new vum0(0);
            case 11:
                return null;
            case 12:
                throw new IllegalStateException("EntityLinkingElement not provided.");
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return w2a1Var;
            case 18:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 19:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 20:
                return w2a1Var;
            case 21:
                return sam.m77645B(Boolean.FALSE);
            case 22:
                return w2a1Var;
            case 23:
                return Locale.forLanguageTag(ihf1.m50635s());
            case 24:
            case 25:
            case 26:
            case 27:
                return w2a1Var;
            case 28:
                float f = 16;
                rd40 rd40Var = new rd40("CheckboxChecked", f, f, 16.0f, 16.0f, 0L, 0, false, 224);
                pk31 pk31Var = new pk31(rfg1.m75434d(4294967295L));
                int i2 = c5b1.f34134a;
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new gcn0(6.708f, 12.623f));
                arrayList.add(new fcn0(12.506f, 5.842f));
                arrayList.add(new fcn0(10.986f, 4.542f));
                arrayList.add(new fcn0(6.709f, 9.544f));
                arrayList.add(new fcn0(5.144f, 7.709f));
                arrayList.add(new fcn0(3.623f, 9.007f));
                arrayList.add(new fcn0(6.708f, 12.623f));
                arrayList.add(ccn0.f36584c);
                rd40.m75320a(rd40Var, arrayList, pk31Var, 0.0f, 0, 4.0f);
                return rd40Var.m75321b();
            default:
                return Boolean.TRUE;
        }
    }
}
