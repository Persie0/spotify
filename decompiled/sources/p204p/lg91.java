package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lg91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133178a;

    /* JADX INFO: renamed from: b */
    public int f133179b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f133180c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg91(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f133180c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133178a = obj;
        this.f133179b |= Integer.MIN_VALUE;
        return this.f133180c.emit(null, this);
    }
}
