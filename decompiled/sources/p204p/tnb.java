package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tnb extends ibk {

    /* JADX INFO: renamed from: a */
    public String f221924a;

    /* JADX INFO: renamed from: b */
    public String f221925b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f221926c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ unb f221927d;

    /* JADX INFO: renamed from: e */
    public int f221928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnb(unb unbVar, ibk ibkVar) {
        super(ibkVar);
        this.f221927d = unbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221926c = obj;
        this.f221928e |= Integer.MIN_VALUE;
        return this.f221927d.m83541d(null, null, this);
    }
}
