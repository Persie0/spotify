package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gmz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f81506a;

    /* JADX INFO: renamed from: b */
    public int f81507b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f81508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f81508c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f81506a = obj;
        this.f81507b |= Integer.MIN_VALUE;
        return this.f81508c.emit(null, this);
    }
}
