package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i5s extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f99014a;

    /* JADX INFO: renamed from: b */
    public int f99015b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f99016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5s(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f99016c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99014a = obj;
        this.f99015b |= Integer.MIN_VALUE;
        return this.f99016c.emit(null, this);
    }
}
