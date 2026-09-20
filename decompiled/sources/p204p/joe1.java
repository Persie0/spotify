package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class joe1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f114413a;

    /* JADX INFO: renamed from: b */
    public int f114414b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f114415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joe1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f114415c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f114413a = obj;
        this.f114414b |= Integer.MIN_VALUE;
        return this.f114415c.emit(null, this);
    }
}
