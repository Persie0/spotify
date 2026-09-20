package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f3f extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65490a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g3f f65491b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3f(g3f g3fVar, int i) {
        super(0);
        this.f65490a = i;
        this.f65491b = g3fVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f65490a) {
            case 0:
                g3f g3fVar = this.f65491b;
                return g3fVar.f76201b.m94280b(g3fVar.f76200a);
            case 1:
                g3f g3fVar2 = this.f65491b;
                return g3fVar2.f76201b.m94282d(g3fVar2.f76200a);
            default:
                g3f g3fVar3 = this.f65491b;
                return g3fVar3.f76201b.m94283e(g3fVar3.f76200a);
        }
    }
}
