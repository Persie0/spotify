package p196j$.nio.file;

import java.nio.file.WatchKey;

/* JADX INFO: renamed from: j$.nio.file.m0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1486m0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WatchKey f10575a;

    public /* synthetic */ C1486m0(WatchKey watchKey) {
        this.f10575a = watchKey;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1486m0 m23921a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return new C1486m0(watchKey);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.f10575a;
        if (obj instanceof C1486m0) {
            obj = ((C1486m0) obj).f10575a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10575a.hashCode();
    }
}
