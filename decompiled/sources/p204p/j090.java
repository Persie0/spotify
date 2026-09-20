package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class j090 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f107391a;

    /* JADX INFO: renamed from: b */
    public String f107392b;

    /* JADX INFO: renamed from: c */
    public List f107393c;

    /* JADX INFO: renamed from: d */
    public String f107394d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f107395e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ n090 f107396f;

    /* JADX INFO: renamed from: g */
    public int f107397g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j090(n090 n090Var, ibk ibkVar) {
        super(ibkVar);
        this.f107396f = n090Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107395e = obj;
        this.f107397g |= Integer.MIN_VALUE;
        return this.f107396f.m63313j(null, null, null, null, this);
    }
}
