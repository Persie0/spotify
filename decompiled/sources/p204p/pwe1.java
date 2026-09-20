package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pwe1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f182007a;

    /* JADX INFO: renamed from: b */
    public int f182008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f182009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwe1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f182009c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f182007a = obj;
        this.f182008b |= Integer.MIN_VALUE;
        return this.f182009c.emit(null, this);
    }
}
