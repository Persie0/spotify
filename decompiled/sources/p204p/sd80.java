package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class sd80 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f207942a;

    /* JADX INFO: renamed from: b */
    public List f207943b;

    /* JADX INFO: renamed from: c */
    public nd80 f207944c;

    /* JADX INFO: renamed from: d */
    public boolean f207945d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f207946e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ud80 f207947f;

    /* JADX INFO: renamed from: g */
    public int f207948g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd80(ud80 ud80Var, fbk fbkVar) {
        super(fbkVar);
        this.f207947f = ud80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f207946e = obj;
        this.f207948g |= Integer.MIN_VALUE;
        return this.f207947f.m82846f(null, this, false);
    }
}
