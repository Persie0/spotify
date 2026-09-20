package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class li60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133733a;

    /* JADX INFO: renamed from: b */
    public int f133734b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f133735c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li60(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f133735c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133733a = obj;
        this.f133734b |= Integer.MIN_VALUE;
        return this.f133735c.emit(null, this);
    }
}
