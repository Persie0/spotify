package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jer extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f111646a;

    /* JADX INFO: renamed from: b */
    public int f111647b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ker f111648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jer(ker kerVar, fbk fbkVar) {
        super(fbkVar);
        this.f111648c = kerVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f111646a = obj;
        this.f111647b |= Integer.MIN_VALUE;
        return this.f111648c.emit(null, this);
    }
}
