package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lns extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135218a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f135219b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lns(int i, List list) {
        super(1);
        this.f135218a = i;
        this.f135219b = list;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f135218a) {
            case 0:
                return Boolean.valueOf(((Number) obj).intValue() == this.f135219b.size());
            default:
                return Boolean.valueOf(((dh71) this.f135219b.get(((Number) obj).intValue())).m35998b());
        }
    }
}
