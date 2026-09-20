package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kce1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f121460a;

    /* JADX INFO: renamed from: b */
    public int f121461b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f121462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kce1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f121462c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121460a = obj;
        this.f121461b |= Integer.MIN_VALUE;
        return this.f121462c.emit(null, this);
    }
}
