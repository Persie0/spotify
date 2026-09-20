package p204p;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class sxd1 implements rxd1 {

    /* JADX INFO: renamed from: b */
    public static final sxd1 f214876b = new sxd1();

    static {
        h6f.m46710G(1, 2, 4, 8, 16, 32, 64, 128);
    }

    /* JADX INFO: renamed from: b */
    public static Rect m79591b(Activity activity) {
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (krg1.m57163i(activity)) {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
            } else {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null));
            }
        } catch (IllegalAccessException unused) {
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException unused2) {
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException unused3) {
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException unused4) {
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        nsg1.m65549n(defaultDisplay, point);
        if (!krg1.m57163i(activity)) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !krg1.m57163i(activity)) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (obj2 instanceof DisplayCutout) {
                    displayCutout = (DisplayCutout) obj2;
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused5) {
            }
            if (displayCutout != null) {
                if (rect.left == r35.m74584N(displayCutout)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == r35.m74585O(displayCutout)) {
                    rect.right = r35.m74585O(displayCutout) + rect.right;
                }
                if (rect.top == r35.m74586P(displayCutout)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == r35.m74583M(displayCutout)) {
                    rect.bottom = r35.m74583M(displayCutout) + rect.bottom;
                }
            }
        }
        return rect;
    }

    /* JADX INFO: renamed from: a */
    public final qxd1 m79592a(Activity activity) throws Exception {
        Rect rect;
        swd1 swd1VarM56710b;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            rect = mzj.m63252a(activity);
        } else if (i >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                rect = new Rect((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
            } catch (IllegalAccessException unused) {
                rect = m79591b(activity);
            } catch (NoSuchFieldException unused2) {
                rect = m79591b(activity);
            } catch (NoSuchMethodException unused3) {
                rect = m79591b(activity);
            } catch (InvocationTargetException unused4) {
                rect = m79591b(activity);
            }
        } else if (i >= 28) {
            rect = m79591b(activity);
        } else {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!krg1.m57163i(activity)) {
                Point point = new Point();
                nsg1.m65549n(defaultDisplay, point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i2 = rect.bottom + dimensionPixelSize;
                if (i2 == point.y) {
                    rect.bottom = i2;
                } else {
                    int i3 = rect.right + dimensionPixelSize;
                    if (i3 == point.x) {
                        rect.right = i3;
                    }
                }
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            swd1VarM56710b = new kkc1().m56710b();
        } else {
            if (i4 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            swd1VarM56710b = mzj.f148721a.m63254b(activity);
        }
        return new qxd1(new vga(rect), swd1VarM56710b);
    }
}
