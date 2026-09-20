package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class owa1 implements rwa1 {

    /* JADX INFO: renamed from: a */
    public final String f170683a;

    public owa1(String str) {
        this.f170683a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof owa1) && wj50.m88271j(this.f170683a, ((owa1) obj).f170683a);
    }

    public final int hashCode() {
        return this.f170683a.hashCode();
    }
}
