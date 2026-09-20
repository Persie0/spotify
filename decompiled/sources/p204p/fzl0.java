package p204p;

import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class fzl0 extends dzl0 {
    @Override // p204p.dzl0, p204p.bzl0
    /* JADX INFO: renamed from: c */
    public Object mo31037c() {
        Object obj = this.f32535a;
        wj50.m88276m(obj instanceof ezl0);
        return ((ezl0) obj).f64413a;
    }

    @Override // p204p.dzl0, p204p.bzl0
    /* JADX INFO: renamed from: d */
    public final String mo31038d() {
        return null;
    }

    @Override // p204p.dzl0, p204p.bzl0
    /* JADX INFO: renamed from: g */
    public void mo31041g(long j) {
        ((ezl0) this.f32535a).f64414b = j;
    }

    @Override // p204p.dzl0, p204p.bzl0
    /* JADX INFO: renamed from: i */
    public final void mo31043i(String str) {
        ((OutputConfiguration) mo31037c()).setPhysicalCameraId(str);
    }
}
