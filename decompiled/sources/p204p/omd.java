package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class omd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f167014a;

    /* JADX INFO: renamed from: b */
    public int f167015b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f167016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omd(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f167016c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f167014a = obj;
        this.f167015b |= Integer.MIN_VALUE;
        return this.f167016c.emit(null, this);
    }
}
