package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class k1a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f118257a;

    /* JADX INFO: renamed from: b */
    public List f118258b;

    /* JADX INFO: renamed from: c */
    public rlv0 f118259c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f118260d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ l1a0 f118261e;

    /* JADX INFO: renamed from: f */
    public int f118262f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1a0(l1a0 l1a0Var, ibk ibkVar) {
        super(ibkVar);
        this.f118261e = l1a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f118260d = obj;
        this.f118262f |= Integer.MIN_VALUE;
        return this.f118261e.m57868c(null, this, false);
    }
}
