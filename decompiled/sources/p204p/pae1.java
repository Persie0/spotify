package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pae1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175513a;

    /* JADX INFO: renamed from: b */
    public int f175514b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f175515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pae1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f175515c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175513a = obj;
        this.f175514b |= Integer.MIN_VALUE;
        return this.f175515c.emit(null, this);
    }
}
