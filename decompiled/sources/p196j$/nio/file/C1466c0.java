package p196j$.nio.file;

import java.nio.file.PathMatcher;

/* JADX INFO: renamed from: j$.nio.file.c0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1466c0 implements InterfaceC1470e0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PathMatcher f10546a;

    public /* synthetic */ C1466c0(PathMatcher pathMatcher) {
        this.f10546a = pathMatcher;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.f10546a;
        if (obj instanceof C1466c0) {
            obj = ((C1466c0) obj).f10546a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10546a.hashCode();
    }

    @Override // p196j$.nio.file.InterfaceC1470e0
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo23844n(Path path) {
        return this.f10546a.matches(C1501x.m23932r(path));
    }
}
