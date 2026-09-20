package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jpj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f114680a;

    /* JADX INFO: renamed from: b */
    public int f114681b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f114682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpj0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f114682c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f114680a = obj;
        this.f114681b |= Integer.MIN_VALUE;
        return this.f114682c.emit(null, this);
    }
}
