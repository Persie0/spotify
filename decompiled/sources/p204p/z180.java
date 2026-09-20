package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z180 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f278255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a280 f278256b;

    /* JADX INFO: renamed from: c */
    public int f278257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z180(a280 a280Var, fbk fbkVar) {
        super(fbkVar);
        this.f278256b = a280Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f278255a = obj;
        this.f278257c |= Integer.MIN_VALUE;
        return this.f278256b.m24504a(this);
    }
}
