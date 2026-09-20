package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class q6j {

    /* JADX INFO: renamed from: a */
    public final float f185829a;

    /* JADX INFO: renamed from: b */
    public final float f185830b;

    /* JADX INFO: renamed from: c */
    public final float f185831c;

    /* JADX INFO: renamed from: d */
    public final float f185832d;

    /* JADX INFO: renamed from: e */
    public final int f185833e;

    /* JADX INFO: renamed from: f */
    public final c7j f185834f;

    public q6j(Context context, XmlResourceParser xmlResourceParser) {
        this.f185829a = Float.NaN;
        this.f185830b = Float.NaN;
        this.f185831c = Float.NaN;
        this.f185832d = Float.NaN;
        this.f185833e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), b2u0.f22717u);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f185833e);
                this.f185833e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    c7j c7jVar = new c7j();
                    this.f185834f = c7jVar;
                    c7jVar.m31736f((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f185832d = typedArrayObtainStyledAttributes.getDimension(index, this.f185832d);
            } else if (index == 2) {
                this.f185830b = typedArrayObtainStyledAttributes.getDimension(index, this.f185830b);
            } else if (index == 3) {
                this.f185831c = typedArrayObtainStyledAttributes.getDimension(index, this.f185831c);
            } else if (index == 4) {
                this.f185829a = typedArrayObtainStyledAttributes.getDimension(index, this.f185829a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72241a(float f, float f2) {
        float f3 = this.f185829a;
        if (!Float.isNaN(f3) && f < f3) {
            return false;
        }
        float f4 = this.f185830b;
        if (!Float.isNaN(f4) && f2 < f4) {
            return false;
        }
        float f5 = this.f185831c;
        if (!Float.isNaN(f5) && f > f5) {
            return false;
        }
        float f6 = this.f185832d;
        return Float.isNaN(f6) || f2 <= f6;
    }
}
