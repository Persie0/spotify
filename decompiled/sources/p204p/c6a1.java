package p204p;

import com.spotify.kodiak.table.table.DataSourceException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c6a1 implements a6a1 {

    /* JADX INFO: renamed from: a */
    public final uz60 f34472a;

    /* JADX INFO: renamed from: b */
    public final tn61 f34473b;

    public c6a1(uz60 uz60Var) {
        this.f34472a = uz60Var;
        this.f34473b = uz60Var.mo28095d();
    }

    @Override // p204p.a6a1
    /* JADX INFO: renamed from: b */
    public final Map mo24860b(Set set) throws DataSourceException.UnsupportedKey {
        Set<k35> set2 = set;
        ArrayList arrayList = new ArrayList(i6f.m49804T(set2, 10));
        for (k35 k35Var : set2) {
            Object obj = k35Var.f118763b;
            if (obj == null) {
                obj = null;
            }
            if (obj == null) {
                throw new DataSourceException.UnsupportedKey(k35Var);
            }
            arrayList.add(obj);
        }
        Map mapMo28093b = this.f34472a.mo28093b(g6f.m43736n1(arrayList));
        LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(mapMo28093b.size()));
        for (Map.Entry entry : mapMo28093b.entrySet()) {
            linkedHashMap.put(new k35(this.f34473b, entry.getKey()), entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // p204p.a6a1
    /* JADX INFO: renamed from: c */
    public final z5a1 mo24861c(gh00 gh00Var) {
        tz60 tz60VarMo28094c = this.f34472a.mo28094c(new jq81(gh00Var, this));
        return new b6a1(this, new tf41(tz60VarMo28094c, 18), new sq11(tz60VarMo28094c), new tf41(tz60VarMo28094c, 19), new e651(tz60VarMo28094c));
    }

    @Override // p204p.a6a1
    /* JADX INFO: renamed from: e */
    public final boolean mo24862e(k35 k35Var) {
        return wj50.m88271j(k35Var.f118762a, this.f34473b);
    }
}
