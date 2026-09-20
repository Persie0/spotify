package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class khq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f122704a;

    /* JADX INFO: renamed from: b */
    public int f122705b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f122706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f122706c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f122704a = obj;
        this.f122705b |= Integer.MIN_VALUE;
        return this.f122706c.emit(null, this);
    }
}
