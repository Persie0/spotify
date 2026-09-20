package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ubq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f228875a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vbq f228876b;

    /* JADX INFO: renamed from: c */
    public int f228877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubq(vbq vbqVar, fbk fbkVar) {
        super(fbkVar);
        this.f228876b = vbqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228875a = obj;
        this.f228877c |= Integer.MIN_VALUE;
        return this.f228876b.invoke(null, this);
    }
}
