package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b540 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uum0 f23509b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f23510c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b540(uum0 uum0Var, kqi0 kqi0Var, int i) {
        super(0);
        this.f23508a = i;
        this.f23509b = uum0Var;
        this.f23510c = kqi0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f23508a) {
            case 0:
                this.f23509b.m84032w(1.0f);
                ydj.m93453l(0L, this.f23510c);
                return w2a1.f247311a;
            default:
                return Long.valueOf((long) ((this.f23509b.m84031v() * ((zny0) this.f23510c.getValue()).f284599b) / 1000));
        }
    }
}
