package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fzr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f75150a;

    /* JADX INFO: renamed from: b */
    public int f75151b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f75152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzr(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f75152c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f75150a = obj;
        this.f75151b |= Integer.MIN_VALUE;
        return this.f75152c.emit(null, this);
    }
}
