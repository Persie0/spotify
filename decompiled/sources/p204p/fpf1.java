package p204p;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class fpf1 extends ufc1 {

    /* JADX INFO: renamed from: c */
    public static final Unsafe f71843c;

    /* JADX INFO: renamed from: d */
    public static final long f71844d;

    /* JADX INFO: renamed from: e */
    public static final long f71845e;

    /* JADX INFO: renamed from: f */
    public static final long f71846f;

    /* JADX INFO: renamed from: g */
    public static final long f71847g;

    /* JADX INFO: renamed from: h */
    public static final long f71848h;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new xpf1());
        }
        try {
            f71845e = unsafe.objectFieldOffset(lpf1.class.getDeclaredField("c"));
            f71844d = unsafe.objectFieldOffset(lpf1.class.getDeclaredField("b"));
            f71846f = unsafe.objectFieldOffset(lpf1.class.getDeclaredField("a"));
            f71847g = unsafe.objectFieldOffset(gpf1.class.getDeclaredField("a"));
            f71848h = unsafe.objectFieldOffset(gpf1.class.getDeclaredField("b"));
            f71843c = unsafe;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p204p.ufc1
    /* JADX INFO: renamed from: A */
    public final void mo36572A(gpf1 gpf1Var, Thread thread) {
        f71843c.putObject(gpf1Var, f71847g, thread);
    }

    @Override // p204p.ufc1
    /* JADX INFO: renamed from: B */
    public final boolean mo36573B(wsf1 wsf1Var, yof1 yof1Var, yof1 yof1Var2) {
        return tpf1.m81260a(f71843c, wsf1Var, f71844d, yof1Var, yof1Var2);
    }

    @Override // p204p.ufc1
    /* JADX INFO: renamed from: C */
    public final boolean mo36574C(lpf1 lpf1Var, Object obj, Object obj2) {
        return tpf1.m81260a(f71843c, lpf1Var, f71846f, obj, obj2);
    }

    @Override // p204p.ufc1
    /* JADX INFO: renamed from: D */
    public final boolean mo36575D(lpf1 lpf1Var, gpf1 gpf1Var, gpf1 gpf1Var2) {
        return tpf1.m81260a(f71843c, lpf1Var, f71845e, gpf1Var, gpf1Var2);
    }

    @Override // p204p.ufc1
    /* JADX INFO: renamed from: x */
    public final yof1 mo36576x(wsf1 wsf1Var) {
        yof1 yof1Var;
        yof1 yof1Var2 = yof1.f274660d;
        do {
            yof1Var = wsf1Var.f135760b;
            if (yof1Var2 == yof1Var) {
                break;
            }
        } while (!mo36573B(wsf1Var, yof1Var, yof1Var2));
        return yof1Var;
    }

    @Override // p204p.ufc1
    /* JADX INFO: renamed from: y */
    public final gpf1 mo36577y(wsf1 wsf1Var) {
        gpf1 gpf1Var;
        gpf1 gpf1Var2 = gpf1.f83181c;
        do {
            gpf1Var = wsf1Var.f135761c;
            if (gpf1Var2 == gpf1Var) {
                break;
            }
        } while (!mo36575D(wsf1Var, gpf1Var, gpf1Var2));
        return gpf1Var;
    }

    @Override // p204p.ufc1
    /* JADX INFO: renamed from: z */
    public final void mo36578z(gpf1 gpf1Var, gpf1 gpf1Var2) {
        f71843c.putObject(gpf1Var, f71848h, gpf1Var2);
    }
}
