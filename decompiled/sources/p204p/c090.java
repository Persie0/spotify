package p204p;

import com.spotify.playlist.proto.ModificationRequest;

/* JADX INFO: loaded from: classes7.dex */
public final class c090 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f32717a;

    /* JADX INFO: renamed from: b */
    public ModificationRequest f32718b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f32719c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ n090 f32720d;

    /* JADX INFO: renamed from: e */
    public int f32721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c090(n090 n090Var, ibk ibkVar) {
        super(ibkVar);
        this.f32720d = n090Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32719c = obj;
        this.f32721e |= Integer.MIN_VALUE;
        return this.f32720d.m63310g(null, null, null, null, null, null, this);
    }
}
