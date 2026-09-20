package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jsx extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f115598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lsx f115599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jsx(lsx lsxVar, int i) {
        super(1);
        this.f115598a = i;
        this.f115599b = lsxVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f115598a) {
            case 0:
                String strM59847i = lsx.m59847i(this.f115599b, (bsx) obj);
                if (strM59847i == null || !hf41.m47326b(strM59847i) || hf41.m47327c(strM59847i)) {
                    return null;
                }
                return strM59847i;
            default:
                String strM59847i2 = lsx.m59847i(this.f115599b, (bsx) obj);
                if (strM59847i2 != null && hf41.m47326b(strM59847i2) && hf41.m47327c(strM59847i2)) {
                    return strM59847i2;
                }
                return null;
        }
    }
}
