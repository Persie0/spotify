package p204p;

import io.ably.lib.types.ErrorInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class lyi extends syi {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f138069h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lyi(vyi vyiVar, wzi wziVar, boolean z, boolean z2, boolean z3, long j, ErrorInfo errorInfo, int i) {
        super(vyiVar, wziVar, z, z2, z3, j, errorInfo);
        this.f138069h = i;
    }

    @Override // p204p.syi
    /* JADX INFO: renamed from: b */
    public void mo60258b(tyi tyiVar, mmc mmcVar) {
        switch (this.f138069h) {
            case 0:
                ErrorInfo errorInfo = vyi.f246121y;
                mmcVar.m29945j();
                znc zncVar = mmcVar.f28786e;
                if (zncVar == znc.attached || zncVar == znc.attaching) {
                    mmcVar.m29951p(errorInfo);
                }
                break;
            case 2:
                mmcVar.m29955t(this.f215254b);
                break;
        }
    }

    @Override // p204p.syi
    /* JADX INFO: renamed from: c */
    public tyi mo60259c() {
        switch (this.f138069h) {
            case 2:
                return new tyi(wzi.connecting, null, null);
            default:
                return super.mo60259c();
        }
    }

    @Override // p204p.syi
    /* JADX INFO: renamed from: d */
    public final tyi mo60260d(tyi tyiVar) {
        switch (this.f138069h) {
            case 0:
                if (tyiVar.f224976a == wzi.connecting) {
                    return tyiVar;
                }
                return null;
            case 1:
                if (tyiVar.f224976a == this.f215253a) {
                    return null;
                }
                return tyiVar;
            default:
                wzi wziVar = tyiVar.f224976a;
                if (wziVar == this.f215253a) {
                    return null;
                }
                return wziVar == wzi.closing ? new tyi(wzi.closed, null, null) : tyiVar;
        }
    }
}
