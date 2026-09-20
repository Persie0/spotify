package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class y3y0 extends a4y0 {

    /* JADX INFO: renamed from: a */
    public final IOException f269006a;

    public y3y0(IOException iOException) {
        this.f269006a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y3y0) && this.f269006a.equals(((y3y0) obj).f269006a);
    }

    public final int hashCode() {
        return this.f269006a.hashCode();
    }
}
