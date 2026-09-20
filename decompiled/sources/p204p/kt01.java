package p204p;

import com.spotify.campfire.sharelist.impl.proto.SharelistResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class kt01 extends ibk {

    /* JADX INFO: renamed from: a */
    public pla1 f126102a;

    /* JADX INFO: renamed from: b */
    public SharelistResponse f126103b;

    /* JADX INFO: renamed from: c */
    public ae50 f126104c;

    /* JADX INFO: renamed from: d */
    public pla1 f126105d;

    /* JADX INFO: renamed from: e */
    public boolean f126106e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f126107f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ot01 f126108g;

    /* JADX INFO: renamed from: h */
    public int f126109h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt01(ot01 ot01Var, ibk ibkVar) {
        super(ibkVar);
        this.f126108g = ot01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f126107f = obj;
        this.f126109h |= Integer.MIN_VALUE;
        return this.f126108g.m67756d(this);
    }
}
