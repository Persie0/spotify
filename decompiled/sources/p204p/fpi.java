package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fpi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f71874a;

    /* JADX INFO: renamed from: b */
    public int f71875b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f71876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f71876c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f71874a = obj;
        this.f71875b |= Integer.MIN_VALUE;
        return this.f71876c.emit(null, this);
    }
}
