package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eeq implements wfq0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ req f58835a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ meq f58836b;

    public /* synthetic */ eeq(req reqVar, meq meqVar) {
        this.f58835a = reqVar;
        this.f58836b = meqVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x006b A[FALL_THROUGH] */
    @Override // p204p.wfq0
    public final boolean apply(Object obj) {
        Boolean bool;
        uw31 uw31Var;
        uw31 uw31Var2;
        r300 r300Var = (r300) obj;
        req reqVar = this.f58835a;
        reqVar.getClass();
        if (this.f58836b.f142817A0 && ((bool = reqVar.f198414k) == null || !bool.booleanValue())) {
            int i = r300Var.f195360J;
            if (i != -1 && i > 2) {
                String str = r300Var.f195387p;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32 && (uw31Var2 = reqVar.f198412i) != null && uw31Var2.f234561b) {
                            }
                        default:
                            if (Build.VERSION.SDK_INT >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (Build.VERSION.SDK_INT >= 32 || (uw31Var = reqVar.f198412i) == null || !uw31Var.f234561b || !uw31Var.m84086c() || !reqVar.f198412i.m84087d() || !reqVar.f198412i.m84084a(reqVar.f198413j, r300Var)) {
                    return false;
                }
            }
        }
        return true;
    }
}
