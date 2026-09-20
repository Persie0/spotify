package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jnb implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final ynb f114053a;

    /* JADX INFO: renamed from: b */
    public final vmz f114054b;

    public jnb(ynb ynbVar, vmz vmzVar) {
        this.f114053a = ynbVar;
        this.f114054b = vmzVar;
    }

    /* JADX INFO: renamed from: a */
    public final fiz m53816a() {
        return this.f114053a.f274426a.m58075h() ? mvl0.m62953p(new pv4(this.f114054b.m86026c("campfire", "DISABLED_CANNOT_ENABLE"), 25)) : new ysk(Boolean.FALSE, 27);
    }

    /* JADX INFO: renamed from: b */
    public final fiz m53817b() {
        return this.f114053a.f274426a.m58075h() ? mvl0.m62953p(new pv4(this.f114054b.m86026c("campfire", "DISABLED_CANNOT_ENABLE"), 26)) : new ysk(Boolean.FALSE, 27);
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }

    @Override // p204p.hgm
    public final void shutdown() {
    }
}
