package p204p;

import com.spotify.contribution.repositoryimpl.C0563a;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vck extends ibk {

    /* JADX INFO: renamed from: a */
    public List f240145a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f240146b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0563a f240147c;

    /* JADX INFO: renamed from: d */
    public int f240148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vck(C0563a c0563a, ibk ibkVar) {
        super(ibkVar);
        this.f240147c = c0563a;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f240146b = obj;
        this.f240148d |= Integer.MIN_VALUE;
        return this.f240147c.m8032e(null, this);
    }
}
