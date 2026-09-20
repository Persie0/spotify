package p204p;

import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iw6 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106343a;

    public /* synthetic */ iw6(int i) {
        this.f106343a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        wl6 wl6Var;
        switch (this.f106343a) {
            case 0:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 1:
                pob pobVar = (pob) obj;
                return (pobVar.f179664b || pobVar.f179665c != 3 || (wl6Var = pobVar.f179666d) == null) ? g52.f76566a : new h52(wl6Var.f252474a);
            default:
                return new ArrayList();
        }
    }
}
