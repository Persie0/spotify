package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jne extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f114087a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lne f114088b;

    /* JADX INFO: renamed from: c */
    public int f114089c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jne(lne lneVar, ibk ibkVar) {
        super(ibkVar);
        this.f114088b = lneVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f114087a = obj;
        this.f114089c |= Integer.MIN_VALUE;
        return this.f114088b.m59496b(null, this);
    }
}
