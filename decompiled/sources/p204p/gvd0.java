package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gvd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f84723a;

    /* JADX INFO: renamed from: b */
    public int f84724b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f84725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvd0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f84725c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84723a = obj;
        this.f84724b |= Integer.MIN_VALUE;
        return this.f84725c.emit(null, this);
    }
}
