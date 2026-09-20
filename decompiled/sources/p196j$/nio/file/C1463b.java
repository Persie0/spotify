package p196j$.nio.file;

import java.nio.file.CopyOption;
import java.nio.file.LinkOption;
import java.nio.file.StandardCopyOption;

/* JADX INFO: renamed from: j$.nio.file.b */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1463b implements CopyOption {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CopyOption f10543a;

    public /* synthetic */ C1463b(CopyOption copyOption) {
        this.f10543a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v3, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v6, types: [j$.nio.file.CopyOption, java.nio.file.LinkOption] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ CopyOption m23916a(CopyOption copyOption) {
        if (copyOption == 0) {
            return null;
        }
        if (copyOption instanceof C1465c) {
            return ((C1465c) copyOption).f10545a;
        }
        if (copyOption instanceof LinkOption) {
            return LinkOption.NOFOLLOW_LINKS;
        }
        if (!(copyOption instanceof StandardCopyOption)) {
            return new C1463b(copyOption);
        }
        StandardCopyOption standardCopyOption = (StandardCopyOption) copyOption;
        if (standardCopyOption == StandardCopyOption.REPLACE_EXISTING) {
            return StandardCopyOption.REPLACE_EXISTING;
        }
        return standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES ? StandardCopyOption.COPY_ATTRIBUTES : StandardCopyOption.ATOMIC_MOVE;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        CopyOption copyOption = this.f10543a;
        if (obj instanceof C1463b) {
            obj = ((C1463b) obj).f10543a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10543a.hashCode();
    }
}
