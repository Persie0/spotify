package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class w101 extends ibk {

    /* JADX INFO: renamed from: a */
    public x101 f246917a;

    /* JADX INFO: renamed from: b */
    public Context f246918b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f246919c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ x101 f246920d;

    /* JADX INFO: renamed from: e */
    public int f246921e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w101(x101 x101Var, ibk ibkVar) {
        super(ibkVar);
        this.f246920d = x101Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f246919c = obj;
        this.f246921e |= Integer.MIN_VALUE;
        return this.f246920d.m89615b(null, null, this);
    }
}
