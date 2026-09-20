package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class j7f extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f109585a;

    /* JADX INFO: renamed from: b */
    public int f109586b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f109587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7f(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f109587c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f109585a = obj;
        this.f109586b |= Integer.MIN_VALUE;
        return this.f109587c.emit(null, this);
    }
}
