package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class mar extends ibk {

    /* JADX INFO: renamed from: a */
    public Set f141662a;

    /* JADX INFO: renamed from: b */
    public Set f141663b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f141664c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ oar f141665d;

    /* JADX INFO: renamed from: e */
    public int f141666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mar(oar oarVar, fbk fbkVar) {
        super(fbkVar);
        this.f141665d = oarVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141664c = obj;
        this.f141666e |= Integer.MIN_VALUE;
        return oar.m66573c(this.f141665d, null, this);
    }
}
