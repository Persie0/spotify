package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gff extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f79346a;

    /* JADX INFO: renamed from: b */
    public int f79347b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f79348c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gff(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f79348c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f79346a = obj;
        this.f79347b |= Integer.MIN_VALUE;
        return this.f79348c.emit(null, this);
    }
}
