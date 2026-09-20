package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h640 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f87993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ni71 f87994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h640(ni71 ni71Var, int i) {
        super(0);
        this.f87993a = i;
        this.f87994b = ni71Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f87993a) {
            case 0:
                return Integer.valueOf(this.f87994b.f154200f.m86437v());
            default:
                ni71 ni71Var = this.f87994b;
                return new ybs(ni71Var.f154196b.mo35988P0(ni71Var.f154197c));
        }
    }
}
