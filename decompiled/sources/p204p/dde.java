package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dde extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47812a;

    /* JADX INFO: renamed from: b */
    public int f47813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f47814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dde(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f47814c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47812a = obj;
        this.f47813b |= Integer.MIN_VALUE;
        return this.f47814c.emit(null, this);
    }
}
