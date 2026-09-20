package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mjs extends ibk {

    /* JADX INFO: renamed from: a */
    public o4e1 f144322a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f144323b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k1n f144324c;

    /* JADX INFO: renamed from: d */
    public int f144325d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjs(k1n k1nVar, ibk ibkVar) {
        super(ibkVar);
        this.f144324c = k1nVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144323b = obj;
        this.f144325d |= Integer.MIN_VALUE;
        return this.f144324c.m55117b(null, this);
    }
}
