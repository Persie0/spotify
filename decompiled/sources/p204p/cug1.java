package p204p;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cug1 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f42117a;

    /* JADX INFO: renamed from: b */
    public int f42118b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fug1 f42119c;

    public cug1(fug1 fug1Var, int i) {
        Objects.requireNonNull(fug1Var);
        this.f42119c = fug1Var;
        this.f42117a = fug1Var.m42729a()[i];
        this.f42118b = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m33924a() {
        int i = this.f42118b;
        Object obj = this.f42117a;
        fug1 fug1Var = this.f42119c;
        if (i != -1 && i < fug1Var.size()) {
            if (Objects.equals(obj, fug1Var.m42729a()[this.f42118b])) {
                return;
            }
        }
        this.f42118b = fug1Var.m42736h(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f42117a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        fug1 fug1Var = this.f42119c;
        Map mapM42732d = fug1Var.m42732d();
        if (mapM42732d != null) {
            return mapM42732d.get(this.f42117a);
        }
        m33924a();
        int i = this.f42118b;
        if (i == -1) {
            return null;
        }
        return fug1Var.m42730b()[i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        fug1 fug1Var = this.f42119c;
        Map mapM42732d = fug1Var.m42732d();
        Object obj2 = this.f42117a;
        if (mapM42732d != null) {
            return mapM42732d.put(obj2, obj);
        }
        m33924a();
        int i = this.f42118b;
        if (i == -1) {
            fug1Var.put(obj2, obj);
            return null;
        }
        Object obj3 = fug1Var.m42730b()[i];
        fug1Var.m42730b()[this.f42118b] = obj;
        return obj3;
    }

    public final String toString() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        return dq60.m36618r(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
