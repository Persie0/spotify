package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class tgc0 implements Map.Entry, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220168a;

    /* JADX INFO: renamed from: b */
    public final Object f220169b;

    /* JADX INFO: renamed from: c */
    public final Object f220170c;

    public /* synthetic */ tgc0(int i, Object obj, Object obj2) {
        this.f220168a = i;
        this.f220169b = obj;
        this.f220170c = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.f220168a) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && wj50.m88271j(entry.getKey(), this.f220169b) && wj50.m88271j(entry.getValue(), getValue());
            default:
                Map.Entry entry2 = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry2 != null && wj50.m88271j(entry2.getKey(), this.f220169b) && wj50.m88271j(entry2.getValue(), getValue());
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f220168a) {
            case 0:
                break;
        }
        return this.f220169b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f220168a) {
            case 0:
                break;
        }
        return this.f220170c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        switch (this.f220168a) {
            case 0:
                Object obj = this.f220169b;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                Object obj2 = this.f220169b;
                int iHashCode2 = obj2 == null ? 0 : obj2.hashCode();
                Object value2 = getValue();
                return (value2 != null ? value2.hashCode() : 0) ^ iHashCode2;
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f220168a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final String toString() {
        switch (this.f220168a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f220169b);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f220169b);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
        }
    }
}
