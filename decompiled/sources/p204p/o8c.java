package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o8c extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162771a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f162772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8c(int i, List list) {
        super(0);
        this.f162771a = i;
        this.f162772b = list;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f162771a) {
            case 0:
                return Integer.valueOf(this.f162772b.size());
            case 1:
                return Integer.valueOf(this.f162772b.size());
            default:
                this.f162772b.clear();
                return w2a1.f247311a;
        }
    }
}
