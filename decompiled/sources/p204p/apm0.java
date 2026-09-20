package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class apm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bpm0 f17985b;

    /* JADX INFO: renamed from: c */
    public int f17986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apm0(bpm0 bpm0Var, ibk ibkVar) {
        super(ibkVar);
        this.f17985b = bpm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f17984a = obj;
        this.f17986c |= Integer.MIN_VALUE;
        return this.f17985b.mo30162a(null, 0.0f, this);
    }
}
