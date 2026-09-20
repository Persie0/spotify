package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class raq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197362a;

    /* JADX INFO: renamed from: b */
    public int f197363b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f197364c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public raq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f197364c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197362a = obj;
        this.f197363b |= Integer.MIN_VALUE;
        return this.f197364c.emit(null, this);
    }
}
