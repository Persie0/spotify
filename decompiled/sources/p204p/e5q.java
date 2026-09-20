package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class e5q extends ibk {

    /* JADX INFO: renamed from: a */
    public umx0 f56445a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f56446b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jwo f56447c;

    /* JADX INFO: renamed from: d */
    public int f56448d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5q(jwo jwoVar, ibk ibkVar) {
        super(ibkVar);
        this.f56447c = jwoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56446b = obj;
        this.f56448d |= Integer.MIN_VALUE;
        return this.f56447c.m54482i(null, null, this);
    }
}
