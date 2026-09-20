package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class og0 extends hg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pg0 f164958a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f164959b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hsg1 f164960c;

    public og0(pg0 pg0Var, String str, hsg1 hsg1Var) {
        this.f164958a = pg0Var;
        this.f164959b = str;
        this.f164960c = hsg1Var;
    }

    @Override // p204p.hg0
    /* JADX INFO: renamed from: a */
    public final void mo24737a(Object obj) throws Exception {
        pg0 pg0Var = this.f164958a;
        ArrayList arrayList = pg0Var.f177177d;
        LinkedHashMap linkedHashMap = pg0Var.f177175b;
        String str = this.f164959b;
        Object obj2 = linkedHashMap.get(str);
        hsg1 hsg1Var = this.f164960c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + hsg1Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            pg0Var.mo34318d(iIntValue, hsg1Var, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }

    @Override // p204p.hg0
    /* JADX INFO: renamed from: b */
    public final void mo24738b() {
        this.f164958a.m69856j(this.f164959b);
    }
}
