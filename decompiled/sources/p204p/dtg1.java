package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class dtg1 {
    /* JADX INFO: renamed from: a */
    public abstract cxg1 mo30689a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtg1) {
            return mo30689a().equals(((dtg1) obj).mo30689a());
        }
        return false;
    }

    public final int hashCode() {
        return mo30689a().hashCode();
    }

    public final String toString() {
        return mo30689a().toString();
    }
}
