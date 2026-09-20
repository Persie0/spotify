package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class xku extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f262939a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f262940b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f262941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xku(ArrayList arrayList, int i, int i2) {
        super(1);
        this.f262939a = i2;
        this.f262940b = arrayList;
        this.f262941c = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f262939a) {
            case 0:
                s5o0 s5o0Var = (s5o0) obj;
                int i = 0;
                int i2 = 0;
                for (Object obj2 : this.f262940b) {
                    int i3 = i + 1;
                    if (i < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    t5o0 t5o0Var = (t5o0) obj2;
                    s5o0Var.m77294i(t5o0Var, i2, 0, -i);
                    i2 += t5o0Var.f217322a - this.f262941c;
                    i = i3;
                }
                return w2a1.f247311a;
            case 1:
                s5o0 s5o0Var2 = (s5o0) obj;
                Integer numValueOf = 0;
                ArrayList<t5o0> arrayList = this.f262940b;
                int iM49804T = i6f.m49804T(arrayList, 9);
                if (iM49804T == 0) {
                    Collections.singletonList(numValueOf);
                } else {
                    ArrayList arrayList2 = new ArrayList(iM49804T + 1);
                    arrayList2.add(numValueOf);
                    for (t5o0 t5o0Var2 : arrayList) {
                        int iIntValue = numValueOf.intValue();
                        s5o0Var2.m77294i(t5o0Var2, iIntValue, (this.f262941c - t5o0Var2.f217323b) / 2, 0.0f);
                        numValueOf = Integer.valueOf(iIntValue + t5o0Var2.f217322a);
                        arrayList2.add(numValueOf);
                    }
                }
                return w2a1.f247311a;
            case 2:
                jpz0.m53997k((mpz0) obj, new b4f(this.f262940b.size(), this.f262941c));
                return w2a1.f247311a;
            default:
                return new x411(this.f262941c, this.f262940b);
        }
    }
}
