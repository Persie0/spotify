package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gsp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f84000a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nsp f84001b;

    /* JADX INFO: renamed from: c */
    public int f84002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsp(nsp nspVar, ibk ibkVar) {
        super(ibkVar);
        this.f84001b = nspVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84000a = obj;
        this.f84002c |= Integer.MIN_VALUE;
        return nsp.m65581b(this.f84001b, false, null, this);
    }
}
