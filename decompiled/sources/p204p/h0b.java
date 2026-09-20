package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h0b extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f86195a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m0b f86196b;

    /* JADX INFO: renamed from: c */
    public int f86197c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0b(m0b m0bVar, ibk ibkVar) {
        super(ibkVar);
        this.f86196b = m0bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f86195a = obj;
        this.f86197c |= Integer.MIN_VALUE;
        return this.f86196b.m60453a(this);
    }
}
