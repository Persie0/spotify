package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class koj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124804a;

    /* JADX INFO: renamed from: b */
    public int f124805b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cvx f124806c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public koj0(cvx cvxVar, fbk fbkVar) {
        super(fbkVar);
        this.f124806c = cvxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124804a = obj;
        this.f124805b |= Integer.MIN_VALUE;
        return this.f124806c.emit(null, this);
    }
}
