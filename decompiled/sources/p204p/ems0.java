package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class ems0 extends a9a {

    /* JADX INFO: renamed from: a */
    public final IOException f60979a;

    public ems0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f60979a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ems0) && wj50.m88271j(this.f60979a, ((ems0) obj).f60979a);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f60979a;
    }

    public final int hashCode() {
        return this.f60979a.hashCode();
    }
}
