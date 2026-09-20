package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lcq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f131969a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mcq f131970b;

    /* JADX INFO: renamed from: c */
    public int f131971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcq(mcq mcqVar, ibk ibkVar) {
        super(ibkVar);
        this.f131970b = mcqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131969a = obj;
        this.f131971c |= Integer.MIN_VALUE;
        return this.f131970b.m61472g(null, this);
    }
}
