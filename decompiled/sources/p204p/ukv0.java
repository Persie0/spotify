package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ukv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231374a;

    /* JADX INFO: renamed from: b */
    public int f231375b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f231376c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukv0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f231376c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231374a = obj;
        this.f231375b |= Integer.MIN_VALUE;
        return this.f231376c.emit(null, this);
    }
}
