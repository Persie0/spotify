package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bix0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f27559a;

    /* JADX INFO: renamed from: b */
    public boolean f27560b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f27561c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fp10 f27562d;

    /* JADX INFO: renamed from: e */
    public int f27563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bix0(fp10 fp10Var, ibk ibkVar) {
        super(ibkVar);
        this.f27562d = fp10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27561c = obj;
        this.f27563e |= Integer.MIN_VALUE;
        return this.f27562d.m42317d(null, null, this);
    }
}
