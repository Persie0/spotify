package p204p;

import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class gzl0 extends fzl0 {
    @Override // p204p.fzl0, p204p.dzl0, p204p.bzl0
    /* JADX INFO: renamed from: c */
    public final Object mo31037c() {
        Object obj = this.f32535a;
        wj50.m88276m(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // p204p.fzl0, p204p.dzl0, p204p.bzl0
    /* JADX INFO: renamed from: g */
    public final void mo31041g(long j) {
        ((OutputConfiguration) mo31037c()).setDynamicRangeProfile(j);
    }

    @Override // p204p.bzl0
    /* JADX INFO: renamed from: h */
    public final void mo31042h(int i) {
        ((OutputConfiguration) mo31037c()).setMirrorMode(i);
    }

    @Override // p204p.bzl0
    /* JADX INFO: renamed from: j */
    public final void mo31044j(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) mo31037c()).setStreamUseCase(j);
    }
}
