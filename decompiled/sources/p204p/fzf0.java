package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class fzf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f75007a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f75008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hzf0 f75009c;

    /* JADX INFO: renamed from: d */
    public int f75010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzf0(hzf0 hzf0Var, ibk ibkVar) {
        super(ibkVar);
        this.f75009c = hzf0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f75008b = obj;
        this.f75010d |= Integer.MIN_VALUE;
        Object objM49274b = this.f75009c.m49274b(null, null, this);
        return objM49274b == yuk.f276404a ? objM49274b : new s6x0(objM49274b);
    }
}
