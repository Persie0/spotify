package p204p;

import android.net.Uri;
import android.widget.ImageView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class a350 implements e940, exe {

    /* JADX INFO: renamed from: a */
    public final b350 f11871a;

    /* JADX INFO: renamed from: b */
    public final ndy f11872b;

    public a350(b350 b350Var, ndy ndyVar) {
        this.f11871a = b350Var;
        this.f11872b = ndyVar;
        b350Var.f22904i = this;
        b350Var.f22903h = this;
    }

    @Override // p204p.e940
    /* JADX INFO: renamed from: a */
    public final void mo24605a(Uri uri) {
        m40231e(uri);
    }

    @Override // p204p.e940
    /* JADX INFO: renamed from: b */
    public final lxe mo24606b(Uri uri) {
        return this.f11871a.m27996a(uri);
    }

    @Override // p204p.e940
    /* JADX INFO: renamed from: c */
    public final void mo24607c(ImageView imageView) {
        vgg1.m85485z(imageView).m83546a();
    }

    @Override // p204p.exe
    /* JADX INFO: renamed from: d */
    public final f940 mo24608d() {
        return (f940) this.f11871a.f22905j.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m24609f(String str, fsk fskVar, Float f) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f11872b.f152866c;
        int iOrdinal = fskVar.ordinal();
        String str2 = "core_cache";
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                str2 = "core_network";
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "unknown";
            }
        }
        z150 z150Var = (z150) concurrentHashMap.get(str);
        if (z150Var != null) {
            concurrentHashMap.put(str, new z150(str2, f, z150Var.f278231c, z150Var.f278232d));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m24610g(String str, String str2, fgw fgwVar) {
        Throwable th = fgwVar.f69412c;
        String str3 = th instanceof TimeoutException ? "timeout" : "error";
        String message = th.getMessage();
        if (message == null) {
            message = th.getClass().getCanonicalName();
        }
        ndy ndyVar = this.f11872b;
        ndyVar.m64229C((z150) ((ConcurrentHashMap) ndyVar.f152866c).get(str), str3, str2, message, str);
    }

    /* JADX INFO: renamed from: h */
    public final void m24611h(String str, Map map) {
        ndy ndyVar = this.f11872b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ndyVar.f152866c;
        if (concurrentHashMap.containsKey(str)) {
            return;
        }
        sr4 sr4VarM76275a = ((rr4) ((am71) ndyVar.f152865b)).m76275a("image_loading_android");
        sr4VarM76275a.m79019k("image_request", null, (4 & 4) != 0);
        sr4VarM76275a.m79013a("library", "coil");
        concurrentHashMap.put(str, new z150("unknown", null, sr4VarM76275a, map));
    }

    /* JADX INFO: renamed from: i */
    public final void m24612i(String str, String str2, ny51 ny51Var) {
        String str3;
        int iM38547C = edb.m38547C(ny51Var.f159720c);
        if (iM38547C == 0 || iM38547C == 1) {
            str3 = "memory_cache";
        } else if (iM38547C == 2) {
            str3 = "request_load";
        } else {
            if (iM38547C != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = "core_network";
        }
        ndy ndyVar = this.f11872b;
        z150 z150Var = (z150) ((ConcurrentHashMap) ndyVar.f152866c).get(str);
        String str4 = z150Var != null ? z150Var.f278229a : null;
        if (!wj50.m88271j(str4, "unknown") && str4 != null) {
            str3 = str4;
        }
        ndyVar.m64229C(z150Var != null ? new z150(str3, z150Var.f278230b, z150Var.f278231c, z150Var.f278232d) : null, "success", str2, null, str);
    }

    @Override // p204p.e940
    /* JADX INFO: renamed from: j */
    public final lxe mo24613j(String str) {
        return this.f11871a.m27996a(str);
    }
}
