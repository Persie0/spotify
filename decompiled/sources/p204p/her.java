package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class her extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f90487a;

    /* JADX INFO: renamed from: b */
    public int f90488b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ idr f90489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public her(idr idrVar, fbk fbkVar) {
        super(fbkVar);
        this.f90489c = idrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f90487a = obj;
        this.f90488b |= Integer.MIN_VALUE;
        return this.f90489c.emit(null, this);
    }
}
