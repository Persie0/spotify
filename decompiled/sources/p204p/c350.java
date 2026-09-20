package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class c350 extends ibk {

    /* JADX INFO: renamed from: a */
    public zbf f33555a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f33556b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i5z f33557c;

    /* JADX INFO: renamed from: d */
    public int f33558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c350(i5z i5zVar, ibk ibkVar) {
        super(ibkVar);
        this.f33557c = i5zVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f33556b = obj;
        this.f33558d |= Integer.MIN_VALUE;
        return this.f33557c.m49785q(null, this);
    }
}
