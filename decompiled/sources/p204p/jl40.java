package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jl40 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f113482a;

    /* JADX INFO: renamed from: b */
    public int f113483b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f113484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl40(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f113484c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113482a = obj;
        this.f113483b |= Integer.MIN_VALUE;
        return this.f113484c.emit(null, this);
    }
}
