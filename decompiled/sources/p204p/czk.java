package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class czk extends ibk {

    /* JADX INFO: renamed from: a */
    public String f43577a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f43578b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vpj f43579c;

    /* JADX INFO: renamed from: d */
    public int f43580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czk(vpj vpjVar, ibk ibkVar) {
        super(ibkVar);
        this.f43579c = vpjVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f43578b = obj;
        this.f43580d |= Integer.MIN_VALUE;
        return this.f43579c.m86162f(null, this);
    }
}
