package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xmh extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f263366a;

    /* JADX INFO: renamed from: b */
    public int f263367b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f263368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmh(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f263368c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263366a = obj;
        this.f263367b |= Integer.MIN_VALUE;
        return this.f263368c.emit(null, this);
    }
}
