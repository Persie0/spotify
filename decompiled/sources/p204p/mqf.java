package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class mqf extends AbstractC1928h8 {

    /* JADX INFO: renamed from: b */
    public final Object f146276b;

    /* JADX INFO: renamed from: c */
    public int f146277c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ nqf f146278d;

    public mqf(nqf nqfVar, int i) {
        super(false, 0);
        this.f146278d = nqfVar;
        Object obj = nqf.f157260t;
        this.f146276b = nqfVar.m65424k()[i];
        this.f146277c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m62540a() {
        int i = this.f146277c;
        Object obj = this.f146276b;
        nqf nqfVar = this.f146278d;
        if (i != -1 && i < nqfVar.size()) {
            if (upf.m83705v(obj, nqfVar.m65424k()[this.f146277c])) {
                return;
            }
        }
        Object obj2 = nqf.f157260t;
        this.f146277c = nqfVar.m65418e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f146276b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        nqf nqfVar = this.f146278d;
        Map mapM65416c = nqfVar.m65416c();
        if (mapM65416c != null) {
            return mapM65416c.get(this.f146276b);
        }
        m62540a();
        int i = this.f146277c;
        if (i == -1) {
            return null;
        }
        return nqfVar.m65425l()[i];
    }

    @Override // p204p.AbstractC1928h8, java.util.Map.Entry
    public final Object setValue(Object obj) {
        nqf nqfVar = this.f146278d;
        Map mapM65416c = nqfVar.m65416c();
        Object obj2 = this.f146276b;
        if (mapM65416c != null) {
            return mapM65416c.put(obj2, obj);
        }
        m62540a();
        int i = this.f146277c;
        if (i == -1) {
            nqfVar.put(obj2, obj);
            return null;
        }
        Object obj3 = nqfVar.m65425l()[i];
        nqfVar.m65425l()[this.f146277c] = obj;
        return obj3;
    }
}
