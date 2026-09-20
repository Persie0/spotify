package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cxp implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43074a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f43075b;

    public /* synthetic */ cxp(int i, List list) {
        this.f43074a = i;
        this.f43075b = list;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f43074a) {
            case 0:
                Integer num = (Integer) this.f43075b.get(2);
                num.intValue();
                return num;
            case 1:
                return ((sr60) this.f43075b.get(0)).mo27067y();
            default:
                return ((sr60) this.f43075b.get(0)).mo27067y();
        }
    }
}
