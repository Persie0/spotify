package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pi60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f177843a;

    /* JADX INFO: renamed from: b */
    public int f177844b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ni60 f177845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi60(ni60 ni60Var, fbk fbkVar) {
        super(fbkVar);
        this.f177845c = ni60Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f177843a = obj;
        this.f177844b |= Integer.MIN_VALUE;
        return this.f177845c.emit(null, this);
    }
}
