package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class obt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f163715a;

    /* JADX INFO: renamed from: b */
    public int f163716b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pbt f163717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obt(pbt pbtVar, fbk fbkVar) {
        super(fbkVar);
        this.f163717c = pbtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f163715a = obj;
        this.f163716b |= Integer.MIN_VALUE;
        return this.f163717c.emit(null, this);
    }
}
