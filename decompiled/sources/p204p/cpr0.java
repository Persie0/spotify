package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cpr0 implements lpr0 {

    /* JADX INFO: renamed from: a */
    public final String f40606a;

    public cpr0(String str) {
        this.f40606a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cpr0) && wj50.m88271j(this.f40606a, ((cpr0) obj).f40606a);
    }

    public final int hashCode() {
        return this.f40606a.hashCode();
    }
}
