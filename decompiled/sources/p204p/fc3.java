package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class fc3 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67973a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ic3 f67974b;

    public /* synthetic */ fc3(ic3 ic3Var, int i) {
        this.f67973a = i;
        this.f67974b = ic3Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f67973a) {
            case 0:
                pl3 pl3Var = this.f67974b.f100720d;
                LinkedHashMap linkedHashMap = pl3Var.f178619b;
                sr4 sr4VarM76275a = ((rr4) pl3Var.f178618a).m76275a("allboarding_post");
                sr4VarM76275a.f213231f = "android-libs-allboarding";
                sr4VarM76275a.m79019k("allboarding_post", null, (4 & 4) != 0);
                linkedHashMap.put("allboarding_post", sr4VarM76275a);
                break;
            default:
                pl3 pl3Var2 = this.f67974b.f100720d;
                LinkedHashMap linkedHashMap2 = pl3Var2.f178619b;
                sr4 sr4VarM76275a2 = ((rr4) pl3Var2.f178618a).m76275a("allboarding_initial_load");
                sr4VarM76275a2.f213231f = "android-libs-allboarding";
                sr4VarM76275a2.m79019k("allboarding_initial_load", null, (4 & 4) != 0);
                linkedHashMap2.put("allboarding_initial_load", sr4VarM76275a2);
                break;
        }
    }
}
