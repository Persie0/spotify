package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v6w implements l3w0, gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ egl f237978a;

    public v6w(egl eglVar) {
        this.f237978a = eglVar;
    }

    @Override // p204p.l3w0
    /* JADX INFO: renamed from: a */
    public final void mo58030a(String str, z650 z650Var) {
        this.f237978a.mo38872a(str, z650Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof l3w0) && (obj instanceof gi00)) {
            return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        return new ri00(2, this.f237978a, egl.class, "openNpv", "openNpv(Ljava/lang/String;Lcom/spotify/ubi/model/InteractionId;)V", 0, 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
