package p204p;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ags {

    /* JADX INFO: renamed from: a */
    public static final boolean f15488a;

    /* JADX INFO: renamed from: b */
    public static final Method f15489b;

    /* JADX INFO: renamed from: c */
    public static final Field f15490c;

    /* JADX INFO: renamed from: d */
    public static final Field f15491d;

    /* JADX INFO: renamed from: e */
    public static final Field f15492e;

    /* JADX INFO: renamed from: f */
    public static final Field f15493f;

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f15489b = method;
                        f15490c = field;
                        f15491d = field2;
                        f15492e = field3;
                        f15493f = field4;
                        f15488a = true;
                        return;
                    }
                    f15489b = null;
                    f15490c = null;
                    f15491d = null;
                    f15492e = null;
                    f15493f = null;
                    f15488a = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f15489b = method;
                        f15490c = field;
                        f15491d = field2;
                        f15492e = field3;
                        f15493f = field4;
                        f15488a = true;
                        return;
                    }
                    f15489b = null;
                    f15490c = null;
                    f15491d = null;
                    f15492e = null;
                    f15493f = null;
                    f15488a = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f15489b = method;
                        f15490c = field;
                        f15491d = field2;
                        f15492e = field3;
                        f15493f = field4;
                        f15488a = true;
                        return;
                    }
                    f15489b = null;
                    f15490c = null;
                    f15491d = null;
                    f15492e = null;
                    f15493f = null;
                    f15488a = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    f15489b = method;
                    f15490c = field;
                    f15491d = field2;
                    f15492e = field3;
                    f15493f = field4;
                    f15488a = true;
                    return;
                }
                f15489b = null;
                f15490c = null;
                f15491d = null;
                f15492e = null;
                f15493f = null;
                f15488a = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    f15489b = method;
                    f15490c = field;
                    f15491d = field2;
                    f15492e = field3;
                    f15493f = field4;
                    f15488a = true;
                    return;
                }
                f15489b = null;
                f15490c = null;
                f15491d = null;
                f15492e = null;
                f15493f = null;
                f15488a = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    f15489b = method;
                    f15490c = field;
                    f15491d = field2;
                    f15492e = field3;
                    f15493f = field4;
                    f15488a = true;
                    return;
                }
                f15489b = null;
                f15490c = null;
                f15491d = null;
                f15492e = null;
                f15493f = null;
                f15488a = false;
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z) {
            f15489b = method;
            f15490c = field;
            f15491d = field2;
            f15492e = field3;
            f15493f = field4;
            f15488a = true;
            return;
        }
        f15489b = null;
        f15490c = null;
        f15491d = null;
        f15492e = null;
        f15493f = null;
        f15488a = false;
    }

    /* JADX INFO: renamed from: a */
    public static Rect m25883a(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29 && f15488a) {
            try {
                Object objInvoke = f15489b.invoke(drawable, null);
                if (objInvoke != null) {
                    return new Rect(f15490c.getInt(objInvoke), f15491d.getInt(objInvoke), f15492e.getInt(objInvoke), f15493f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return cgs.f37784c;
    }
}
