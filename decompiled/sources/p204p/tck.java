package p204p;

import com.spotify.contribution.repositoryimpl.C0563a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class tck extends ibk {

    /* JADX INFO: renamed from: a */
    public ArrayList f219095a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f219096b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0563a f219097c;

    /* JADX INFO: renamed from: d */
    public int f219098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tck(C0563a c0563a, ibk ibkVar) {
        super(ibkVar);
        this.f219097c = c0563a;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219096b = obj;
        this.f219098d |= Integer.MIN_VALUE;
        return this.f219097c.m8030c(null, this);
    }
}
