package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hik0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f91829a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nj7 f91830b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hik0(nj7 nj7Var, int i) {
        super(0);
        this.f91829a = i;
        this.f91830b = nj7Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f91829a) {
            case 0:
                return this.f91830b.mo61931b();
            case 1:
                return this.f91830b.mo61933d();
            case 2:
                return new jjk0(this.f91830b, 0);
            case 3:
                return new jjk0(this.f91830b, 1);
            case 4:
                return this.f91830b.mo61933d();
            case 5:
                return new jjk0(this.f91830b, 2);
            case 6:
                return this.f91830b.mo61933d();
            case 7:
                return this.f91830b.mo61935f();
            case 8:
                return this.f91830b.mo61933d();
            case 9:
                return this.f91830b.mo61933d();
            case 10:
                return this.f91830b.mo61932c();
            case 11:
                return this.f91830b.mo61932c();
            case 12:
                return this.f91830b.mo61935f();
            case 13:
                return this.f91830b.mo61932c();
            case 14:
                return this.f91830b.mo61933d();
            case 15:
                return this.f91830b.mo61933d();
            default:
                return new hke(this.f91830b, 3);
        }
    }
}
