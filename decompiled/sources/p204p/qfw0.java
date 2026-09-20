package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qfw0 implements sfw0 {

    /* JADX INFO: renamed from: a */
    public final String f188305a;

    public qfw0(String str) {
        this.f188305a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qfw0) && wj50.m88271j(this.f188305a, ((qfw0) obj).f188305a);
    }

    public final int hashCode() {
        return this.f188305a.hashCode();
    }
}
