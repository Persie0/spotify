package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f179720a;

    /* JADX INFO: renamed from: b */
    public String f179721b;

    /* JADX INFO: renamed from: c */
    public String f179722c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f179723d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bpk f179724e;

    /* JADX INFO: renamed from: f */
    public int f179725f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f179724e = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f179723d = obj;
        this.f179725f |= Integer.MIN_VALUE;
        return this.f179724e.m30159y(null, null, null, this);
    }
}
