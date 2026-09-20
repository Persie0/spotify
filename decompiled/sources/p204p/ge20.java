package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ge20 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78994a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f78995b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f78996c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f78997d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f78998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge20(int i, int i2, int i3, ArrayList arrayList, int i4) {
        super(1);
        this.f78994a = i;
        this.f78995b = i2;
        this.f78996c = i3;
        this.f78997d = arrayList;
        this.f78998e = i4;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        s5o0 s5o0Var = (s5o0) obj;
        int i = this.f78994a;
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = 0;
        }
        for (int i4 = 0; i4 < i; i4++) {
            iArr[i4] = (this.f78995b + this.f78996c) * i4;
        }
        int[] iArr2 = new int[i];
        for (int i5 = 0; i5 < i; i5++) {
            iArr2[i5] = 0;
        }
        for (Object obj2 : this.f78997d) {
            int i6 = i2 + 1;
            if (i2 < 0) {
                h6f.m46722S();
                throw null;
            }
            int i7 = iArr2[i2];
            int i8 = this.f78998e;
            iArr2[i2] = i7 + i8;
            for (t5o0 t5o0Var : (List) obj2) {
                s5o0Var.m77294i(t5o0Var, iArr2[i2], iArr[i2], 0.0f);
                iArr2[i2] = t5o0Var.f217322a + i8 + iArr2[i2];
            }
            i2 = i6;
        }
        return w2a1.f247311a;
    }
}
