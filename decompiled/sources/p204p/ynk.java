package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ynk extends ibk {

    /* JADX INFO: renamed from: a */
    public String f274465a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f274466b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bpk f274467c;

    /* JADX INFO: renamed from: d */
    public int f274468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynk(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f274467c = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274466b = obj;
        this.f274468d |= Integer.MIN_VALUE;
        return this.f274467c.m30142h(null, null, this);
    }
}
