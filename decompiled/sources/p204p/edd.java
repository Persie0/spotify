package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class edd implements qdd {

    /* JADX INFO: renamed from: a */
    public final String f58502a;

    public edd(String str) {
        this.f58502a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edd) && wj50.m88271j(this.f58502a, ((edd) obj).f58502a);
    }

    public final int hashCode() {
        return this.f58502a.hashCode();
    }
}
