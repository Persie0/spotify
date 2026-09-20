package p204p;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes10.dex */
public final class kk71 extends ibk {

    /* JADX INFO: renamed from: a */
    public nc20 f123525a;

    /* JADX INFO: renamed from: b */
    public Resources f123526b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f123527c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ lk71 f123528d;

    /* JADX INFO: renamed from: e */
    public int f123529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk71(lk71 lk71Var, ibk ibkVar) {
        super(ibkVar);
        this.f123528d = lk71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f123527c = obj;
        this.f123529e |= Integer.MIN_VALUE;
        return this.f123528d.m59217a(null, null, this);
    }
}
