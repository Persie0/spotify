package p204p;

import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class xg21 extends ibk {

    /* JADX INFO: renamed from: a */
    public bh21 f261184a;

    /* JADX INFO: renamed from: b */
    public FileInputStream f261185b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f261186c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bh21 f261187d;

    /* JADX INFO: renamed from: e */
    public int f261188e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg21(bh21 bh21Var, ibk ibkVar) {
        super(ibkVar);
        this.f261187d = bh21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f261186c = obj;
        this.f261188e |= Integer.MIN_VALUE;
        return this.f261187d.m29195g(this);
    }
}
