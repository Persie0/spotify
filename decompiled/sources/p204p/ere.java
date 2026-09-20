package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ere extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62108a;

    /* JADX INFO: renamed from: b */
    public int f62109b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f62110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ere(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f62110c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f62108a = obj;
        this.f62109b |= Integer.MIN_VALUE;
        return this.f62110c.emit(null, this);
    }
}
