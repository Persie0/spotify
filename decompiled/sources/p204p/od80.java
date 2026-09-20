package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class od80 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f164123a;

    /* JADX INFO: renamed from: b */
    public List f164124b;

    /* JADX INFO: renamed from: c */
    public nd80 f164125c;

    /* JADX INFO: renamed from: d */
    public boolean f164126d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f164127e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ud80 f164128f;

    /* JADX INFO: renamed from: g */
    public int f164129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od80(ud80 ud80Var, fbk fbkVar) {
        super(fbkVar);
        this.f164128f = ud80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f164127e = obj;
        this.f164129g |= Integer.MIN_VALUE;
        return this.f164128f.m82843a(null, this, false);
    }
}
