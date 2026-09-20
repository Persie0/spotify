package p204p;

import com.spotify.playlist.proto.ModificationRequest;

/* JADX INFO: loaded from: classes7.dex */
public final class l090 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f128333a;

    /* JADX INFO: renamed from: b */
    public ModificationRequest f128334b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f128335c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ n090 f128336d;

    /* JADX INFO: renamed from: e */
    public int f128337e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l090(n090 n090Var, ibk ibkVar) {
        super(ibkVar);
        this.f128336d = n090Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f128335c = obj;
        this.f128337e |= Integer.MIN_VALUE;
        return this.f128336d.m63319p(null, null, null, null, null, this);
    }
}
