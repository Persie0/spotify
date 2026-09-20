package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class cng1 extends ibk {

    /* JADX INFO: renamed from: a */
    public ArrayList f40017a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f40018b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f7d1 f40019c;

    /* JADX INFO: renamed from: d */
    public int f40020d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cng1(f7d1 f7d1Var, ibk ibkVar) {
        super(ibkVar);
        this.f40019c = f7d1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40018b = obj;
        this.f40020d |= Integer.MIN_VALUE;
        return this.f40019c.m40977q(null, this);
    }
}
