package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;

/* JADX INFO: loaded from: classes3.dex */
public final class nx41 {

    /* JADX INFO: renamed from: a */
    public final float f159359a;

    /* JADX INFO: renamed from: b */
    public final float f159360b;

    /* JADX INFO: renamed from: c */
    public final float f159361c;

    /* JADX INFO: renamed from: d */
    public final float f159362d;

    /* JADX INFO: renamed from: e */
    public final int f159363e;

    public nx41(Context context, XmlResourceParser xmlResourceParser) {
        this.f159359a = Float.NaN;
        this.f159360b = Float.NaN;
        this.f159361c = Float.NaN;
        this.f159362d = Float.NaN;
        this.f159363e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), b2u0.f22717u);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f159363e);
                this.f159363e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.f159362d = typedArrayObtainStyledAttributes.getDimension(index, this.f159362d);
            } else if (index == 2) {
                this.f159360b = typedArrayObtainStyledAttributes.getDimension(index, this.f159360b);
            } else if (index == 3) {
                this.f159361c = typedArrayObtainStyledAttributes.getDimension(index, this.f159361c);
            } else if (index == 4) {
                this.f159359a = typedArrayObtainStyledAttributes.getDimension(index, this.f159359a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m65818a(float f, float f2) {
        float f3 = this.f159359a;
        if (!Float.isNaN(f3) && f < f3) {
            return false;
        }
        float f4 = this.f159360b;
        if (!Float.isNaN(f4) && f2 < f4) {
            return false;
        }
        float f5 = this.f159361c;
        if (!Float.isNaN(f5) && f > f5) {
            return false;
        }
        float f6 = this.f159362d;
        return Float.isNaN(f6) || f2 <= f6;
    }
}
