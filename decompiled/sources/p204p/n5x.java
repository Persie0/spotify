package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n5x extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f150634a;

    /* JADX INFO: renamed from: b */
    public int f150635b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f150636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5x(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f150636c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f150634a = obj;
        this.f150635b |= Integer.MIN_VALUE;
        return this.f150636c.emit(null, this);
    }
}
