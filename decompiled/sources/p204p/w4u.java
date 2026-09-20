package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class w4u extends y4u {

    /* JADX INFO: renamed from: a */
    public final Exception f247889a;

    public w4u(Exception exc) {
        this.f247889a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4u) && wj50.m88271j(this.f247889a, ((w4u) obj).f247889a);
    }

    public final int hashCode() {
        Exception exc = this.f247889a;
        if (exc == null) {
            return 0;
        }
        return exc.hashCode();
    }
}
