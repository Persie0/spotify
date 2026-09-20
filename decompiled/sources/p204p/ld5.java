package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ld5 extends ibk {

    /* JADX INFO: renamed from: a */
    public gx70 f132050a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f132051b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ md5 f132052c;

    /* JADX INFO: renamed from: d */
    public int f132053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld5(md5 md5Var, ibk ibkVar) {
        super(ibkVar);
        this.f132052c = md5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f132051b = obj;
        this.f132053d |= Integer.MIN_VALUE;
        return md5.m61509b(this.f132052c, null, this);
    }
}
