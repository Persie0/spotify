package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nmz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f156294a;

    /* JADX INFO: renamed from: b */
    public int f156295b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f156296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmz(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f156296c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f156294a = obj;
        this.f156295b |= Integer.MIN_VALUE;
        return this.f156296c.emit(null, this);
    }
}
