package p204p;

import com.spotify.casita.p040v1.resolved.ResolvedHome;

/* JADX INFO: loaded from: classes5.dex */
public final class p47 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f173830a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f173831b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f173832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p47(int i, int i2, boolean z) {
        super(1);
        this.f173830a = i2;
        this.f173831b = z;
        this.f173832c = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i;
        switch (this.f173830a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                if (this.f173831b) {
                    i = (((this.f173832c * 50) + ResolvedHome.ONDEMAND_SET_FIELD_NUMBER) / 1000) * 2;
                } else {
                    i = 1024;
                    if (iIntValue >= 1024) {
                        i = iIntValue;
                    }
                }
                return new o47(iIntValue, i);
            default:
                return new aiz0(this.f173831b, this.f173832c == 2);
        }
    }
}
