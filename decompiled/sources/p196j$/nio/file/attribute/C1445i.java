package p196j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: j$.nio.file.attribute.i */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1445i implements InterfaceC1447k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileAttribute f10528a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttribute fileAttribute = this.f10528a;
        if (obj instanceof C1445i) {
            obj = ((C1445i) obj).f10528a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10528a.hashCode();
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1447k
    public final /* synthetic */ String name() {
        return this.f10528a.name();
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1447k
    public final /* synthetic */ Object value() {
        return this.f10528a.value();
    }
}
