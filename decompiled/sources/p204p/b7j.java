package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class b7j {

    /* JADX INFO: renamed from: o */
    public static final SparseIntArray f24284o;

    /* JADX INFO: renamed from: a */
    public boolean f24285a;

    /* JADX INFO: renamed from: b */
    public float f24286b;

    /* JADX INFO: renamed from: c */
    public float f24287c;

    /* JADX INFO: renamed from: d */
    public float f24288d;

    /* JADX INFO: renamed from: e */
    public float f24289e;

    /* JADX INFO: renamed from: f */
    public float f24290f;

    /* JADX INFO: renamed from: g */
    public float f24291g;

    /* JADX INFO: renamed from: h */
    public float f24292h;

    /* JADX INFO: renamed from: i */
    public int f24293i;

    /* JADX INFO: renamed from: j */
    public float f24294j;

    /* JADX INFO: renamed from: k */
    public float f24295k;

    /* JADX INFO: renamed from: l */
    public float f24296l;

    /* JADX INFO: renamed from: m */
    public boolean f24297m;

    /* JADX INFO: renamed from: n */
    public float f24298n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f24284o = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m28378a(b7j b7jVar) {
        this.f24285a = b7jVar.f24285a;
        this.f24286b = b7jVar.f24286b;
        this.f24287c = b7jVar.f24287c;
        this.f24288d = b7jVar.f24288d;
        this.f24289e = b7jVar.f24289e;
        this.f24290f = b7jVar.f24290f;
        this.f24291g = b7jVar.f24291g;
        this.f24292h = b7jVar.f24292h;
        this.f24293i = b7jVar.f24293i;
        this.f24294j = b7jVar.f24294j;
        this.f24295k = b7jVar.f24295k;
        this.f24296l = b7jVar.f24296l;
        this.f24297m = b7jVar.f24297m;
        this.f24298n = b7jVar.f24298n;
    }

    /* JADX INFO: renamed from: b */
    public final void m28379b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b2u0.f22715s);
        this.f24285a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f24284o.get(index)) {
                case 1:
                    this.f24286b = typedArrayObtainStyledAttributes.getFloat(index, this.f24286b);
                    break;
                case 2:
                    this.f24287c = typedArrayObtainStyledAttributes.getFloat(index, this.f24287c);
                    break;
                case 3:
                    this.f24288d = typedArrayObtainStyledAttributes.getFloat(index, this.f24288d);
                    break;
                case 4:
                    this.f24289e = typedArrayObtainStyledAttributes.getFloat(index, this.f24289e);
                    break;
                case 5:
                    this.f24290f = typedArrayObtainStyledAttributes.getFloat(index, this.f24290f);
                    break;
                case 6:
                    this.f24291g = typedArrayObtainStyledAttributes.getDimension(index, this.f24291g);
                    break;
                case 7:
                    this.f24292h = typedArrayObtainStyledAttributes.getDimension(index, this.f24292h);
                    break;
                case 8:
                    this.f24294j = typedArrayObtainStyledAttributes.getDimension(index, this.f24294j);
                    break;
                case 9:
                    this.f24295k = typedArrayObtainStyledAttributes.getDimension(index, this.f24295k);
                    break;
                case 10:
                    this.f24296l = typedArrayObtainStyledAttributes.getDimension(index, this.f24296l);
                    break;
                case 11:
                    this.f24297m = true;
                    this.f24298n = typedArrayObtainStyledAttributes.getDimension(index, this.f24298n);
                    break;
                case 12:
                    this.f24293i = c7j.m31727p(typedArrayObtainStyledAttributes, index, this.f24293i);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
