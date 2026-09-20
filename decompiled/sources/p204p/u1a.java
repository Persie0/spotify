package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class u1a extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f225730a;

    /* JADX INFO: renamed from: b */
    public int f225731b;

    /* JADX INFO: renamed from: c */
    public niz f225732c;

    /* JADX INFO: renamed from: d */
    public int f225733d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ v1a f225734e;

    /* JADX INFO: renamed from: f */
    public Set f225735f;

    /* JADX INFO: renamed from: g */
    public Set f225736g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1a(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f225734e = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f225730a = obj;
        this.f225731b |= Integer.MIN_VALUE;
        return this.f225734e.emit(null, this);
    }
}
