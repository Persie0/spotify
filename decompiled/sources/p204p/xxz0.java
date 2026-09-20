package p204p;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class xxz0 implements zxz0 {

    /* JADX INFO: renamed from: a */
    public final SessionConfiguration f267165a;

    /* JADX INFO: renamed from: b */
    public final List f267166b;

    public xxz0(ArrayList arrayList, htz0 htz0Var, meb mebVar) {
        zyl0 zyl0Var;
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, ayz0.m27559a(arrayList), htz0Var, mebVar);
        this.f267165a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            if (outputConfiguration == null) {
                zyl0Var = null;
            } else {
                int i = Build.VERSION.SDK_INT;
                zyl0Var = new zyl0(i >= 33 ? new gzl0(outputConfiguration) : i >= 28 ? new fzl0(new ezl0(outputConfiguration)) : i >= 26 ? new dzl0(new czl0(outputConfiguration)) : new bzl0(new azl0(outputConfiguration)));
            }
            arrayList2.add(zyl0Var);
        }
        this.f267166b = Collections.unmodifiableList(arrayList2);
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: a */
    public final List mo92388a() {
        return this.f267166b;
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: b */
    public final void mo92389b(bv40 bv40Var) {
        this.f267165a.setInputConfiguration(bv40Var.f31273a.f286341a);
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: c */
    public final Object mo92390c() {
        return this.f267165a;
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: d */
    public final bv40 mo92391d() {
        return bv40.m30585a(this.f267165a.getInputConfiguration());
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: e */
    public final Executor mo92392e() {
        return this.f267165a.getExecutor();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xxz0) {
            return Objects.equals(this.f267165a, ((xxz0) obj).f267165a);
        }
        return false;
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: f */
    public final int mo92393f() {
        return this.f267165a.getSessionType();
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: g */
    public final CameraCaptureSession.StateCallback mo92394g() {
        return this.f267165a.getStateCallback();
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: h */
    public final void mo92395h(CaptureRequest captureRequest) {
        this.f267165a.setSessionParameters(captureRequest);
    }

    public final int hashCode() {
        return this.f267165a.hashCode();
    }
}
