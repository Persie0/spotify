package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mqv0 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146361a;

    /* JADX INFO: renamed from: b */
    public final String f146362b;

    public /* synthetic */ mqv0(String str, int i) {
        this.f146361a = i;
        this.f146362b = str;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f146361a) {
            case 0:
                String strM36617q = dq60.m36617q(new StringBuilder(), rm41.f200447n.f269048a.f279080a, '.');
                if (!bm51.m29803n0(this.f146362b, strM36617q, false)) {
                    strM36617q = null;
                }
                return strM36617q == null ? "" : strM36617q;
            default:
                String strM36617q2 = dq60.m36617q(new StringBuilder(), rm41.f200445l.f269048a.f279080a, '.');
                if (!bm51.m29803n0(this.f146362b, strM36617q2, false)) {
                    strM36617q2 = null;
                }
                return strM36617q2 == null ? "" : strM36617q2;
        }
    }
}
