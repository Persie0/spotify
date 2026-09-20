package p204p;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class jom0 {

    /* JADX INFO: renamed from: a */
    public final bum f114452a;

    /* JADX INFO: renamed from: b */
    public final idd1 f114453b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f114454c;

    /* JADX INFO: renamed from: d */
    public final hb11 f114455d;

    /* JADX INFO: renamed from: e */
    public final hb11 f114456e;

    /* JADX INFO: renamed from: g */
    public Integer f114458g;

    /* JADX INFO: renamed from: h */
    public Integer f114459h;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f114457f = new LinkedHashMap();

    /* JADX INFO: renamed from: i */
    public List f114460i = lau.f131415a;

    public jom0(bum bumVar, idd1 idd1Var, h4t0 h4t0Var, hb11 hb11Var, hb11 hb11Var2) {
        this.f114452a = bumVar;
        this.f114453b = idd1Var;
        this.f114454c = h4t0Var;
        this.f114455d = hb11Var;
        this.f114456e = hb11Var2;
    }

    /* JADX INFO: renamed from: a */
    public final jv50 m53890a(int i, vwf vwfVar) {
        String uri;
        gej gejVarMo44314c;
        String strMo37804k;
        LinkedHashMap linkedHashMap = this.f114457f;
        Object objM30575a = linkedHashMap.get(vwfVar);
        if (objM30575a == null) {
            boolean z = vwfVar instanceof pcd1;
            pcd1 pcd1Var = z ? (pcd1) vwfVar : null;
            String str = "";
            if (pcd1Var == null || (uri = pcd1Var.getUri()) == null) {
                uri = "";
            }
            pcd1 pcd1Var2 = z ? (pcd1) vwfVar : null;
            if (pcd1Var2 != null && (gejVarMo44314c = pcd1Var2.mo44314c()) != null && (strMo37804k = gejVarMo44314c.mo37804k()) != null) {
                str = strMo37804k;
            }
            objM30575a = this.f114452a.m30575a(new pqk0(new s150(i, uri, str), 6), vwfVar, (k1p0) this.f114454c.get());
            linkedHashMap.put(vwfVar, objM30575a);
        }
        return (jv50) objM30575a;
    }
}
