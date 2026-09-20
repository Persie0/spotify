package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class qua1 extends ibk {

    /* JADX INFO: renamed from: a */
    public ArrayList f192613a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f192614b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e8i0 f192615c;

    /* JADX INFO: renamed from: d */
    public int f192616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qua1(e8i0 e8i0Var, ibk ibkVar) {
        super(ibkVar);
        this.f192615c = e8i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f192614b = obj;
        this.f192616d |= Integer.MIN_VALUE;
        return this.f192615c.m38109a(null, this);
    }
}
