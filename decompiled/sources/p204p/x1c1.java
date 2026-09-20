package p204p;

import com.spotify.campaigns.rivevideo.preview.api.TerminalParamsException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x1c1 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: a */
    public static final Object m89631a(l1c1 l1c1Var, zi5 zi5Var, z9r0 z9r0Var, ibk ibkVar) {
        o1c1 o1c1Var;
        y9r0 y9r0Var;
        if (ibkVar instanceof o1c1) {
            o1c1Var = (o1c1) ibkVar;
            int i = o1c1Var.f160696c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o1c1Var.f160696c = i - Integer.MIN_VALUE;
            } else {
                o1c1Var = new o1c1(ibkVar);
            }
        } else {
            o1c1Var = new o1c1(ibkVar);
        }
        Object cq51Var = o1c1Var.f160695b;
        Object obj = yuk.f276404a;
        int i2 = o1c1Var.f160696c;
        try {
            if (i2 == 0) {
                bga.m29073P(cq51Var);
                String str = l1c1Var.f128699a;
                synchronized (z9r0Var.f280866b) {
                    y9r0Var = z9r0Var.f280867c;
                }
                y9r0 y9r0VarM95720a = y9r0Var == null ? z9r0Var.m95720a(str) : y9r0Var;
                o1c1Var.f160694a = y9r0VarM95720a;
                o1c1Var.f160696c = 1;
                zi5Var.getClass();
                cq51Var = new cq51();
                l1c1Var = y9r0VarM95720a;
                if (cq51Var == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y9r0 y9r0Var2 = o1c1Var.f160694a;
                bga.m29073P(cq51Var);
                l1c1Var = y9r0Var2;
            }
            return new t2c1((cq51) cq51Var);
        } catch (CancellationException e) {
            l1c1Var.m93159b(3);
            throw e;
        } catch (Exception e2) {
            l1c1Var.m93159b(2);
            return new s2c1(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e A[Catch: Exception -> 0x0028, TerminalParamsException -> 0x002a, CancellationException -> 0x002d, TryCatch #4 {TerminalParamsException -> 0x002a, CancellationException -> 0x002d, Exception -> 0x0028, blocks: (B:12:0x0024, B:28:0x005a, B:30:0x005e, B:32:0x0069), top: B:48:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0069 A[Catch: Exception -> 0x0028, TerminalParamsException -> 0x002a, CancellationException -> 0x002d, TRY_LEAVE, TryCatch #4 {TerminalParamsException -> 0x002a, CancellationException -> 0x002d, Exception -> 0x0028, blocks: (B:12:0x0024, B:28:0x005a, B:30:0x005e, B:32:0x0069), top: B:48:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m89632b(bya0 bya0Var, z9r0 z9r0Var, ibk ibkVar) throws Throwable {
        p1c1 p1c1Var;
        Exception e;
        y9r0 y9r0Var;
        CancellationException e2;
        TerminalParamsException e3;
        String message;
        jix0 jix0Var;
        if (ibkVar instanceof p1c1) {
            p1c1Var = (p1c1) ibkVar;
            int i = p1c1Var.f173050c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p1c1Var.f173050c = i - Integer.MIN_VALUE;
            } else {
                p1c1Var = new p1c1(ibkVar);
            }
        } else {
            p1c1Var = new p1c1(ibkVar);
        }
        Object objM89557A = p1c1Var.f173049b;
        int i2 = p1c1Var.f173050c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y9r0Var = p1c1Var.f173048a;
            try {
                bga.m29073P(objM89557A);
                jix0Var = (jix0) objM89557A;
                if (jix0Var != null) {
                    y9r0Var.m93161d(jix0Var.f112831a);
                    return new v2c1(jix0Var);
                }
                y9r0Var.m93159b(2);
                return new w2c1("Share asset is not a Rive animation");
            } catch (TerminalParamsException e4) {
                e3 = e4;
                y9r0Var.m93159b(2);
                message = e3.getMessage();
                if (message == null) {
                    message = "Share asset unavailable";
                }
                return new w2c1(message);
            } catch (CancellationException e5) {
                e2 = e5;
                y9r0Var.m93159b(3);
                throw e2;
            } catch (Exception e6) {
                e = e6;
                y9r0Var.m93159b(2);
                return new u2c1(e);
            }
        }
        bga.m29073P(objM89557A);
        fbk fbkVar = null;
        y9r0 y9r0VarM95720a = z9r0Var.m95720a(null);
        try {
            mbr0 mbr0Var = new mbr0(y9r0VarM95720a);
            ry2 ry2Var = new ry2(bya0Var, fbkVar, 10);
            p1c1Var.f173048a = y9r0VarM95720a;
            p1c1Var.f173050c = 1;
            objM89557A = x0h1.m89557A(mbr0Var, ry2Var, p1c1Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
            y9r0Var = y9r0VarM95720a;
            jix0Var = (jix0) objM89557A;
            if (jix0Var != null) {
                y9r0Var.m93161d(jix0Var.f112831a);
                return new v2c1(jix0Var);
            }
            y9r0Var.m93159b(2);
            return new w2c1("Share asset is not a Rive animation");
        } catch (TerminalParamsException e7) {
            e3 = e7;
            y9r0Var = y9r0VarM95720a;
            y9r0Var.m93159b(2);
            message = e3.getMessage();
            if (message == null) {
                message = "Share asset unavailable";
            }
            return new w2c1(message);
        } catch (CancellationException e8) {
            e2 = e8;
            y9r0Var = y9r0VarM95720a;
            y9r0Var.m93159b(3);
            throw e2;
        } catch (Exception e9) {
            e = e9;
            y9r0Var = y9r0VarM95720a;
            y9r0Var.m93159b(2);
            return new u2c1(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m89633c(n1c1 n1c1Var, ibk ibkVar) {
        q1c1 q1c1Var;
        if (ibkVar instanceof q1c1) {
            q1c1Var = (q1c1) ibkVar;
            int i = q1c1Var.f184294c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q1c1Var.f184294c = i - Integer.MIN_VALUE;
            } else {
                q1c1Var = new q1c1(ibkVar);
            }
        } else {
            q1c1Var = new q1c1(ibkVar);
        }
        Object obj = q1c1Var.f184293b;
        int i2 = q1c1Var.f184294c;
        if (i2 == 0) {
            bga.m29073P(obj);
            long j = n1c1Var.f149392a;
            q1c1Var.f184292a = n1c1Var;
            q1c1Var.f184294c = 1;
            Object objM64619l = njg1.m64619l(j, q1c1Var);
            yuk yukVar = yuk.f276404a;
            if (objM64619l == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n1c1Var = q1c1Var.f184292a;
            bga.m29073P(obj);
        }
        return new x2c1(n1c1Var.f149393b);
    }
}
