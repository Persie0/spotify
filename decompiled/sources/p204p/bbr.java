package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class bbr extends ibk {

    /* JADX INFO: renamed from: a */
    public gj9 f25638a;

    /* JADX INFO: renamed from: b */
    public Set f25639b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f25640c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cbr f25641d;

    /* JADX INFO: renamed from: e */
    public int f25642e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbr(cbr cbrVar, ibk ibkVar) {
        super(ibkVar);
        this.f25641d = cbrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f25640c = obj;
        this.f25642e |= Integer.MIN_VALUE;
        return this.f25641d.m32192b(null, null, this);
    }
}
