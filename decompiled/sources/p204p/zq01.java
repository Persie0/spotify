package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zq01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285275a;

    /* JADX INFO: renamed from: b */
    public int f285276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f285277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq01(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f285277c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285275a = obj;
        this.f285276b |= Integer.MIN_VALUE;
        return this.f285277c.emit(null, this);
    }
}
