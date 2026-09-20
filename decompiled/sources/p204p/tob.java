package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tob extends ibk {

    /* JADX INFO: renamed from: a */
    public hhl0 f222216a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f222217b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uob f222218c;

    /* JADX INFO: renamed from: d */
    public int f222219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tob(uob uobVar, ibk ibkVar) {
        super(ibkVar);
        this.f222218c = uobVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222217b = obj;
        this.f222219d |= Integer.MIN_VALUE;
        return this.f222218c.m83608a(null, this);
    }
}
