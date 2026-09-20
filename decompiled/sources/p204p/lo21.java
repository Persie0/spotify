package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class lo21 implements no21 {

    /* JADX INFO: renamed from: a */
    public final float f135286a = 1.4705882f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lo21) {
            return Float.compare(0.68f, 0.68f) == 0 && Float.compare(this.f135286a, ((lo21) obj).f135286a) == 0 && Float.compare(0.75f, 0.75f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(0.75f) + AbstractC0000a.m8g(Float.hashCode(0.68f) * 31, 31, this.f135286a);
    }
}
