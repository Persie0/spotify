package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hhe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f91370a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ei1 f91371b;

    /* JADX INFO: renamed from: c */
    public int f91372c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhe(ei1 ei1Var, fbk fbkVar) {
        super(fbkVar);
        this.f91371b = ei1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f91370a = obj;
        this.f91372c |= Integer.MIN_VALUE;
        return this.f91371b.m39056f(this);
    }
}
