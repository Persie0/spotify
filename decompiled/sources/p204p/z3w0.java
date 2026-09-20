package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z3w0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f279046a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p2b f279047b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3w0(p2b p2bVar, int i) {
        super(2);
        this.f279046a = i;
        this.f279047b = p2bVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f279046a) {
            case 0:
                return new bjc0((qy8) this.f279047b.invoke(), pzv0.f183828S0);
            default:
                return new bjc0((qy8) this.f279047b.invoke(), pzv0.f183832W0);
        }
    }
}
