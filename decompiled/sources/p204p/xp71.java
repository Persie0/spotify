package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xp71 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f264522a;

    /* JADX INFO: renamed from: b */
    public int f264523b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pbt f264524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp71(pbt pbtVar, fbk fbkVar) {
        super(fbkVar);
        this.f264524c = pbtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f264522a = obj;
        this.f264523b |= Integer.MIN_VALUE;
        return this.f264524c.emit(null, this);
    }
}
