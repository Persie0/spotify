package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jgy extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f112295a;

    /* JADX INFO: renamed from: b */
    public int f112296b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f112297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgy(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f112297c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f112295a = obj;
        this.f112296b |= Integer.MIN_VALUE;
        return this.f112297c.emit(null, this);
    }
}
