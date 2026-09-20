package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dra1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f52276a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ era1 f52277b;

    /* JADX INFO: renamed from: c */
    public int f52278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dra1(era1 era1Var, ibk ibkVar) {
        super(ibkVar);
        this.f52277b = era1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f52276a = obj;
        this.f52278c |= Integer.MIN_VALUE;
        return this.f52277b.m39772b(null, null, this);
    }
}
