package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dni extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f50840a;

    /* JADX INFO: renamed from: b */
    public int f50841b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eni f50842c;

    /* JADX INFO: renamed from: d */
    public bqz0 f50843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dni(eni eniVar, ibk ibkVar) {
        super(ibkVar);
        this.f50842c = eniVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50840a = obj;
        this.f50841b |= Integer.MIN_VALUE;
        return this.f50842c.mo15629a(null, null, this);
    }
}
