package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class htb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f94971a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jtb f94972b;

    /* JADX INFO: renamed from: c */
    public int f94973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htb(jtb jtbVar, ibk ibkVar) {
        super(ibkVar);
        this.f94972b = jtbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f94971a = obj;
        this.f94973c |= Integer.MIN_VALUE;
        return this.f94972b.m54280a(null, this);
    }
}
