package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class npl extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f157026a;

    /* JADX INFO: renamed from: b */
    public int f157027b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ opl f157028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npl(opl oplVar, fbk fbkVar) {
        super(fbkVar);
        this.f157028c = oplVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157026a = obj;
        this.f157027b |= Integer.MIN_VALUE;
        return this.f157028c.emit(null, this);
    }
}
