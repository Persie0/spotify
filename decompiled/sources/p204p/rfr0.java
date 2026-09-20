package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rfr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f198723a;

    /* JADX INFO: renamed from: b */
    public int f198724b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f198725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f198725c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f198723a = obj;
        this.f198724b |= Integer.MIN_VALUE;
        return this.f198725c.emit(null, this);
    }
}
