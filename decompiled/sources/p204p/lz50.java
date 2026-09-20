package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lz50 {

    /* JADX INFO: renamed from: a */
    public static final long f138263a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f138264b = 0;

    static {
        hvi0 hvi0Var = cks.f39079b;
        f138263a = jwg1.m54449D(10, ils.SECONDS);
    }

    /* JADX INFO: renamed from: a */
    public static final xfr m60282a(int i) {
        switch (edb.m38547C(i)) {
            case 0:
                return xfr.f261078a;
            case 1:
                return xfr.f261079b;
            case 2:
                return xfr.f261080c;
            case 3:
                return xfr.f261081d;
            case 4:
                return xfr.f261082e;
            case 5:
                return xfr.f261068Q0;
            case 6:
                return xfr.f261083f;
            case 7:
                return xfr.f261084g;
            case 8:
                return xfr.f261085h;
            case 9:
                return xfr.f261086i;
            case 10:
                return xfr.f261087t;
            case 11:
                return xfr.f261075X;
            case 12:
                return xfr.f261076Y;
            case 13:
                return xfr.f261077Z;
            case 14:
                return xfr.f261063L0;
            case 15:
                return xfr.f261064M0;
            case 16:
                return xfr.f261065N0;
            case 17:
                return xfr.f261066O0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m60283b(qy50 qy50Var, ibk ibkVar) {
        kz50 kz50Var;
        if (ibkVar instanceof kz50) {
            kz50Var = (kz50) ibkVar;
            int i = kz50Var.f128019b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kz50Var.f128019b = i - Integer.MIN_VALUE;
            } else {
                kz50Var = new kz50(ibkVar);
            }
        } else {
            kz50Var = new kz50(ibkVar);
        }
        Object objM76981v = kz50Var.f128018a;
        int i2 = kz50Var.f128019b;
        if (i2 == 0) {
            bga.m29073P(objM76981v);
            q950 q950Var = new q950(qy50Var, null, 5);
            kz50Var.f128019b = 1;
            objM76981v = s1h1.m76981v(f138263a, q950Var, kz50Var);
            yuk yukVar = yuk.f276404a;
            if (objM76981v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76981v);
        }
        return qyg1.m74178H(objM76981v != null);
    }
}
