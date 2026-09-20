package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class jja1 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f112964a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f112965b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lja1 f112966c;

    /* JADX INFO: renamed from: d */
    public int f112967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jja1(lja1 lja1Var, ibk ibkVar) {
        super(ibkVar);
        this.f112966c = lja1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f112965b = obj;
        this.f112967d |= Integer.MIN_VALUE;
        return this.f112966c.m59142a(null, this);
    }
}
