package p204p;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class vyj implements Comparator, Serializable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f246157a;

    public /* synthetic */ vyj(int i) {
        this.f246157a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f246157a) {
            case 0:
                return ((uyj) obj2).f235291a.f224984a - ((uyj) obj).f235291a.f224984a;
            default:
                o9d0 o9d0Var = (o9d0) obj;
                o9d0 o9d0Var2 = (o9d0) obj2;
                o9d0Var.getClass();
                o9d0Var2.getClass();
                long jMo37699g = o9d0Var.mo37699g();
                long jMo37699g2 = o9d0Var2.mo37699g();
                if (jMo37699g2 < jMo37699g) {
                    return -1;
                }
                return jMo37699g2 == jMo37699g ? 0 : 1;
        }
    }
}
