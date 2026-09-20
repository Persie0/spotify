package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d8i0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46466a;

    /* JADX INFO: renamed from: b */
    public int f46467b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f46468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8i0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f46468c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46466a = obj;
        this.f46467b |= Integer.MIN_VALUE;
        return this.f46468c.emit(null, this);
    }
}
