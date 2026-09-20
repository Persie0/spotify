package p204p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class mkq extends ibk {

    /* JADX INFO: renamed from: a */
    public ViewGroup f144628a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f144629b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nkq f144630c;

    /* JADX INFO: renamed from: d */
    public int f144631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkq(nkq nkqVar, ibk ibkVar) {
        super(ibkVar);
        this.f144630c = nkqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144629b = obj;
        this.f144631d |= Integer.MIN_VALUE;
        this.f144630c.m64701a(null, this);
        return yuk.f276404a;
    }
}
