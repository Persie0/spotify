package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f441 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65672a;

    /* JADX INFO: renamed from: b */
    public int f65673b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f65674c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f441(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f65674c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f65672a = obj;
        this.f65673b |= Integer.MIN_VALUE;
        return this.f65674c.emit(null, this);
    }
}
