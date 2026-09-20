package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f68291a;

    /* JADX INFO: renamed from: b */
    public int f68292b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f68293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd1(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f68293c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f68291a = obj;
        this.f68292b |= Integer.MIN_VALUE;
        return this.f68293c.emit(null, this);
    }
}
