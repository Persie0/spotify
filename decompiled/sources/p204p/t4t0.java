package p204p;

import com.spotify.widgets.npvwidget.C1378r;

/* JADX INFO: loaded from: classes11.dex */
public final class t4t0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f217071a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1378r f217072b;

    /* JADX INFO: renamed from: c */
    public int f217073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4t0(C1378r c1378r, ibk ibkVar) {
        super(ibkVar);
        this.f217072b = c1378r;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f217071a = obj;
        this.f217073c |= Integer.MIN_VALUE;
        return this.f217072b.m23090a(this);
    }
}
