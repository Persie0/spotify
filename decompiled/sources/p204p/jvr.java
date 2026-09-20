package p204p;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class jvr {

    /* JADX INFO: renamed from: e */
    public static final Size f116451e = new Size(1920, 1080);

    /* JADX INFO: renamed from: f */
    public static final Size f116452f = new Size(320, 240);

    /* JADX INFO: renamed from: g */
    public static final Size f116453g = new Size(640, 480);

    /* JADX INFO: renamed from: h */
    public static final Object f116454h = new Object();

    /* JADX INFO: renamed from: i */
    public static volatile jvr f116455i;

    /* JADX INFO: renamed from: a */
    public final DisplayManager f116456a;

    /* JADX INFO: renamed from: b */
    public volatile Size f116457b = null;

    /* JADX INFO: renamed from: c */
    public final ha80 f116458c = new ha80(13);

    /* JADX INFO: renamed from: d */
    public final j3p f116459d = new j3p();

    public jvr(Context context) {
        this.f116456a = (DisplayManager) context.getSystemService("display");
    }

    /* JADX INFO: renamed from: b */
    public static jvr m54388b(Context context) {
        if (f116455i == null) {
            synchronized (f116454h) {
                try {
                    if (f116455i == null) {
                        f116455i = new jvr(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f116455i;
    }

    /* JADX INFO: renamed from: d */
    public static Display m54389d(Display[] displayArr, boolean z) {
        Display display = null;
        int i = -1;
        for (Display display2 : displayArr) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i2 = point.x * point.y;
                if (i2 > i) {
                    display = display2;
                    i = i2;
                }
            }
        }
        return display;
    }

    /* JADX INFO: renamed from: a */
    public final Size m54390a() {
        Size sizeM181b;
        Point point = new Point();
        m54391c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = vi21.f241602a;
        if (size.getHeight() * size.getWidth() < vi21.m85581a(f116452f)) {
            size = ((SmallDisplaySizeQuirk) this.f116459d.f108451b) != null ? (Size) SmallDisplaySizeQuirk.f388a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = f116453g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = f116451e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        if (((ExtraCroppingQuirk) this.f116458c.f89153b) != null && (sizeM181b = ExtraCroppingQuirk.m181b(1)) != null) {
            if (sizeM181b.getHeight() * sizeM181b.getWidth() > size.getHeight() * size.getWidth()) {
                return sizeM181b;
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: c */
    public final Display m54391c(boolean z) {
        Display[] displays = this.f116456a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayM54389d = m54389d(displays, z);
        if (displayM54389d == null && z) {
            displayM54389d = m54389d(displays, false);
        }
        if (displayM54389d != null) {
            return displayM54389d;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* JADX INFO: renamed from: e */
    public final Size m54392e() {
        if (this.f116457b != null) {
            return this.f116457b;
        }
        this.f116457b = m54390a();
        return this.f116457b;
    }
}
