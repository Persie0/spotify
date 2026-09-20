package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rre1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f202036a;

    /* JADX INFO: renamed from: b */
    public int f202037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f202038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rre1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f202038c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202036a = obj;
        this.f202037b |= Integer.MIN_VALUE;
        return this.f202038c.emit(null, this);
    }
}
