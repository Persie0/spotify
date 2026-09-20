package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rdm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f198168a;

    /* JADX INFO: renamed from: b */
    public int f198169b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f198170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdm0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f198170c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f198168a = obj;
        this.f198169b |= Integer.MIN_VALUE;
        return this.f198170c.emit(null, this);
    }
}
