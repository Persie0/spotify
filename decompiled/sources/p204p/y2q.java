package p204p;

import com.spotify.bluetooth.categorizer.CategorizerResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class y2q extends ibk {

    /* JADX INFO: renamed from: a */
    public l3a f268658a;

    /* JADX INFO: renamed from: b */
    public CategorizerResponse f268659b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f268660c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ z2q f268661d;

    /* JADX INFO: renamed from: e */
    public int f268662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2q(z2q z2qVar, ibk ibkVar) {
        super(ibkVar);
        this.f268661d = z2qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f268660c = obj;
        this.f268662e |= Integer.MIN_VALUE;
        return this.f268661d.m95231b(null, this);
    }
}
