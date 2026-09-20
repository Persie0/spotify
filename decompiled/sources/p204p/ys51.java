package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ys51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f275694a;

    /* JADX INFO: renamed from: b */
    public int f275695b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f275696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys51(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f275696c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f275694a = obj;
        this.f275695b |= Integer.MIN_VALUE;
        return this.f275696c.emit(null, this);
    }
}
