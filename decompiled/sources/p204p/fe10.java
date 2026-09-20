package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class fe10 extends ibk {

    /* JADX INFO: renamed from: a */
    public ge10 f68650a;

    /* JADX INFO: renamed from: b */
    public Context f68651b;

    /* JADX INFO: renamed from: c */
    public int f68652c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f68653d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ge10 f68654e;

    /* JADX INFO: renamed from: f */
    public int f68655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe10(ge10 ge10Var, ibk ibkVar) {
        super(ibkVar);
        this.f68654e = ge10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f68653d = obj;
        this.f68655f |= Integer.MIN_VALUE;
        return this.f68654e.m44445a(null, 0, this);
    }
}
