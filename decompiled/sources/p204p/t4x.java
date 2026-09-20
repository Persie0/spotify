package p204p;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t4x {

    /* JADX INFO: renamed from: a */
    public final List f217142a;

    public t4x(Context context, yb11 yb11Var, wra0 wra0Var, p94 p94Var, s050 s050Var, ex20 ex20Var, List list, hke hkeVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("context_monotonic_clock", new r050(new zy5(17), new zk1(yb11Var, new d2j0(5, yb11Var, new np7(9, context, wra0Var)))));
        linkedHashMap.put("context_device_android", new i6r(context, p94Var, ex20Var));
        linkedHashMap.put("context_sdk", new ooy0(hkeVar));
        linkedHashMap.put("context_application_android", new jg5(context, wra0Var));
        linkedHashMap.put("context_installation_id", new r050(s050Var));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s4x s4xVar = (s4x) it.next();
            linkedHashMap.put(s4xVar.mo29679a(), s4xVar);
        }
        this.f217142a = g6f.m43728j1(linkedHashMap.values());
    }
}
