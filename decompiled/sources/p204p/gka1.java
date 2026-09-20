package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class gka1 extends ibk {

    /* JADX INFO: renamed from: a */
    public lvu0 f80768a;

    /* JADX INFO: renamed from: b */
    public rlv0 f80769b;

    /* JADX INFO: renamed from: c */
    public Iterator f80770c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f80771d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ hka1 f80772e;

    /* JADX INFO: renamed from: f */
    public int f80773f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gka1(hka1 hka1Var, ibk ibkVar) {
        super(ibkVar);
        this.f80772e = hka1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80771d = obj;
        this.f80773f |= Integer.MIN_VALUE;
        return this.f80772e.mo44137a(null, this);
    }
}
