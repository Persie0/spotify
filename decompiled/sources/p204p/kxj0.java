package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class kxj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f127512a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f127513b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wxj0 f127514c;

    /* JADX INFO: renamed from: d */
    public int f127515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxj0(wxj0 wxj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f127514c = wxj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f127513b = obj;
        this.f127515d |= Integer.MIN_VALUE;
        return this.f127514c.m89305a(this);
    }
}
