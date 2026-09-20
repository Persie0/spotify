package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class wrk extends ibk {

    /* JADX INFO: renamed from: a */
    public Uri f254374a;

    /* JADX INFO: renamed from: b */
    public h4b f254375b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f254376c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xrk f254377d;

    /* JADX INFO: renamed from: e */
    public int f254378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrk(xrk xrkVar, ibk ibkVar) {
        super(ibkVar);
        this.f254377d = xrkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f254376c = obj;
        this.f254378e |= Integer.MIN_VALUE;
        return this.f254377d.m91938b(null, 0, 0, null, this);
    }
}
