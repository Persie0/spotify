package p204p;

import com.spotify.campfire.sharelist.impl.proto.SharelistResponse;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class mt01 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f146923a;

    /* JADX INFO: renamed from: b */
    public SharelistResponse f146924b;

    /* JADX INFO: renamed from: c */
    public Set f146925c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f146926d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ot01 f146927e;

    /* JADX INFO: renamed from: f */
    public int f146928f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt01(ot01 ot01Var, ibk ibkVar) {
        super(ibkVar);
        this.f146927e = ot01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146926d = obj;
        this.f146928f |= Integer.MIN_VALUE;
        return this.f146927e.m67758f(this);
    }
}
