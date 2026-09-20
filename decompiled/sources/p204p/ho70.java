package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class ho70 extends ibk {

    /* JADX INFO: renamed from: a */
    public Context f93472a;

    /* JADX INFO: renamed from: b */
    public int f93473b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f93474c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bx3 f93475d;

    /* JADX INFO: renamed from: e */
    public int f93476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho70(bx3 bx3Var, ibk ibkVar) {
        super(ibkVar);
        this.f93475d = bx3Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93474c = obj;
        this.f93476e |= Integer.MIN_VALUE;
        return this.f93475d.m30750l(null, 0, this);
    }
}
