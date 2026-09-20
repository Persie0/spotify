package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class trl extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f223083a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wrl f223084b;

    /* JADX INFO: renamed from: c */
    public int f223085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trl(wrl wrlVar, ibk ibkVar) {
        super(ibkVar);
        this.f223084b = wrlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f223083a = obj;
        this.f223085c |= Integer.MIN_VALUE;
        return this.f223084b.m88865d(null, null, this);
    }
}
