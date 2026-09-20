package p204p;

import com.spotify.engagesdk.engagesigninrequest.workers.EngageOnBroadcastSignInHandler;

/* JADX INFO: loaded from: classes6.dex */
public final class k7v extends ibk {

    /* JADX INFO: renamed from: a */
    public p7v f120199a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f120200b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EngageOnBroadcastSignInHandler f120201c;

    /* JADX INFO: renamed from: d */
    public int f120202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7v(EngageOnBroadcastSignInHandler engageOnBroadcastSignInHandler, ibk ibkVar) {
        super(ibkVar);
        this.f120201c = engageOnBroadcastSignInHandler;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f120200b = obj;
        this.f120202d |= Integer.MIN_VALUE;
        return this.f120201c.mo6805k(null, this);
    }
}
