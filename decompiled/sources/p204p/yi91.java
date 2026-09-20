package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yi91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f273067a;

    /* JADX INFO: renamed from: b */
    public int f273068b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f273069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi91(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f273069c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f273067a = obj;
        this.f273068b |= Integer.MIN_VALUE;
        return this.f273069c.emit(null, this);
    }
}
