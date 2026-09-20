package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kry extends ibk {

    /* JADX INFO: renamed from: a */
    public kft f125745a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f125746b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mqr f125747c;

    /* JADX INFO: renamed from: d */
    public int f125748d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kry(mqr mqrVar, ibk ibkVar) {
        super(ibkVar);
        this.f125747c = mqrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125746b = obj;
        this.f125748d |= Integer.MIN_VALUE;
        return this.f125747c.m62588i(null, this);
    }
}
