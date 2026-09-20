package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jlo0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f113659a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dwt f113660b;

    /* JADX INFO: renamed from: c */
    public int f113661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlo0(dwt dwtVar, ibk ibkVar) {
        super(ibkVar);
        this.f113660b = dwtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113659a = obj;
        this.f113661c |= Integer.MIN_VALUE;
        Object objM37171a = this.f113660b.m37171a(this);
        return objM37171a == yuk.f276404a ? objM37171a : new s6x0(objM37171a);
    }
}
