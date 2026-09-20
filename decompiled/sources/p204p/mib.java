package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public final class mib extends ibk {

    /* JADX INFO: renamed from: a */
    public Intent f143991a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f143992b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rib f143993c;

    /* JADX INFO: renamed from: d */
    public int f143994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mib(rib ribVar, ibk ibkVar) {
        super(ibkVar);
        this.f143993c = ribVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f143992b = obj;
        this.f143994d |= Integer.MIN_VALUE;
        return rib.m75582b(this.f143993c, null, this);
    }
}
