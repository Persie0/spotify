package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class i5q extends ibk {

    /* JADX INFO: renamed from: a */
    public Set f99005a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f99006b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j5q f99007c;

    /* JADX INFO: renamed from: d */
    public int f99008d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5q(j5q j5qVar, ibk ibkVar) {
        super(ibkVar);
        this.f99007c = j5qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99006b = obj;
        this.f99008d |= Integer.MIN_VALUE;
        return j5q.m52472a(this.f99007c, null, this);
    }
}
