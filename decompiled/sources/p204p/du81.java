package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class du81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53011a;

    /* JADX INFO: renamed from: b */
    public int f53012b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f53013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du81(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f53013c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53011a = obj;
        this.f53012b |= Integer.MIN_VALUE;
        return this.f53013c.emit(null, this);
    }
}
