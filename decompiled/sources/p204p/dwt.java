package p204p;

import android.app.Application;
import com.google.android.gms.common.api.ApiException;

/* JADX INFO: loaded from: classes2.dex */
public final class dwt {

    /* JADX INFO: renamed from: e */
    public static final long[] f53742e = new long[0];

    /* JADX INFO: renamed from: a */
    public long f53743a;

    /* JADX INFO: renamed from: b */
    public final Object f53744b;

    /* JADX INFO: renamed from: c */
    public final Object f53745c;

    /* JADX INFO: renamed from: d */
    public Object f53746d;

    /* JADX WARN: Multi-variable type inference failed */
    public dwt(ktz0 ktz0Var, th00 th00Var) {
        this.f53744b = ktz0Var;
        this.f53745c = (ri00) th00Var;
        int iMo33222e = ktz0Var.mo33222e();
        if (iMo33222e <= 64) {
            this.f53743a = iMo33222e != 64 ? (-1) << iMo33222e : 0L;
            this.f53746d = f53742e;
            return;
        }
        this.f53743a = 0L;
        int i = (iMo33222e - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iMo33222e & 63) != 0) {
            jArr[i - 1] = (-1) << iMo33222e;
        }
        this.f53746d = jArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m37171a(ibk ibkVar) {
        jlo0 jlo0Var;
        if (ibkVar instanceof jlo0) {
            jlo0Var = (jlo0) ibkVar;
            int i = jlo0Var.f113661c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jlo0Var.f113661c = i - Integer.MIN_VALUE;
            } else {
                jlo0Var = new jlo0(this, ibkVar);
            }
        } else {
            jlo0Var = new jlo0(this, ibkVar);
        }
        Object objM63268a = jlo0Var.f113659a;
        int i2 = jlo0Var.f113661c;
        if (i2 == 0) {
            bga.m29073P(objM63268a);
            g1f1 g1f1Var = (g1f1) this.f53746d;
            if (g1f1Var != null) {
                return g1f1Var;
            }
            jlo0Var.f113661c = 1;
            mzx0 mzx0Var = new mzx0(seg1.m77914f(jlo0Var));
            ((okj0) this.f53744b).m67242f0();
            t0f1 t0f1Var = (t0f1) this.f53745c;
            long j = this.f53743a;
            byte b = (byte) (((byte) (0 | 2)) | 1);
            if (b != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b & 1) == 0) {
                    sb.append(" cloudProjectNumber");
                }
                if ((b & 2) == 0) {
                    sb.append(" webViewRequestMode");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            y7h1 y7h1VarM79785a = t0f1Var.m79785a(new m2f1(j));
            y7h1VarM79785a.mo1512d(gv61.f84648a, new klo0(this, mzx0Var, 0));
            y7h1VarM79785a.m92992m(new klo0(this, mzx0Var, 1));
            objM63268a = mzx0Var.m63268a();
            yuk yukVar = yuk.f276404a;
            if (objM63268a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM63268a);
        }
        return ((s6x0) objM63268a).f206218a;
    }

    /* JADX INFO: renamed from: b */
    public void m37172b(int i) {
        if (i < 64) {
            this.f53743a = (1 << i) | this.f53743a;
        } else {
            int i2 = (i >>> 6) - 1;
            long[] jArr = (long[]) this.f53746d;
            jArr[i2] = (1 << (i & 63)) | jArr[i2];
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [p.ri00, p.th00] */
    /* JADX INFO: renamed from: c */
    public int m37173c() {
        int iNumberOfTrailingZeros;
        ?? r1 = (ri00) this.f53745c;
        ktz0 ktz0Var = (ktz0) this.f53744b;
        int iMo33222e = ktz0Var.mo33222e();
        do {
            long j = this.f53743a;
            if (j == -1) {
                if (iMo33222e <= 64) {
                    return -1;
                }
                long[] jArr = (long[]) this.f53746d;
                int length = jArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    int i3 = i2 * 64;
                    long j2 = jArr[i];
                    while (j2 != -1) {
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                        j2 |= 1 << iNumberOfTrailingZeros2;
                        int i4 = iNumberOfTrailingZeros2 + i3;
                        if (((Boolean) r1.invoke(ktz0Var, Integer.valueOf(i4))).booleanValue()) {
                            jArr[i] = j2;
                            return i4;
                        }
                    }
                    jArr[i] = j2;
                    i = i2;
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.f53743a |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) r1.invoke(ktz0Var, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (r7 == r4) goto L25;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m37174d(String str, ibk ibkVar) {
        llo0 llo0Var;
        Object objM37171a;
        if (ibkVar instanceof llo0) {
            llo0Var = (llo0) ibkVar;
            int i = llo0Var.f134677d;
            if ((i & Integer.MIN_VALUE) != 0) {
                llo0Var.f134677d = i - Integer.MIN_VALUE;
            } else {
                llo0Var = new llo0(this, ibkVar);
            }
        } else {
            llo0Var = new llo0(this, ibkVar);
        }
        Object objM63268a = llo0Var.f134675b;
        int i2 = llo0Var.f134677d;
        int i3 = 2;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM63268a);
            llo0Var.f134674a = str;
            llo0Var.f134677d = 1;
            objM37171a = m37171a(llo0Var);
            if (objM37171a != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = llo0Var.f134674a;
            bga.m29073P(objM63268a);
            objM37171a = ((s6x0) objM63268a).f206218a;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM63268a);
        }
        return (zy71) objM63268a;
        Throwable thM77348a = s6x0.m77348a(objM37171a);
        if (thM77348a != null) {
            if (thM77348a instanceof ApiException) {
                return new wy71(z8g1.m95593m(((ApiException) thM77348a).getStatusCode()));
            }
            String message = thM77348a.getMessage();
            if (message == null) {
                message = "Failed to initialise";
            }
            return new wy71(message);
        }
        g1f1 g1f1Var = (g1f1) objM37171a;
        llo0Var.f134674a = null;
        llo0Var.f134677d = 2;
        ((okj0) this.f53744b).m67244h0();
        mzx0 mzx0Var = new mzx0(seg1.m77914f(llo0Var));
        int i4 = l0f1.f128420h;
        n0f1 n0f1Var = n0f1.f149047Y;
        if (n0f1Var == null) {
            throw new NullPointerException("Null verdictOptOut");
        }
        y7h1 y7h1VarM43356a = g1f1Var.m43356a(new s2f1(str, n0f1Var));
        klo0 klo0Var = new klo0(this, mzx0Var, i3);
        y7h1VarM43356a.getClass();
        y7h1VarM43356a.mo1512d(gv61.f84648a, klo0Var);
        y7h1VarM43356a.m92992m(new klo0(this, mzx0Var, 3));
        objM63268a = mzx0Var.m63268a();
    }

    public dwt(Application application, okj0 okj0Var) {
        this.f53744b = okj0Var;
        this.f53745c = zn91.m96585y(application.getApplicationContext());
        this.f53743a = 603244941621L;
    }
}
