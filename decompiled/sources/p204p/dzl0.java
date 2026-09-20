package p204p;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public class dzl0 extends bzl0 {
    @Override // p204p.bzl0
    /* JADX INFO: renamed from: a */
    public final void mo31035a(Surface surface) {
        ((OutputConfiguration) mo31037c()).addSurface(surface);
    }

    @Override // p204p.bzl0
    /* JADX INFO: renamed from: b */
    public final void mo31036b() {
        ((OutputConfiguration) mo31037c()).enableSurfaceSharing();
    }

    @Override // p204p.bzl0
    /* JADX INFO: renamed from: c */
    public Object mo31037c() {
        Object obj = this.f32535a;
        wj50.m88276m(obj instanceof czl0);
        return ((czl0) obj).f43589a;
    }

    @Override // p204p.bzl0
    /* JADX INFO: renamed from: d */
    public String mo31038d() {
        return ((czl0) this.f32535a).f43590b;
    }

    @Override // p204p.bzl0
    /* JADX INFO: renamed from: f */
    public final boolean mo31040f() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // p204p.bzl0
    /* JADX INFO: renamed from: g */
    public void mo31041g(long j) {
        ((czl0) this.f32535a).f43591c = j;
    }

    @Override // p204p.bzl0
    /* JADX INFO: renamed from: i */
    public void mo31043i(String str) {
        ((czl0) this.f32535a).f43590b = str;
    }
}
