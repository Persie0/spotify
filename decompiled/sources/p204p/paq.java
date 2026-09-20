package p204p;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class paq {

    /* JADX INFO: renamed from: a */
    public final Map f175594a;

    /* JADX INFO: renamed from: b */
    public final Map f175595b;

    /* JADX INFO: renamed from: c */
    public final Object f175596c;

    public paq(Map map, Map map2, Object obj, Bundle bundle) {
        Bundle bundle2;
        this.f175594a = map;
        this.f175595b = map2;
        this.f175596c = obj;
        if (bundle == null || (bundle2 = bundle.getBundle("StateHolderStoreKey")) == null) {
            return;
        }
        Set<String> setKeySet = bundle2.keySet();
        int iM31820L = c95.m31820L(i6f.m49804T(setKeySet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L < 16 ? 16 : iM31820L);
        for (Object obj2 : setKeySet) {
            linkedHashMap.put(obj2, bundle2.getBundle((String) obj2));
        }
        this.f175595b.putAll(kkc0.m56709v0(linkedHashMap));
    }

    /* JADX INFO: renamed from: a */
    public final gw41 m69495a(Object obj, Object obj2, d7y0 d7y0Var, eh00 eh00Var) {
        Object objM69496c = m69496c(obj);
        oaq oaqVar = null;
        Map map = this.f175594a;
        if (d7y0Var != null) {
            Map map2 = this.f175595b;
            Bundle bundle = (Bundle) map2.get(objM69496c);
            Object objMo27875W = bundle != null ? d7y0Var.mo27875W(bundle, obj2) : null;
            zn91.m96561l(map2).remove(objM69496c);
            if (objMo27875W != null) {
                Bundle bundle2 = (Bundle) map2.remove(objM69496c + "_ui");
                oaq oaqVar2 = new oaq(objMo27875W, this, obj.toString(), d7y0Var);
                oaqVar2.f163442f = bundle2;
                map.put(objM69496c, oaqVar2);
                oaqVar = oaqVar2;
            }
        }
        if (oaqVar != null) {
            return oaqVar;
        }
        gw41 gw41Var = (gw41) map.get(objM69496c);
        if (gw41Var != null) {
            return gw41Var;
        }
        gw41 gw41Var2 = (gw41) eh00Var.invoke();
        map.put(objM69496c, gw41Var2);
        return gw41Var2;
    }

    /* JADX INFO: renamed from: c */
    public Object m69496c(Object obj) {
        String strM75734h;
        Object obj2 = this.f175596c;
        return (obj2 == null || (strM75734h = rkh0.m75734h("/", obj2, obj)) == null) ? obj : strM75734h;
    }

    public paq(Bundle bundle) {
        this(new LinkedHashMap(), new LinkedHashMap(), null, bundle);
    }
}
