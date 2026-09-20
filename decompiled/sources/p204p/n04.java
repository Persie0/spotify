package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class n04 {

    /* JADX INFO: renamed from: a */
    public final int f148888a;

    public final boolean equals(Object obj) {
        if (obj instanceof n04) {
            return this.f148888a == ((n04) obj).f148888a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f148888a);
    }

    public final String toString() {
        return dq60.m36613m("AndroidContentDataType(androidAutofillType=", this.f148888a, ')');
    }
}
