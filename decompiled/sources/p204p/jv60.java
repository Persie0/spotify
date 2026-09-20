package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jv60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f116270a;

    /* JADX INFO: renamed from: b */
    public int f116271b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kv60 f116272c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv60(kv60 kv60Var, fbk fbkVar) {
        super(fbkVar);
        this.f116272c = kv60Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116270a = obj;
        this.f116271b |= Integer.MIN_VALUE;
        return this.f116272c.emit(null, this);
    }
}
