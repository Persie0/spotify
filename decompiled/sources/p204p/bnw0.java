package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bnw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cnw0 f28932b;

    /* JADX INFO: renamed from: c */
    public int f28933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnw0(cnw0 cnw0Var, ibk ibkVar) {
        super(ibkVar);
        this.f28932b = cnw0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f28931a = obj;
        this.f28933c |= Integer.MIN_VALUE;
        return cnw0.m33471e(this.f28932b, null, null, this);
    }
}
