package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j5e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f108943a;

    /* JADX INFO: renamed from: b */
    public int f108944b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f108945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5e(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f108945c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f108943a = obj;
        this.f108944b |= Integer.MIN_VALUE;
        return this.f108945c.emit(null, this);
    }
}
