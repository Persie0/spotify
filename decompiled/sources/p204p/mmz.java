package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mmz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f145284a;

    /* JADX INFO: renamed from: b */
    public int f145285b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f145286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f145286c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145284a = obj;
        this.f145285b |= Integer.MIN_VALUE;
        return this.f145286c.emit(null, this);
    }
}
