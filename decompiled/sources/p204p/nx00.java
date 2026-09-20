package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class nx00 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f159313a;

    /* JADX INFO: renamed from: b */
    public Map f159314b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f159315c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ px00 f159316d;

    /* JADX INFO: renamed from: e */
    public int f159317e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx00(px00 px00Var, ibk ibkVar) {
        super(ibkVar);
        this.f159316d = px00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f159315c = obj;
        this.f159317e |= Integer.MIN_VALUE;
        return this.f159316d.m71342g(null, null, this);
    }
}
