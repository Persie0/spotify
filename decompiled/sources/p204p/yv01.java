package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yv01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276519a;

    /* JADX INFO: renamed from: b */
    public int f276520b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f276521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv01(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f276521c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276519a = obj;
        this.f276520b |= Integer.MIN_VALUE;
        return this.f276521c.emit(null, this);
    }
}
