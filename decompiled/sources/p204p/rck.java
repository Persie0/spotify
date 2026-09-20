package p204p;

import com.spotify.contribution.repositoryimpl.C0563a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class rck extends ibk {

    /* JADX INFO: renamed from: a */
    public ArrayList f197876a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f197877b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0563a f197878c;

    /* JADX INFO: renamed from: d */
    public int f197879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rck(C0563a c0563a, ibk ibkVar) {
        super(ibkVar);
        this.f197878c = c0563a;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197877b = obj;
        this.f197879d |= Integer.MIN_VALUE;
        return this.f197878c.m8028a(null, this);
    }
}
