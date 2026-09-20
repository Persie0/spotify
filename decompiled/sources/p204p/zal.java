package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zal extends ibk {

    /* JADX INFO: renamed from: a */
    public mtc0 f281085a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f281086b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ei1 f281087c;

    /* JADX INFO: renamed from: d */
    public int f281088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zal(ei1 ei1Var, fbk fbkVar) {
        super(fbkVar);
        this.f281087c = ei1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f281086b = obj;
        this.f281088d |= Integer.MIN_VALUE;
        return this.f281087c.m39055e(null, this);
    }
}
