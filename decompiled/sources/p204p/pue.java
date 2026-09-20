package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pue extends mif1 {
    @Override // p204p.mif1
    /* JADX INFO: renamed from: f */
    public final void mo25449f(ezx0 ezx0Var, Object obj) {
        pve pveVar = (pve) obj;
        Integer numM71140b = pveVar.m71140b();
        if (numM71140b == null) {
            ezx0Var.mo24847v(1);
        } else {
            ezx0Var.mo24846u(1, numM71140b.intValue());
        }
        String strM71139a = pveVar.m71139a();
        if (strM71139a == null) {
            ezx0Var.mo24847v(2);
        } else {
            ezx0Var.mo24842R(2, strM71139a);
        }
        String strM71141c = pveVar.m71141c();
        if (strM71141c == null) {
            ezx0Var.mo24847v(3);
        } else {
            ezx0Var.mo24842R(3, strM71141c);
        }
        Long lM71142d = pveVar.m71142d();
        if (lM71142d == null) {
            ezx0Var.mo24847v(4);
        } else {
            ezx0Var.mo24846u(4, lM71142d.longValue());
        }
    }

    @Override // p204p.mif1
    /* JADX INFO: renamed from: m */
    public final String mo25450m() {
        return "INSERT OR REPLACE INTO `device_broadcasts` (`id`,`from`,`deviceId`,`createdAt`) VALUES (?,?,?,?)";
    }
}
