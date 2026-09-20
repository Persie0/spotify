package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yv00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276516a;

    /* JADX INFO: renamed from: b */
    public int f276517b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f276518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv00(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f276518c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276516a = obj;
        this.f276517b |= Integer.MIN_VALUE;
        return this.f276518c.emit(null, this);
    }
}
