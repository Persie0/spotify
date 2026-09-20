package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kdm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f121697a;

    /* JADX INFO: renamed from: b */
    public int f121698b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f121699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdm0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f121699c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121697a = obj;
        this.f121698b |= Integer.MIN_VALUE;
        return this.f121699c.emit(null, this);
    }
}
