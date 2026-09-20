package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j4p extends ibk {

    /* JADX INFO: renamed from: a */
    public String f108752a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f108753b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k4p f108754c;

    /* JADX INFO: renamed from: d */
    public int f108755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4p(k4p k4pVar, ibk ibkVar) {
        super(ibkVar);
        this.f108754c = k4pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f108753b = obj;
        this.f108755d |= Integer.MIN_VALUE;
        return k4p.m55405c(this.f108754c, null, this);
    }
}
