package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class sjz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f209952a;

    /* JADX INFO: renamed from: b */
    public int f209953b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tjz f209954c;

    /* JADX INFO: renamed from: d */
    public niz f209955d;

    /* JADX INFO: renamed from: e */
    public Serializable f209956e;

    /* JADX INFO: renamed from: f */
    public int f209957f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjz(tjz tjzVar, fbk fbkVar) {
        super(fbkVar);
        this.f209954c = tjzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f209952a = obj;
        this.f209953b |= Integer.MIN_VALUE;
        return this.f209954c.collect(null, this);
    }
}
