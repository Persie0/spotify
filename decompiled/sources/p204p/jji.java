package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class jji {

    /* JADX INFO: renamed from: a */
    public final er70 f113044a;

    public /* synthetic */ jji(er70 er70Var) {
        this.f113044a = er70Var;
    }

    /* JADX INFO: renamed from: a */
    public iji m53571a(String str) {
        Iterable iterable = (Iterable) this.f113044a.get();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((iji) obj).mo28037b(str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Logger.m3966b("MBS: Configurator for package '%s': '%s'", str, ((iji) it.next()).getClass().getName());
            }
            edb.m38545A("Multiple handlers registered for package: '", str, "'");
        }
        return (iji) g6f.m43745s0(arrayList);
    }
}
