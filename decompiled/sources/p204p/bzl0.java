package p204p;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class bzl0 {

    /* JADX INFO: renamed from: a */
    public final Object f32535a;

    public bzl0(Object obj) {
        this.f32535a = obj;
    }

    /* JADX INFO: renamed from: a */
    public void mo31035a(Surface surface) {
        if (m31039e() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!mo31040f()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    /* JADX INFO: renamed from: b */
    public void mo31036b() {
        ((azl0) this.f32535a).f21645c = true;
    }

    /* JADX INFO: renamed from: c */
    public Object mo31037c() {
        Object obj = this.f32535a;
        wj50.m88276m(obj instanceof azl0);
        return ((azl0) obj).f21643a;
    }

    /* JADX INFO: renamed from: d */
    public String mo31038d() {
        return ((azl0) this.f32535a).f21644b;
    }

    /* JADX INFO: renamed from: e */
    public final Surface m31039e() {
        return ((OutputConfiguration) mo31037c()).getSurface();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bzl0)) {
            return false;
        }
        return Objects.equals(this.f32535a, ((bzl0) obj).f32535a);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo31040f() {
        return ((azl0) this.f32535a).f21645c;
    }

    /* JADX INFO: renamed from: g */
    public void mo31041g(long j) {
        ((azl0) this.f32535a).f21646d = j;
    }

    public final int hashCode() {
        return this.f32535a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public void mo31043i(String str) {
        ((azl0) this.f32535a).f21644b = str;
    }

    /* JADX INFO: renamed from: h */
    public void mo31042h(int i) {
    }

    /* JADX INFO: renamed from: j */
    public void mo31044j(long j) {
    }
}
