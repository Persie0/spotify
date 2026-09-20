package p204p;

import com.spotify.jvm.jni.NativeClassLoader;

/* JADX INFO: loaded from: classes2.dex */
public final class lwi0 implements qql0 {
    @Override // p204p.qql0
    /* JADX INFO: renamed from: a */
    public final void mo25857a() {
        NativeClassLoader.INSTANCE.load();
    }

    @Override // p204p.qql0
    public final String getName() {
        return "NativeClassLoaderOperation";
    }
}
