package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jmo {

    /* JADX INFO: renamed from: a */
    public final emo f113916a;

    /* JADX INFO: renamed from: b */
    public final String f113917b;

    public jmo(emo emoVar, String str) {
        this.f113916a = emoVar;
        this.f113917b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmo)) {
            return false;
        }
        jmo jmoVar = (jmo) obj;
        return wj50.m88271j(this.f113916a, jmoVar.f113916a) && wj50.m88271j(this.f113917b, jmoVar.f113917b);
    }

    public final int hashCode() {
        return this.f113917b.hashCode() + (this.f113916a.hashCode() * 31);
    }
}
