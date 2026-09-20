package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k43 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f119056a;

    /* JADX INFO: renamed from: b */
    public int f119057b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f119058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k43(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f119058c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f119056a = obj;
        this.f119057b |= Integer.MIN_VALUE;
        return this.f119058c.emit(null, this);
    }
}
