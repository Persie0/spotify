package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xre1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f265333a;

    /* JADX INFO: renamed from: b */
    public int f265334b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f265335c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xre1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f265335c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f265333a = obj;
        this.f265334b |= Integer.MIN_VALUE;
        return this.f265335c.emit(null, this);
    }
}
