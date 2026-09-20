package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mc20 {

    /* JADX INFO: renamed from: a */
    public final int f142017a;

    /* JADX INFO: renamed from: a */
    public static final boolean m61435a(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int m61436b() {
        return this.f142017a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mc20) {
            return this.f142017a == ((mc20) obj).f142017a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f142017a);
    }

    public final String toString() {
        int i = this.f142017a;
        if (i == 16) {
            return "Confirm";
        }
        if (i == 6) {
            return "ContextClick";
        }
        if (i == 13) {
            return "GestureEnd";
        }
        if (i == 23) {
            return "GestureThresholdActivate";
        }
        if (i == 3) {
            return "KeyboardTap";
        }
        if (i == 0) {
            return "LongPress";
        }
        if (i == 17) {
            return "Reject";
        }
        if (i == 27) {
            return "SegmentFrequentTick";
        }
        if (i == 26) {
            return "SegmentTick";
        }
        if (i == 9) {
            return "TextHandleMove";
        }
        if (i == 22) {
            return "ToggleOff";
        }
        if (i == 21) {
            return "ToggleOn";
        }
        return i == 1 ? "VirtualKey" : "Invalid";
    }
}
