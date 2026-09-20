package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class pci implements iys0 {

    /* JADX INFO: renamed from: a */
    public final oci f176112a;

    /* JADX INFO: renamed from: b */
    public final bji f176113b;

    /* JADX INFO: renamed from: c */
    public final wg61 f176114c;

    public pci(oci ociVar, bji bjiVar) {
        this.f176112a = ociVar;
        this.f176113b = bjiVar;
        this.f176114c = new wg61(new r7i(this, 2));
    }

    /* JADX INFO: renamed from: a */
    public final oci m69586a() {
        oci ociVarM69586a;
        pci pciVar = (pci) this.f176114c.getValue();
        return (pciVar == null || (ociVarM69586a = pciVar.m69586a()) == null) ? this.f176112a : ociVarM69586a;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m69586a().f163930a;
        oci[] ociVarArrValues = oci.values();
        ArrayList arrayList = new ArrayList(ociVarArrValues.length);
        for (oci ociVar : ociVarArrValues) {
            arrayList.add(ociVar.f163930a);
        }
        return Collections.singletonList(new k8a("concert_friends_entrypoint_type", "concert-friend-matcher", str, arrayList));
    }

    public pci(bji bjiVar) {
        this(oci.SHARE, bjiVar);
    }
}
