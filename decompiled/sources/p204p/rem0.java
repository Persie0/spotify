package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rem0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f198386a;

    /* JADX INFO: renamed from: b */
    public int f198387b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f198388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rem0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f198388c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f198386a = obj;
        this.f198387b |= Integer.MIN_VALUE;
        return this.f198388c.emit(null, this);
    }
}
