package p204p;

import java.util.Map;

/* JADX INFO: renamed from: p.h8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1928h8 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f88581a;

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f88581a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return upf.m83705v(getKey(), entry.getKey()) && upf.m83705v(getValue(), entry.getValue());
            default:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                return qvf1.m74003H(getKey(), entry2.getKey()) && qvf1.m74003H(getValue(), entry2.getValue());
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f88581a) {
            case 0:
                Object key = getKey();
                Object value = getValue();
                return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
            default:
                Object key2 = getKey();
                Object value2 = getValue();
                return (key2 == null ? 0 : key2.hashCode()) ^ (value2 != null ? value2.hashCode() : 0);
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        switch (this.f88581a) {
            case 0:
                return getKey() + "=" + getValue();
            default:
                return klh.m56834f(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }
}
