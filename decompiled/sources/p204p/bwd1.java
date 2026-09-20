package p204p;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class bwd1 extends hwd1 {

    /* JADX INFO: renamed from: e */
    public static Field f31635e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f31636f = false;

    /* JADX INFO: renamed from: g */
    public static Constructor f31637g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f31638h = false;

    /* JADX INFO: renamed from: c */
    public WindowInsets f31639c;

    /* JADX INFO: renamed from: d */
    public dx40 f31640d;

    public bwd1() {
        this.f31639c = m30679i();
    }

    /* JADX INFO: renamed from: i */
    private static WindowInsets m30679i() {
        if (!f31636f) {
            try {
                f31635e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f31636f = true;
        }
        Field field = f31635e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f31638h) {
            try {
                f31637g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f31638h = true;
        }
        Constructor constructor = f31637g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // p204p.hwd1
    /* JADX INFO: renamed from: b */
    public swd1 mo30680b() {
        m48936a();
        swd1 swd1VarM79536g = swd1.m79536g(null, this.f31639c);
        dx40[] dx40VarArr = this.f95924b;
        pwd1 pwd1Var = swd1VarM79536g.f214650a;
        pwd1Var.mo51812r(dx40VarArr);
        pwd1Var.mo54435u(this.f31640d);
        return swd1VarM79536g;
    }

    @Override // p204p.hwd1
    /* JADX INFO: renamed from: e */
    public void mo30681e(dx40 dx40Var) {
        this.f31640d = dx40Var;
    }

    @Override // p204p.hwd1
    /* JADX INFO: renamed from: g */
    public void mo30682g(dx40 dx40Var) {
        WindowInsets windowInsets = this.f31639c;
        if (windowInsets != null) {
            this.f31639c = windowInsets.replaceSystemWindowInsets(dx40Var.f53848a, dx40Var.f53849b, dx40Var.f53850c, dx40Var.f53851d);
        }
    }

    public bwd1(swd1 swd1Var) {
        super(swd1Var);
        this.f31639c = swd1Var.m79541f();
    }
}
