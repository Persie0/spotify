package p204p;

import com.spotify.player.model.PlayerError;

/* JADX INFO: loaded from: classes10.dex */
public final class zuv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public PlayerError f286546a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f286547b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xld f286548c;

    /* JADX INFO: renamed from: d */
    public int f286549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zuv0(xld xldVar, fbk fbkVar) {
        super(fbkVar);
        this.f286548c = xldVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f286547b = obj;
        this.f286549d |= Integer.MIN_VALUE;
        return this.f286548c.m91420b(null, this);
    }
}
