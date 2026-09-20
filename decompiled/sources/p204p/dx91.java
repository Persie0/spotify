package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dx91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53909a;

    /* JADX INFO: renamed from: b */
    public int f53910b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f53911c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx91(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f53911c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53909a = obj;
        this.f53910b |= Integer.MIN_VALUE;
        return this.f53911c.emit(null, this);
    }
}
