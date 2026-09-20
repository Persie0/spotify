package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zdm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f281766a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f281767b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bem0 f281768c;

    /* JADX INFO: renamed from: d */
    public int f281769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdm0(bem0 bem0Var, ibk ibkVar) {
        super(ibkVar);
        this.f281768c = bem0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f281767b = obj;
        this.f281769d |= Integer.MIN_VALUE;
        return this.f281768c.m28951e(0, this);
    }
}
