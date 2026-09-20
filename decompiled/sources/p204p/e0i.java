package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e0i extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54976a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n6f f54977b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f54978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0i(n6f n6fVar, long j, int i) {
        super(2);
        this.f54976a = i;
        this.f54977b = n6fVar;
        this.f54978c = j;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f54976a) {
            case 0:
                n6f n6fVar = this.f54977b;
                return new n6f(n6fVar != null ? n6fVar.f150873a : this.f54978c);
            default:
                n6f n6fVar2 = this.f54977b;
                return new n6f(n6fVar2 != null ? n6fVar2.f150873a : this.f54978c);
        }
    }
}
