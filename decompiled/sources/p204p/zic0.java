package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zic0 extends AbstractC1928h8 {

    /* JADX INFO: renamed from: b */
    public final Object f283127b;

    /* JADX INFO: renamed from: c */
    public Object f283128c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ajc0 f283129d;

    public zic0(ajc0 ajc0Var, Object obj, Object obj2) {
        super(false, 0);
        this.f283129d = ajc0Var;
        this.f283127b = obj;
        this.f283128c = obj2;
    }

    @Override // p204p.AbstractC1928h8, java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.f283127b.equals(entry.getKey()) && this.f283128c.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f283127b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f283128c;
    }

    @Override // p204p.AbstractC1928h8, java.util.Map.Entry
    public final int hashCode() {
        return this.f283127b.hashCode() ^ this.f283128c.hashCode();
    }

    @Override // p204p.AbstractC1928h8, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object objPut = this.f283129d.put(this.f283127b, obj);
        this.f283128c = obj;
        return objPut;
    }
}
