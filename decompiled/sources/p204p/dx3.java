package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dx3 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53834a;

    /* JADX INFO: renamed from: b */
    public int f53835b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f53836c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx3(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f53836c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53834a = obj;
        this.f53835b |= Integer.MIN_VALUE;
        return this.f53836c.emit(null, this);
    }
}
