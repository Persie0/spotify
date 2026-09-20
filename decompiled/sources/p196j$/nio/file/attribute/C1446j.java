package p196j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: j$.nio.file.attribute.j */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1446j implements FileAttribute {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1447k f10529a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1447k interfaceC1447k = this.f10529a;
        if (obj instanceof C1446j) {
            obj = ((C1446j) obj).f10529a;
        }
        return interfaceC1447k.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10529a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.f10529a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.f10529a.value();
    }
}
