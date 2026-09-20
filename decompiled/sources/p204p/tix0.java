package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tix0 {

    /* JADX INFO: renamed from: a */
    public final int f220762a;

    public final boolean equals(Object obj) {
        if (obj instanceof tix0) {
            return this.f220762a == ((tix0) obj).f220762a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f220762a);
    }

    public final String toString() {
        int i = this.f220762a;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        if (i == 4) {
            return "Tab";
        }
        if (i == 5) {
            return "Image";
        }
        if (i == 6) {
            return "DropdownList";
        }
        if (i == 7) {
            return "Picker";
        }
        return i == 8 ? "Carousel" : "Unknown";
    }
}
