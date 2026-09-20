package p204p;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0b1 {

    /* JADX INFO: renamed from: a */
    public static final qlo f256851a = new qlo(1);

    /* JADX INFO: renamed from: b */
    public static final q32 f256852b = new q32(14);

    /* JADX INFO: renamed from: c */
    public static final q32 f256853c = new q32(15);

    /* JADX INFO: renamed from: d */
    public static final q32 f256854d = new q32(16);

    /* JADX INFO: renamed from: e */
    public static final float f256855e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: a */
    public static void m89549a(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) f256851a.get();
        Path path2 = (Path) f256852b.get();
        Path path3 = (Path) f256853c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f == 1.0f && f2 == 0.0f) && length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = eff0.m38733c(fMin, length);
                fMax = eff0.m38733c(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = eff0.m38733c(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = eff0.m38733c(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m89550b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m89551c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: d */
    public static float m89552d(Matrix matrix) {
        float[] fArr = (float[]) f256854d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f256855e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m89553e(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
