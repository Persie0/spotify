package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class z6j {

    /* JADX INFO: renamed from: n */
    public static final SparseIntArray f279925n;

    /* JADX INFO: renamed from: a */
    public boolean f279926a;

    /* JADX INFO: renamed from: b */
    public int f279927b;

    /* JADX INFO: renamed from: c */
    public int f279928c;

    /* JADX INFO: renamed from: d */
    public String f279929d;

    /* JADX INFO: renamed from: e */
    public int f279930e;

    /* JADX INFO: renamed from: f */
    public int f279931f;

    /* JADX INFO: renamed from: g */
    public float f279932g;

    /* JADX INFO: renamed from: h */
    public float f279933h;

    /* JADX INFO: renamed from: i */
    public float f279934i;

    /* JADX INFO: renamed from: j */
    public int f279935j;

    /* JADX INFO: renamed from: k */
    public String f279936k;

    /* JADX INFO: renamed from: l */
    public int f279937l;

    /* JADX INFO: renamed from: m */
    public int f279938m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f279925n = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* JADX INFO: renamed from: a */
    public final void m95507a(z6j z6jVar) {
        this.f279926a = z6jVar.f279926a;
        this.f279927b = z6jVar.f279927b;
        this.f279929d = z6jVar.f279929d;
        this.f279930e = z6jVar.f279930e;
        this.f279931f = z6jVar.f279931f;
        this.f279933h = z6jVar.f279933h;
        this.f279932g = z6jVar.f279932g;
    }

    /* JADX INFO: renamed from: b */
    public final void m95508b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b2u0.f22707k);
        this.f279926a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f279925n.get(index)) {
                case 1:
                    this.f279933h = typedArrayObtainStyledAttributes.getFloat(index, this.f279933h);
                    break;
                case 2:
                    this.f279930e = typedArrayObtainStyledAttributes.getInt(index, this.f279930e);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f279929d = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f279929d = aqs.f18771d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f279931f = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f279927b = c7j.m31727p(typedArrayObtainStyledAttributes, index, this.f279927b);
                    break;
                case 6:
                    this.f279928c = typedArrayObtainStyledAttributes.getInteger(index, this.f279928c);
                    break;
                case 7:
                    this.f279932g = typedArrayObtainStyledAttributes.getFloat(index, this.f279932g);
                    break;
                case 8:
                    this.f279935j = typedArrayObtainStyledAttributes.getInteger(index, this.f279935j);
                    break;
                case 9:
                    this.f279934i = typedArrayObtainStyledAttributes.getFloat(index, this.f279934i);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f279938m = resourceId;
                        if (resourceId != -1) {
                            this.f279937l = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f279936k = string;
                        if (string.indexOf("/") > 0) {
                            this.f279938m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f279937l = -2;
                        } else {
                            this.f279937l = -1;
                        }
                    } else {
                        this.f279937l = typedArrayObtainStyledAttributes.getInteger(index, this.f279938m);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
