package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class a7j {

    /* JADX INFO: renamed from: a */
    public boolean f13060a;

    /* JADX INFO: renamed from: b */
    public int f13061b;

    /* JADX INFO: renamed from: c */
    public int f13062c;

    /* JADX INFO: renamed from: d */
    public float f13063d;

    /* JADX INFO: renamed from: e */
    public float f13064e;

    /* JADX INFO: renamed from: a */
    public final void m24941a(a7j a7jVar) {
        this.f13060a = a7jVar.f13060a;
        this.f13061b = a7jVar.f13061b;
        this.f13063d = a7jVar.f13063d;
        this.f13064e = a7jVar.f13064e;
        this.f13062c = a7jVar.f13062c;
    }

    /* JADX INFO: renamed from: b */
    public final void m24942b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b2u0.f22712p);
        this.f13060a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f13063d = typedArrayObtainStyledAttributes.getFloat(index, this.f13063d);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f13061b);
                this.f13061b = i2;
                this.f13061b = c7j.f34929h[i2];
            } else if (index == 4) {
                this.f13062c = typedArrayObtainStyledAttributes.getInt(index, this.f13062c);
            } else if (index == 3) {
                this.f13064e = typedArrayObtainStyledAttributes.getFloat(index, this.f13064e);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
