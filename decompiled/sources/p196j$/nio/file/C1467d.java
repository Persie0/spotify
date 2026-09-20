package p196j$.nio.file;

import java.nio.file.FileStore;

/* JADX INFO: renamed from: j$.nio.file.d */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1467d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileStore f10547a;

    public C1467d(FileStore fileStore) {
        this.f10547a = fileStore;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.f10547a;
        if (obj instanceof C1467d) {
            obj = ((C1467d) obj).f10547a;
        }
        return fileStore.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10547a.hashCode();
    }
}
