package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gm40 extends ibk {

    /* JADX INFO: renamed from: a */
    public sr4 f81278a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f81279b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hm40 f81280c;

    /* JADX INFO: renamed from: d */
    public int f81281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm40(hm40 hm40Var, ibk ibkVar) {
        super(ibkVar);
        this.f81280c = hm40Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f81279b = obj;
        this.f81281d |= Integer.MIN_VALUE;
        return hm40.m47926d(this.f81280c, null, this);
    }
}
