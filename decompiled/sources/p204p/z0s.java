package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z0s extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f278159a;

    /* JADX INFO: renamed from: b */
    public int f278160b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f278161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0s(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f278161c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f278159a = obj;
        this.f278160b |= Integer.MIN_VALUE;
        return this.f278161c.emit(null, this);
    }
}
