package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class qw41 extends AbstractC1850f7 implements Iterator, pq60 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f193171g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw41(ib31 ib31Var, Iterator it, int i) {
        super(ib31Var, it);
        this.f193171g = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f193171g) {
            case 0:
                m40910b();
                if (((Map.Entry) this.f66524e) != null) {
                    return new pw41(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = (Map.Entry) this.f66525f;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                m40910b();
                return entry.getKey();
            default:
                Map.Entry entry2 = (Map.Entry) this.f66525f;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                m40910b();
                return entry2.getValue();
        }
    }
}
