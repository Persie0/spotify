package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ddv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ edv f47874b;

    /* JADX INFO: renamed from: c */
    public int f47875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddv(edv edvVar, ibk ibkVar) {
        super(ibkVar);
        this.f47874b = edvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47873a = obj;
        this.f47875c |= Integer.MIN_VALUE;
        return this.f47874b.m38621a(this);
    }
}
