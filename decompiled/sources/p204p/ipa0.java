package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ipa0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f104461a;

    /* JADX INFO: renamed from: b */
    public final float f104462b;

    public ipa0(float f, ArrayList arrayList) {
        this.f104461a = arrayList;
        this.f104462b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipa0)) {
            return false;
        }
        ipa0 ipa0Var = (ipa0) obj;
        return this.f104461a.equals(ipa0Var.f104461a) && Float.compare(this.f104462b, ipa0Var.f104462b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f104462b) + (this.f104461a.hashCode() * 31);
    }
}
