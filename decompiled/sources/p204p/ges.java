package p204p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ges {

    /* JADX INFO: renamed from: a */
    public final ArrayList f79175a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public float[] f79176b;

    public ges() {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.f79176b = fArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m44522a(Object obj, float f) {
        ArrayList arrayList = this.f79175a;
        arrayList.add(obj);
        if (this.f79176b.length < arrayList.size()) {
            this.f79176b = Arrays.copyOf(this.f79176b, arrayList.size() + 2);
        }
        this.f79176b[arrayList.size() - 1] = f;
    }
}
