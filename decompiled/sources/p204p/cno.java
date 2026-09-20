package p204p;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class cno extends yno {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dc21 f40051b;

    public cno(dc21 dc21Var) {
        this.f40051b = dc21Var;
    }

    @Override // p204p.yno
    /* JADX INFO: renamed from: a */
    public final String mo33464a(dz61 dz61Var, long j, hf71 hf71Var, Locale locale) {
        Map map = (Map) this.f40051b.f47408a.get(hf71Var);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    @Override // p204p.yno
    /* JADX INFO: renamed from: b */
    public final Iterator mo33465b(dz61 dz61Var, hf71 hf71Var, Locale locale) {
        List list = (List) this.f40051b.f47409b.get(hf71Var);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
