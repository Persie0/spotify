package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cv2 implements dv2 {

    /* JADX INFO: renamed from: a */
    public final String f42272a;

    public cv2(String str) {
        this.f42272a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cv2) && wj50.m88271j(this.f42272a, ((cv2) obj).f42272a);
    }

    public final int hashCode() {
        return this.f42272a.hashCode();
    }
}
