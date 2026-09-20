package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class t7v extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f217901a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y7v f217902b;

    /* JADX INFO: renamed from: c */
    public int f217903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7v(y7v y7vVar, ibk ibkVar) {
        super(ibkVar);
        this.f217902b = y7vVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f217901a = obj;
        this.f217903c |= Integer.MIN_VALUE;
        return this.f217902b.m93009d(this);
    }
}
