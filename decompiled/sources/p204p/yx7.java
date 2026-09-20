package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class yx7 extends ibk {

    /* JADX INFO: renamed from: a */
    public niz f277150a;

    /* JADX INFO: renamed from: b */
    public Object f277151b;

    /* JADX INFO: renamed from: c */
    public Object f277152c;

    /* JADX INFO: renamed from: d */
    public Serializable f277153d;

    /* JADX INFO: renamed from: e */
    public Object f277154e;

    /* JADX INFO: renamed from: f */
    public juk f277155f;

    /* JADX INFO: renamed from: g */
    public zv41 f277156g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f277157h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ay7 f277158i;

    /* JADX INFO: renamed from: t */
    public int f277159t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx7(ay7 ay7Var, fbk fbkVar) {
        super(fbkVar);
        this.f277158i = ay7Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f277157h = obj;
        this.f277159t |= Integer.MIN_VALUE;
        this.f277158i.collect(null, this);
        return yuk.f276404a;
    }
}
