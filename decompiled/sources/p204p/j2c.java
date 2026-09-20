package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j2c extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f107993a;

    /* JADX INFO: renamed from: b */
    public int f107994b;

    /* JADX INFO: renamed from: c */
    public niz f107995c;

    /* JADX INFO: renamed from: d */
    public int f107996d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ k2c f107997e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2c(k2c k2cVar, fbk fbkVar) {
        super(fbkVar);
        this.f107997e = k2cVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107993a = obj;
        this.f107994b |= Integer.MIN_VALUE;
        return this.f107997e.emit(null, this);
    }
}
