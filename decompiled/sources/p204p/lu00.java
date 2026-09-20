package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lu00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f136943a;

    /* JADX INFO: renamed from: b */
    public int f136944b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f136945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu00(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f136945c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f136943a = obj;
        this.f136944b |= Integer.MIN_VALUE;
        return this.f136945c.emit(null, this);
    }
}
