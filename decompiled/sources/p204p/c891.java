package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class c891 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35146a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i8z f35147b;

    /* JADX INFO: renamed from: c */
    public int f35148c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c891(i8z i8zVar, ibk ibkVar) {
        super(ibkVar);
        this.f35147b = i8zVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35146a = obj;
        this.f35148c |= Integer.MIN_VALUE;
        return this.f35147b.m49967d(null, null, this);
    }
}
