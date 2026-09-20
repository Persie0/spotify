package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rqe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f201819a;

    /* JADX INFO: renamed from: b */
    public int f201820b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f201821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqe(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f201821c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201819a = obj;
        this.f201820b |= Integer.MIN_VALUE;
        return this.f201821c.emit(null, this);
    }
}
