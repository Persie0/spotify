package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class te5 extends ibk {

    /* JADX INFO: renamed from: a */
    public we5 f219574a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f219575b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ we5 f219576c;

    /* JADX INFO: renamed from: d */
    public int f219577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te5(we5 we5Var, ibk ibkVar) {
        super(ibkVar);
        this.f219576c = we5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219575b = obj;
        this.f219577d |= Integer.MIN_VALUE;
        return this.f219576c.m87860e(null, null, this);
    }
}
