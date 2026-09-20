package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cra1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f41249a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f41250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ era1 f41251c;

    /* JADX INFO: renamed from: d */
    public int f41252d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cra1(era1 era1Var, ibk ibkVar) {
        super(ibkVar);
        this.f41251c = era1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41250b = obj;
        this.f41252d |= Integer.MIN_VALUE;
        return this.f41251c.m39771a(null, null, this);
    }
}
