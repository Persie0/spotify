package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class juv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f116180a;

    /* JADX INFO: renamed from: b */
    public int f116181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f116182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juv0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f116182c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116180a = obj;
        this.f116181b |= Integer.MIN_VALUE;
        return this.f116182c.emit(null, this);
    }
}
