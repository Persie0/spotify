package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class b1d0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Set f22295a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22296b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h1d0 f22297c;

    /* JADX INFO: renamed from: d */
    public int f22298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1d0(h1d0 h1d0Var, ibk ibkVar) {
        super(ibkVar);
        this.f22297c = h1d0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f22296b = obj;
        this.f22298d |= Integer.MIN_VALUE;
        return this.f22297c.m46422f(null, this);
    }
}
