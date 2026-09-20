package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wj91 extends ibk {

    /* JADX INFO: renamed from: a */
    public int[] f251917a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f251918b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rry0 f251919c;

    /* JADX INFO: renamed from: d */
    public int f251920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj91(rry0 rry0Var, fbk fbkVar) {
        super(fbkVar);
        this.f251919c = rry0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f251918b = obj;
        this.f251920d |= Integer.MIN_VALUE;
        return this.f251919c.m76308b(null, this);
    }
}
