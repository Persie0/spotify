package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sj5 extends un40 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f209759d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f209760e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj5(zj5 zj5Var) {
        super(zj5Var.f283362c);
        this.f209760e = zj5Var;
    }

    @Override // p204p.un40
    /* JADX INFO: renamed from: a */
    public final Object mo67087a(int i) {
        switch (this.f209759d) {
            case 0:
                return ((uj5) this.f209760e).m25315i(i);
            default:
                return ((zj5) this.f209760e).f283361b[i];
        }
    }

    @Override // p204p.un40
    /* JADX INFO: renamed from: b */
    public final void mo67088b(int i) {
        switch (this.f209759d) {
            case 0:
                ((uj5) this.f209760e).m25313g(i);
                break;
            default:
                ((zj5) this.f209760e).m96230a(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj5(uj5 uj5Var) {
        super(uj5Var.f13976c);
        this.f209760e = uj5Var;
    }
}
