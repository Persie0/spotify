package p204p;

import com.google.firebase.datatransport.TransportRegistrar;
import io.reactivex.rxjava3.functions.BiFunction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mjr0 implements BiFunction, d2s, rwf, fi00 {

    /* JADX INFO: renamed from: b */
    public static final mjr0 f144316b = new mjr0(3);

    /* JADX INFO: renamed from: c */
    public static final mjr0 f144317c = new mjr0(4);

    /* JADX INFO: renamed from: d */
    public static final mjr0 f144318d = new mjr0(5);

    /* JADX INFO: renamed from: e */
    public static final mjr0 f144319e = new mjr0(6);

    /* JADX INFO: renamed from: f */
    public static final mjr0 f144320f = new mjr0(7);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144321a;

    public /* synthetic */ mjr0(int i) {
        this.f144321a = i;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f144321a) {
            case 0:
                Map map = (Map) obj;
                xul0 xul0Var = (xul0) obj2;
                if (!xul0Var.mo49279c()) {
                    return btv0.f30940g;
                }
                HashMap map2 = new HashMap(y85.m93062g(((Map) xul0Var.mo49278b()).size() + map.size()));
                map2.putAll(map);
                map2.putAll((Map) xul0Var.mo49278b());
                return xf40.m90451c(map2);
            default:
                return new qqm0((e301) obj, (Boolean) obj2);
        }
    }

    @Override // p204p.d2s
    /* JADX INFO: renamed from: b */
    public double mo34792b(double d) {
        return d;
    }

    @Override // p204p.rwf
    /* JADX INFO: renamed from: h */
    public Object mo1885h(sef0 sef0Var) {
        return TransportRegistrar.lambda$getComponents$0(sef0Var);
    }

    @Override // p204p.fi00
    public Object apply(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((h1e1) it.next()).m46429a());
        }
        return arrayList;
    }
}
