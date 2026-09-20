package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class j7r0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Context.Builder f109653a;

    /* JADX INFO: renamed from: b */
    public ContextPage.Builder f109654b;

    /* JADX INFO: renamed from: c */
    public List f109655c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f109656d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ m7r0 f109657e;

    /* JADX INFO: renamed from: f */
    public int f109658f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7r0(m7r0 m7r0Var, ibk ibkVar) {
        super(ibkVar);
        this.f109657e = m7r0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f109656d = obj;
        this.f109658f |= Integer.MIN_VALUE;
        return this.f109657e.m61090b(null, null, this);
    }
}
