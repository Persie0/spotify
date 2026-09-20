package p204p;

import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import androidx.compose.p002ui.graphics.ColorFilter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class u7f extends ColorFilter {

    /* JADX INFO: renamed from: b */
    public float[] f227594b;

    /* JADX INFO: renamed from: a */
    public final float[] m82509a() {
        float[] fArr = this.f227594b;
        if (fArr != null) {
            return fArr;
        }
        android.graphics.ColorFilter colorFilter = this.f495a;
        if (!(colorFilter instanceof ColorMatrixColorFilter) || 26 > Build.VERSION.SDK_INT) {
            throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
        }
        float[] fArrM31241w = c150.m31241w((ColorMatrixColorFilter) colorFilter);
        this.f227594b = fArrM31241w;
        return fArrM31241w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7f) && Arrays.equals(m82509a(), ((u7f) obj).m82509a());
    }

    public final int hashCode() {
        float[] fArr = this.f227594b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f227594b;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
