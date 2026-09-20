package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class ol31 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f166747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f166748b;

    public /* synthetic */ ol31(int i, ArrayList arrayList) {
        this.f166747a = i;
        this.f166748b = arrayList;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f166747a) {
            case 0:
                return ((at11) this.f166748b.get(((Number) obj).intValue())).f19555c;
            case 1:
                this.f166748b.get(((Number) obj).intValue());
                return null;
            default:
                this.f166748b.get(((Number) obj).intValue());
                return null;
        }
    }
}
