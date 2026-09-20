package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mi60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f143946a;

    /* JADX INFO: renamed from: b */
    public int f143947b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ni60 f143948c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi60(ni60 ni60Var, fbk fbkVar) {
        super(fbkVar);
        this.f143948c = ni60Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f143946a = obj;
        this.f143947b |= Integer.MIN_VALUE;
        return this.f143948c.emit(null, this);
    }
}
