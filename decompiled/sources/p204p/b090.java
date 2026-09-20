package p204p;

import com.spotify.playlist.proto.ModificationRequest;

/* JADX INFO: loaded from: classes7.dex */
public final class b090 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f21801a;

    /* JADX INFO: renamed from: b */
    public ModificationRequest f21802b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f21803c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ n090 f21804d;

    /* JADX INFO: renamed from: e */
    public int f21805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b090(n090 n090Var, ibk ibkVar) {
        super(ibkVar);
        this.f21804d = n090Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f21803c = obj;
        this.f21805e |= Integer.MIN_VALUE;
        return this.f21804d.m63309f(null, null, null, null, null, this);
    }
}
