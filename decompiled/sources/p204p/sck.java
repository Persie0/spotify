package p204p;

import com.spotify.contribution.repositoryimpl.C0563a;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class sck extends ibk {

    /* JADX INFO: renamed from: a */
    public List f207759a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f207760b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0563a f207761c;

    /* JADX INFO: renamed from: d */
    public int f207762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sck(C0563a c0563a, ibk ibkVar) {
        super(ibkVar);
        this.f207761c = c0563a;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f207760b = obj;
        this.f207762d |= Integer.MIN_VALUE;
        return this.f207761c.m8029b(null, this);
    }
}
