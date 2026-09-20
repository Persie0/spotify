package p204p;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nhs {

    /* JADX INFO: renamed from: a */
    public static final Method f154067a;

    /* JADX INFO: renamed from: b */
    public static final Method f154068b;

    /* JADX INFO: renamed from: c */
    public static final Method f154069c;

    /* JADX INFO: renamed from: d */
    public static final boolean f154070d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f154067a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f154068b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f154069c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f154070d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
