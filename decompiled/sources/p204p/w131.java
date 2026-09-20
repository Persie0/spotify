package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w131 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f246935a;

    /* JADX INFO: renamed from: b */
    public int f246936b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f246937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w131(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f246937c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f246935a = obj;
        this.f246936b |= Integer.MIN_VALUE;
        return this.f246937c.emit(null, this);
    }
}
