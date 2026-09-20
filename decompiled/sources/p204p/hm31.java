package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hm31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f92808a;

    /* JADX INFO: renamed from: b */
    public int f92809b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f92810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm31(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f92810c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f92808a = obj;
        this.f92809b |= Integer.MIN_VALUE;
        return this.f92810c.emit(null, this);
    }
}
