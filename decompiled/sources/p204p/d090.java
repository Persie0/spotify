package p204p;

import com.spotify.playlist.proto.ModificationRequest;

/* JADX INFO: loaded from: classes7.dex */
public final class d090 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f43816a;

    /* JADX INFO: renamed from: b */
    public ModificationRequest f43817b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f43818c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ n090 f43819d;

    /* JADX INFO: renamed from: e */
    public int f43820e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d090(n090 n090Var, ibk ibkVar) {
        super(ibkVar);
        this.f43819d = n090Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f43818c = obj;
        this.f43820e |= Integer.MIN_VALUE;
        return this.f43819d.m63311h(null, null, null, null, null, null, this);
    }
}
