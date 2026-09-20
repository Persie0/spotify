package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p2b extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f173313a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r2b f173314b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2b(r2b r2bVar, int i) {
        super(0);
        this.f173313a = i;
        this.f173314b = r2bVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f173313a) {
            case 0:
                r2b r2bVar = this.f173314b;
                return new b7v0(r2bVar.f195099b, r2bVar.f195102e);
            default:
                return this.f173314b.m74513a();
        }
    }
}
