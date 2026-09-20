package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vhu implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241558a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f241559b;

    public /* synthetic */ vhu(int i, List list) {
        this.f241558a = i;
        this.f241559b = list;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f241558a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return bwt.f31705U0.invoke(Integer.valueOf(iIntValue), this.f241559b.get(iIntValue));
            case 1:
                this.f241559b.get(((Number) obj).intValue());
                return null;
            default:
                this.f241559b.get(((Number) obj).intValue());
                return null;
        }
    }
}
