package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cd90 implements fd90 {

    /* JADX INFO: renamed from: a */
    public final String f36835a;

    public cd90(String str) {
        this.f36835a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd90) && wj50.m88271j(this.f36835a, ((cd90) obj).f36835a);
    }

    public final int hashCode() {
        return this.f36835a.hashCode();
    }
}
