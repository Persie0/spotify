package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class eof extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61415a;

    /* JADX INFO: renamed from: b */
    public int f61416b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f61417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eof(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f61417c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61415a = obj;
        this.f61416b |= Integer.MIN_VALUE;
        return this.f61417c.emit(null, this);
    }
}
