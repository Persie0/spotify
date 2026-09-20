package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ost extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168888a;

    /* JADX INFO: renamed from: b */
    public int f168889b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f168890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ost(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f168890c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168888a = obj;
        this.f168889b |= Integer.MIN_VALUE;
        return this.f168890c.emit(null, this);
    }
}
