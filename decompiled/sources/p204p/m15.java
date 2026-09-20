package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m15 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f138845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f138846b;

    public /* synthetic */ m15(int i, ArrayList arrayList) {
        this.f138845a = i;
        this.f138846b = arrayList;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f138845a) {
            case 0:
                s5o0 s5o0Var = (s5o0) obj;
                ArrayList arrayList = this.f138846b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    s5o0Var.m77294i((t5o0) arrayList.get(i), 0, 0, 0.0f);
                }
                break;
            case 1:
                s5o0 s5o0Var2 = (s5o0) obj;
                ArrayList arrayList2 = this.f138846b;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    s6d0 s6d0Var = (s6d0) arrayList2.get(i2);
                    List list = s6d0Var.f206086b;
                    boolean z = s6d0Var.f206092h;
                    if (s6d0Var.f206096l == Integer.MIN_VALUE) {
                        pt40.m70891a("position() should be called first");
                    }
                    int size3 = list.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        t5o0 t5o0Var = (t5o0) list.get(i3);
                        int[] iArr = s6d0Var.f206094j;
                        int i4 = i3 * 2;
                        int i5 = i2;
                        long jM92731d = y350.m92731d((((long) iArr[i4 + 1]) & 4294967295L) | (((long) iArr[i4]) << 32), s6d0Var.f206087c);
                        if (z) {
                            s5o0.m77292s(s5o0Var2, t5o0Var, jM92731d);
                        } else {
                            s5o0.m77289m(s5o0Var2, t5o0Var, jM92731d);
                        }
                        i3++;
                        i2 = i5;
                    }
                    i2++;
                }
                break;
            default:
                s5o0 s5o0Var3 = (s5o0) obj;
                ArrayList arrayList3 = this.f138846b;
                int size4 = arrayList3.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    s5o0Var3.m77293f((t5o0) arrayList3.get(i6), 0, 0, 0.0f);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
