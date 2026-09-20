package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qa70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186772a;

    /* JADX INFO: renamed from: b */
    public int f186773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pbt f186774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa70(pbt pbtVar, fbk fbkVar) {
        super(fbkVar);
        this.f186774c = pbtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186772a = obj;
        this.f186773b |= Integer.MIN_VALUE;
        return this.f186774c.emit(null, this);
    }
}
