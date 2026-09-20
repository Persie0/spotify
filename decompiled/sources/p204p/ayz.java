package p204p;

import com.spotify.notifications.models.preferences.Channels;
import com.spotify.notifications.models.preferences.Item$Group;
import com.spotify.notifications.models.preferences.Item$Preference;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class ayz implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21379a;

    /* JADX INFO: renamed from: b */
    public final List f21380b;

    public /* synthetic */ ayz(int i, List list) {
        this.f21379a = i;
        this.f21380b = list;
    }

    /* JADX INFO: renamed from: a */
    public j1t0 m27558a(int i) {
        return (j1t0) this.f21380b.get(i);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f21379a) {
            case 0:
                Map map = (Map) obj;
                boolean z = true;
                List list = this.f21380b;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        y5f y5fVar = (y5f) map.get((String) it.next());
                        if (!(y5fVar != null ? y5fVar.f269417a : false)) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (!this.f21380b.contains(((br50) obj2).getUri())) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 2:
                gqx gqxVar = (gqx) obj;
                ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj3 : this.f21380b) {
                    if (gqxVar.mo45449a(b5q0.class, (String) obj3).f72301b != null) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
                for (String str : arrayList2) {
                    b5q0 b5q0Var = (b5q0) gqxVar.mo45449a(b5q0.class, str).f72301b;
                    arrayList3.add(new pqm0(str, Boolean.valueOf(b5q0Var != null ? q350.m72056k(b5q0Var) : false)));
                }
                return kkc0.m56705r0(arrayList3);
            case 3:
                ArrayList<Item$Preference> arrayListM90932b = xgq0.m90932b((Item$Group) obj);
                ArrayList arrayList4 = new ArrayList();
                for (Item$Preference item$Preference : arrayListM90932b) {
                    String str2 = item$Preference.key;
                    Channels channels = item$Preference.channels;
                    srl0 srl0VarM49325G = i091.m49325G(str2);
                    pqm0 pqm0Var = null;
                    if (srl0VarM49325G != null) {
                        if (!this.f21380b.contains(srl0VarM49325G)) {
                            srl0VarM49325G = null;
                        }
                        if (srl0VarM49325G != null) {
                            Boolean bool = channels.push;
                            Boolean bool2 = Boolean.TRUE;
                            pqm0Var = new pqm0(srl0VarM49325G, new xrl0(wj50.m88271j(bool, bool2), wj50.m88271j(channels.email, bool2)));
                        }
                    }
                    if (pqm0Var != null) {
                        arrayList4.add(pqm0Var);
                    }
                }
                return kkc0.m56705r0(arrayList4);
            default:
                return new pqm0((bxz0) obj, this.f21380b);
        }
    }

    public ayz(xgq0 xgq0Var, List list) {
        this.f21379a = 3;
        this.f21380b = list;
    }

    public ayz(p1t0 p1t0Var) {
        this.f21379a = 5;
        List list = p1t0Var.f173165c;
        if ((p1t0Var.f173164b & 1) == 1) {
            int i = p1t0Var.f173166d;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                j1t0 j1t0VarM49424g = (j1t0) obj;
                if (i2 >= i) {
                    j1t0VarM49424g.getClass();
                    i1t0 i1t0VarM52183p = j1t0.m52183p(j1t0VarM49424g);
                    i1t0VarM52183p.f97599d |= 2;
                    i1t0VarM52183p.f97601f = true;
                    j1t0VarM49424g = i1t0VarM52183p.m49424g();
                    if (!j1t0VarM49424g.isInitialized()) {
                        throw new UninitializedMessageException();
                    }
                }
                arrayList.add(j1t0VarM49424g);
                i2 = i3;
            }
            list = arrayList;
        }
        this.f21380b = list;
    }
}
