package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oef implements pef {

    /* JADX INFO: renamed from: a */
    public final String f164412a;

    public oef(String str) {
        this.f164412a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oef) && wj50.m88271j(this.f164412a, ((oef) obj).f164412a);
    }

    public final int hashCode() {
        return this.f164412a.hashCode();
    }
}
