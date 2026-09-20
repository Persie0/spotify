package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kqe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125294a;

    /* JADX INFO: renamed from: b */
    public int f125295b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f125296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqe(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f125296c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125294a = obj;
        this.f125295b |= Integer.MIN_VALUE;
        return this.f125296c.emit(null, this);
    }
}
