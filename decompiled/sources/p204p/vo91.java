package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class vo91 {

    /* JADX INFO: renamed from: a */
    public int[] f243431a = new int[10];

    /* JADX INFO: renamed from: b */
    public int[] f243432b = new int[10];

    /* JADX INFO: renamed from: c */
    public int f243433c = 0;

    /* JADX INFO: renamed from: d */
    public int[] f243434d = new int[10];

    /* JADX INFO: renamed from: e */
    public float[] f243435e = new float[10];

    /* JADX INFO: renamed from: f */
    public int f243436f = 0;

    /* JADX INFO: renamed from: g */
    public int[] f243437g = new int[5];

    /* JADX INFO: renamed from: h */
    public String[] f243438h = new String[5];

    /* JADX INFO: renamed from: i */
    public int f243439i = 0;

    /* JADX INFO: renamed from: a */
    public final void m86088a(float f, int i) {
        int i2 = this.f243436f;
        int[] iArr = this.f243434d;
        if (i2 >= iArr.length) {
            this.f243434d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f243435e;
            this.f243435e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f243434d;
        int i3 = this.f243436f;
        iArr2[i3] = i;
        float[] fArr2 = this.f243435e;
        this.f243436f = i3 + 1;
        fArr2[i3] = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m86089b(int i, int i2) {
        int i3 = this.f243433c;
        int[] iArr = this.f243431a;
        if (i3 >= iArr.length) {
            this.f243431a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f243432b;
            this.f243432b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f243431a;
        int i4 = this.f243433c;
        iArr3[i4] = i;
        int[] iArr4 = this.f243432b;
        this.f243433c = i4 + 1;
        iArr4[i4] = i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m86090c(int i, String str) {
        int i2 = this.f243439i;
        int[] iArr = this.f243437g;
        if (i2 >= iArr.length) {
            this.f243437g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f243438h;
            this.f243438h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f243437g;
        int i3 = this.f243439i;
        iArr2[i3] = i;
        String[] strArr2 = this.f243438h;
        this.f243439i = i3 + 1;
        strArr2[i3] = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypedBundle{mCountInt=");
        sb.append(this.f243433c);
        sb.append(", mCountFloat=");
        sb.append(this.f243436f);
        sb.append(", mCountString=");
        return klh.m56832d(this.f243439i, ", mCountBoolean=0}", sb);
    }
}
