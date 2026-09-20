package p204p;

import com.spotify.contribution.repositoryimpl.C0563a;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class uck extends ibk {

    /* JADX INFO: renamed from: a */
    public List f229074a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f229075b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0563a f229076c;

    /* JADX INFO: renamed from: d */
    public int f229077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uck(C0563a c0563a, ibk ibkVar) {
        super(ibkVar);
        this.f229076c = c0563a;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f229075b = obj;
        this.f229077d |= Integer.MIN_VALUE;
        return this.f229076c.m8031d(null, this);
    }
}
