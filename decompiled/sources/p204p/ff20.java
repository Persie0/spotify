package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ff20 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f68885a;

    /* JADX INFO: renamed from: b */
    public int f68886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f68887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff20(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f68887c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f68885a = obj;
        this.f68886b |= Integer.MIN_VALUE;
        return this.f68887c.emit(null, this);
    }
}
