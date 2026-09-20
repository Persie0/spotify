package p204p;

import android.view.Choreographer;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ylq implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public static final Field f274073a;

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        f274073a = declaredField;
        declaredField.setAccessible(true);
    }
}
