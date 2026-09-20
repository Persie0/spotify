package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class rgc0 {

    /* JADX INFO: renamed from: a */
    public final Map f198930a;

    public rgc0(Map map) {
        this.f198930a = map;
    }

    /* JADX INFO: renamed from: a */
    public final Object m75481a(float f) {
        Object next;
        Iterator it = this.f198930a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Object m75482b(float f, boolean z) {
        Object next;
        Iterator it = this.f198930a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f2 = z ? fFloatValue - f : f - fFloatValue;
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f3 = z ? fFloatValue2 - f : f - fFloatValue2;
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final float m75483c() {
        Float fM43694H0 = g6f.m43694H0(this.f198930a.values());
        if (fM43694H0 != null) {
            return fM43694H0.floatValue();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: d */
    public final float m75484d(Object obj) {
        Float f = (Float) this.f198930a.get(obj);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgc0)) {
            return false;
        }
        return wj50.m88271j(this.f198930a, ((rgc0) obj).f198930a);
    }

    public final int hashCode() {
        return this.f198930a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f198930a + ')';
    }
}
