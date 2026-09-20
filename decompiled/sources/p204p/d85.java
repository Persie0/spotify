package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d85 {

    /* JADX INFO: renamed from: l */
    public static final RectF f46367l = new RectF();

    /* JADX INFO: renamed from: m */
    public static final ConcurrentHashMap f46368m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public int f46369a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f46370b = false;

    /* JADX INFO: renamed from: c */
    public float f46371c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f46372d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f46373e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f46374f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f46375g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f46376h;

    /* JADX INFO: renamed from: i */
    public final TextView f46377i;

    /* JADX INFO: renamed from: j */
    public final Context f46378j;

    /* JADX INFO: renamed from: k */
    public final a85 f46379k;

    static {
        new ConcurrentHashMap();
    }

    public d85(TextView textView) {
        this.f46377i = textView;
        this.f46378j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f46379k = new b85();
        } else {
            this.f46379k = new a85();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m35246b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static Method m35247d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f46368m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m35248a() {
        if (!m35253h() || this.f46369a == 0) {
            return;
        }
        if (this.f46370b) {
            if (this.f46377i.getMeasuredHeight() <= 0 || this.f46377i.getMeasuredWidth() <= 0) {
                return;
            }
            int measuredWidth = this.f46379k.mo28412b(this.f46377i) ? 1048576 : (this.f46377i.getMeasuredWidth() - this.f46377i.getTotalPaddingLeft()) - this.f46377i.getTotalPaddingRight();
            int height = (this.f46377i.getHeight() - this.f46377i.getCompoundPaddingBottom()) - this.f46377i.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            RectF rectF = f46367l;
            synchronized (rectF) {
                try {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fM35249c = m35249c(rectF);
                    if (fM35249c != this.f46377i.getTextSize()) {
                        m35250e(fM35249c, 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f46370b = true;
    }

    /* JADX INFO: renamed from: c */
    public final int m35249c(RectF rectF) {
        CharSequence transformation;
        int length = this.f46374f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= i) {
            int i4 = (i3 + i) / 2;
            int i5 = this.f46374f[i4];
            TextView textView = this.f46377i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int iM90141b = x75.m90141b(textView);
            TextPaint textPaint = this.f46376h;
            if (textPaint == null) {
                this.f46376h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f46376h.set(textView.getPaint());
            this.f46376h.setTextSize(i5);
            Object objInvoke = Layout.Alignment.ALIGN_NORMAL;
            try {
                objInvoke = m35247d("getLayoutAlignment").invoke(textView, null);
            } catch (Exception unused) {
            }
            StaticLayout staticLayoutM95530a = z75.m95530a(charSequence, (Layout.Alignment) objInvoke, Math.round(rectF.right), iM90141b, this.f46377i, this.f46376h, this.f46379k);
            if ((iM90141b == -1 || (staticLayoutM95530a.getLineCount() <= iM90141b && staticLayoutM95530a.getLineEnd(staticLayoutM95530a.getLineCount() - 1) == charSequence.length())) && staticLayoutM95530a.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
        return this.f46374f[i2];
    }

    /* JADX INFO: renamed from: e */
    public final void m35250e(float f, int i) {
        Context context = this.f46378j;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f46377i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zM92987a = y75.m92987a(textView);
            if (textView.getLayout() != null) {
                this.f46370b = false;
                try {
                    Method methodM35247d = m35247d("nullLayouts");
                    if (methodM35247d != null) {
                        methodM35247d.invoke(textView, null);
                    }
                } catch (Exception unused) {
                }
                if (zM92987a) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m35251f() {
        if (m35253h() && this.f46369a == 1) {
            if (!this.f46375g || this.f46374f.length == 0) {
                int iFloor = ((int) Math.floor((this.f46373e - this.f46372d) / this.f46371c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f46371c) + this.f46372d);
                }
                this.f46374f = m35246b(iArr);
            }
            this.f46370b = true;
        } else {
            this.f46370b = false;
        }
        return this.f46370b;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m35252g() {
        int[] iArr = this.f46374f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f46375g = z;
        if (z) {
            this.f46369a = 1;
            this.f46372d = iArr[0];
            this.f46373e = iArr[length - 1];
            this.f46371c = -1.0f;
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m35253h() {
        return !(this.f46377i instanceof AppCompatEditText);
    }

    /* JADX INFO: renamed from: i */
    public final void m35254i(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f46369a = 1;
        this.f46372d = f;
        this.f46373e = f2;
        this.f46371c = f3;
        this.f46375g = false;
    }
}
