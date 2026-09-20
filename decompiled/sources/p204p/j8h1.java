package p204p;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class j8h1 extends wvf1 {

    /* JADX INFO: renamed from: d */
    public static final Unsafe f109940d;

    /* JADX INFO: renamed from: e */
    public static final long f109941e;

    /* JADX INFO: renamed from: f */
    public static final long f109942f;

    /* JADX INFO: renamed from: g */
    public static final long f109943g;

    /* JADX INFO: renamed from: h */
    public static final long f109944h;

    /* JADX INFO: renamed from: i */
    public static final long f109945i;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(n8h1.f151539a);
            }
            try {
                f109942f = unsafe.objectFieldOffset(l8h1.class.getDeclaredField("Y"));
                f109941e = unsafe.objectFieldOffset(l8h1.class.getDeclaredField("X"));
                f109943g = unsafe.objectFieldOffset(l8h1.class.getDeclaredField("t"));
                f109944h = unsafe.objectFieldOffset(k8h1.class.getDeclaredField("a"));
                f109945i = unsafe.objectFieldOffset(k8h1.class.getDeclaredField("b"));
                f109940d = unsafe;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // p204p.wvf1
    /* JADX INFO: renamed from: I */
    public final void mo38102I(k8h1 k8h1Var, Thread thread) {
        f109940d.putObject(k8h1Var, f109944h, thread);
    }

    @Override // p204p.wvf1
    /* JADX INFO: renamed from: J */
    public final void mo38103J(k8h1 k8h1Var, k8h1 k8h1Var2) {
        f109940d.putObject(k8h1Var, f109945i, k8h1Var2);
    }

    @Override // p204p.wvf1
    /* JADX INFO: renamed from: K */
    public final boolean mo38104K(l8h1 l8h1Var, k8h1 k8h1Var, k8h1 k8h1Var2) {
        return i8h1.m49948a(f109940d, l8h1Var, f109942f, k8h1Var, k8h1Var2);
    }

    @Override // p204p.wvf1
    /* JADX INFO: renamed from: L */
    public final boolean mo38105L(l8h1 l8h1Var, c8h1 c8h1Var, c8h1 c8h1Var2) {
        return h8h1.m46832a(f109940d, l8h1Var, f109941e, c8h1Var, c8h1Var2);
    }

    @Override // p204p.wvf1
    /* JADX INFO: renamed from: M */
    public final k8h1 mo38106M(d8h1 d8h1Var) {
        k8h1 k8h1Var;
        k8h1 k8h1Var2 = k8h1.f120370c;
        do {
            k8h1Var = d8h1Var.f130872Y;
            if (k8h1Var2 == k8h1Var) {
                break;
            }
        } while (!mo38104K(d8h1Var, k8h1Var, k8h1Var2));
        return k8h1Var;
    }

    @Override // p204p.wvf1
    /* JADX INFO: renamed from: N */
    public final c8h1 mo38107N(d8h1 d8h1Var) {
        c8h1 c8h1Var;
        c8h1 c8h1Var2 = c8h1.f35220d;
        do {
            c8h1Var = d8h1Var.f130871X;
            if (c8h1Var2 == c8h1Var) {
                break;
            }
        } while (!mo38105L(d8h1Var, c8h1Var, c8h1Var2));
        return c8h1Var;
    }

    @Override // p204p.wvf1
    /* JADX INFO: renamed from: O */
    public final boolean mo38108O(l8h1 l8h1Var, Object obj, Object obj2) {
        return g8h1.m43959a(f109940d, l8h1Var, f109943g, obj, obj2);
    }
}
