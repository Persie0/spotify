package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rg4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f198821a;

    /* JADX INFO: renamed from: b */
    public int f198822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f198823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg4(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f198823c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f198821a = obj;
        this.f198822b |= Integer.MIN_VALUE;
        return this.f198823c.emit(null, this);
    }
}
