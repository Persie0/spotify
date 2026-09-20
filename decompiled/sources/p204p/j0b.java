package p204p;

import com.spotify.player.model.command.PlayCommand;

/* JADX INFO: loaded from: classes9.dex */
public final class j0b extends ibk {

    /* JADX INFO: renamed from: a */
    public String f107403a;

    /* JADX INFO: renamed from: b */
    public PlayCommand f107404b;

    /* JADX INFO: renamed from: c */
    public z650 f107405c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f107406d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ m0b f107407e;

    /* JADX INFO: renamed from: f */
    public int f107408f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0b(m0b m0bVar, ibk ibkVar) {
        super(ibkVar);
        this.f107407e = m0bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107406d = obj;
        this.f107408f |= Integer.MIN_VALUE;
        return this.f107407e.m60455c(null, false, null, null, this);
    }
}
