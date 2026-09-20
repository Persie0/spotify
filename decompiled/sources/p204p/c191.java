package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c191 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33029a;

    /* JADX INFO: renamed from: b */
    public int f33030b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f33031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c191(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f33031c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f33029a = obj;
        this.f33030b |= Integer.MIN_VALUE;
        return this.f33031c.emit(null, this);
    }
}
