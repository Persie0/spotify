package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gpi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f83199a;

    /* JADX INFO: renamed from: b */
    public int f83200b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f83201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f83201c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f83199a = obj;
        this.f83200b |= Integer.MIN_VALUE;
        return this.f83201c.emit(null, this);
    }
}
