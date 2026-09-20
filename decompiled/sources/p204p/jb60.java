package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jb60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f110664a;

    /* JADX INFO: renamed from: b */
    public int f110665b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f110666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb60(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f110666c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f110664a = obj;
        this.f110665b |= Integer.MIN_VALUE;
        return this.f110666c.emit(null, this);
    }
}
