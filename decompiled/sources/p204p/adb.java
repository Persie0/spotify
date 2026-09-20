package p204p;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class adb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ idb f14589b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f14590c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vxz0 f14591d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ jla1 f14592e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ j28 f14593f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List f14594g;

    public /* synthetic */ adb(idb idbVar, String str, vxz0 vxz0Var, jla1 jla1Var, j28 j28Var, List list, int i) {
        this.f14588a = i;
        this.f14589b = idbVar;
        this.f14590c = str;
        this.f14591d = vxz0Var;
        this.f14592e = jla1Var;
        this.f14593f = j28Var;
        this.f14594g = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14588a) {
            case 0:
                idb idbVar = this.f14589b;
                String str = this.f14590c;
                vxz0 vxz0Var = this.f14591d;
                jla1 jla1Var = this.f14592e;
                j28 j28Var = this.f14593f;
                List list = this.f14594g;
                idbVar.m50339t("Use case " + str + " UPDATED");
                idbVar.f101033a.m66687h(str, vxz0Var, jla1Var, j28Var, list);
                idbVar.m50324K();
                break;
            case 1:
                idb idbVar2 = this.f14589b;
                String str2 = this.f14590c;
                vxz0 vxz0Var2 = this.f14591d;
                jla1 jla1Var2 = this.f14592e;
                j28 j28Var2 = this.f14593f;
                List list2 = this.f14594g;
                idbVar2.m50339t("Use case " + str2 + " ACTIVE");
                LinkedHashMap linkedHashMap = idbVar2.f101033a.f163909a;
                hla1 hla1Var = (hla1) linkedHashMap.get(str2);
                if (hla1Var == null) {
                    hla1Var = new hla1(vxz0Var2, jla1Var2, j28Var2, list2);
                    linkedHashMap.put(str2, hla1Var);
                }
                hla1Var.f92662f = true;
                idbVar2.f101033a.m66687h(str2, vxz0Var2, jla1Var2, j28Var2, list2);
                idbVar2.m50324K();
                break;
            default:
                idb idbVar3 = this.f14589b;
                String str3 = this.f14590c;
                vxz0 vxz0Var3 = this.f14591d;
                jla1 jla1Var3 = this.f14592e;
                j28 j28Var3 = this.f14593f;
                List list3 = this.f14594g;
                idbVar3.m50339t("Use case " + str3 + " RESET");
                idbVar3.f101033a.m66687h(str3, vxz0Var3, jla1Var3, j28Var3, list3);
                idbVar3.m50335p();
                idbVar3.m50317D();
                idbVar3.m50324K();
                if (idbVar3.f101044f1 == 9) {
                    idbVar3.m50315B();
                }
                break;
        }
    }
}
