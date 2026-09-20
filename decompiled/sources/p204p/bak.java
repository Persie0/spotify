package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class bak extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25230a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f25231b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25232c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f25233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bak(int i, int i2, int i3, ArrayList arrayList) {
        super(1);
        this.f25230a = i3;
        this.f25231b = arrayList;
        this.f25232c = i;
        this.f25233d = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f25230a) {
            case 0:
                s5o0 s5o0Var = (s5o0) obj;
                int i = 0;
                for (Object obj2 : this.f25231b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    t5o0 t5o0Var = (t5o0) obj2;
                    s5o0Var.m77293f(t5o0Var, i * this.f25232c, (this.f25233d - t5o0Var.f217323b) / 2, 0.0f);
                    i = i2;
                }
                return w2a1.f247311a;
            default:
                s5o0 s5o0Var2 = (s5o0) obj;
                Iterator it = this.f25231b.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    s5o0Var2.m77294i((t5o0) it.next(), i3, 0, 0.0f);
                    i3 += this.f25232c + this.f25233d;
                }
                return w2a1.f247311a;
        }
    }
}
