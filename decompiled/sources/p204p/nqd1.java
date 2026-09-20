package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes10.dex */
public final class nqd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public Intent f157237a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f157238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v8y f157239c;

    /* JADX INFO: renamed from: d */
    public int f157240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqd1(v8y v8yVar, ibk ibkVar) {
        super(ibkVar);
        this.f157239c = v8yVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157238b = obj;
        this.f157240d |= Integer.MIN_VALUE;
        return this.f157239c.m84932j(null, null, this);
    }
}
