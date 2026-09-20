package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m7p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f140810a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r7p f140811b;

    /* JADX INFO: renamed from: c */
    public int f140812c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7p(r7p r7pVar, ibk ibkVar) {
        super(ibkVar);
        this.f140811b = r7pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f140810a = obj;
        this.f140812c |= Integer.MIN_VALUE;
        return r7p.m74951c(this.f140811b, null, this);
    }
}
