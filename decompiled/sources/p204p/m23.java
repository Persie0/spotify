package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m23 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139200a;

    /* JADX INFO: renamed from: b */
    public int f139201b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f139202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m23(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f139202c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139200a = obj;
        this.f139201b |= Integer.MIN_VALUE;
        return this.f139202c.emit(null, this);
    }
}
