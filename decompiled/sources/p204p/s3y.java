package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s3y extends ibk {

    /* JADX INFO: renamed from: a */
    public hv91 f205363a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f205364b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t3y f205365c;

    /* JADX INFO: renamed from: d */
    public int f205366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3y(t3y t3yVar, ibk ibkVar) {
        super(ibkVar);
        this.f205365c = t3yVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f205364b = obj;
        this.f205366d |= Integer.MIN_VALUE;
        return t3y.m80022b(this.f205365c, null, null, this);
    }
}
