package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b5i extends ibk {

    /* JADX INFO: renamed from: a */
    public String f23593a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23594b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d5i f23595c;

    /* JADX INFO: renamed from: d */
    public int f23596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5i(d5i d5iVar, ibk ibkVar) {
        super(ibkVar);
        this.f23595c = d5iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f23594b = obj;
        this.f23596d |= Integer.MIN_VALUE;
        return d5i.m35001a(this.f23595c, null, this);
    }
}
