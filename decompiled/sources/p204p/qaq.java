package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qaq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186914a;

    /* JADX INFO: renamed from: b */
    public int f186915b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f186916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qaq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f186916c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186914a = obj;
        this.f186915b |= Integer.MIN_VALUE;
        return this.f186916c.emit(null, this);
    }
}
