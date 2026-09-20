package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pmz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f179258a;

    /* JADX INFO: renamed from: b */
    public int f179259b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qmz f179260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmz(qmz qmzVar, fbk fbkVar) {
        super(fbkVar);
        this.f179260c = qmzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f179258a = obj;
        this.f179259b |= Integer.MIN_VALUE;
        return this.f179260c.emit(null, this);
    }
}
