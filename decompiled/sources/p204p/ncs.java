package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ncs extends exh0 implements ce91, ocs, eo70 {

    /* JADX INFO: renamed from: M0 */
    public final gh00 f152577M0;

    /* JADX INFO: renamed from: N0 */
    public ncs f152578N0;

    /* JADX INFO: renamed from: O0 */
    public ocs f152579O0;

    /* JADX INFO: renamed from: P0 */
    public long f152580P0;

    public ncs(szp szpVar, int i) {
        this.f152577M0 = (i & 2) != 0 ? null : szpVar;
        this.f152580P0 = 0L;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: A1 */
    public final void mo25064A1() {
        this.f152579O0 = null;
        this.f152578N0 = null;
    }

    @Override // p204p.ocs
    /* JADX INFO: renamed from: H0 */
    public final void mo64171H0(gcs gcsVar) {
        tug1.m81571i(this, new mcs(gcsVar, 0));
    }

    @Override // p204p.ocs
    /* JADX INFO: renamed from: Q0 */
    public final void mo64172Q0(gcs gcsVar) {
        ocs ocsVar = this.f152579O0;
        if (ocsVar != null) {
            ocsVar.mo64172Q0(gcsVar);
            return;
        }
        ncs ncsVar = this.f152578N0;
        if (ncsVar != null) {
            ncsVar.mo64172Q0(gcsVar);
        }
    }

    @Override // p204p.ocs
    /* JADX INFO: renamed from: Y0 */
    public final void mo64173Y0(gcs gcsVar) {
        ocs ocsVar = this.f152579O0;
        if (ocsVar != null) {
            ocsVar.mo64173Y0(gcsVar);
            return;
        }
        ncs ncsVar = this.f152578N0;
        if (ncsVar != null) {
            ncsVar.mo64173Y0(gcsVar);
        }
    }

    @Override // p204p.ocs
    /* JADX INFO: renamed from: a1 */
    public final boolean mo64174a1(gcs gcsVar) {
        ncs ncsVar = this.f152578N0;
        if (ncsVar != null) {
            return ncsVar.mo64174a1(gcsVar);
        }
        ocs ocsVar = this.f152579O0;
        if (ocsVar != null) {
            return ocsVar.mo64174a1(gcsVar);
        }
        return false;
    }

    @Override // p204p.ocs
    /* JADX INFO: renamed from: d0 */
    public final void mo64175d0(gcs gcsVar) {
        ce91 ce91Var;
        ncs ncsVar;
        ncs ncsVar2 = this.f152578N0;
        if (ncsVar2 == null || !tug1.m81567e(ncsVar2, uug1.m84016j(gcsVar))) {
            if (this.f63770a.f63766L0) {
                rlv0 rlv0Var = new rlv0();
                vj50.m85717E(this, new ziq(rlv0Var, this, gcsVar, 8));
                ce91Var = (ce91) rlv0Var.f200373a;
            } else {
                ce91Var = null;
            }
            ncsVar = (ncs) ce91Var;
        } else {
            ncsVar = ncsVar2;
        }
        if (ncsVar != null && ncsVar2 == null) {
            tug1.m81568f(ncsVar, gcsVar);
            ocs ocsVar = this.f152579O0;
            if (ocsVar != null) {
                ocsVar.mo64176u(gcsVar);
            }
        } else if (ncsVar == null && ncsVar2 != null) {
            ocs ocsVar2 = this.f152579O0;
            if (ocsVar2 != null) {
                tug1.m81568f(ocsVar2, gcsVar);
            }
            ncsVar2.mo64176u(gcsVar);
        } else if (!wj50.m88271j(ncsVar, ncsVar2)) {
            if (ncsVar != null) {
                tug1.m81568f(ncsVar, gcsVar);
            }
            if (ncsVar2 != null) {
                ncsVar2.mo64176u(gcsVar);
            }
        } else if (ncsVar != null) {
            ncsVar.mo64175d0(gcsVar);
        } else {
            ocs ocsVar3 = this.f152579O0;
            if (ocsVar3 != null) {
                ocsVar3.mo64175d0(gcsVar);
            }
        }
        this.f152578N0 = ncsVar;
    }

    @Override // p204p.eo70, p204p.t6d0
    /* JADX INFO: renamed from: f */
    public final void mo32895f(long j) {
        this.f152580P0 = j;
    }

    @Override // p204p.ce91
    /* JADX INFO: renamed from: r */
    public final Object mo26917r() {
        return t6x0.f217623P0;
    }

    @Override // p204p.ocs
    /* JADX INFO: renamed from: u */
    public final void mo64176u(gcs gcsVar) {
        ocs ocsVar = this.f152579O0;
        if (ocsVar != null) {
            ocsVar.mo64176u(gcsVar);
        }
        ncs ncsVar = this.f152578N0;
        if (ncsVar != null) {
            ncsVar.mo64176u(gcsVar);
        }
        this.f152578N0 = null;
    }
}
