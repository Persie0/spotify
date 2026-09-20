package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l6z extends ibk {

    /* JADX INFO: renamed from: a */
    public o6z f130504a;

    /* JADX INFO: renamed from: b */
    public String f130505b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f130506c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ o6z f130507d;

    /* JADX INFO: renamed from: e */
    public int f130508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6z(o6z o6zVar, ibk ibkVar) {
        super(ibkVar);
        this.f130507d = o6zVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f130506c = obj;
        this.f130508e |= Integer.MIN_VALUE;
        return o6z.m66370a(this.f130507d, null, this);
    }
}
