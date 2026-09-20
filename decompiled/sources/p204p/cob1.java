package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cob1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sk81 f40223b;

    /* JADX INFO: renamed from: c */
    public int f40224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cob1(sk81 sk81Var, ibk ibkVar) {
        super(ibkVar);
        this.f40223b = sk81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40222a = obj;
        this.f40224c |= Integer.MIN_VALUE;
        return this.f40223b.m78367a(null, this);
    }
}
