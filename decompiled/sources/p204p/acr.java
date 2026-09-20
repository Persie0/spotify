package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class acr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14413a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bcr f14414b;

    /* JADX INFO: renamed from: c */
    public int f14415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(bcr bcrVar, ibk ibkVar) {
        super(ibkVar);
        this.f14414b = bcrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f14413a = obj;
        this.f14415c |= Integer.MIN_VALUE;
        return this.f14414b.m28780a(null, this);
    }
}
