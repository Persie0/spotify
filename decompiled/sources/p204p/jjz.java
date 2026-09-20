package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class jjz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f113119a;

    /* JADX INFO: renamed from: b */
    public int f113120b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ysk f113121c;

    /* JADX INFO: renamed from: d */
    public niz f113122d;

    /* JADX INFO: renamed from: e */
    public Iterator f113123e;

    /* JADX INFO: renamed from: f */
    public int f113124f;

    /* JADX INFO: renamed from: g */
    public int f113125g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjz(ysk yskVar, fbk fbkVar) {
        super(fbkVar);
        this.f113121c = yskVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113119a = obj;
        this.f113120b |= Integer.MIN_VALUE;
        return this.f113121c.collect(null, this);
    }
}
