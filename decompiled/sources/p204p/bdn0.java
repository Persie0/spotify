package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bdn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26185a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ grw f26186b;

    /* JADX INFO: renamed from: c */
    public int f26187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdn0(grw grwVar, ibk ibkVar) {
        super(ibkVar);
        this.f26186b = grwVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f26185a = obj;
        this.f26187c |= Integer.MIN_VALUE;
        return this.f26186b.m45588a(this);
    }
}
