package p204p;

import androidx.camera.core.CameraControl$OperationCanceledException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ncb implements hbb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pcb f152486b;

    public /* synthetic */ ncb(pcb pcbVar, int i) {
        this.f152485a = i;
        this.f152486b = pcbVar;
    }

    @Override // p204p.hbb
    public final Object attachCompleter(final gbb gbbVar) {
        switch (this.f152485a) {
            case 0:
                final pcb pcbVar = this.f152486b;
                final int i = 1;
                ((htz0) pcbVar.f176005e).execute(new Runnable() { // from class: p.ocb
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                pcb pcbVar2 = pcbVar;
                                pcbVar2.f176003c = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                gbb gbbVar2 = (gbb) pcbVar2.f176008h;
                                if (gbbVar2 != null) {
                                    gbbVar2.m44212c(cameraControl$OperationCanceledException);
                                    pcbVar2.f176008h = null;
                                }
                                pcbVar2.f176008h = gbbVar;
                                if (pcbVar2.f176002b) {
                                    wcb wcbVar = (wcb) pcbVar2.f176004d;
                                    wcbVar.getClass();
                                    x4w0.m89920K(n5h1.m63736l(new io9(wcbVar, 4))).mo28322a(new RunnableC2210od(pcbVar2, 11), (htz0) pcbVar2.f176005e);
                                    pcbVar2.f176003c = false;
                                }
                                break;
                            default:
                                pcb pcbVar3 = pcbVar;
                                pcbVar3.f176003c = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                gbb gbbVar3 = (gbb) pcbVar3.f176008h;
                                if (gbbVar3 != null) {
                                    gbbVar3.m44212c(cameraControl$OperationCanceledException2);
                                    pcbVar3.f176008h = null;
                                }
                                pcbVar3.f176008h = gbbVar;
                                if (pcbVar3.f176002b) {
                                    wcb wcbVar2 = (wcb) pcbVar3.f176004d;
                                    wcbVar2.getClass();
                                    x4w0.m89920K(n5h1.m63736l(new io9(wcbVar2, 4))).mo28322a(new RunnableC2210od(pcbVar3, 11), (htz0) pcbVar3.f176005e);
                                    pcbVar3.f176003c = false;
                                }
                                break;
                        }
                    }
                });
                return "addCaptureRequestOptions";
            default:
                final pcb pcbVar2 = this.f152486b;
                final int i2 = 0;
                ((htz0) pcbVar2.f176005e).execute(new Runnable() { // from class: p.ocb
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                pcb pcbVar3 = pcbVar2;
                                pcbVar3.f176003c = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                gbb gbbVar2 = (gbb) pcbVar3.f176008h;
                                if (gbbVar2 != null) {
                                    gbbVar2.m44212c(cameraControl$OperationCanceledException);
                                    pcbVar3.f176008h = null;
                                }
                                pcbVar3.f176008h = gbbVar;
                                if (pcbVar3.f176002b) {
                                    wcb wcbVar = (wcb) pcbVar3.f176004d;
                                    wcbVar.getClass();
                                    x4w0.m89920K(n5h1.m63736l(new io9(wcbVar, 4))).mo28322a(new RunnableC2210od(pcbVar3, 11), (htz0) pcbVar3.f176005e);
                                    pcbVar3.f176003c = false;
                                }
                                break;
                            default:
                                pcb pcbVar4 = pcbVar2;
                                pcbVar4.f176003c = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                gbb gbbVar3 = (gbb) pcbVar4.f176008h;
                                if (gbbVar3 != null) {
                                    gbbVar3.m44212c(cameraControl$OperationCanceledException2);
                                    pcbVar4.f176008h = null;
                                }
                                pcbVar4.f176008h = gbbVar;
                                if (pcbVar4.f176002b) {
                                    wcb wcbVar2 = (wcb) pcbVar4.f176004d;
                                    wcbVar2.getClass();
                                    x4w0.m89920K(n5h1.m63736l(new io9(wcbVar2, 4))).mo28322a(new RunnableC2210od(pcbVar4, 11), (htz0) pcbVar4.f176005e);
                                    pcbVar4.f176003c = false;
                                }
                                break;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
        }
    }
}
