package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sri extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f213322a;

    /* JADX INFO: renamed from: b */
    public int f213323b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f213324c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sri(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f213324c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213322a = obj;
        this.f213323b |= Integer.MIN_VALUE;
        return this.f213324c.emit(null, this);
    }
}
