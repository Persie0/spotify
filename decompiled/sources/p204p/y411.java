package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y411 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f269057a;

    /* JADX INFO: renamed from: b */
    public int f269058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f269059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y411(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f269059c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f269057a = obj;
        this.f269058b |= Integer.MIN_VALUE;
        return this.f269059c.emit(null, this);
    }
}
