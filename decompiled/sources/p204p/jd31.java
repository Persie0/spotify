package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class jd31 extends ibk {

    /* JADX INFO: renamed from: a */
    public ArrayList f111229a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f111230b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ md31 f111231c;

    /* JADX INFO: renamed from: d */
    public int f111232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd31(md31 md31Var, ibk ibkVar) {
        super(ibkVar);
        this.f111231c = md31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f111230b = obj;
        this.f111232d |= Integer.MIN_VALUE;
        return this.f111231c.m61505b(null, this);
    }
}
