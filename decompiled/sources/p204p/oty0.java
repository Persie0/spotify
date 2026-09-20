package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class oty0 implements quy0 {

    /* JADX INFO: renamed from: a */
    public final String f170118a;

    public oty0(String str) {
        this.f170118a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oty0) && wj50.m88271j(this.f170118a, ((oty0) obj).f170118a);
    }

    public final int hashCode() {
        return this.f170118a.hashCode();
    }
}
