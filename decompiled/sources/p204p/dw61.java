package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dw61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53627a;

    /* JADX INFO: renamed from: b */
    public int f53628b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f53629c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw61(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f53629c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53627a = obj;
        this.f53628b |= Integer.MIN_VALUE;
        return this.f53629c.emit(null, this);
    }
}
