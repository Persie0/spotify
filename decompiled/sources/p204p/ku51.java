package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ku51 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f126462a = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public final String m57379a() {
        List listM43728j1 = g6f.m43728j1(this.f126462a);
        StringBuilder sb = new StringBuilder();
        sb.append("#Active subscriptions: " + listM43728j1.size());
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM43728j1, 10));
        Iterator it = listM43728j1.iterator();
        while (it.hasNext()) {
            arrayList.add("\n" + ((zs81) it.next()).m96826a().m45724b());
        }
        sb.append(arrayList);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final zs81 m57380b(String str, Emitter emitter, Disposable disposable) {
        zs81 zs81Var = new zs81(emitter, disposable, ofg1.m66843l(str), str);
        synchronized (this) {
            this.f126462a.add(zs81Var);
            this.f126462a.size();
        }
        return zs81Var;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized List m57381c() {
        List listM43728j1 = g6f.m43728j1(this.f126462a);
        if (listM43728j1.isEmpty()) {
            return lau.f131415a;
        }
        this.f126462a.size();
        Logger.m3966b("Found active subscribers:\n" + m57379a(), new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM43728j1) {
            if (((zs81) obj).m96827b()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zs81) it.next()).m96826a());
        }
        this.f126462a.clear();
        this.f126462a.size();
        return arrayList2;
    }
}
