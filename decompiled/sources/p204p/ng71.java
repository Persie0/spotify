package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ng71 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153580a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f153581b;

    public /* synthetic */ ng71(int i, List list) {
        this.f153580a = i;
        this.f153581b = list;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f153580a) {
            case 0:
                this.f153581b.get(((Number) obj).intValue());
                return null;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                return Integer.valueOf(((ai71) this.f153581b.get(iIntValue)).hashCode() + iIntValue);
            case 2:
                this.f153581b.get(((Number) obj).intValue());
                return null;
            case 3:
                int iIntValue2 = ((Number) obj).intValue();
                return tfe.m80649g(iIntValue2, "-", ((rt71) this.f153581b.get(iIntValue2)).getId());
            case 4:
                this.f153581b.get(((Number) obj).intValue());
                return null;
            case 5:
                this.f153581b.get(((Number) obj).intValue());
                return null;
            case 6:
                this.f153581b.get(((Number) obj).intValue());
                return null;
            case 7:
                return ((obl0) this.f153581b.get(((Number) obj).intValue())).mo69528c();
            case 8:
                this.f153581b.get(((Number) obj).intValue());
                return null;
            case 9:
                return ((g7c1) this.f153581b.get(((Number) obj).intValue())).f77242a;
            case 10:
                this.f153581b.get(((Number) obj).intValue());
                return null;
            case 11:
                this.f153581b.get(((Number) obj).intValue());
                return null;
            case 12:
                return ((vvc1) this.f153581b.get(((Number) obj).intValue())).f245209a;
            case 13:
                this.f153581b.get(((Number) obj).intValue());
                return null;
            case 14:
                this.f153581b.get(((Number) obj).intValue());
                return null;
            case 15:
                this.f153581b.get(((Number) obj).intValue());
                return null;
            case 16:
                this.f153581b.get(((Number) obj).intValue());
                return null;
            case 17:
                return ((qsj0) this.f153581b.get(((Number) obj).intValue())).f192133a;
            default:
                this.f153581b.get(((Number) obj).intValue());
                return null;
        }
    }
}
