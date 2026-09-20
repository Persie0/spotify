package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qph0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191317a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sph0 f191318b;

    /* JADX INFO: renamed from: c */
    public int f191319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qph0(sph0 sph0Var, fbk fbkVar) {
        super(fbkVar);
        this.f191318b = sph0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191317a = obj;
        this.f191319c |= Integer.MIN_VALUE;
        return this.f191318b.mo60087a(null, this);
    }
}
