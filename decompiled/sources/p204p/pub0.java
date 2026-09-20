package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pub0 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f181405a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qub0 f181406b;

    public /* synthetic */ pub0(qub0 qub0Var, int i) {
        this.f181405a = i;
        this.f181406b = qub0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f181405a) {
            case 0:
                this.f181406b.m73893J1();
                return w2a1.f247311a;
            case 1:
                return new Offset(this.f181406b.f192631a1);
            default:
                jo70 jo70Var = (jo70) this.f181406b.f192629Y0.getValue();
                return new Offset(jo70Var != null ? jo70Var.mo30006K(0L) : 9205357640488583168L);
        }
    }
}
