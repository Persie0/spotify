package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class iof extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104218a;

    /* JADX INFO: renamed from: b */
    public int f104219b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f104220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iof(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f104220c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104218a = obj;
        this.f104219b |= Integer.MIN_VALUE;
        return this.f104220c.emit(null, this);
    }
}
