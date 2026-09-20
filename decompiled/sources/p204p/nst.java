package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nst extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f157889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pst f157890b;

    /* JADX INFO: renamed from: c */
    public int f157891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nst(pst pstVar, fbk fbkVar) {
        super(fbkVar);
        this.f157890b = pstVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157889a = obj;
        this.f157891c |= Integer.MIN_VALUE;
        return this.f157890b.m70888a(this);
    }
}
