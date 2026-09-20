package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class azk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f21633a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vpj f21634b;

    /* JADX INFO: renamed from: c */
    public int f21635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azk(vpj vpjVar, ibk ibkVar) {
        super(ibkVar);
        this.f21634b = vpjVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f21633a = obj;
        this.f21635c |= Integer.MIN_VALUE;
        return this.f21634b.m86158a(null, this);
    }
}
