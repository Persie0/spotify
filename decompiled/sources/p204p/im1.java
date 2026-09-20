package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class im1 extends ibk {

    /* JADX INFO: renamed from: a */
    public Set f103569a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f103570b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mm1 f103571c;

    /* JADX INFO: renamed from: d */
    public int f103572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im1(mm1 mm1Var, ibk ibkVar) {
        super(ibkVar);
        this.f103571c = mm1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103570b = obj;
        this.f103572d |= Integer.MIN_VALUE;
        return mm1.m62260m(this.f103571c, null, this);
    }
}
