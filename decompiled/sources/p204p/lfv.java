package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lfv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133016a;

    /* JADX INFO: renamed from: b */
    public int f133017b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f133018c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfv(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f133018c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133016a = obj;
        this.f133017b |= Integer.MIN_VALUE;
        return this.f133018c.emit(null, this);
    }
}
