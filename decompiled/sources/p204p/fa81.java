package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class fa81 {

    /* JADX INFO: renamed from: E */
    public static final float[][] f67459E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: F */
    public static final float[][] f67460F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: A */
    public final float f67461A;

    /* JADX INFO: renamed from: B */
    public final float f67462B;

    /* JADX INFO: renamed from: C */
    public final int f67463C;

    /* JADX INFO: renamed from: D */
    public final int f67464D;

    /* JADX INFO: renamed from: a */
    public final int f67465a;

    /* JADX INFO: renamed from: b */
    public final int f67466b;

    /* JADX INFO: renamed from: c */
    public final int f67467c;

    /* JADX INFO: renamed from: d */
    public final int f67468d;

    /* JADX INFO: renamed from: e */
    public final int f67469e;

    /* JADX INFO: renamed from: f */
    public final int f67470f;

    /* JADX INFO: renamed from: g */
    public float f67471g;

    /* JADX INFO: renamed from: h */
    public float f67472h;

    /* JADX INFO: renamed from: i */
    public final int f67473i;

    /* JADX INFO: renamed from: j */
    public final boolean f67474j;

    /* JADX INFO: renamed from: k */
    public float f67475k;

    /* JADX INFO: renamed from: l */
    public float f67476l;

    /* JADX INFO: renamed from: m */
    public boolean f67477m = false;

    /* JADX INFO: renamed from: n */
    public final float[] f67478n = new float[2];

    /* JADX INFO: renamed from: o */
    public final int[] f67479o = new int[2];

    /* JADX INFO: renamed from: p */
    public float f67480p;

    /* JADX INFO: renamed from: q */
    public float f67481q;

    /* JADX INFO: renamed from: r */
    public final MotionLayout f67482r;

    /* JADX INFO: renamed from: s */
    public final float f67483s;

    /* JADX INFO: renamed from: t */
    public final float f67484t;

    /* JADX INFO: renamed from: u */
    public final boolean f67485u;

    /* JADX INFO: renamed from: v */
    public final float f67486v;

    /* JADX INFO: renamed from: w */
    public final int f67487w;

    /* JADX INFO: renamed from: x */
    public final float f67488x;

    /* JADX INFO: renamed from: y */
    public final float f67489y;

    /* JADX INFO: renamed from: z */
    public final float f67490z;

    public fa81(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f67465a = 0;
        this.f67466b = 0;
        this.f67467c = 0;
        this.f67468d = -1;
        this.f67469e = -1;
        this.f67470f = -1;
        this.f67471g = 0.5f;
        this.f67472h = 0.5f;
        this.f67473i = -1;
        this.f67474j = false;
        this.f67475k = 0.0f;
        this.f67476l = 1.0f;
        this.f67483s = 4.0f;
        this.f67484t = 1.2f;
        this.f67485u = true;
        this.f67486v = 1.0f;
        this.f67487w = 0;
        this.f67488x = 10.0f;
        this.f67489y = 10.0f;
        this.f67490z = 1.0f;
        this.f67461A = Float.NaN;
        this.f67462B = Float.NaN;
        this.f67463C = 0;
        this.f67464D = 0;
        this.f67482r = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), b2u0.f22711o);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 16) {
                this.f67468d = typedArrayObtainStyledAttributes.getResourceId(index, this.f67468d);
            } else if (index == 17) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f67465a);
                this.f67465a = i2;
                float[] fArr = f67459E[i2];
                this.f67472h = fArr[0];
                this.f67471g = fArr[1];
            } else if (index == 1) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f67466b);
                this.f67466b = i3;
                if (i3 < 6) {
                    float[] fArr2 = f67460F[i3];
                    this.f67475k = fArr2[0];
                    this.f67476l = fArr2[1];
                } else {
                    this.f67476l = Float.NaN;
                    this.f67475k = Float.NaN;
                    this.f67474j = true;
                }
            } else if (index == 6) {
                this.f67483s = typedArrayObtainStyledAttributes.getFloat(index, this.f67483s);
            } else if (index == 5) {
                this.f67484t = typedArrayObtainStyledAttributes.getFloat(index, this.f67484t);
            } else if (index == 7) {
                this.f67485u = typedArrayObtainStyledAttributes.getBoolean(index, this.f67485u);
            } else if (index == 2) {
                this.f67486v = typedArrayObtainStyledAttributes.getFloat(index, this.f67486v);
            } else if (index == 3) {
                this.f67488x = typedArrayObtainStyledAttributes.getFloat(index, this.f67488x);
            } else if (index == 18) {
                this.f67469e = typedArrayObtainStyledAttributes.getResourceId(index, this.f67469e);
            } else if (index == 9) {
                this.f67467c = typedArrayObtainStyledAttributes.getInt(index, this.f67467c);
            } else if (index == 8) {
                this.f67487w = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f67470f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f67473i = typedArrayObtainStyledAttributes.getResourceId(index, this.f67473i);
            } else if (index == 12) {
                this.f67489y = typedArrayObtainStyledAttributes.getFloat(index, this.f67489y);
            } else if (index == 13) {
                this.f67490z = typedArrayObtainStyledAttributes.getFloat(index, this.f67490z);
            } else if (index == 14) {
                this.f67461A = typedArrayObtainStyledAttributes.getFloat(index, this.f67461A);
            } else if (index == 15) {
                this.f67462B = typedArrayObtainStyledAttributes.getFloat(index, this.f67462B);
            } else if (index == 11) {
                this.f67463C = typedArrayObtainStyledAttributes.getInt(index, this.f67463C);
            } else if (index == 0) {
                this.f67464D = typedArrayObtainStyledAttributes.getInt(index, this.f67464D);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final RectF m41145a(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f67470f;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: b */
    public final RectF m41146b(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f67469e;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: c */
    public final void m41147c(boolean z) {
        float[][] fArr = f67459E;
        float[][] fArr2 = f67460F;
        if (z) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f67465a];
        this.f67472h = fArr3[0];
        this.f67471g = fArr3[1];
        int i = this.f67466b;
        if (i >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i];
        this.f67475k = fArr4[0];
        this.f67476l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f67475k)) {
            return "rotation";
        }
        return this.f67475k + " , " + this.f67476l;
    }
}
