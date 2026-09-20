package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class crc1 implements rwf, z591 {
    /* JADX INFO: renamed from: a */
    public static ArrayList m33736a(List list, upq upqVar) {
        ArrayList arrayList = new ArrayList(list);
        int i = upqVar.f232807b;
        w0k0 w0k0Var = (w0k0) arrayList.get(i);
        ArrayList arrayList2 = new ArrayList(w0k0Var.f246749a);
        arrayList2.add(upqVar.f232808c, upqVar.f232806a);
        arrayList.set(i, new w0k0(w0k0Var.f246750b, w0k0Var.f246751c, arrayList2));
        return arrayList;
    }

    @Override // p204p.z591
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // p204p.rwf
    /* JADX INFO: renamed from: h */
    public Object mo1885h(sef0 sef0Var) {
        return new pbg1((c8g0) sef0Var.mo54438a(c8g0.class));
    }
}
