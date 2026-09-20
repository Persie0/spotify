package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class i940 extends ibk {

    /* JADX INFO: renamed from: a */
    public Uri f99904a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f99905b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dju f99906c;

    /* JADX INFO: renamed from: d */
    public int f99907d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i940(dju djuVar, ibk ibkVar) {
        super(ibkVar);
        this.f99906c = djuVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99905b = obj;
        this.f99907d |= Integer.MIN_VALUE;
        return this.f99906c.m36234a(null, this);
    }
}
