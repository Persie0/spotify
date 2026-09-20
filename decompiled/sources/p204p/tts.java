package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tts implements vts {

    /* JADX INFO: renamed from: a */
    public final String f223670a;

    public tts(String str) {
        this.f223670a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tts) && wj50.m88271j(this.f223670a, ((tts) obj).f223670a);
    }

    public final int hashCode() {
        return this.f223670a.hashCode();
    }
}
