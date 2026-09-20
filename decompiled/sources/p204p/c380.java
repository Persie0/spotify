package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c380 {

    /* JADX INFO: renamed from: a */
    public final a380 f33604a;

    public c380(a380 a380Var) {
        this.f33604a = a380Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m31366a() {
        int size;
        a380 a380Var = this.f33604a;
        if (a380Var.f11897a.m31604F("dialog_presenter") == null) {
            c700 c700Var = a380Var.f11897a;
            b380 b380Var = a380Var.f11898b;
            khr khrVar = new khr();
            List listM89877x = c700Var.f34668c.m89877x();
            b380Var.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("playback_error_dialog_fragment", nyo0.class);
            linkedHashMap.put("offline_sync_error_fragment", g3l0.class);
            linkedHashMap.put("disk_almost_full_fragment", jqr.class);
            try {
                linkedHashMap.put("uninstall_release_version", Class.forName("com.spotify.debugtools.uninstallrelease.UninstallReleaseVersionDialogFragment"));
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                throw new AssertionError(e);
            }
            linkedHashMap.put("google_assistant_linking_debug_fragment", ak10.class);
            xi8 xi8Var = new xi8(c700Var);
            xi8Var.m91100k(0, khrVar, "dialog_presenter", 1);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Class cls = (Class) entry.getValue();
                xi8Var.m91100k(0, xi8Var.m91099j(null, cls), (String) entry.getKey(), 1);
            }
            xi8Var.m91095f();
            c700Var.m31601C();
            ArrayList<i500> arrayList = new ArrayList(c700Var.f34668c.m89877x());
            arrayList.removeAll(listM89877x);
            for (i500 i500Var : arrayList) {
                if (i500Var instanceof qzq0) {
                    qzq0 qzq0Var = (qzq0) i500Var;
                    String str = qzq0Var.f98688Y0;
                    if (str == null || str.length() == 0) {
                        throw new IllegalArgumentException("Fragment must be added to a transaction with a specific tag before being registered in DialogPresenter.");
                    }
                    qzq0Var.f194253A1 = khrVar;
                    synchronized (khrVar) {
                        khrVar.f122711A1.add(new jhr(qzq0Var.f98688Y0));
                        size = khrVar.f122711A1.size();
                    }
                    qzq0Var.f194254B1 = size;
                }
            }
        }
    }
}
