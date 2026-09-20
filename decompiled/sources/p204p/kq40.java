package p204p;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import rxdogtag2.RxDogTag;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kq40 {
    /* JADX INFO: renamed from: a */
    public static void m57079a() {
        RxDogTag.builder().addIgnoredPackages("com.spotify.mobius").install();
        RxJavaPlugins.f10307a = new fxc1(15);
    }
}
