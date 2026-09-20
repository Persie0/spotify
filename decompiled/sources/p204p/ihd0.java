package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ihd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f102257a;

    /* JADX INFO: renamed from: b */
    public int f102258b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fhd0 f102259c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihd0(fhd0 fhd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f102259c = fhd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f102257a = obj;
        this.f102258b |= Integer.MIN_VALUE;
        return this.f102259c.emit(null, this);
    }
}
