package p204p;

import com.spotify.contribution.repositoryimpl.C0567e;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jik extends ibk {

    /* JADX INFO: renamed from: a */
    public List f112777a;

    /* JADX INFO: renamed from: b */
    public List f112778b;

    /* JADX INFO: renamed from: c */
    public Iterator f112779c;

    /* JADX INFO: renamed from: d */
    public int f112780d;

    /* JADX INFO: renamed from: e */
    public int f112781e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f112782f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0567e f112783g;

    /* JADX INFO: renamed from: h */
    public int f112784h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jik(C0567e c0567e, ibk ibkVar) {
        super(ibkVar);
        this.f112783g = c0567e;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f112782f = obj;
        this.f112784h |= Integer.MIN_VALUE;
        return this.f112783g.m8034a(null, this);
    }
}
