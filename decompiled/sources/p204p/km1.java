package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class km1 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f124024a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f124025b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mm1 f124026c;

    /* JADX INFO: renamed from: d */
    public int f124027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km1(mm1 mm1Var, ibk ibkVar) {
        super(ibkVar);
        this.f124026c = mm1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124025b = obj;
        this.f124027d |= Integer.MIN_VALUE;
        return this.f124026c.m62264p(null, this);
    }
}
