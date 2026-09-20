package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes4.dex */
public final class p5u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f174227a;

    /* JADX INFO: renamed from: b */
    public int f174228b;

    /* JADX INFO: renamed from: c */
    public niz f174229c;

    /* JADX INFO: renamed from: d */
    public int f174230d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ b3t f174231e;

    /* JADX INFO: renamed from: f */
    public PlayerState f174232f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5u(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f174231e = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f174227a = obj;
        this.f174228b |= Integer.MIN_VALUE;
        return this.f174231e.emit(null, this);
    }
}
